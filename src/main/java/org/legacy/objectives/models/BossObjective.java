package org.legacy.objectives.models;

import org.legacy.dataProviders.BossDataProvider;
import org.legacy.utils.Boss;
import org.legacy.objectives.ObjectiveTags;

public class BossObjective extends Objective {
    Boss boss;
    int kc;
    public BossObjective(Boss boss, int kc) {
        super("Defeat "+boss.getUnformattedName(), "Defeat " + boss.getUnformattedName() +" until your total KC is " + kc , 1, "BOSS_KC-"+boss.name()+"-"+kc);
        this.boss = boss;
        this.kc = kc;
        addTag(ObjectiveTags.BOSSING);
    }

    @Override
    public void updateCompletedValue() {
        setObjectiveCompleted(BossDataProvider.getBossData(boss).getKillCount()>=kc);
    }
}
