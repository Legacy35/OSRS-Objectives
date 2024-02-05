package org.legacy.models;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.*;
import net.runelite.api.Skill;
import org.legacy.core.ObjectivesPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkillModel {

    @Getter @Setter
    private Skill skill;
    @Getter @Setter
    private String stringName;
    @Getter @Setter
    private int lvl;
    @Getter @Setter
    private int xp;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public SkillModel(Skill skill, Client client){
        this.skill =skill;
        stringName = skill.getName();
        xp= client.getSkillExperience(skill);
        lvl= client.getRealSkillLevel(skill);
    }

    @Override
    public String toString() {
        return "SkillModel{" +
                "name=" + skill +
                ", stringName='" + stringName + '\'' +
                ", lvl=" + lvl +
                ", xp=" + xp +
                '}';
    }
}
