package org.legacy.data;

import lombok.Getter;
import net.runelite.api.Skill;
import org.legacy.models.SkillModel;
import org.legacy.objectives.Objective;
import org.legacy.objectives.ObjectiveType;

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
                addAllSkillObjectives(skill, SkillData.getSkill(skill).getLvl());
            }
        }
    }
    private void addAllSkillObjectives(Skill skill, int curLvl) {
        Objective prevObjective = null;
        for(int i = curLvl+1; i<99;i++ ){
            Objective goal= new Objective("Get to Lvl " + i + " in "+skill.getName(),"To complete the objective level up the corresponding skill to set goal",100-curLvl,"SKILL_"+skill.getName().toUpperCase()+"_"+i);
            goal.addType(ObjectiveType.SKILLING);
            goal.addRequirememnt(prevObjective);
            skillingObjectives.add(goal);
            prevObjective=goal;
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
