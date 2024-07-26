package org.legacy.dataProviders;

import net.runelite.api.Client;
import org.legacy.core.ObjectivesPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public abstract class DataProvider {
    @Inject
    private Client client;
    public abstract void updateValues();
    public abstract String serializedData();


}
