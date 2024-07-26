package org.legacy.objectives;

import net.runelite.api.Skill;
import org.legacy.dataProviders.SkillDataProvider;
import org.legacy.objectives.models.CombatLevelObjective;
import org.legacy.objectives.models.Objective;
import org.legacy.objectives.models.SkillObjective;

import java.util.ArrayList;

public class SkillObjectivesProvider extends ObjectivesProvider {
    public ArrayList<Objective> skillingObjectivesList;
    public ArrayList<Objective>CombatLevelObjectivesList;
    public void initialize(){
        skillingObjectivesList= new ArrayList<>();
        CombatLevelObjectivesList= new ArrayList<>();
    }
    public void generateObjectives() {
        skillingObjectivesList.clear();
        addAllSkillingObjectives();
        CombatLevelObjectivesList.clear();
        addAllCMBObjectives();
    }

    private void addAllCMBObjectives() {
        for(int i = 4; i<=126;i++ ){
            CombatLevelObjective goal= new CombatLevelObjective(i);
            CombatLevelObjectivesList.add(goal);
        }
    }

    private void addAllSkillingObjectives() {
        for(Skill skill: Skill.values()){
            if(SkillDataProvider.getSkill(skill)!=null) {
                addAllSkillLevelsToObjectives(skill);
            }
        }
    }
    private void addAllSkillLevelsToObjectives(Skill skill) {
        for(int i = 2; i<=99;i++ ){
            SkillObjective goal= new SkillObjective(skill,i);
            skillingObjectivesList.add(goal);
        }
    }
    @Override
    public String toString(){
        String result= "SkillObjectives{ skillingObjectives=";
        for(Objective temp :skillingObjectivesList){
            result += "+ \n},\n " +temp;
        }
        result+="\nskillingObjectives=";
        for(Objective temp :CombatLevelObjectivesList){
            result += ",\n " +temp;
        }
        return result+ "\n}";
    }
}
