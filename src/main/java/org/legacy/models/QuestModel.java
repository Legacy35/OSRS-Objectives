package org.legacy.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.runelite.api.Client;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.utils.ExternalQuestResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuestModel {
    Quest quest;
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String wikiUrl;

    @Getter
    @Setter
    private int index;

    @Getter
    @Setter
    private QuestState questState;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);

    public QuestModel(Quest quest, Client client){
        this.quest = quest;
        name= quest.getName();
        wikiUrl = getUrlForQuest(name);
        index = quest.getId();
        questState=quest.getState(client);
    }
    private static String getUrlForQuest(String questName) {
        // Remove non-alphanumeric characters and change to uppercase
        String formattedQuestName = questName.replaceAll("[^a-zA-Z0-9 ]", "").toUpperCase().replace(' ', '_');
        try {
            // Get the corresponding enum value
            ExternalQuestResources quest = ExternalQuestResources.valueOf(formattedQuestName);
            // Retrieve and return the URL associated with the enum value
            return quest.getUrl();
        } catch (IllegalArgumentException e) {
            // Handle case where the quest name does not match any enum value
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
