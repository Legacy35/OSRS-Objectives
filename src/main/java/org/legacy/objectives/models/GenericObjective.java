package org.legacy.objectives.models;

import org.legacy.objectives.ObjectiveTags;

public abstract class GenericObjective extends Objective {
    public GenericObjective(String title, String description, int priorityLevel, String ID, ObjectiveTags genericReq) {
        super(title, description, priorityLevel, ID);
        setGeneralizedRequiredBy(genericReq);
    }
}
