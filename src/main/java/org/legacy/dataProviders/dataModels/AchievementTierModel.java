package org.legacy.dataProviders.dataModels;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import org.legacy.utils.Difficulty;
import org.legacy.utils.Location;

import java.util.ArrayList;

@Getter
public class AchievementTierModel {
    private final int value;
    private final String type;
    private final Difficulty difficulty;
    private final int varBit;
    private final Location location;
    private final ArrayList<AchievementTaskModel> tasks;
    @Setter
    private boolean complete;


    public AchievementTierModel(Difficulty difficulty, Location location, String type, int value, int varBit){
        this.difficulty = difficulty;
        this.varBit = varBit;
        this.location = location;
        this.value = value;
        this.type = type;
        this.tasks= new ArrayList<>();

    }

    @Override
    public String toString() {
        return "AchievementModel{" +
                "difficulty=" + difficulty +
                ", varbit=" + varBit +
                ", location=" + location +
                ", complete=" +complete +
                ",Task="+tasks+
                '}';
    }

    public void addTask(AchievementTaskModel task) {
        task.setId(tasks.size()+1);
        tasks.add(task);
    }
}
