package org.legacy.dataProviders.dataModels;

import org.legacy.utils.Difficulty;
import org.legacy.utils.CombatAchievementTask;

public class CombatAchievementTaskModel {
    String name;
    CombatAchievementTask combatAchievementTask;
    boolean completed;

    BossModel boss;

    public CombatAchievementTaskModel(CombatAchievementTask combatAchievementTask, boolean completed){
        this.combatAchievementTask = combatAchievementTask;
        name= unformatName(getFormattedName());
        this.completed=completed;
    }
    private String unformatName(String screamingSnakeCase) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = screamingSnakeCase.split("_");

        for (String word : words) {
            stringBuilder.append(Character.toUpperCase(word.charAt(0)));
            stringBuilder.append(word.substring(1).toLowerCase());
            stringBuilder.append(" ");
        }

        // Remove the trailing space
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }
    public int getVarpIndex() {
        return combatAchievementTask.getVarpIndex();
    }
    public Difficulty getDifficulty() {
        return combatAchievementTask.getDifficulty();
    }
    public String getFormattedName() {
        return combatAchievementTask.name();
    }

    @Override
    public String toString() {
        return "CombatAchievementTaskModel{" +
                "name='" + name + '\'' +
                //", difficulty=" + getDifficulty() +
                ", varpIndex=" + getVarpIndex() +
                ", completed=" + completed +
                '}';
    }
}
