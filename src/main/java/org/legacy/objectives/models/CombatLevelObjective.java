package org.legacy.objectives.models;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.VarPlayer;
import org.legacy.objectives.SkillObjectives;
import org.legacy.utils.ObjectiveType;

public class CombatLevelObjective extends Objective {
    int cmbLvl;
    public CombatLevelObjective(int cmbLvl) {
        super("Combat Level", "Combat Level", 0, "CMB_Lvl-"+cmbLvl);
        this.cmbLvl= cmbLvl;
        setHiddenObjective(true);
        addType(ObjectiveType.SKILLING);
        addRequirememnt("SKILL_"+Skill.ATTACK.getName().toUpperCase()+"_"+(cmbLvl*21/28));
        addRequirememnt("SKILL_"+Skill.DEFENCE.getName().toUpperCase()+"_"+(cmbLvl*21/28));
        addRequirememnt("SKILL_"+Skill.HITPOINTS.getName().toUpperCase()+"_"+(cmbLvl*21/28));
        addRequirememnt("SKILL_"+Skill.STRENGTH.getName().toUpperCase()+"_"+(cmbLvl*21/28));
        addRequirememnt("SKILL_"+Skill.MAGIC.getName().toUpperCase()+"_"+(cmbLvl*21/28));
        addRequirememnt("SKILL_"+Skill.RANGED.getName().toUpperCase()+"_"+(cmbLvl*21/28));
        addRequirememnt("SKILL_"+Skill.PRAYER.getName().toUpperCase()+"_"+(cmbLvl*21/28));
    }
    @Override
    public boolean updateCompletedValue(Client client) {
        setObjectiveCompleted(cmbLvl<=client.getLocalPlayer().getCombatLevel());
        return getObjectiveCompleted();
    }
}
