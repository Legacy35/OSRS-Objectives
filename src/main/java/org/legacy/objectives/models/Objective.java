package org.legacy.objectives.models;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import org.legacy.core.ObjectivesManager;
import org.legacy.utils.ObjectiveTags;

import java.util.ArrayList;

public abstract class Objective implements Comparable<Objective> {
    @Getter
    ArrayList<ObjectiveTags> types ;
    @Getter@Setter
    private int selfContainedPriorityLevel;
    @Getter
    private int basePriorityLevel;
    @Getter@Setter
    private int priorityLevel;
    @Getter
    ArrayList<String> requirements;
    @Getter
    ArrayList<String> requiredBy;
    @Getter
    private String title;
    @Getter
    private String description;
    @Getter
    private String reccomendationAFK;
    @Getter
    private String reccomendationProfit;
    @Getter
    private String reccomendationEfficient;
    @Setter
    private boolean objectiveCompleted;
    @Getter @Setter
    private boolean canBeDone;
    @Getter@Setter
    private boolean HiddenObjective;
    @Getter
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
        requirements = new ArrayList<String>();
        requiredBy = new ArrayList<String>();
        types = new ArrayList<ObjectiveTags>();
        this.ID = ID;
        HiddenObjective=false;
        updateCanBeDone();
    }
    public void addRequirement(String req){
        if (req==null){
            return;
        }
        requirements.add(req);
    }
    public void addRequiredBy(String req){
        if (req==null){
            return;
        }
        requiredBy.add(req);
    }
    public void clearRequirememnts(){
        requirements.clear();
    }
    public void addTag(ObjectiveTags type){
        types.add(type);
    }
    public abstract boolean updateCompletedValue(Client client);
    public boolean updateCanBeDone(){
        for(String requirement : requirements){
            if(!ObjectivesManager.getObjectiveFromID(requirement).objectiveCompleted){
                canBeDone = false;
                return false;
            }
        }
        canBeDone = true;
        return true;
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
               //", completionStatus=" + objectiveCompleted +
                ", requirements=" + requirements +
                ", requiredBy=" + requiredBy +
                ", basePriorityLevel=" + basePriorityLevel +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
