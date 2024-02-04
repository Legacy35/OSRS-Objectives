package org.legacy.utils;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.legacy.data.BankData;
import net.runelite.client.plugins.bank.BankPlugin;
import org.legacy.utils.ObjectivesConfig;
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
		}
	}


}
