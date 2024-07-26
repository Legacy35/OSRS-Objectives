package org.legacy.objectives;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Skill;
public enum ObjectiveTags {
    QUESTING,
    SKILLING,
    COMBAT_SKILLING,
    COMBAT_LEVELS,
    ACHIEVEMENTS,
    COMABT_ACHIEVEMENTS,
    DIARY_ACHIEVEMENTS,
    PVM,
    BOSSING,
    REOCCURING_TASK,
    COLLECTION_LOG,
    WILDERNESS,
    PROFITABLE,
    MUSIC,
    GIVES_XP;

    @Getter
    private Skill skill;
    ObjectiveTags(){}

    public ObjectiveTags setSkill(Skill skill) {
        this.skill=skill;
        return this;
    }
}
