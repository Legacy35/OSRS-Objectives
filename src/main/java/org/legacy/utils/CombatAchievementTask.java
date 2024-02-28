package org.legacy.utils;

public enum CombatAchievementTask {
    NOXIUS_FOE(0, Difficulty.Easy),
    BARROWS_NOVICE(24, Difficulty.Easy),
    DEFENCE_WHAT_DEFENCE(28, Difficulty.Easy),
    BIG_BLACK_AND_FIERY(32, Difficulty.Easy),
    THE_DEMONIC_PUNCHING_BAG(33, Difficulty.Easy),
    PREPERATION_IS_KEY(39, Difficulty.Easy),
    FIGHTING_AS_INTENDED_II(41, Difficulty.Easy),
    BRYOPHYTA_NOVICE(35, Difficulty.Easy),
    PRETOECTION_FROM_MOSS(37, Difficulty.Easy),
    A_SLOW_DEATH(40, Difficulty.Easy),
    DERANGED_ARCHAEOLOGIST_NOVICE(76, Difficulty.Easy),
    THE_WALKING_VOLCANO(80, Difficulty.Easy),
    GIANT_MOLE_NOVICE(177, Difficulty.Easy),
    NOT_SO_GREAT_AFTER_ALL(121, Difficulty.Easy),
    A_GREATER_FOE(120, Difficulty.Easy),
    A_DEMONS_BEST_FRIEND(122, Difficulty.Easy),
    KING_BLACK_DRAGON_NOVICE(162, Difficulty.Easy),
    SHAYZIEN_PROTECTOR (175, Difficulty.Easy),
    A_SCALEY_ENCOUNTER (174, Difficulty.Easy),
    INTO_THE_DEN_OF_GIANTS (398, Difficulty.Easy),
    FIGHTING_AS_INTENDED (134, Difficulty.Easy),
    SLEEPING_GIANT (131, Difficulty.Easy),
    OBOR_NOVICE (129, Difficulty.Easy),
    SARACHNIS_NOVICE (206, Difficulty.Easy),
    SCURRIUS_NOVICE (521, Difficulty.Easy),
    SIT_RAT (523, Difficulty.Easy),
    CALM_BEFORE_THE_STORM (357, Difficulty.Easy),
    MASTER_OF_BUCKETS (356, Difficulty.Easy),
    TEMPOROSS_NOVICE (353, Difficulty.Easy),
    FIRE_IN_THE_HOLE (360, Difficulty.Easy),
    MUMMY (281, Difficulty.Easy),
    HANDYMAN (282, Difficulty.Easy),
    COSY (285, Difficulty.Easy),
    WINTERTODT_NOVICE (279, Difficulty.Easy),
    A_SLITHERY_ENCOUNTER (287, Difficulty.Easy);


    private final int varpIndex;
    private final Difficulty difficulty;

    CombatAchievementTask(int varpIndex , Difficulty difficulty) {
        this.varpIndex = varpIndex;
        this.difficulty = difficulty;
    }

    public int getVarpIndex() {
        return varpIndex;
    }
    public Difficulty getDifficulty() {
        return difficulty;
    }
    public static CombatAchievementTask getByVarpIndex(int number) {
        for (CombatAchievementTask myEnum : CombatAchievementTask.values()) {
            if (myEnum.getVarpIndex() == number) {
                return myEnum;
            }
        }
        return null; // Enum not found for given number
    }
}
