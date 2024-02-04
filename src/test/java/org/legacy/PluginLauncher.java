package org.legacy;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import org.legacy.utils.ObjectivesPlugin;

public class PluginLauncher
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ObjectivesPlugin.class);
		RuneLite.main(args);
	}
}