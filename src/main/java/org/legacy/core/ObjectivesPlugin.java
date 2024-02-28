package org.legacy.core;

import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.api.*;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import org.legacy.devTools.VarInspector;
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
	private boolean once = false;
	@Inject
	private Client client;
	@Inject
	private ClientThread clientThread;
	@Inject
	private EventBus eventBus;
	@Inject
	private ObjectivesConfig config;
	@Inject
	private DataManager playerDataManager;
	@Inject
	private ObjectivesManager objectivesManager;

	@Inject
	VarInspector test;
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
		//playerBankValue.updateValues();
		if(once) {
			log.info("WHYTHOUGH");
			test();
		}
	}
	@Subscribe
	public void onGameTick(GameTick J){

		//32
		gameTick++;
		if(gameTick<1010){
			return;
		}
		gameTick=0;
		VarInspector test = new VarInspector(client,clientThread,eventBus);
		if(!once) {
			log.info("Initializing values");
			once=true;
			playerDataManager.updateValues();
			objectivesManager.initialize();
			test.open();
		}
	}
	public void test(){
		log.info("Updating All Data");
		playerDataManager.updateValues();
		log.info("Updating All Objectives");
		objectivesManager.updateAllCompletionStatuses();
		objectivesManager.printRecommendedSkillingObjectives();
		objectivesManager.printRecommendedQuestObjectives();
	}
	@Provides
	ObjectivesConfig getConfig(ConfigManager configManager) {
		return (ObjectivesConfig)configManager.getConfig(ObjectivesConfig.class);
	}


}
