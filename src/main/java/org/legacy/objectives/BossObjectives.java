package org.legacy.objectives;

import org.legacy.objectives.models.BossObjective;
import org.legacy.objectives.models.Objective;
import org.legacy.utils.Boss;
import org.legacy.utils.ObjectiveTags;

import java.util.ArrayList;

public class BossObjectives {
    public ArrayList<Objective> bossObjectivesList;
    public void initialize(){
        bossObjectivesList = new ArrayList<>();
    }
    public void generateObjectives() {
        bossObjectivesList.clear();
        addKCBossObjectives();
    }
    public void addKCBossObjectives(){
        int[] Kc = {1,5,25,50,100,150};
        for(Boss boss : Boss.values()) {
            ArrayList<ObjectiveTags> temp = getObjectiveTags(boss);
            int i =4;
            if(temp.contains(ObjectiveTags.KC_1)){
               i=1;
            }
            else if(temp.contains(ObjectiveTags.KC_5)){
                i=2;
            }
            else if(temp.contains(ObjectiveTags.KC_150)){
                i=6;
            }
           for(int j=0; j<i;j++){
               BossObjective objective = new BossObjective(boss,Kc[j]);
               objective.addTag(temp);
               bossObjectivesList.add(objective);
           }
        }
    }
    private ArrayList<ObjectiveTags> getObjectiveTags(Boss boss){
        ArrayList<ObjectiveTags> tags= new ArrayList<ObjectiveTags>();
        switch (boss) {
            case CALLISTO:
            case ARTIO:
            case CALVARION:
            case CHAOS_ELEMENTAL:
            case CHAOS_FANATIC:
            case CRAZY_ARCHAEOLOGIST:
            case KING_BLACK_DRAGON:
            case SCORPIA:
            case SPINDEL:
            case VETION:
            case VENENATIS:
                tags.add(ObjectiveTags.WILDERNESS);
            case THE_MIMIC:
            case THEATRE_OF_BLOOD_ENTRY:
            case TOMBS_OF_AMASCUT_ENTRY:
                tags.add(ObjectiveTags.KC_1);
                break;
            case TZKAL_ZUK:
            case TZTOK_JAD:
                tags.add(ObjectiveTags.KC_5);
                break;
            case CHAMBERS_OF_XERIC:
            case TOMBS_OF_AMASCUT_EXPERT:
            case CHAMBERS_OF_XERIC_CM:
            case THEATRE_OF_BLOOD_HM:
                tags.add(ObjectiveTags.KC_150);
                break;
        }

        return tags;

    }
}
