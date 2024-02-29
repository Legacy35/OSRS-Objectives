package org.legacy.data;

import net.runelite.api.Client;

import javax.inject.Inject;

public abstract class Data {
    @Inject
    private Client client;
    public abstract void updateValues();

}
