package org.legacy.objectives.models;

import lombok.Getter;
import org.legacy.dataProviders.SkillDataProvider;
import org.legacy.objectives.ObjectiveTags;

public class CombatLevelObjective extends GenericObjective {
    @Getter
    private int cmbLvl;
    public CombatLevelObjective(int cmbLvl) {
        super("Combat Level", "Combat Level", 0, "CMB-"+cmbLvl,ObjectiveTags.COMBAT_SKILLING);
        this.cmbLvl= cmbLvl;
        addTag(ObjectiveTags.SKILLING);
        addTag(ObjectiveTags.COMBAT_LEVELS);
       if (cmbLvl > 4) {
            addRequirement("CMB-"+(cmbLvl-1));
        }
        if (cmbLvl==126){
            setPriorityLevel(1);
        }
    }
    @Override
    public void updateCompletedValue() {
        setObjectiveCompleted(cmbLvl<= SkillDataProvider.playerCmbLvl);
    }
}
