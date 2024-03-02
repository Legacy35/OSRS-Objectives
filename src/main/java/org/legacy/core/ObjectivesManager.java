package org.legacy.core;

import lombok.Getter;
import net.runelite.api.Client;
import org.legacy.objectives.BossObjectives;
import org.legacy.objectives.QuestObjectives;
import org.legacy.objectives.SkillObjectives;
import org.legacy.objectives.models.BossObjective;
import org.legacy.objectives.models.Objective;
import org.legacy.objectives.models.QuestObjective;
import org.legacy.objectives.models.SkillObjective;
import org.legacy.utils.ObjectiveTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.*;

@Singleton
public class ObjectivesManager implements Runnable{
    @Inject
    private ObjectivesConfig config;
    @Inject
    private Client client;
    @Inject
    private SkillObjectives skillObjectives;
    @Inject
    private QuestObjectives questObjectives;
    @Inject
    private BossObjectives bossObjectives;
    @Getter
    private boolean isIntialized;
    @Getter
    private boolean intializationStarted;
    private static final int objectiveListCount =5;
    // 0-> Skills , 1->Cmb Lvl, 2-> Quest, 3-> Quest Point
    private static ArrayList<Objective>[] Objectives = new ArrayList[objectiveListCount+1];
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    private boolean debug = true;
    public ObjectivesManager(){
        intializationStarted=false;
        isIntialized=false;
    }
    @Override
    public void run() {
            initialize();
    }
    public void initialize(){
        if(isIntialized){
            return;
        }
        log.info("----Initializing Objectives----");
        initializeObjectives();
        Objectives[objectiveListCount]= new ArrayList<Objective>();
        intializationStarted=true;
        log.info("----Generating Objectives----");
        generateObjectives();//medium O(n)
        log.info("----Assigning Required By Values for Objectives----");
        assignRequiredByValues();////medium o(n)
        log.info("----Updating Completion Statuses----");
        updateAllCompletionStatuses();//medium-Light  o(n)
        log.info("----Combining Objectives Lists----");
        combineObjectivesList();//Light o(1)
        log.info("----Removing Completed Objectives----");
        if(!debug){
            removeCompletedObjectives();//Light O(n)
        }
        log.info("----Sorting Objectives List by amount of things that require it----");
        sortByRequiredByCount();//medium-Light o(nlog(N)) //This is so that when we topological sort we start at the head of every relationship tree
        log.info("----Topologically sorting combined objectives Lists----");
        Objectives[objectiveListCount] = topologicallySortCombinedObjectiveList(Objectives[objectiveListCount]); //Heavy approx O(N)
        log.info("----Assigning Priority Levels to Objectives----");
        prioritizeObjectives(); //Medium-Light //
        log.info("----Delete Unnecessary/Hidden Objectives----");
        removeHiddenObjectives(); //light
        remove0PriorityObjectives();//light
        removeUncompletableObjectives();//light
        log.info("----Sorting Objectives by Priority----");
        sortObjectivesListByPriority(); //Medium-Light
        isIntialized=true;

    }
    private void initializeObjectives(){
        skillObjectives.initialize();
        questObjectives.initialize();
        /*
        achivementObjectives.initialize();
        /*
        combatAchivementObjectives.initialize();
        /*
        musicObjectives.initialize();
        itemObjectives.initialize();
        */
        bossObjectives.initialize();
        /*
        clogObjectives.initialize();
        recurringObjectives.initialize();
         */
        /**/
    }
    private void generateObjectives(){
        skillObjectives.generateObjectives();
        Objectives[0]= skillObjectives.skillingObjectivesList;
        Objectives[1]= skillObjectives.CombatLevelObjectivesList; //hidden

        questObjectives.generateObjectives();
        Objectives[2]= questObjectives.QuestObjectivesList;
        Objectives[3]= questObjectives.QuestPointObjectivesList; //hidden
        /*
        achivementObjectives.generateObjectives();
        Objectives[4]= achivementObjectives.achievementTaskObjectiveList;//partially hidden (KC will instead be a boss Kc objective req and it will be hidden)
        Objectives[5]= achivementObjectives.achievementTierObjectivesList; //hidden
        /*
        combatAchivementObjectives.generateObjectives();
        Objectives[6]= combatAchivementObjectives.combatAchievementTaskObjectivesList;
        Objectives[7]= combatAchivementObjectives.combatAchievementTierObjectivesList;//hidden
        /*
        musicObjectives.generateObjectives();
        Objectives[8]= musicObjectives.musicObjectivesList; // ???

        itemObjectives.generateObjectives();
        Objectives[9]= itemObjectives.wealthObjectivesList; // ???
        Objectives[10]= itemObjectives.itemObjectivesList; // ???
        Objectives[11]= itemObjectives.petObjectivesList; // hidden and redirects to boss KC
        */
        bossObjectives.generateObjectives();
        Objectives[4/*12*/]= bossObjectives.bossObjectivesList; // ???
        /*
        clogObjectives.generateObjectives();
        Objectives[13]= clogObjectives.clogObjectivesList; // ???

        recurringObjectives.generateRecurringObjectives();
        Objectives[14]= clogObjectives.clogObjectivesList; // ???
         */
        /**/
    }
    //organizes Objectives in the CombinedObjectiveList to be topological sorted by requirements
    private ArrayList<Objective> topologicallySortCombinedObjectiveList(ArrayList<Objective> objectives) {
        ArrayList<Objective> result = new ArrayList<>();

        for (Objective objective : objectives) {
            if (!objective.isHasBeenSorted()) {
                dfs(objective, result);
            }
        }

        //Collections.reverse(result);
        return result;
    }
    //helper function for topological sorting
    private void dfs(Objective objective, ArrayList<Objective> result) {
        objective.setHasBeenSorted(true);
        for (String requirementString : objective.getRequirements()) {
            Objective requirement = getObjectiveFromID(requirementString);
            assert requirement != null;
            if (!requirement.isHasBeenSorted() && (!requirement.getObjectiveCompleted()|| debug)) {
                dfs(requirement, result);
            }
        }
        result.add(objective);
    }

    //creates the last value in the Objectives list which is just a combination of all the objective lists
    public void combineObjectivesList(){
        Objectives[objectiveListCount]= new ArrayList<Objective>();
        for(int i =0; i<objectiveListCount;i++) {
            Objectives[objectiveListCount].addAll(Objectives[i]);
        }
    }

    //Assigns Required By values to all Objectives
    private void assignRequiredByValues(){
        for(int i =0; i<objectiveListCount;i++) {
            for (Objective objective : Objectives[i]) {
                for (String objectiveCode : objective.getRequirements()) {
                    Objects.requireNonNull(getObjectiveFromID(objectiveCode)).addRequiredBy(objective.getID());
                }
            }
        }
    }

    //Update values of all the completion statuses
    public void updateAllCompletionStatuses() {
        for(ArrayList<Objective> obj :Objectives){
            updateCompletionStatusesOfAListOfObjectives(obj);
        }
    }

    //helper function for updating all the completion statuses
    private void updateCompletionStatusesOfAListOfObjectives(ArrayList<Objective> givenObjectives) {
        for(Objective obj : givenObjectives){
            obj.updateCompletedValue();
            obj.updateCanBeDone();
        }
    }

    //Go through all the objectives and trickle down the priority to their subsequent objectives
    private void prioritizeObjectives (){
        for(int i = Objectives[objectiveListCount].size()-1; i>=0;i--){
            for(String requirement: Objectives[objectiveListCount].get(i).getRequirements()){
                ObjectivesManager.getObjectiveFromID(requirement).addToPriority(Objectives[objectiveListCount].get(i).getPriorityLevel());
            }
            Objectives[objectiveListCount].get(i).addToPriority( Objectives[objectiveListCount].get(i).getSelfContainedPriorityLevel());
        }
        applyPriorityRatios();
    }

    //sets the Ratios for priorities that change priority based on player config settings
    private void applyPriorityRatios() {
    }

    private void removeCompletedObjectives(){
        for(int i = 0; i < Objectives[objectiveListCount].size();i++) {
            if(Objectives[objectiveListCount].get(i).getObjectiveCompleted()){
                Objectives[objectiveListCount].remove(i);
                i--;
            }
        }
    }
    private void removeHiddenObjectives(){
        ArrayList<Objective> objectivesList = Objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(objectivesList.get(i).isHiddenObjective()){
                objectivesList.remove(i);
                i--;
            }
        }
    }
    private void remove0PriorityObjectives(){
        ArrayList<Objective> objectivesList = Objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(objectivesList.get(i).getPriorityLevel()==0){
                objectivesList.remove(i);
                i--;
            }
        }
    }
    private void removeUncompletableObjectives(){
        ArrayList<Objective> objectivesList = Objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(!objectivesList.get(i).isCanBeDone()){
                objectivesList.remove(i);
                i--;
            }
        }
    }
    private void cleanUpObjectives(){

    }

    private void sortByRequiredByCount(){
        Objectives[objectiveListCount].sort(Comparator.comparingInt(obj -> obj.getRequiredBy().size()));

    }
    private void sortObjectivesListByPriority(){
        Collections.sort(Objectives[objectiveListCount]);
    }

    private void resetObjectivePriorities (){

    }
    private void sortObjectivesByPriority (){

    }
    public void printRecommendedQuestObjectives () {
        ArrayList<QuestObjective> list = getRecommendedQuestObjectives();
        log.info("-----Printing Recommended Quest Objectives("+list.size()+")-----");
        for ( QuestObjective obj : list){
            log.info(obj.toString());
        }
    }
    public void printRecommendedSkillingObjectives () {
        ArrayList<SkillObjective> list = getRecommendedSkillingObjectives();
        log.info("-----Printing Recommended Skilling Objectives("+list.size()+")-----");
        for ( SkillObjective obj : list){
            log.info(obj.toString());
        }
    }
    public ArrayList<QuestObjective> getRecommendedQuestObjectives(){
        ArrayList<QuestObjective> recommendedSkillingObjectives = new ArrayList<QuestObjective>();
        for(int i=0; i<Objectives[objectiveListCount].size(); i++){
            if(!Objectives[objectiveListCount].get(i).getTypes().contains(ObjectiveTags.QUESTING)){
                continue;
            }
            QuestObjective storedObjective = (QuestObjective) Objectives[objectiveListCount].get(i);
             if(storedObjective.isCanBeDone()){
                 recommendedSkillingObjectives.add(storedObjective);
            }
        }
        return recommendedSkillingObjectives;
    }
    public ArrayList<SkillObjective> getRecommendedSkillingObjectives (){
        ArrayList<SkillObjective> recommendedSkillingObjectives = new ArrayList<>();
        SkillObjective storedObjective = null;
        for(int i=0; i<Objectives[objectiveListCount].size(); i++){
            if(!Objectives[objectiveListCount].get(i).getTypes().contains(ObjectiveTags.SKILLING)){
                continue;
            }
            if (storedObjective==null) {
                storedObjective = (SkillObjective) Objectives[objectiveListCount].get(i);
            }
            else if(storedObjective.getSkill()==((SkillObjective)Objectives[objectiveListCount].get(i)).getSkill()){
                storedObjective = (SkillObjective) Objectives[objectiveListCount].get(i);
            }
            else if(storedObjective.getSkill()==((SkillObjective)Objectives[objectiveListCount].get(i)).getSkill()){
                storedObjective = (SkillObjective) Objectives[objectiveListCount].get(i);
            }
            else{
                recommendedSkillingObjectives.add(storedObjective);
                storedObjective = (SkillObjective) Objectives[objectiveListCount].get(i);

            }
        }
        if (storedObjective!=null) {
            recommendedSkillingObjectives.add(storedObjective);
        }
        return recommendedSkillingObjectives;
    }
    public Objective getRecomendedObjective (){
        return null;
    }
    public void updatePriorityLevelsOfAllObjectives(){

    }

    public static Objective getObjectiveFromID(String ID){
        String[] parts = ID.split("-");
        ArrayList<Objective> objectiveList;
        switch (parts[0]) {
            case "SKILL":
                objectiveList = ObjectivesManager.Objectives[0];
                break;
            case "CMB":
                objectiveList = ObjectivesManager.Objectives[1];
                break;
            case "QUEST":
                objectiveList = ObjectivesManager.Objectives[2];
                break;
            case "QP":
                objectiveList = ObjectivesManager.Objectives[3];
                break;
            default:
                log.error("ID: " + ID + " ,could not identify beginning identifier:" + parts[0]);
                return null;
        }
        return findObjectiveFromObjectiveList(objectiveList,ID);
    }
    private static Objective findObjectiveFromObjectiveList(ArrayList<Objective> objectiveList, String ID){
        for (Objective obj : objectiveList){
            if (obj.getID().equals(ID)){
                return obj;
            }
        }
        log.error("ID: " + ID + " ,could not find ID in: " + objectiveList+" Failed to find ID: "+ ID );
        return null;
    }
    public ArrayList<BossObjective> getRecommendedBossObjectives(){
        ArrayList<BossObjective> recommendedBossObjectives = new ArrayList<>();
        for(int i=0; i<Objectives[objectiveListCount].size(); i++){
            if(!Objectives[objectiveListCount].get(i).getTypes().contains(ObjectiveTags.BOSSING)){
                continue;
            }
            BossObjective storedObjective = (BossObjective) Objectives[objectiveListCount].get(i);
            if(storedObjective.isCanBeDone()){
                recommendedBossObjectives.add(storedObjective);
            }
        }
        return recommendedBossObjectives;
    }
    private void printRecommendedBossObjectives() {
        ArrayList<BossObjective> list = getRecommendedBossObjectives();
        log.info("-----Printing Recommended Boss Kc Objectives ("+list.size()+")-----");
        for ( BossObjective obj : list){
            log.info(obj.toString());
        }
    }
    public void printAllRecommendedObjectives() {
        printRecommendedSkillingObjectives();
        printRecommendedQuestObjectives();
        printRecommendedBossObjectives();
    }

}
