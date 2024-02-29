package org.legacy.data;

import net.runelite.api.Client;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.VarPlayer;
import org.legacy.models.QuestModel;
import org.legacy.models.SkillModel;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;

public class QuestData extends Data{
    @Inject
    private Client client;
    public static int playerQP;
    private static HashMap<Quest, QuestModel> questMap = new HashMap<>();
    @Override
    public void updateValues() {
        playerQP = client.getVarpValue(VarPlayer.QUEST_POINTS);
        for(Quest quest :Quest.values()){
            if (!questMap.containsKey(quest)){
                QuestModel temp = new QuestModel(quest);
                temp.updateQuestState(client);
                questMap.put(quest,temp);
            }else if(questMap.get(quest).getQuestState()!= QuestState.FINISHED){
                questMap.get(quest).updateQuestState(client);
            }

        }
    }
    public static QuestModel getQuestModel (Quest quest){
        return questMap.get(quest);
    }
}
