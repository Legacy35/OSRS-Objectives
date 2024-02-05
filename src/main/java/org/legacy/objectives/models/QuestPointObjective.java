package org.legacy.objectives.models;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.client.plugins.achievementdiary.Requirement;
import org.legacy.objectives.models.Objective;
import net.runelite.api.VarPlayer;
import org.legacy.utils.ObjectiveType;


public class QuestPointObjective extends Objective {
    @Getter
    private final int QPReq;
    public QuestPointObjective(int QPReq){
        super("Quest Point Requirement", "Quest Point Requirement", 0, "QP-"+QPReq);
        this.QPReq=QPReq;
        setHiddenObjective(true);
        addType(ObjectiveType.QUESTING);
    }
    @Override
    public boolean updateCompletedValue(Client client) {
        setObjectiveCompleted(QPReq<=client.getVarbitValue(VarPlayer.QUEST_POINTS));
        return getObjectiveCompleted();
    }
}
