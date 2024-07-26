package org.legacy.objectives.models;

import lombok.Getter;
import lombok.Setter;
import org.legacy.core.ObjectivesManager;
import org.legacy.objectives.ObjectiveTags;

import java.util.ArrayList;

public abstract class Objective implements Comparable<Objective> {
    @Getter
    ArrayList<ObjectiveTags> tags;
    @Getter@Setter
    private int selfContainedPriorityLevel;
    @Getter
    private int basePriorityLevel;
    @Getter@Setter
    private int priorityLevel;
    @Getter
    private ArrayList<String> requirements;
    @Getter
    private ArrayList<String> requiredBy;
    @Getter@Setter
    private ObjectiveTags generalizedRequiredBy; //If this objective is required it will instead be replaced with the task that has this tag with the highest priority
    @Getter@Setter
    private String title;
    @Getter@Setter
    private String description;
    @Getter@Setter
    private String reccomendationAFK;
    @Getter@Setter
    private String reccomendationProfit;
    @Getter@Setter
    private String reccomendationEfficient;
    @Setter
    private boolean objectiveCompleted;
    @Getter @Setter
    private boolean canBeDone;
    @Getter@Setter
    private String ID;
    @Getter@Setter
    private boolean priorityGiven;
    @Getter@Setter
    private boolean hasBeenSorted;
    public Objective(String title, String description, int priorityLevel, String ID){
        this.title = title;
        this.description = description;
        this.basePriorityLevel = priorityLevel;
        this.priorityLevel = priorityLevel;
        this.hasBeenSorted = false;
        requirements = new ArrayList<>();
        requiredBy = new ArrayList<>();
        tags = new ArrayList<>();
        this.ID = ID;
        updateCanBeDone();
    }
    public void addRequirement(String req){
        if (req==null){
            return;
        }
        requirements.add(req);
    }
    public boolean isGeneralizedObjective(){
        return generalizedRequiredBy != null;
    }
    public void addRequirements(ArrayList<String> reqs){
        if (reqs==null || reqs.isEmpty()){
            return;
        }
        requirements.addAll(reqs);
    }
    public void addRequiredBy(String req){
        if (req==null){
            return;
        }
        requiredBy.add(req);
    }
    public void addTag(ObjectiveTags type){
        tags.add(type);
    }
    public void addTags(ArrayList<ObjectiveTags> type){
        tags.addAll(type);
    }

    public void updateObjective(){
        if(!canBeDone){
            updateCanBeDone();
        }
        if(objectiveCompleted){
            return;
        }
        updateCompletedValue();
    }
    public abstract void updateCompletedValue();
    public void updateCanBeDone(){
        for(String requirement : requirements){
            if(!ObjectivesManager.getObjectiveFromID(requirement).objectiveCompleted){
                canBeDone = false;
            }
        }
        canBeDone = true;
    }
    public boolean getObjectiveCompleted(){
        return objectiveCompleted;
    }
    public void addToPriority(int value){
        priorityLevel += value;
    }
    public void resetPriority(){
        priorityLevel = basePriorityLevel;
    }
    public void setBasePriorityLevel(int lvl){
        basePriorityLevel=Math.max(lvl,0);
        priorityLevel=Math.max(lvl,0);
    }
    public void addBasePriorityLevel(int lvl){
        basePriorityLevel+=Math.max(lvl,0);
        priorityLevel+=Math.max(lvl,0);
    }
    @Override
    public int compareTo(Objective other) {
        return Integer.compare(this.priorityLevel, other.priorityLevel);
    }
    @Override
    public String toString() {
        return "Objective{" +
                ", ID='" + ID + '\'' +
               ", completionStatus=" + objectiveCompleted +
                ", requirements=" + requirements +
                //", requiredBy=" + requiredBy +
                ", basePriorityLevel=" + basePriorityLevel +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
