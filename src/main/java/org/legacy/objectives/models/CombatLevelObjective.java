package org.legacy.objectives.models;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import org.legacy.utils.ObjectiveTags;

public class CombatLevelObjective extends Objective {
    int cmbLvl;
    public CombatLevelObjective(int cmbLvl) {
        super("Combat Level", "Combat Level", 0, "CMB-"+cmbLvl);
        this.cmbLvl= cmbLvl;
        setHiddenObjective(true);
        addTag(ObjectiveTags.SKILLING);
        addRequirement("SKILL-"+Skill.ATTACK.getName().toUpperCase()+"-"+(cmbLvl*21/28));
        addRequirement("SKILL-"+Skill.DEFENCE.getName().toUpperCase()+"-"+(cmbLvl*21/28));
        addRequirement("SKILL-"+Skill.HITPOINTS.getName().toUpperCase()+"-"+(cmbLvl*21/28));
        addRequirement("SKILL-"+Skill.STRENGTH.getName().toUpperCase()+"-"+(cmbLvl*21/28));
        addRequirement("SKILL-"+Skill.MAGIC.getName().toUpperCase()+"-"+(cmbLvl*21/28));
        addRequirement("SKILL-"+Skill.RANGED.getName().toUpperCase()+"-"+(cmbLvl*21/28));
        addRequirement("SKILL-"+Skill.PRAYER.getName().toUpperCase()+"-"+(cmbLvl*21/28));
    }
    @Override
    public boolean updateCompletedValue(Client client) {
        setObjectiveCompleted(cmbLvl<=client.getLocalPlayer().getCombatLevel());
        return getObjectiveCompleted();
    }
}
