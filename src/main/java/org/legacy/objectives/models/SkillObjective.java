package org.legacy.objectives.models;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import org.legacy.data.SkillData;
import org.legacy.utils.ObjectiveType;

public class SkillObjective extends Objective{
    Skill skill;
    int targetLevel;
    public SkillObjective(Skill skill, int targetLevel) {
        super("Get to Lvl " + targetLevel + " in "+skill.getName(),"To complete the objective level up the corresponding skill to set goal",100-targetLevel,"SKILL_"+skill.getName().toUpperCase()+"_"+targetLevel);
        this.targetLevel=targetLevel;
        addType(ObjectiveType.SKILLING);
        addRequirememnt("SKILL-"+skill.getName().toUpperCase()+"-"+(targetLevel-1));
    }

    @Override
    public boolean updateCompletedValue(Client client) {
        if(SkillData.getSkill(skill).getLvl()>=targetLevel){
            setObjectiveCompleted(true);
            return true;
        }
        setObjectiveCompleted(false);
        return false;
    }
}
