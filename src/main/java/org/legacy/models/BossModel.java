package org.legacy.models;

import lombok.Getter;
import lombok.Setter;
import org.legacy.utils.Boss;

import java.util.ArrayList;

@Getter
public class BossModel {
    @Setter
    private int killCount;
    @Setter
    private double PersonalBest;
    private final ArrayList<Integer> associatedCombatTasksVarps;
    private final String name;
    private final String formatted_name;
    private final Boss boss;
   public BossModel (Boss boss){
       this.boss = boss;
       killCount=-1;
       associatedCombatTasksVarps= new ArrayList<Integer>();
       name= boss.getUnformattedName();
       formatted_name=boss.name();
   }
   public void addCombatAchievemntTaskVarp(int varp){
       associatedCombatTasksVarps.add(varp);
   }

    @Override
    public String toString() {
        return "BossModel{" +
                "killCount=" + killCount +
                ", associatedCombatTasksVarps=" + associatedCombatTasksVarps +
                ", name='" + name + '\'' +
                ", boss=" + boss +
                '}';
    }

}
