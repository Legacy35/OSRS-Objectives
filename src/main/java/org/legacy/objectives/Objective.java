package org.legacy.objectives;

import java.util.ArrayList;

public class Objective {
    ArrayList<ObjectiveType> types ;
    private int priorityLevel;
    ArrayList<Objective> requirements;
    private String title;
    private String description;
    private String reccomendationAFK;
    private String reccomendationProfit;
    private String reccomendationEfficient;
    private String ID;

    public Objective( String title, String description, int priorityLevel, String ID){
        this.title=title;
        this.description=description;
        this.priorityLevel=priorityLevel;
        requirements = new ArrayList<Objective>();
        types = new ArrayList<ObjectiveType>();
        this.ID=ID;
    }
    public void addRequirememnt(Objective req){
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

    @Override
    public String toString() {
        return "Objective{" +
                ", ID='" + ID + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
