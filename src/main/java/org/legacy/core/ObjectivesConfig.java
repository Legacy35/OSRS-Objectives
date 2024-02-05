package org.legacy.core;

import net.runelite.client.config.*;

@ConfigGroup("Objectives")
public interface ObjectivesConfig extends Config
{
	/***
	 ------------Hidden Persistent Data----------------
	 ***/
	@ConfigItem(
		keyName = "playerBankValue",
		name = "Player Bank Value",
		description = "The Players Bank Value",
		hidden=true
	)
	void PlayerBankValue(long value);
	@ConfigItem(
			keyName = "playerBankValue",
			name = "Player Bank Value",
			description = "The Players Bank Value",
			hidden=true
	)
	default long PlayerBankValue()
	{
		return -1;
	}
	@ConfigItem(
			keyName = "playerInventoryValue",
			name = "Player Inventory Value",
			description = "The Players Inventory Value",
			hidden=true,
			secret = true
	)
	void PlayerInventoryValue(long value);
	@ConfigItem(
			keyName = "playerInventoryValue",
			name = "Player Inventory Value",
			description = "The Players Inventory Value",
			hidden=true,
			secret = true
	)
	default long PlayerInventoryValue()
	{
		return -1;
	}

	@ConfigItem(
			keyName = "playerEquipmentValue",
			name = "Player Equipment Value",
			description = "The Players Equipment Value",
			hidden=true,
			secret = true
	)
	void PlayerEquipmentValue(long value);
	@ConfigItem(
			keyName = "playerEquipmentValue",
			name = "Player Equipment Value",
			description = "The Players Equipment Value",
			hidden=true,
			secret = true
	)
	default long PlayerEquipmentValue()
	{
		return -1;
	}
	@ConfigItem(
			keyName = "playerEquipmentValue",
			name = "Player Equipment Value",
			description = "The Players Equipment Value",
			hidden=true,
			secret = true
	)
	void PlayerSeedVaultValue(long value);
	@ConfigItem(
			keyName = "playerSeedVaultValue",
			name = "Player Seed Vault Value",
			description = "The Players Seed Vault Value",
			hidden=true,
			secret = true
	)
	default long PlayerSeedVaultValue()
	{
		return -1;
	}
	@ConfigItem(
			keyName = "playerGroupStorageValue",
			name = "Player group Storage Value",
			description = "The Players group Storage Value",
			hidden=true,
			secret = true
	)
	void PlayerGroupStorageValue(long value);
	@ConfigItem(
			keyName = "playerGroupStorageValue",
			name = "Player Group Storage Value",
			description = "The Players Group Storage Value",
			hidden=true,
			secret = true
	)
	default long PlayerGroupStorageValue()
	{
		return -1;
	}

	/***
	 ------------Priorities SECTION----------------
	 ***/
	@ConfigSection(
			position = 1,
			name = "Priority of Objectives",
			description = "Determine what objectives you want to prioritize"
	)
	String prioritySection = "prioritySection";

	@Range(
			min = 0,
			max = 5
	)
	@ConfigItem(
			keyName = "priorityOfCommonTasks",
			name = "Priority Level of Common Tasks",
			description = "Set Common Task Priority to 0-5, 0 means these Objectives will not be given, 5 means they are highest priority on your list.",
			section = prioritySection
	)
	default int commonPriority()
	{
		return 5;
	}
	@Range(
			min = 0,
			max = 5
	)
	@ConfigItem(
			keyName = "priorityOfQuestTasks",
			name = "Priority Level of Quest Tasks",
			description = "Set Quest Task Priority to 0-5, 0 means these Objectives will not be given, 5 means they are highest priority on your list.",
			section = prioritySection
	)
	default int questPriority()
	{
		return 5;
	}
	@Range(
			min = 0,
			max = 5
	)
	@ConfigItem(
			keyName = "priorityOfAchievementTasks",
			name = "Priority Level of Achievement Tasks",
			description = "Set Achievement Task Priority to 0-5, 0 means these Objectives will not be given, 5 means they are highest priority on your list.",
			section = prioritySection
	)
	default int achievementTasksPriority()
	{
		return 5;
	}
	@Range(
			min = 0,
			max = 5
	)
	@ConfigItem(
			keyName = "priorityOfSkillingTasks",
			name = "Priority Level of Skilling Tasks",
			description = "Set Skilling Task Priority to 0-5, 0 means these Objectives will not be given, 5 means they are highest priority on your list.",
			section = prioritySection
	)
	default int skillingPriority()
	{
		return 5;
	}
	@Range(
			min = 0,
			max = 5
	)
	@ConfigItem(
			keyName = "priorityOfBankValueTasks",
			name = "Priority Level of Bank Value Tasks",
			description = "Set BankValue Task Priority to 0-5, 0 means these Objectives will not be given, 5 means they are highest priority on your list.",
			section = prioritySection
	)
	default int bankValuePriority()
	{
		return 5;
	}
	@Range(
			min = 0,
			max = 5
	)
	@ConfigItem(
			keyName = "priorityOfCollectionLogTasks",
			name = "Priority Level of Collection Log Tasks",
			description = "Set Collection Log Task Priority to 0-5, 0 means these Objectives will not be given, 5 means they are highest priority on your list.",
			section = prioritySection
	)
	default int collectionLogPriority()
	{
		return 5;
	}

	/***
	 ------------Common Objectives SECTION----------------
	 ***/
	@ConfigSection(
			position = 2,
			name = "Common Objectives",
			description = "Determines what common tasks should be shown"
	)
	String commonSection = "commonSection";
	@ConfigItem(
			keyName = "doZaffsStaff",
			name = "Buy Zaff's Staves",
			description = "Buy Zaff's Staves"

	)
	default boolean doZaffStaffTask()
	{
		return true;
	}
}
