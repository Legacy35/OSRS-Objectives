package org.legacy.objectives;

import org.legacy.objectives.models.Objective;
import org.legacy.objectives.models.WealthObjective;

import java.util.ArrayList;

public class ItemObjectivesProvider extends ObjectivesProvider {
    public ArrayList<Objective> WealthObjectivesList;
    @Override
    public void initialize() {
        WealthObjectivesList = new ArrayList<>();
    }

    @Override
    public void generateObjectives() {
        generateWealthObjectives();
    }

    public void generateWealthObjectives() {
        WealthObjectivesList.add(new WealthObjective("500K",500000L));
        WealthObjectivesList.add(new WealthObjective("1M", 1000000L));
        WealthObjectivesList.add(new WealthObjective("2M",2L*1000000L));
        WealthObjectivesList.add(new WealthObjective("5M",5L*5000000L));
        WealthObjectivesList.add(new WealthObjective("10M",10L*1000000L));
        WealthObjectivesList.add(new WealthObjective("15M",15L*1000000L));
        WealthObjectivesList.add(new WealthObjective("20M",20L*1000000L));
        WealthObjectivesList.add(new WealthObjective("30M",30L*1000000L));
        WealthObjectivesList.add(new WealthObjective("50M",50L*1000000L));
        WealthObjectivesList.add(new WealthObjective("100M",100L*1000000L));
        WealthObjectivesList.add(new WealthObjective("200M",200L*1000000L));
        WealthObjectivesList.add(new WealthObjective("400M",400L*1000000L));
        WealthObjectivesList.add(new WealthObjective("600M",600L*1000000L));
        WealthObjectivesList.add(new WealthObjective("800M",800L*1000000L));
        WealthObjectivesList.add(new WealthObjective("1B", 1000000000L));
        WealthObjectivesList.add(new WealthObjective("1.5B",(long)(1.5*1000000000L)));
        WealthObjectivesList.add(new WealthObjective("1B",2L*1000000000L));
        WealthObjectivesList.add(new WealthObjective("2.5B",(long)(2.5*1000000000L)));
        WealthObjectivesList.add(new WealthObjective("3B", 3L *1000000000L));
        WealthObjectivesList.add(new WealthObjective("4B",4L*1000000000L));
        WealthObjectivesList.add(new WealthObjective("5B",5L*1000000000L));

        for(int i=1;i<WealthObjectivesList.size();i++){
            WealthObjectivesList.get(i).addRequirement(WealthObjectivesList.get(i-1).getID());
        }
    }
}
