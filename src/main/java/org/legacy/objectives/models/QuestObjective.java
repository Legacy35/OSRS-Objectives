package org.legacy.objectives.models;

import net.runelite.api.Client;
import net.runelite.api.QuestState;
import org.legacy.models.QuestModel;
import org.legacy.utils.ObjectiveTags;

public class QuestObjective extends Objective{

    QuestModel quest;
    public QuestObjective(QuestModel quest){
        super("Complete the "+quest.getName() +"Quest:","The guide to complete "+quest.getName()+ " cane be found at " + quest.getWikiUrl(), 1, "QUEST-"+quest.getFormattedQuestName());
        this.quest=quest;
        setObjectiveCompleted(quest.getQuestState()==QuestState.FINISHED);
        addTag(ObjectiveTags.QUESTING);
    }

    @Override
    public boolean updateCompletedValue(Client client) {
        if(quest.getQuestState()== QuestState.FINISHED){
            setObjectiveCompleted(true);
            return true;
        }
        setObjectiveCompleted(false);
        return false;

    }
}
