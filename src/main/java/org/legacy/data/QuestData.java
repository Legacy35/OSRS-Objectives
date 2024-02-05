package org.legacy.data;

import net.runelite.api.Client;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import org.legacy.models.QuestModel;


import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class QuestData extends Data{
    @Inject
    private Client client;
    ArrayList<QuestModel> ListOfQuests = new ArrayList<QuestModel>();
    public QuestData(){
    }
    public void updateValues() {
        ListOfQuests.clear();
        for(Quest quest :Quest.values()){
            if (quest.getState(client)!= QuestState.FINISHED) {
                ListOfQuests.add(new QuestModel(quest, client));
            }
        }
    }

    @Override
    public String toString() {
        String result=  "QuestData{ ListOfQuests=" ;
        for(QuestModel temp :ListOfQuests){
            result += ",\n " +temp;
        }
        return result+ "\n}";
    }
}
