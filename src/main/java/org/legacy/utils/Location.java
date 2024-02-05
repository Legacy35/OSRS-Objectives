package org.legacy.utils;

public enum Location {
    ARDOUGNE(1),
    DESERT(2),
    FALADOR(3),
    FREMENNIK(4),
    KANDARIN(5),
    KARAMJA(6),
    KOUREND(7),
    LUMBRIDGE(8),
    MORYTANIA(9),
    VARROCK(10),
    WESTERN(11),
    WILDERNESS(12);

    private final int Location;

    Location(int Location) {
        this.Location = Location;
    }

    public int getLocation() {
        return Location;
    }
}
