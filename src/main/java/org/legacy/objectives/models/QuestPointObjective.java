package org.legacy.objectives.models;
import lombok.Getter;
import org.legacy.dataProviders.QuestDataProvider;
import org.legacy.objectives.ObjectiveTags;


@Getter
public class QuestPointObjective extends GenericObjective {
    private final int QPReq;
    public QuestPointObjective(int QPReq){
        super("Quest Point Requirement", "Quest Point Requirement", 0, "QP-"+QPReq,ObjectiveTags.QUESTING);
        this.QPReq=QPReq;
        setGeneralizedRequiredBy(ObjectiveTags.QUESTING);
    }
    @Override
    public void updateCompletedValue() {
        setObjectiveCompleted(QPReq<= QuestDataProvider.playerQP);
    }
}
