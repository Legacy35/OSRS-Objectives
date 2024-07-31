package org.legacy.core;

import com.google.inject.Provides;

import javax.inject.Inject;

import net.runelite.api.*;
import net.runelite.api.events.GameTick;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import net.runelite.client.task.Schedule;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import org.legacy.devTools.VarInspector;
import org.legacy.utils.IconUtils;
import org.legacy.view.ObjectivesPluginPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.temporal.ChronoUnit;

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
	private ClientToolbar clientToolbar;
	private NavigationButton navButton;
	private ObjectivesPluginPanel objectivesUI;
	EventBus objectivesEventBus;
	@Inject
	VarInspector test;
	@Override
	protected void startUp() throws Exception
	{
		log.info("Objectives Plugin started!");
		objectivesEventBus = new EventBus();
		objectivesUI = new ObjectivesPluginPanel(objectivesManager);
		navButton = NavigationButton.builder()
				.tooltip("Objectives")
				.icon(IconUtils.loadImage("ObjSymbol.png"))
				.priority(9)
				.panel(objectivesUI)
				.build();

		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}
	@Subscribe
	public void onGameTick(GameTick J){
		if(!playerDataManager.isIntializationStarted()) {
			playerDataManager.initialize();
			//playerDataManager.printData();
		}
		else if(!playerDataManager.isIntialized()){
		}
		else if(!objectivesManager.isIntializationStarted()) {
			Thread ObjectivesThread = new Thread(objectivesManager);
			ObjectivesThread.setName("Objectives Thread");
			ObjectivesThread.start(); //Creates the Objectives, this happens once and this thread terminates once done
			objectivesUI.passObjectiveManager(objectivesManager);
			objectivesUI.updatePanel();
		}
		if(playerDataManager.isIntialized()){
			playerDataManager.updateValues();
		}
		if(!once) {
			//VarInspector test = new VarInspector(client,clientThread,eventBus);
			once=true;
			//test.open();
			//InfoPanel infoPanel = new InfoPanel ();
		}
	}
	@Schedule(
			period = 5,
			unit = ChronoUnit.SECONDS,
			asynchronous = true
	)
	public void updateUIPanels (){
		objectivesUI.updatePanel();
	}
	public void test(){
		//log.info("Printing All Data");
		//playerDataManager.printData();
		log.info("Printing All Objectives");
		objectivesManager.printAllRecommendedObjectives();
	}
	@Provides
	ObjectivesConfig getConfig(ConfigManager configManager) {
		return (ObjectivesConfig)configManager.getConfig(ObjectivesConfig.class);
	}


}
