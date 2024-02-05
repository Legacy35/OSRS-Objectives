package org.legacy.core;

import com.google.inject.Provides;
import javax.inject.Inject;

import net.runelite.api.*;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.legacy.data.AchievementData;
import org.legacy.data.BankData;

import org.legacy.data.QuestData;
import org.legacy.data.SkillData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(
	name = "Objectives",
	configName = "ObjectivesConfig"
)
public class ObjectivesPlugin extends Plugin
{
	private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
	private int gameTick=998;
	@Inject
	private Client client;
	@Inject
	private ObjectivesConfig config;
	@Inject
	private BankData playerBankValue;
	@Inject
	private SkillData playerSkillData;
	@Inject
	private QuestData playerQuestData;
	@Inject
	private AchievementData playerAchievementData;
	@Inject
	private ObjectivesManager objectives;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}
	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged event) {
		playerBankValue.updateValues();
	}
	@Subscribe
	public void onGameTick(GameTick J){
		gameTick++;
		if(gameTick<30){
			return;
		}
		log.info("Updating All Data");
		playerBankValue.updateValues();
		playerSkillData.updateValues();
		playerQuestData.updateValues();
		playerAchievementData.updateValues();
		log.info(""+playerBankValue);
		log.info(""+ playerSkillData);
		log.info(""+ playerQuestData);
		log.info(""+ playerAchievementData);
		objectives.getRecomendedObjective();
		gameTick=0;
	}
	@Provides
	ObjectivesConfig getConfig(ConfigManager configManager) {
		return (ObjectivesConfig)configManager.getConfig(ObjectivesConfig.class);
	}


}
