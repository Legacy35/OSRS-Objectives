package org.legacy.models;

import net.runelite.api.Client;
import org.legacy.utils.Difficulty;
import org.legacy.utils.Location;

public class AchievementModel {
    Difficulty difficulty;
    int varbit;
    Location location;
    public AchievementModel(Difficulty difficulty, Location location, int varbit){
        this.difficulty=difficulty;
        this.varbit=varbit;
        this.location=location;
    }

    @Override
    public String toString() {
        return "AchievementModel{" +
                "difficulty=" + difficulty +
                ", varbit=" + varbit +
                ", location=" + location +
                '}';
    }
    public String toString(Client client) {
        return "AchievementModel{" +
                "difficulty=" + difficulty +
                ", varbit=" + varbit +
                ", location=" + location +
                ", value=" + client.getVarbitValue(varbit) +
                '}';
    }
}
