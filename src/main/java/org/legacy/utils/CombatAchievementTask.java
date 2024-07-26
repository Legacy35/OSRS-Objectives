package org.legacy.utils;

public enum CombatAchievementTask {
    NOXIUS_FOE(0, Difficulty.EASY),
    BARROWS_NOVICE(24, Difficulty.EASY),
    DEFENCE_WHAT_DEFENCE(28, Difficulty.EASY),
    BIG_BLACK_AND_FIERY(32, Difficulty.EASY),
    THE_DEMONIC_PUNCHING_BAG(33, Difficulty.EASY),
    PREPERATION_IS_KEY(39, Difficulty.EASY),
    FIGHTING_AS_INTENDED_II(41, Difficulty.EASY),
    BRYOPHYTA_NOVICE(35, Difficulty.EASY),
    PRETOECTION_FROM_MOSS(37, Difficulty.EASY),
    A_SLOW_DEATH(40, Difficulty.EASY),
    DERANGED_ARCHAEOLOGIST_NOVICE(76, Difficulty.EASY),
    THE_WALKING_VOLCANO(80, Difficulty.EASY),
    GIANT_MOLE_NOVICE(177, Difficulty.EASY),
    NOT_SO_GREAT_AFTER_ALL(121, Difficulty.EASY),
    A_GREATER_FOE(120, Difficulty.EASY),
    A_DEMONS_BEST_FRIEND(122, Difficulty.EASY),
    KING_BLACK_DRAGON_NOVICE(162, Difficulty.EASY),
    SHAYZIEN_PROTECTOR (175, Difficulty.EASY),
    A_SCALEY_ENCOUNTER (174, Difficulty.EASY),
    INTO_THE_DEN_OF_GIANTS (398, Difficulty.EASY),
    FIGHTING_AS_INTENDED (134, Difficulty.EASY),
    SLEEPING_GIANT (131, Difficulty.EASY),
    OBOR_NOVICE (129, Difficulty.EASY),
    SARACHNIS_NOVICE (206, Difficulty.EASY),
    SCURRIUS_NOVICE (521, Difficulty.EASY),
    SIT_RAT (523, Difficulty.EASY),
    CALM_BEFORE_THE_STORM (357, Difficulty.EASY),
    MASTER_OF_BUCKETS (356, Difficulty.EASY),
    TEMPOROSS_NOVICE (353, Difficulty.EASY),
    FIRE_IN_THE_HOLE (360, Difficulty.EASY),
    MUMMY (281, Difficulty.EASY),
    HANDYMAN (282, Difficulty.EASY),
    COSY (285, Difficulty.EASY),
    WINTERTODT_NOVICE (279, Difficulty.EASY),
    A_SLITHERY_ENCOUNTER (287, Difficulty.EASY);


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
