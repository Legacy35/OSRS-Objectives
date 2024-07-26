package org.legacy.utils;

public enum Difficulty {
    EASY(1),
    MEDIUM(2),
    HARD(3),
    ELITE(4),
    MASTER(5),
    GRANDMASTER(6);

    private final int level;

    Difficulty(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}