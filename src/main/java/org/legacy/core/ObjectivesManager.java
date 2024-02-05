package org.legacy.core;

import org.legacy.data.ObjectiveData;
import org.legacy.objectives.models.Objective;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ObjectivesManager {
    @Inject
    private ObjectiveData availableObjectives;
    @Inject
    private ObjectivesConfig config;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public ObjectivesManager(){

    }

    public Objective getRecomendedObjective (){
        availableObjectives.updateValues();
        log.info(availableObjectives.toStringSkillingObjectives());
        return availableObjectives.getSkillingObjectives().get(0);
    }


}
