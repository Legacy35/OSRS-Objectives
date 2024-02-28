package org.legacy.objectives.models;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.VarPlayer;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.utils.ObjectiveTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class QuestPointObjective extends Objective {
    @Getter
    private final int QPReq;
    public QuestPointObjective(int QPReq){
        super("Quest Point Requirement", "Quest Point Requirement", 0, "QP-"+QPReq);
        this.QPReq=QPReq;
        setHiddenObjective(true);
        addTag(ObjectiveTags.QUESTING);
    }
    @Override
    public boolean updateCompletedValue(Client client) {
        setObjectiveCompleted(QPReq<=client.getVarpValue(VarPlayer.QUEST_POINTS));
        return getObjectiveCompleted();
    }
}
