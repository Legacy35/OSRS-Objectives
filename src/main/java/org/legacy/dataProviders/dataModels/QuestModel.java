package org.legacy.dataProviders.dataModels;

import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.utils.ExternalQuestResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuestModel {
    @Getter
    private Quest quest;
    @Getter
    private final String name;
    @Getter
    private final String wikiUrl;
    @Getter
    private final int index;
    @Getter
    private QuestState questState;
    @Getter
    private final String formattedQuestName;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);

    public QuestModel(Quest quest){
        this.quest = quest;
        name= quest.getName();
        formattedQuestName = name.replaceAll("[^a-zA-Z0-9 ]", "").toUpperCase().replace(' ', '_');
        wikiUrl = getUrlForQuest();
        index = quest.getId();
    }
    public void updateQuestState (Client client){
        questState= quest.getState(client);
    }
    private String getUrlForQuest() {
        try {
            ExternalQuestResources quest = ExternalQuestResources.valueOf(formattedQuestName);
            return quest.getUrl();
        } catch (IllegalArgumentException e) {
            log.error("Quest " + formattedQuestName + " not found.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "QuestModel{" +
                "quest=" + quest +
                ", name='" + name + '\'' +
                ", wikiUrl='" + wikiUrl + '\'' +
                ", index=" + index +
                ", questState=" + questState +
                '}';
    }
}
