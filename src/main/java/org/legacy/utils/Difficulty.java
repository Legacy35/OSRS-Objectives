package org.legacy.utils;

public enum Difficulty {
    Easy(1),
    Medium(2),
    Hard(3),
    Elite(4),
    Master(5),
    GrandMaster(6);

    private final int level;

    Difficulty(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}