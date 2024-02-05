package org.legacy.objectives.models;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import org.legacy.utils.ObjectiveLookUp;
import org.legacy.utils.ObjectiveType;

import java.util.ArrayList;

public abstract class Objective {
    @Getter
    ArrayList<ObjectiveType> types ;
    @Getter@Setter
    private int priorityLevel;
    @Getter
    ArrayList<String> requirements;
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
    @Getter @Setter
    private boolean objectiveCompleted;
    @Getter @Setter
    private boolean canBeDone;
    @Getter@Setter
    private boolean HiddenObjective;
    @Getter
    private String ID;

    public Objective(String title, String description, int priorityLevel, String ID){
        this.title=title;
        this.description=description;
        this.priorityLevel=priorityLevel;
        requirements = new ArrayList<String>();
        types = new ArrayList<ObjectiveType>();
        this.ID=ID;
        HiddenObjective=false;
        updateCanBeDone();
    }
    public void addRequirememnt(String req){
        if (req==null){
            return;
        }
        requirements.add(req);
    }
    public void clearRequirememnts(){
        requirements.clear();
    }
    public void addType(ObjectiveType type){
        types.add(type);
    }
    public abstract boolean updateCompletedValue(Client client);
    public boolean updateCanBeDone(){
        for(String requirement : requirements){
            if(!ObjectiveLookUp.getObjectiveFromID(requirement).objectiveCompleted){
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
    @Override
    public String toString() {
        return "Objective{" +
                ", ID='" + ID + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
