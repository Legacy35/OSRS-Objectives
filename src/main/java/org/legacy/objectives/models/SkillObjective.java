package org.legacy.objectives.models;

import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.data.SkillData;
import org.legacy.utils.ObjectiveTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkillObjective extends Objective{
    @Getter
    private Skill skill;
    @Getter
    private int targetLevel;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public SkillObjective(Skill skill, int targetLevel) {
        super("Get to Lvl " + targetLevel + " in "+skill.getName(),"To complete the objective level up the corresponding skill to set goal",0,"SKILL-"+skill.getName().toUpperCase()+"-"+targetLevel);
        this.targetLevel=targetLevel;
        addTag(ObjectiveTags.SKILLING);
        if (targetLevel==99){
            setBasePriorityLevel(1);
        }
        this.skill=skill;
        if(targetLevel>2) {
            this.requirements.add("SKILL-"+skill.getName().toUpperCase()+"-"+(targetLevel-1));
        }
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
