package org.legacy.utils;

import javax.inject.Inject;
import net.runelite.api.*;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.legacy.data.BankData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(
	name = "Objectives"
)
public class ObjectivesPlugin extends Plugin
{
	private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
	@Inject
	private Client client;

	@Inject
	private ObjectivesConfig config;


	@Override
	protected void startUp() throws Exception
	{
		BankData playerValue = new BankData();
		log.info("Example started!"+ playerValue.getTotalValue());
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
			BankData playerValue = new BankData();
			log.info("Example started!"+ playerValue.getTotalValue());
		}
	}


}
