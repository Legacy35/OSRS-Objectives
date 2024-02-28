package org.legacy.core;

import net.runelite.api.Client;
import org.legacy.objectives.QuestObjectives;
import org.legacy.objectives.SkillObjectives;
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
public class ObjectivesManager {
    @Inject
    private ObjectivesConfig config;
    @Inject
    private Client client;
    @Inject
    private SkillObjectives skillObjectives;
    @Inject
    private QuestObjectives questObjectives;

    private static final int objectiveListCount =4;
    // 0-> Skills , 1->Cmb Lvl, 2-> Quest, 3-> Quest Point
    private static final ArrayList<Objective>[] Objectives = new ArrayList[objectiveListCount+1];
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public ObjectivesManager(){
    }
    public void initialize(){
        log.info("----Initializing Objectives----");
        skillObjectives.initialize();
        questObjectives.initialize();
        log.info("----Generating Objectives----");
        generateObjectives();
        log.info("----Assigning Required By Values for Objectives----");
        assignRequiredByValues();
        log.info("----Combining Objectives Lists----");
        combineObjectivesList();
        log.info("----Sorting Objectives List by amount of things that require it----");
        sortByRequiredByCount();
        log.info("----Topologically sorting combined objectives Lists----");
        Objectives[objectiveListCount] = topologicallySortCombinedObjectiveList(Objectives[objectiveListCount]);
        log.info("----Assigning Priority Levels to Objectives----");
        prioritizeObjectives();
        log.info("----Updating Completion Statuses----");
        updateAllCompletionStatuses();
        log.info("----Delete Completed Objectives----");
        //removeCompletedTasks();
        removeHiddenTasks();
        remove0PriorityTasks();
        log.info("----Sort Objectives by Priority----");
        sortTasksListByPriority();
    }
    private void generateObjectives(){
        skillObjectives.generateObjectives();
        questObjectives.generateObjectives();
        Objectives[0]= skillObjectives.skillingObjectivesList;
        Objectives[1]= skillObjectives.CombatLevelObjectivesList;
        Objectives[2]= questObjectives.QuestObjectivesList;
        Objectives[3]= questObjectives.QuestPointObjectivesList;
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
            if (!requirement.isHasBeenSorted()) {
                dfs(requirement, result);
            }
        }
        result.add(objective);
    }

    //creates the last value in the Objectives list which is just a combination of all the objective lists
    public void combineObjectivesList(){
        Objectives[4]= new ArrayList<Objective>();
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
            obj.updateCompletedValue(client);
            obj.updateCanBeDone();
        }
    }

    //Go through all the objectives and trickle down the priority to their subsequent objectives
    private void prioritizeObjectives (){
        ArrayList<Objective> objectivesList = Objectives[objectiveListCount];
        for(int i = objectivesList.size()-1; i>=0;i--){
            for(String requirement: objectivesList.get(i).getRequirements()){
                ObjectivesManager.getObjectiveFromID(requirement).addToPriority(objectivesList.get(i).getPriorityLevel());
            }
            objectivesList.get(i).addToPriority( objectivesList.get(i).getSelfContainedPriorityLevel());
        }
        applyPriorityRatios();
    }

    //sets the Ratios for priorities that change priority based on player config settings
    private void applyPriorityRatios() {
    }

    private void removeCompletedTasks(){
        ArrayList<Objective> objectivesList = Objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(objectivesList.get(i).getObjectiveCompleted()){
                objectivesList.remove(i);
                i--;
            }
        }
    }
    private void removeHiddenTasks(){
        ArrayList<Objective> objectivesList = Objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(objectivesList.get(i).isHiddenObjective()){
                objectivesList.remove(i);
                i--;
            }
        }
    }
    private void remove0PriorityTasks(){
        ArrayList<Objective> objectivesList = Objectives[objectiveListCount];
        for(int i = 0; i < objectivesList.size();i++) {
            if(objectivesList.get(i).getPriorityLevel()==0){
                objectivesList.remove(i);
                i--;
            }
        }
    }

    private void sortByRequiredByCount(){
        Objectives[objectiveListCount].sort(Comparator.comparingInt(obj -> obj.getRequiredBy().size()));

    }
    private void sortTasksListByPriority(){
        Collections.sort(Objectives[objectiveListCount]);
    }

    private void resetObjectivePriorities (){

    }
    private void sortObjectivesByPriority (){

    }
    public void printRecommendedQuestObjectives () {
        ArrayList<QuestObjective> list = getRecommendedQuestObjectives();
        log.info("-----Printing Recommended Quest Objectives-----");
        for ( QuestObjective obj : list){
            log.info(obj.toString());
        }
    }
    public void printRecommendedSkillingObjectives () {
        ArrayList<SkillObjective> list = getRecommendedSkillingObjectives();
        log.info("-----Printing Recommended Skilling Objectives-----");
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
    private boolean hasDataBeenLoaded(){
        return true;
    }
    private boolean hasObjectivesBeenLoaded(){
        return true;
    }
    public void printAllObjectivesInPriorityOrder(){
        log.info("-----Printing Objectives-----");
        for(Objective objective: Objectives[objectiveListCount] ) {
            log.info(objective.toString());

        }
    }
    public void printAllObjectivesInPriorityOrderGroupedByCategory(){
       log.info(skillObjectives.toString());
       log.info(questObjectives.toString());
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
}
