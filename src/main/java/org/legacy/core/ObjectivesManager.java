package org.legacy.core;

import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import org.legacy.objectives.*;
import org.legacy.objectives.models.*;
import org.legacy.utils.RecommendedObjectiveList;
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
    private SkillObjectivesProvider skillObjectives;
    @Inject
    private QuestObjectivesProvider questObjectives;
    @Inject
    private BossObjectivesProvider bossObjectives;
    @Inject
    private ItemObjectivesProvider itemObjectives;
    @Inject
    private MusicObjectivesProvider musicObjectives;
    @Getter
    private boolean isIntialized;
    @Getter
    private boolean intializationStarted;
    private static final int objectiveListCount =7; //TODO UPDATE: New Objectives need Generates added here need this value incremented for every new list
    private static final int recommendedObjectiveListCounts =4; //TODO UPDATE: New Objectives that are shown need this value incremented for every new list

    private static HashMap<ObjectiveTags,Objective> generalizedObjectiveReplacements= new HashMap<>();
    private static HashMap<String,Integer> objectiveListMap= new HashMap<>();
    // 0-> Skills , 1->Cmb Lvl, 2-> Quest, 3-> Quest Point
    private static final ArrayList<Objective>[] objectives = new ArrayList[objectiveListCount+1];
    private static final RecommendedObjectiveList[] shownReccommendedObjectives = new  RecommendedObjectiveList[recommendedObjectiveListCounts+1];// The +1 is for the Non-Shown Obectives Aka Generalized ones
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    private final boolean debugDoNotRemoveCompleted = true; //Does not remove
    private final boolean debugPrintFullList = true;
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
        objectives[objectiveListCount]= new ArrayList<>();
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
        if(!debugDoNotRemoveCompleted){
            removeCompletedObjectives();//Light O(n)
        }
        log.info("----Sorting Objectives List by amount of things that require it----");
        sortByRequiredByCount();//medium-Light o(nlog(N)) //This is so that when we topological sort we start at the head of every relationship tree
        log.info("----Topologically sorting combined objectives Lists----");
        objectives[objectiveListCount] = topologicallySortCombinedObjectiveList(objectives[objectiveListCount]); //Heavy approx O(N)
        log.info("----Assigning Priority Levels to Objectives----");
        prioritizeObjectives(); //Medium-Light //
        log.info("----Delete Unnecessary/Hidden Objectives----");
        remove0PriorityObjectives();//light
        removeUncompletableObjectives();//light
        log.info("----Sorting Objectives by Priority----");
        sortObjectivesListByPriority(); //Medium-Light
        log.info("----Initialize Recommended Objectives Lists----");
        initializeRecommendedObjectives();
        log.info("----Create Recommended Objectives Lists----");
        generateRecommendedObjectives();
        log.info("----Initialize Recommended Objectives Replacement Map----");
        initializeGeneralizedObjectiveReplacements();
        log.info("----Populate Recommended Objectives Replacement Map----");
        updateRecommendedObjectivesMap();
        isIntialized=true;
        log.info("----Objectives Completed Initialization----");
    }

    private void initializeObjectives(){
        skillObjectives.initialize();

        questObjectives.initialize();

        /*
        achivementObjectives.initialize();
        /*
        combatAchivementObjectives.initialize();
        */
        musicObjectives.initialize();
        itemObjectives.initialize();

        bossObjectives.initialize();
        /*
        clogObjectives.initialize();
        recurringObjectives.initialize();
         */
        //TODO UPDATE: New Objectives need inits added here
    }
    private void generateObjectives(){
        //TODO UPDATE: New Objectives need Generates added here as well as the map of the first part of their ID to the list
        skillObjectives.generateObjectives();
        objectiveListMap.put("SKILL",0);
        objectives[objectiveListMap.get("SKILL")]= skillObjectives.skillingObjectivesList;
        objectiveListMap.put("CMB",1);
        objectives[objectiveListMap.get("CMB")]= skillObjectives.CombatLevelObjectivesList; //Generic

        questObjectives.generateObjectives();
        objectiveListMap.put("QUEST",2);
        objectives[objectiveListMap.get("QUEST")]= questObjectives.QuestObjectivesList;
        objectiveListMap.put("QP",3);
        objectives[objectiveListMap.get("QP")]= questObjectives.QuestPointObjectivesList; //Generic
        /*
        achivementObjectives.generateObjectives();
        Objectives[4]= achivementObjectives.achievementTaskObjectiveList;//partially hidden (KC will instead be a boss Kc objective req and it will be hidden)
        Objectives[5]= achivementObjectives.achievementTierObjectivesList; //hidden
        /*
        combatAchivementObjectives.generateObjectives();
        Objectives[6]= combatAchivementObjectives.combatAchievementTaskObjectivesList;
        Objectives[7]= combatAchivementObjectives.combatAchievementTierObjectivesList;//hidden
        */
        musicObjectives.generateObjectives();
        objectiveListMap.put("MUSIC",4);
        objectives[objectiveListMap.get("MUSIC")]= new ArrayList<>(musicObjectives.MusicObjectiveMap.values());

        itemObjectives.generateObjectives();
        objectiveListMap.put("WEALTH",5);
        objectives[objectiveListMap.get("WEALTH")]= itemObjectives.WealthObjectivesList; //Generic

        /*
        Objectives[10]= itemObjectives.itemObjectivesList; // ???
        Objectives[11]= itemObjectives.petObjectivesList; // hidden and redirects to boss KC
        */

        bossObjectives.generateObjectives();
        objectiveListMap.put("BOSS_KC",6);
        objectives[objectiveListMap.get("BOSS_KC")]= bossObjectives.bossObjectivesList;
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
            if (!requirement.isHasBeenSorted() && (!requirement.getObjectiveCompleted()|| debugDoNotRemoveCompleted)) {
                dfs(requirement, result);
            }
        }
        result.add(objective);
    }
    //creates the last value in the Objectives list which is just a combination of all the objective lists
    public void combineObjectivesList(){
        objectives[objectiveListCount]= new ArrayList<Objective>();
        for(int i =0; i<objectiveListCount;i++) {
            objectives[objectiveListCount].addAll(objectives[i]);
        }
    }
    //Assigns Required By values to all Objectives
    private void assignRequiredByValues(){
        for(int i =0; i<objectiveListCount;i++) {
            for (Objective objective : objectives[i]) {
                for (String objectiveCode : objective.getRequirements()) {
                    Objects.requireNonNull(getObjectiveFromID(objectiveCode)).addRequiredBy(objective.getID());
                }
            }
        }
    }
    //Update values of all the completion statuses
    public void updateAllCompletionStatuses() {
        for(ArrayList<Objective> obj : objectives){
            updateCompletionStatusesOfAListOfObjectives(obj);
        }
    }
    //helper function for updating all the completion statuses
    private void updateCompletionStatusesOfAListOfObjectives(ArrayList<Objective> givenObjectives) {
        for(Objective obj : givenObjectives){
            obj.updateObjective();
        }
    }
    //Go through all the objectives and trickle down the priority to their subsequent objectives
    private void prioritizeObjectives (){
        for(int i = objectives[objectiveListCount].size()-1; i>=0; i--){
            for(String requirement: objectives[objectiveListCount].get(i).getRequirements()){
                ObjectivesManager.getObjectiveFromID(requirement).addToPriority(objectives[objectiveListCount].get(i).getPriorityLevel());
            }
            objectives[objectiveListCount].get(i).addToPriority( objectives[objectiveListCount].get(i).getSelfContainedPriorityLevel());
        }
        applyPriorityRatios();
    }
    //sets the Ratios for priorities that change priority based on player config settings
    private void applyPriorityRatios() {
    }
    private void removeCompletedObjectives(){
        for(int i = 0; i < objectives[objectiveListCount].size(); i++) {
            if(objectives[objectiveListCount].get(i).getObjectiveCompleted()){
                objectives[objectiveListCount].remove(i);
                i--;
            }
        }
    }
    private Objective getReccommendedObjective(ObjectiveTags tag){
        return generalizedObjectiveReplacements.get(tag);
    }
    private void initializeRecommendedObjectives() {
        for(int i = 0; i<shownReccommendedObjectives.length;i++){
            shownReccommendedObjectives[i]= new RecommendedObjectiveList();
        }
    }
    private void generateRecommendedObjectives() {
        ArrayList<Objective> recommendedQuestingObjectives = new ArrayList<>();
        ArrayList<Objective> recommendedSkillingObjectives = new ArrayList<>();
        ArrayList<Objective> recommendedBossObjectives = new ArrayList<>();
        ArrayList<Objective> recommendedMusicObjectives = new ArrayList<>();
        ArrayList<Objective> recommendedGeneralizedObjectives = new ArrayList<>();
        boolean[] skillCompletedList = new boolean[Skill.values().length];

        SkillObjective storedSkillingObjective = null;
        CombatLevelObjective storedCMBObjective = null;
        QuestPointObjective storedQPObjective = null;
        WealthObjective wealthObjective = null;
        for(int i = 0; i< objectives[objectiveListCount].size(); i++){

            //Creates Generalized Objectives List
            if(objectives[objectiveListCount].get(i).isGeneralizedObjective()){
                Objective storedObjective = objectives[objectiveListCount].get(i);
                if( objectives[objectiveListCount].get(i).getTags().contains(ObjectiveTags.COMBAT_LEVELS)){
                    if(storedCMBObjective==null) {
                        storedCMBObjective = (CombatLevelObjective) objectives[objectiveListCount].get(i);
                    }
                    else if(storedCMBObjective.getCmbLvl()<((CombatLevelObjective) objectives[objectiveListCount].get(i)).getCmbLvl()){
                        storedCMBObjective = (CombatLevelObjective) objectives[objectiveListCount].get(i);
                    }
                    continue;
                }
                else if(storedCMBObjective!=null) {
                    recommendedGeneralizedObjectives.add(storedCMBObjective);
                    storedCMBObjective=null;
                }/*
                if( objectives[objectiveListCount].get(i).getTags().contains(ObjectiveTags.QUESTING)){
                    if(storedQPObjective==null) {
                        storedQPObjective = (CombatLevelObjective) objectives[objectiveListCount].get(i);
                    }
                    else if(storedQPObjective.getCmbLvl()<((CombatLevelObjective) objectives[objectiveListCount].get(i)).getCmbLvl()){
                        storedQPObjective = (CombatLevelObjective) objectives[objectiveListCount].get(i);
                    }
                    continue;
                }
                else if(storedQPObjective!=null) {
                    recommendedGeneralizedObjectives.add(storedQPObjective);
                    storedQPObjective=null;
                }
                if( objectives[objectiveListCount].get(i).getTags().contains(ObjectiveTags.WEALTH)){
                    if(wealthObjective==null) {
                        wealthObjective = (CombatLevelObjective) objectives[objectiveListCount].get(i);
                    }
                    else if(wealthObjective.getCmbLvl()<((CombatLevelObjective) objectives[objectiveListCount].get(i)).getCmbLvl()){
                        wealthObjective = (CombatLevelObjective) objectives[objectiveListCount].get(i);
                    }
                    continue;
                }
                else if(storedQPObjective!=null) {
                    recommendedGeneralizedObjectives.add(storedQPObjective);
                    storedQPObjective=null;
                }*/

                recommendedGeneralizedObjectives.add(storedObjective);
            }
            //Questing List
            else if(objectives[objectiveListCount].get(i).getTags().contains(ObjectiveTags.QUESTING)){
                Objective storedObjective = objectives[objectiveListCount].get(i);
                if(storedObjective.isCanBeDone()){
                    recommendedQuestingObjectives.add(storedObjective);
                }
            }
            //Creates Skilling List
            else if(objectives[objectiveListCount].get(i).getTags().contains(ObjectiveTags.SKILLING)){
                //Checks if we already have a goal for that skill
                if(skillCompletedList[((SkillObjective)objectives[objectiveListCount].get(i)).getSkill().ordinal()]){
                    continue;
                }
                if(storedSkillingObjective==null) {
                    storedSkillingObjective = (SkillObjective) objectives[objectiveListCount].get(i);
                }
                else if(storedSkillingObjective.getSkill()==((SkillObjective) objectives[objectiveListCount].get(i)).getSkill()){
                    storedSkillingObjective = (SkillObjective) objectives[objectiveListCount].get(i);
                }
                else{
                    recommendedSkillingObjectives.add(storedSkillingObjective);
                    skillCompletedList[((SkillObjective)objectives[objectiveListCount].get(i)).getSkill().ordinal()]= true;
                    storedSkillingObjective = (SkillObjective) objectives[objectiveListCount].get(i);
                }
            }
            //Creates Bossing List
            else if(objectives[objectiveListCount].get(i).getTags().contains(ObjectiveTags.BOSSING)){
                Objective storedObjective = objectives[objectiveListCount].get(i);
                if(storedObjective.isCanBeDone()){
                    recommendedBossObjectives.add(storedObjective);
                }
            }
            //Creates Music List
            else if(objectives[objectiveListCount].get(i).getTags().contains(ObjectiveTags.MUSIC)){
                Objective storedObjective = objectives[objectiveListCount].get(i);
                if(storedObjective.isCanBeDone()){
                    recommendedMusicObjectives.add(storedObjective);
                }
            }
        }
        if(storedCMBObjective!=null) {
            recommendedGeneralizedObjectives.add(storedCMBObjective);
        }
        shownReccommendedObjectives[0].setObjectiveList(recommendedSkillingObjectives);
        shownReccommendedObjectives[1].setObjectiveList(recommendedQuestingObjectives);
        shownReccommendedObjectives[2].setObjectiveList(recommendedBossObjectives);
        shownReccommendedObjectives[3].setObjectiveList(recommendedMusicObjectives);
        shownReccommendedObjectives[recommendedObjectiveListCounts].setObjectiveList(recommendedGeneralizedObjectives);

    }
    public void printRecommendedGeneralizedObjectives () {
        ArrayList<Objective> list = shownReccommendedObjectives[recommendedObjectiveListCounts].getObjectiveList();
        log.info("-----Printing Recommended Generalized Objectives("+list.size()+")-----");
        for ( Objective obj : list){
            log.info(obj.toString());
            if(!debugPrintFullList){
                return;
            }
        }
    }
    private void remove0PriorityObjectives(){
        ArrayList<Objective> objectivesList = objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(objectivesList.get(i).getPriorityLevel()==0){
                objectivesList.remove(i);
                i--;
            }
        }
    }
    private void removeUncompletableObjectives(){
        ArrayList<Objective> objectivesList = objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(!objectivesList.get(i).isCanBeDone()){
                objectivesList.remove(i);
                i--;
            }
        }
    }
    private void sortByRequiredByCount(){
        objectives[objectiveListCount].sort(Comparator.comparingInt(obj -> obj.getRequiredBy().size()));
    }
    private void sortObjectivesListByPriority(){
        Collections.sort(objectives[objectiveListCount]);
    }
    private void initializeGeneralizedObjectiveReplacements(){
        for(ObjectiveTags tag: ObjectiveTags.values()) {
            generalizedObjectiveReplacements.put(tag,null);
        }
    }
    private void updateRecommendedObjectivesMap() {
        for(ObjectiveTags tag: ObjectiveTags.values()){
            Objective bestOption = null;
            for(int i =0; i<shownReccommendedObjectives.length-1;i++){
                Objective temp = shownReccommendedObjectives[i].getReccommendedObjective(tag);
                if(temp==null){
                    continue;
                }
                if(bestOption==null){
                    bestOption= temp;
                }
                else if(temp.getPriorityLevel()>bestOption.getPriorityLevel()){
                    bestOption=temp;
                }
            }
            generalizedObjectiveReplacements.put(tag,bestOption);
        }
    }
    public static Objective getObjectiveFromID(String ID){
        String[] parts = ID.split("-");
        ArrayList<Objective> objectiveList;
        if(!objectiveListMap.containsKey(parts[0])) {
            log.error("ID: " + ID + " ,could not identify beginning identifier:" + parts[0]);
            return null;
        }
        objectiveList = ObjectivesManager.objectives[objectiveListMap.get(parts[0])];
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
    public void printRecommendedQuestObjectives () {
        ArrayList<Objective> list = shownReccommendedObjectives[1].getObjectiveList();
        log.info("-----Printing Recommended Quest Objectives("+list.size()+")-----");
        for ( Objective obj : list){
            log.info(obj.toString());
            if(!debugPrintFullList){
                return;
            }
        }
    }
    public void printRecommendedSkillingObjectives () {
        ArrayList<Objective> list = shownReccommendedObjectives[0].getObjectiveList();
        log.info("-----Printing Recommended Skilling Objectives("+list.size()+")-----");
        for ( Objective obj : list){
            log.info(obj.toString());
            if(!debugPrintFullList){
                return;
            }
        }
    }
    private void printRecommendedBossObjectives() {
        ArrayList<Objective> list = shownReccommendedObjectives[2].getObjectiveList();
        log.info("-----Printing Recommended Boss Kc Objectives ("+list.size()+")-----");
        for ( Objective obj : list){
            log.info(obj.toString());
            if(!debugPrintFullList){
                return;
            }
        }
    }
    private void printRecommendedMusicObjectives() {
        ArrayList<Objective> list = shownReccommendedObjectives[3].getObjectiveList();
        log.info("-----Printing Recommended Music Objectives ("+list.size()+")-----");
        for ( Objective obj : list){
            log.info(obj.toString());
            if(!debugPrintFullList){
                return;
            }
        }
    }
    public void printAllRecommendedObjectives() {
        printRecommendedSkillingObjectives();
        printRecommendedQuestObjectives();
        printRecommendedBossObjectives();
        printRecommendedMusicObjectives();
        printRecommendedGeneralizedObjectives();
    }
    public RecommendedObjectiveList getAReccommendedObjectiveList(int i){
       return shownReccommendedObjectives[i];
    }

}

