package org.legacy.data;

import lombok.Getter;
import net.runelite.api.Skill;
import org.legacy.objectives.models.Objective;
import org.legacy.objectives.models.SkillObjective;
import org.legacy.utils.ObjectiveType;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class ObjectiveData extends Data
{
    @Inject
    private BankData playerBankValue;
    @Inject
    private SkillData playerSkillData;
    @Inject
    private QuestData playerQuestData;
    @Inject
    private AchievementData playerAchievementData;
    @Getter
    ArrayList<Objective> skillingObjectives = new ArrayList<Objective>();
    @Getter
    ArrayList<Objective> BankObjectives = new ArrayList<Objective>();
    @Getter
    ArrayList<Objective> questObjectives = new ArrayList<Objective>();
    @Getter
    ArrayList<Objective> achievementObjectives = new ArrayList<Objective>();
    public ObjectiveData(){
    }
    public void updateValues() {
        addBankValueObjectives();
        addSkillingObjectives();
        addQuestObjectives();
        addPlayerAchievementObjectives();
    }
    private void addBankValueObjectives() {

    }
    private void addSkillingObjectives() {
        skillingObjectives.clear();
        for(Skill skill: Skill.values()){
            if(SkillData.getSkill(skill)!=null) {
                addAllSkillObjectives(skill);
            }
        }
    }
    private void addAllSkillObjectives(Skill skill) {
        for(int i = 2; i<99;i++ ){
            Objective goal= new SkillObjective(skill,i);
            skillingObjectives.add(goal);
        }
    }
    private void addQuestObjectives() {

    }
    private void addPlayerAchievementObjectives() {


    }
    public String toStringSkillingObjectives(){
        String result= "ObjectiveData{ skillingObjectives=";
        for(Objective temp :skillingObjectives){
            result += ",\n " +temp;
        }
        return result+ "\n}";
    }

}
