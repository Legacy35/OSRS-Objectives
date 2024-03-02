package org.legacy.objectives.models;

import net.runelite.api.Client;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import org.legacy.models.QuestModel;
import org.legacy.data.QuestData;
import org.legacy.utils.ObjectiveTags;

public class QuestObjective extends Objective{

    Quest quest;
    public QuestObjective(Quest quest){
        super("Temp", "temp", 1, "temp");
        this.quest=quest;
        QuestModel temp = QuestData.getQuestModel(quest);
        setTitle("Complete the "+temp.getName());
        setDescription("The guide to complete "+temp.getName()+ " can be found at " + temp.getWikiUrl());
        setID("QUEST-"+temp.getFormattedQuestName());
        setObjectiveCompleted(temp.getQuestState()==QuestState.FINISHED);
        addTag(ObjectiveTags.QUESTING);
    }

    @Override
    public void updateCompletedValue() {
        if(QuestData.getQuestModel(quest).getQuestState()== QuestState.FINISHED){
            setObjectiveCompleted(true);
            return;
        }
        setObjectiveCompleted(false);
    }
}
