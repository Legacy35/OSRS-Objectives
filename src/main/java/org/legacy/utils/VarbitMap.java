package org.legacy.utils;

public enum VarbitMap {
    ACTIVE_PRAYER_HASH(4101),
    //AMOUNT_OF_SUCCESSFUL_HITS_DONE(5934),
    MINUTES_CLIENT_HAS_BEEN_OPEN(8354),

    CA_TASK_MENU_FILTER_TIER(12858),
    CA_TASK_MENU_FILTER_TYPE(12859),
    CA_TASK_MENU_FILTER_MONSTER(12860),
    CA_TASK_MENU_FILTER_COMPLETED(12861),
    NUM_EASY_CA_TASKS_COMPLETED(12885),
    NUM_MEDIUM_CA_TASKS_COMPLETED(12886),
    NUM_HARD_CA_TASKS_COMPLETED(12887),
    NUM_ELITE_CA_TASKS_COMPLETED(12888),
    NUM_MASTER_CA_TASKS_COMPLETED(12889),
    NUM_GRANDMASTER_CA_TASKS_COMPLETED(12890),
    UNKOWN_CA_RELATED(12906),
    YELLOW__FLASHING_ARROW_VISIBLE(14192),
    TOTAL_COMBAT_POINTS(14815),

    NOT_IDENTIFIED(-1);
    private final int varbit;

    VarbitMap(int varbit) {
        this.varbit = varbit;
    }

    public int getVarbit() {
        return varbit;
    }
    public static VarbitMap fromValue(int varbit) {
        for (VarbitMap numEnum : VarbitMap.values()) {
            if (numEnum.varbit == varbit) {
                return numEnum;
            }
        }

        return NOT_IDENTIFIED; // Return catch-all value if number not found
    }
}

