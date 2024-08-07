package org.legacy.objectives.models;

import lombok.Getter;
import net.runelite.api.Skill;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.dataProviders.SkillDataProvider;
import org.legacy.objectives.ObjectiveTags;
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
       switch (skill){
           case MAGIC:
           case ATTACK:
           case PRAYER:
           case RANGED:
           case DEFENCE:
           case STRENGTH:
           case HITPOINTS:
               addTag(ObjectiveTags.COMBAT_SKILLING);
        }
        if (targetLevel==99){
            setBasePriorityLevel(1);
        }
        this.skill=skill;
        if(targetLevel>2) {
            this.getRequirements().add("SKILL-"+skill.getName().toUpperCase()+"-"+(targetLevel-1));
        }
    }

    @Override
    public void updateCompletedValue() {
        if(SkillDataProvider.getSkill(skill).getLvl()>=targetLevel){
            setObjectiveCompleted(true);
            return;
        }
        setObjectiveCompleted(false);
    }
}
