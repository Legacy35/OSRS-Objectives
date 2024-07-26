package org.legacy.objectives.models;

import org.legacy.dataProviders.BankDataProvider;
import org.legacy.objectives.ObjectiveTags;

public class WealthObjective extends Objective{
    private long wealthGoal;
    private String wealthGoalString;
    public WealthObjective(String wealthGoalString, long wealthGoal) {
        super("Obtain "+ wealthGoalString +" Total Bank Value", "", 1, "WEALTH-"+wealthGoalString);
        this.wealthGoalString= wealthGoalString;
        this.wealthGoal=wealthGoal;
        updateCompletedValue();
        setGeneralizedRequiredBy(ObjectiveTags.PROFITABLE);
    }

    @Override
    public void updateCompletedValue() {
        setObjectiveCompleted(BankDataProvider.getTotalValue()>=wealthGoal);
    }
}
