package org.legacy.objectives;

import net.runelite.api.Client;
import net.runelite.api.Quest;
import org.legacy.models.QuestModel;
import org.legacy.objectives.models.QuestObjective;
import org.legacy.objectives.models.Objective;
import org.legacy.objectives.models.QuestPointObjective;
import org.legacy.utils.ObjectiveTags;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class QuestObjectives {
    @Inject
    private Client client;
    public ArrayList<Objective> QuestObjectivesList;
    public ArrayList<Objective> QuestPointObjectivesList;

    public QuestObjectives(){
    }
    public void initialize(){
        QuestObjectivesList= new ArrayList<Objective>();
        QuestPointObjectivesList= new ArrayList<Objective>();
    }
    public void generateObjectives() {
        QuestObjectivesList.clear();
        generateQuestObjectives();
        QuestPointObjectivesList.clear();
        generateQuestPointObjectives();
    }
    public void generateQuestPointObjectives(){
        for(int i=1; i<=301;i++){
            QuestPointObjectivesList.add(new QuestPointObjective(i));
        }
    }
    public void generateQuestObjectives(){
        int totalOptimalQuestSteps=200;
        QuestModel temp;
        QuestObjective questObjective;
        //first few quests are given high prio to complete

        // Create a QuestModel object for COOKS_ASSISTANT
        temp = new QuestModel(Quest.COOKS_ASSISTANT, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHEEP_SHEARER
        temp = new QuestModel(Quest.SHEEP_SHEARER, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MISTHALIN_MYSTERY
        temp = new QuestModel(Quest.MISTHALIN_MYSTERY, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PRINCE_ALI_RESCUE
        temp = new QuestModel(Quest.PRINCE_ALI_RESCUE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_RESTLESS_GHOST
        temp = new QuestModel(Quest.THE_RESTLESS_GHOST, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RUNE_MYSTERIES
        temp = new QuestModel(Quest.RUNE_MYSTERIES, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(1260); //This is so high because it is not required by a lot of requests, but since it unlocks RC it is a high prio to unlock first
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IMP_CATCHER
        temp = new QuestModel(Quest.IMP_CATCHER, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WITCHS_POTION
        temp = new QuestModel(Quest.WITCHS_POTION, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GERTRUDES_CAT
        temp = new QuestModel(Quest.GERTRUDES_CAT, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DADDYS_HOME
        temp = new QuestModel(Quest.DADDYS_HOME, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DWARF_CANNON
        temp = new QuestModel(Quest.DWARF_CANNON, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WATERFALL_QUEST
        temp = new QuestModel(Quest.WATERFALL_QUEST, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TREE_GNOME_VILLAGE
        temp = new QuestModel(Quest.TREE_GNOME_VILLAGE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DORICS_QUEST
        temp = new QuestModel(Quest.DORICS_QUEST, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WITCHS_HOUSE
        temp = new QuestModel(Quest.WITCHS_HOUSE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_KNIGHTS_SWORD
        temp = new QuestModel(Quest.THE_KNIGHTS_SWORD, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        questObjective.addRequirement("SKILL-MINING-10");
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_TOURIST_TRAP
        temp = new QuestModel(Quest.THE_TOURIST_TRAP, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("SKILL-FLETCHING-10");
        questObjective.addRequirement("SKILL-SMITHING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BLACK_KNIGHTS_FORTRESS
        temp = new QuestModel(Quest.BLACK_KNIGHTS_FORTRESS, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-12");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRUIDIC_RITUAL
        temp = new QuestModel(Quest.DRUIDIC_RITUAL, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECRUITMENT_DRIVE
        temp = new QuestModel(Quest.RECRUITMENT_DRIVE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-BLACK_KNIGHTS_FORTRESS");
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GOBLIN_DIPLOMACY
        temp = new QuestModel(Quest.GOBLIN_DIPLOMACY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SLEEPING_GIANTS
        temp = new QuestModel(Quest.SLEEPING_GIANTS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-SMITHING-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FIGHT_ARENA
        temp = new QuestModel(Quest.FIGHT_ARENA, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PLAGUE_CITY
        temp = new QuestModel(Quest.PLAGUE_CITY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKS_FRIEND
        temp = new QuestModel(Quest.MONKS_FRIEND, client);
        questObjective.addBasePriorityLevel(40);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HAZEEL_CULT
        temp = new QuestModel(Quest.HAZEEL_CULT, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHEEP_HERDER
        temp = new QuestModel(Quest.SHEEP_HERDER, client);
        questObjective.addBasePriorityLevel(40);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BIOHAZARD
        temp = new QuestModel(Quest.BIOHAZARD, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PLAGUE_CITY");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TOWER_OF_LIFE
        temp = new QuestModel(Quest.TOWER_OF_LIFE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CONSTRUCTION-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TRIBAL_TOTEM
        temp = new QuestModel(Quest.TRIBAL_TOTEM, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-21");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEATH_PLATEAU
        temp = new QuestModel(Quest.DEATH_PLATEAU, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MERLINS_CRYSTAL
        temp = new QuestModel(Quest.MERLINS_CRYSTAL, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HOLY_GRAIL
        temp = new QuestModel(Quest.HOLY_GRAIL, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MERLINS_CRYSTAL");
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-ATTACK-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MURDER_MYSTERY
        temp = new QuestModel(Quest.MURDER_MYSTERY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GRAND_TREE
        temp = new QuestModel(Quest.THE_GRAND_TREE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("CMB-50");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RAG_AND_BONE_MAN_I
        temp = new QuestModel(Quest.RAG_AND_BONE_MAN_I, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PRIEST_IN_PERIL
        temp = new QuestModel(Quest.PRIEST_IN_PERIL, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for NATURE_SPIRIT
        temp = new QuestModel(Quest.NATURE_SPIRIT, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_LOST_TRIBE
        temp = new QuestModel(Quest.THE_LOST_TRIBE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-13");
        questObjective.addRequirement("SKILL-THIEVING-13");
        questObjective.addRequirement("SKILL-MINING-17");
        questObjective.addRequirement("QUEST-GOBLIN_DIPLOMACY");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEATH_TO_THE_DORGESHUUN
        temp = new QuestModel(Quest.DEATH_TO_THE_DORGESHUUN, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_LOST_TRIBE");
        questObjective.addRequirement("SKILL-THIEVING-23");
        questObjective.addRequirement("SKILL-AGILITY-23");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ELEMENTAL_WORKSHOP_I
        temp = new QuestModel(Quest.ELEMENTAL_WORKSHOP_I, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MINING-20");
        questObjective.addRequirement("SKILL-SMITHING-20");
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ICTHLARINS_LITTLE_HELPER
        temp = new QuestModel(Quest.ICTHLARINS_LITTLE_HELPER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-AGILITY-35");
        questObjective.addRequirement("QUEST-GERTRUDES_CAT");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GOLEM
        temp = new QuestModel(Quest.THE_GOLEM, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-THIEVING-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LOST_CITY
        temp = new QuestModel(Quest.LOST_CITY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-45");
        questObjective.addRequirement("SKILL-CRAFTING-31");
        questObjective.addRequirement("SKILL-WOODCUTTING-36");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAIRYTALE_I__GROWING_PAINS
        temp = new QuestModel(Quest.FAIRYTALE_I__GROWING_PAINS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-LOST_CITY");
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-COOKING-10");
        questObjective.addRequirement("QUEST-COOKS_ASSISTANT");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("QUEST-GOBLIN_DIPLOMACY");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SEA_SLUG
        temp = new QuestModel(Quest.SEA_SLUG, client);
        questObjective.addBasePriorityLevel(5);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FIREMAKING-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FISHING_CONTEST
        temp = new QuestModel(Quest.FISHING_CONTEST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FISHING-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__MOUNTAIN_DWARF
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOUNTAIN_DAUGHTER
        temp = new QuestModel(Quest.MOUNTAIN_DAUGHTER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-40");
        questObjective.addRequirement("SKILL-AGILITY-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RATCATCHERS
        temp = new QuestModel(Quest.RATCATCHERS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ICTHLARINS_LITTLE_HELPER");
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FEUD
        temp = new QuestModel(Quest.THE_FEUD, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-30");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ALFRED_GRIMHANDS_BARCRAWL
        temp = new QuestModel(Quest.ALFRED_GRIMHANDS_BARCRAWL, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SCORPION_CATCHER
        temp = new QuestModel(Quest.SCORPION_CATCHER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-PRAYER-31");
        questObjective.addRequirement("QUEST-ALFRED_GRIMHANDS_BARCRAWL");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_DIG_SITE
        temp = new QuestModel(Quest.THE_DIG_SITE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-10");
        questObjective.addRequirement("SKILL-HERBLORE-10");
        questObjective.addRequirement("SKILL-THIEVING-25");
        questObjective.addBasePriorityLevel(5);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ELEMENTAL_WORKSHOP_II
        temp = new QuestModel(Quest.ELEMENTAL_WORKSHOP_II, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-20");
        questObjective.addRequirement("SKILL-SMITHING-30");
        questObjective.addRequirement("QUEST-ELEMENTAL_WORKSHOP_I");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_SOULS_BANE
        temp = new QuestModel(Quest.A_SOULS_BANE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENTER_THE_ABYSS
        temp = new QuestModel(Quest.ENTER_THE_ABYSS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(15);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for X_MARKS_THE_SPOT
        temp = new QuestModel(Quest.X_MARKS_THE_SPOT, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PIRATES_TREASURE
        temp = new QuestModel(Quest.PIRATES_TREASURE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CLIENT_OF_KOUREND
        temp = new QuestModel(Quest.CLIENT_OF_KOUREND, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-X_MARKS_THE_SPOT");
        questObjective.addBasePriorityLevel(5);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_QUEEN_OF_THIEVES
        temp = new QuestModel(Quest.THE_QUEEN_OF_THIEVES, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-THIEVING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_DEPTHS_OF_DESPAIR
        temp = new QuestModel(Quest.THE_DEPTHS_OF_DESPAIR, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-AGILITY-18");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_PORCINE_OF_INTEREST
        temp = new QuestModel(Quest.A_PORCINE_OF_INTEREST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WANTED
        temp = new QuestModel(Quest.WANTED, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-32");
        questObjective.addRequirement("QUEST-RECRUITMENT_DRIVE");
        questObjective.addRequirement("QUEST-THE_LOST_TRIBE");
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-ENTER_THE_ABYSS");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHIELD_OF_ARRAV
        temp = new QuestModel(Quest.SHIELD_OF_ARRAV, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BONE_VOYAGE
        temp = new QuestModel(Quest.BONE_VOYAGE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_DIG_SITE");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WATCHTOWER
        temp = new QuestModel(Quest.WATCHTOWER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(5);
        questObjective.addRequirement("SKILL-MAGIC-14");
        questObjective.addRequirement("SKILL-THIEVING-15");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("SKILL-HERBLORE-14");
        questObjective.addRequirement("SKILL-MINING-40");
        questObjective.addRequirement("CMB-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GIANT_DWARF
        temp = new QuestModel(Quest.THE_GIANT_DWARF, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-12");
        questObjective.addRequirement("SKILL-FIREMAKING-16");
        questObjective.addRequirement("SKILL-MAGIC-33");
        questObjective.addRequirement("SKILL-THIEVING-14");
        questObjective.addBasePriorityLevel(10);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAKING_HISTORY
        temp = new QuestModel(Quest.MAKING_HISTORY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GHOSTS_AHOY
        temp = new QuestModel(Quest.GHOSTS_AHOY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("SKILL-COOKING-20");
        questObjective.addRequirement("CMB-15");
        questObjective.addBasePriorityLevel(15);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FORGETTABLE_TALE
        temp = new QuestModel(Quest.FORGETTABLE_TALE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        questObjective.addRequirement("SKILL-COOKING-22");
        questObjective.addRequirement("SKILL-FARMING-17");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ANOTHER_SLICE_OF_HAM
        temp = new QuestModel(Quest.ANOTHER_SLICE_OF_HAM, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DEATH_TO_THE_DORGESHUUN");
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        questObjective.addRequirement("QUEST-THE_DIG_SITE");
        questObjective.addRequirement("SKILL-ATTACK-15");
        questObjective.addRequirement("SKILL-PRAYER-25");
        questObjective.addRequirement("CMB-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for VAMPYRE_SLAYER
        temp = new QuestModel(Quest.VAMPYRE_SLAYER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ERNEST_THE_CHICKEN
        temp = new QuestModel(Quest.ERNEST_THE_CHICKEN, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEMON_SLAYER
        temp = new QuestModel(Quest.DEMON_SLAYER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHADOW_OF_THE_STORM
        temp = new QuestModel(Quest.SHADOW_OF_THE_STORM, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("QUEST-THE_GOLEM");
        questObjective.addRequirement("QUEST-DEMON_SLAYER");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ANIMAL_MAGNETISM
        temp = new QuestModel(Quest.ANIMAL_MAGNETISM, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        questObjective.addRequirement("QUEST-ERNEST_THE_CHICKEN");
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("SKILL-SLAYER-18");
        questObjective.addRequirement("SKILL-CRAFTING-19");
        questObjective.addRequirement("SKILL-RANGED-30");
        questObjective.addRequirement("SKILL-WOODCUTTING-35");
        questObjective.addBasePriorityLevel(150);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CREATURE_OF_FENKENSTRAIN
        temp = new QuestModel(Quest.CREATURE_OF_FENKENSTRAIN, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-THIEVING-25");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BIG_CHOMPY_BIRD_HUNTING
        temp = new QuestModel(Quest.BIG_CHOMPY_BIRD_HUNTING, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FLETCHING-5");
        questObjective.addRequirement("SKILL-COOKING-30");
        questObjective.addRequirement("SKILL-RANGED-30");
        questObjective.addRequirement("CMB-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for JUNGLE_POTION
        temp = new QuestModel(Quest.JUNGLE_POTION, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("SKILL-HERBLORE-3");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHILO_VILLAGE
        temp = new QuestModel(Quest.SHILO_VILLAGE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(10);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-AGILITY-32");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ZOGRE_FLESH_EATERS
        temp = new QuestModel(Quest.ZOGRE_FLESH_EATERS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-SMITHING-4");
        questObjective.addRequirement("SKILL-HERBLORE-8");
        questObjective.addRequirement("SKILL-RANGED-30");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for OBSERVATORY_QUEST
        temp = new QuestModel(Quest.OBSERVATORY_QUEST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HORROR_FROM_THE_DEEP
        temp = new QuestModel(Quest.HORROR_FROM_THE_DEEP, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(5);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("QUEST-ALFRED_GRIMHANDS_BARCRAWL");
        questObjective.addRequirement("SKILL-AGILITY-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SPIRITS_OF_THE_ELID
        temp = new QuestModel(Quest.SPIRITS_OF_THE_ELID, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-33");
        questObjective.addRequirement("SKILL-RANGED-37");
        questObjective.addRequirement("SKILL-MINING-37");
        questObjective.addRequirement("SKILL-THIEVING-37");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GARDEN_OF_TRANQUILLITY
        temp = new QuestModel(Quest.GARDEN_OF_TRANQUILLITY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FARMING-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENLIGHTENED_JOURNEY
        temp = new QuestModel(Quest.ENLIGHTENED_JOURNEY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-20");
        questObjective.addRequirement("SKILL-FIREMAKING-20");
        questObjective.addRequirement("SKILL-FARMING-30");
        questObjective.addRequirement("SKILL-CRAFTING-36");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROMEO__JULIET
        temp = new QuestModel(Quest.ROMEO__JULIET, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEARS_OF_GUTHIX
        temp = new QuestModel(Quest.TEARS_OF_GUTHIX, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(20);
        questObjective.addRequirement("QP-43");
        questObjective.addRequirement("SKILL-FIREMAKING-49");
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-MINING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IN_SEARCH_OF_THE_MYREQUE
        temp = new QuestModel(Quest.IN_SEARCH_OF_THE_MYREQUE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHADES_OF_MORTTON
        temp = new QuestModel(Quest.SHADES_OF_MORTTON, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("CMB-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IN_AID_OF_THE_MYREQUE
        temp = new QuestModel(Quest.IN_AID_OF_THE_MYREQUE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-IN_SEARCH_OF_THE_MYREQUE");
        questObjective.addRequirement("CMB-45");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("SKILL-CRAFTING-25");
        questObjective.addRequirement("SKILL-MINING-15");
        questObjective.addRequirement("SKILL-MAGIC-7");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SKIPPY_AND_THE_MOGRES
        temp = new QuestModel(Quest.SKIPPY_AND_THE_MOGRES, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-COOKING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TROLL_STRONGHOLD
        temp = new QuestModel(Quest.TROLL_STRONGHOLD, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DEATH_PLATEAU");
        questObjective.addRequirement("SKILL-AGILITY-15");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TROLL_ROMANCE
        temp = new QuestModel(Quest.TROLL_ROMANCE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("SKILL-AGILITY-28");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DARKNESS_OF_HALLOWVALE
        temp = new QuestModel(Quest.DARKNESS_OF_HALLOWVALE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-IN_AID_OF_THE_MYREQUE");
        questObjective.addRequirement("SKILL-CONSTRUCTION-5");
        questObjective.addRequirement("SKILL-MINING-20");
        questObjective.addRequirement("SKILL-THIEVING-22");
        questObjective.addRequirement("SKILL-AGILITY-26");
        questObjective.addRequirement("SKILL-CRAFTING-32");
        questObjective.addRequirement("SKILL-MAGIC-33");
        questObjective.addRequirement("SKILL-STRENGTH-40");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for UNDERGROUND_PASS
        temp = new QuestModel(Quest.UNDERGROUND_PASS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-BIOHAZARD");
        questObjective.addRequirement("SKILL-RANGED-25");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for REGICIDE
        temp = new QuestModel(Quest.REGICIDE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-10");
        questObjective.addRequirement("SKILL-AGILITY-56");
        questObjective.addRequirement("QUEST-UNDERGROUND_PASS");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRAGON_SLAYER_I
        temp = new QuestModel(Quest.DRAGON_SLAYER_I, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-32");
        questObjective.addRequirement("CMB-45");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_TRIALS
        temp = new QuestModel(Quest.THE_FREMENNIK_TRIALS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_ISLES
        temp = new QuestModel(Quest.THE_FREMENNIK_ISLES, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CONSTRUCTION-20");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__EVIL_DAVE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__EVIL_DAVE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-25");
        questObjective.addRequirement("QUEST-GERTRUDES_CAT");
        questObjective.addRequirement("QUEST-SHADOW_OF_THE_STORM");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__PIRATE_PETE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__PIRATE_PETE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-31");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TAI_BWO_WANNAI_TRIO
        temp = new QuestModel(Quest.TAI_BWO_WANNAI_TRIO, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-15");
        questObjective.addRequirement("SKILL-COOKING-30");
        questObjective.addRequirement("SKILL-FISHING-5");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CONTACT
        temp = new QuestModel(Quest.CONTACT, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-50");
        questObjective.addRequirement("SKILL-THIEVING-50");
        questObjective.addRequirement("CMB-70");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEMPLE_OF_IKOV
        temp = new QuestModel(Quest.TEMPLE_OF_IKOV, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-42");
        questObjective.addRequirement("SKILL-RANGED-40");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_EYES_OF_GLOUPHRIE
        temp = new QuestModel(Quest.THE_EYES_OF_GLOUPHRIE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_GRAND_TREE");
        questObjective.addRequirement("SKILL-CONSTRUCTION-5");
        questObjective.addRequirement("SKILL-MAGIC-46");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEMPLE_OF_THE_EYE
        temp = new QuestModel(Quest.TEMPLE_OF_THE_EYE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ENTER_THE_ABYSS");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ONE_SMALL_FAVOUR
        temp = new QuestModel(Quest.ONE_SMALL_FAVOUR, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-45");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        questObjective.addRequirement("QUEST-SHILO_VILLAGE");
        questObjective.addRequirement("SKILL-AGILITY-36");
        questObjective.addRequirement("SKILL-CRAFTING-25");
        questObjective.addRequirement("SKILL-HERBLORE-18");
        questObjective.addRequirement("SKILL-SMITHING-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_ASCENT_OF_ARCEUUS
        temp = new QuestModel(Quest.THE_ASCENT_OF_ARCEUUS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-HUNTER-12");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TALE_OF_THE_RIGHTEOUS CLIENT_OF_KOUREND
        temp = new QuestModel(Quest.TALE_OF_THE_RIGHTEOUS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-STRENGTH-16");
        questObjective.addRequirement("SKILL-MINING-10");
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BETWEEN_A_ROCK
        temp = new QuestModel(Quest.BETWEEN_A_ROCK, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DWARF_CANNON");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        questObjective.addRequirement("SKILL-DEFENCE-30");
        questObjective.addRequirement("SKILL-MINING-40");
        questObjective.addRequirement("SKILL-SMITHING-50");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FORSAKEN_TOWER
        temp = new QuestModel(Quest.THE_FORSAKEN_TOWER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_SLUG_MENACE
        temp = new QuestModel(Quest.THE_SLUG_MENACE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("SKILL-RUNECRAFT-30");
        questObjective.addRequirement("SKILL-SLAYER-30");
        questObjective.addRequirement("SKILL-THIEVING-30");
        questObjective.addRequirement("QUEST-SEA_SLUG");
        questObjective.addRequirement("QUEST-WANTED");
        questObjective.addRequirement("CMB-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GETTING_AHEAD
        temp = new QuestModel(Quest.GETTING_AHEAD, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("SKILL-CONSTRUCTION-26");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for COLD_WAR
        temp = new QuestModel(Quest.COLD_WAR, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-HUNTER-10");
        questObjective.addRequirement("SKILL-AGILITY-30");
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("SKILL-CONSTRUCTION-34");
        questObjective.addRequirement("SKILL-THIEVING-15");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_HAND_IN_THE_SAND
        temp = new QuestModel(Quest.THE_HAND_IN_THE_SAND, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-17");
        questObjective.addRequirement("SKILL-CRAFTING-49");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENAKHRAS_LAMENT
        temp = new QuestModel(Quest.ENAKHRAS_LAMENT, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-25");
        questObjective.addRequirement("SKILL-CRAFTING-50");
        questObjective.addRequirement("SKILL-FIREMAKING-45");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addRequirement("SKILL-MAGIC-39");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for EADGARS_RUSE
        temp = new QuestModel(Quest.EADGARS_RUSE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("SKILL-AGILITY-31");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MY_ARMS_BIG_ADVENTURE
        temp = new QuestModel(Quest.MY_ARMS_BIG_ADVENTURE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-EADGARS_RUSE");
        questObjective.addRequirement("QUEST-THE_FEUD");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        questObjective.addRequirement("SKILL-FARMING-29");
        questObjective.addRequirement("SKILL-WOODCUTTING-10");
        questObjective.addRequirement("CMB-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GARDEN_OF_DEATH
        temp = new QuestModel(Quest.THE_GARDEN_OF_DEATH, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("SKILL-FARMING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RAG_AND_BONE_MAN_II
        temp = new QuestModel(Quest.RAG_AND_BONE_MAN_II, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-40");
        questObjective.addRequirement("QUEST-RAG_AND_BONE_MAN_I");
        questObjective.addRequirement("QUEST-SKIPPY_AND_THE_MOGRES");
        questObjective.addRequirement("QUEST-HORROR_FROM_THE_DEEP");
        questObjective.addRequirement("QUEST-CREATURE_OF_FENKENSTRAIN");
        questObjective.addRequirement("QUEST-ZOGRE_FLESH_EATERS");
        questObjective.addRequirement("QUEST-WATERFALL_QUEST");
        questObjective.addRequirement("SKILL-SLAYER-40");
        questObjective.addRequirement("SKILL-DEFENCE-20");
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RUM_DEAL
        temp = new QuestModel(Quest.RUM_DEAL, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ZOGRE_FLESH_EATERS");
        questObjective.addRequirement("SKILL-CRAFTING-42");
        questObjective.addRequirement("SKILL-FISHING-50");
        questObjective.addRequirement("SKILL-FARMING-40");
        questObjective.addRequirement("SKILL-PRAYER-47");
        questObjective.addRequirement("SKILL-SLAYER-42");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CABIN_FEVER
        temp = new QuestModel(Quest.CABIN_FEVER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PIRATES_TREASURE");
        questObjective.addRequirement("QUEST-RUM_DEAL");
        questObjective.addRequirement("SKILL-AGILITY-42");
        questObjective.addRequirement("SKILL-CRAFTING-45");
        questObjective.addRequirement("SKILL-SMITHING-50");
        questObjective.addRequirement("SKILL-RANGED-40");
        questObjective.addRequirement("CMB-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__LUMBRIDGE_GUIDE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__LUMBRIDGE_GUIDE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-40");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        questObjective.addRequirement("QUEST-BIOHAZARD");
        questObjective.addRequirement("QUEST-MURDER_MYSTERY");
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("QUEST-WITCHS_HOUSE");
        questObjective.addRequirement("QUEST-DEMON_SLAYER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__SKRACH_UGLOGWEE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__SKRACH_UGLOGWEE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-41");
        questObjective.addRequirement("SKILL-FIREMAKING-20");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HEROES_QUEST
        temp = new QuestModel(Quest.HEROES_QUEST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("QP-55");
        questObjective.addRequirement("SKILL-COOKING-53");
        questObjective.addRequirement("SKILL-FISHING-53");
        questObjective.addRequirement("SKILL-HERBLORE-25");
        questObjective.addRequirement("SKILL-MINING-50");
        questObjective.addRequirement("QUEST-DRAGON_SLAYER_I");
        questObjective.addRequirement("QUEST-LOST_CITY");
        questObjective.addRequirement("QUEST-MERLINS_CRYSTAL");
        questObjective.addRequirement("QUEST-SHIELD_OF_ARRAV");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THRONE_OF_MISCELLANIA
        temp = new QuestModel(Quest.THRONE_OF_MISCELLANIA, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-HEROES_QUEST");
        questObjective.addRequirement("QUEST-THE_FREMENNIK_TRIALS");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROYAL_TROUBLE
        temp = new QuestModel(Quest.ROYAL_TROUBLE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THRONE_OF_MISCELLANIA");
        questObjective.addRequirement("SKILL-AGILITY-40");
        questObjective.addRequirement("SKILL-SLAYER-40");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HAUNTED_MINE
        temp = new QuestModel(Quest.HAUNTED_MINE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("SKILL-CRAFTING-35");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LAIR_OF_TARN_RAZORLOR
        temp = new QuestModel(Quest.LAIR_OF_TARN_RAZORLOR, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-SLAYER-40");
        questObjective.addRequirement("QUEST-HAUNTED_MINE");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKEY_MADNESS_I
        temp = new QuestModel(Quest.MONKEY_MADNESS_I, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("QUEST-THE_GRAND_TREE");
        questObjective.addRequirement("QUEST-TREE_GNOME_VILLAGE");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROVING_ELVES
        temp = new QuestModel(Quest.ROVING_ELVES, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-REGICIDE");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOURNINGS_END_PART_I
        temp = new QuestModel(Quest.MOURNINGS_END_PART_I, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-60");
        questObjective.addRequirement("SKILL-RANGED-60");
        questObjective.addRequirement("SKILL-THIEVING-50");
        questObjective.addRequirement("QUEST-ROVING_ELVES");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        questObjective.addRequirement("QUEST-SHEEP_HERDER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOURNINGS_END_PART_II
        temp = new QuestModel(Quest.MOURNINGS_END_PART_II, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MOURNINGS_END_PART_I");
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("SKILL-AGILITY-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DESERT_TREASURE_I
        temp = new QuestModel(Quest.DESERT_TREASURE_I, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_DIG_SITE");
        questObjective.addRequirement("QUEST-TEMPLE_OF_IKOV");
        questObjective.addRequirement("QUEST-THE_TOURIST_TRAP");
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("QUEST-WATERFALL_QUEST");
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("SKILL-THIEVING-53");
        questObjective.addRequirement("SKILL-MAGIC-50");
        questObjective.addRequirement("SKILL-FIREMAKING-50");
        questObjective.addRequirement("SKILL-SLAYER-10");
        questObjective.addRequirement("CMB-70");
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAMILY_CREST
        temp = new QuestModel(Quest.FAMILY_CREST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-55");
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WHAT_LIES_BELOW
        temp = new QuestModel(Quest.WHAT_LIES_BELOW, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-RUNECRAFT-35");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for EAGLES_PEAK
        temp = new QuestModel(Quest.EAGLES_PEAK, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-HUNTER-27");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_TAIL_OF_TWO_CATS
        temp = new QuestModel(Quest.A_TAIL_OF_TWO_CATS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ICTHLARINS_LITTLE_HELPER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LEGENDS_QUEST
        temp = new QuestModel(Quest.LEGENDS_QUEST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-107");
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("SKILL-AGILITY-50");
        questObjective.addRequirement("SKILL-CRAFTING-50");
        questObjective.addRequirement("SKILL-HERBLORE-45");
        questObjective.addRequirement("SKILL-MAGIC-56");
        questObjective.addRequirement("SKILL-MINING-52");
        questObjective.addRequirement("SKILL-PRAYER-42");
        questObjective.addRequirement("SKILL-SMITHING-50");
        questObjective.addRequirement("SKILL-STRENGTH-50");
        questObjective.addRequirement("SKILL-THIEVING-50");
        questObjective.addRequirement("SKILL-WOODCUTTING-50");
        questObjective.addRequirement("QUEST-FAMILY_CREST");
        questObjective.addRequirement("QUEST-HEROES_QUEST");
        questObjective.addRequirement("QUEST-SHILO_VILLAGE");
        questObjective.addRequirement("QUEST-UNDERGROUND_PASS");
        questObjective.addRequirement("QUEST-WATERFALL_QUEST");
        questObjective.addBasePriorityLevel(10);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LAND_OF_THE_GOBLINS
        temp = new QuestModel(Quest.LAND_OF_THE_GOBLINS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ANOTHER_SLICE_OF_HAM");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("SKILL-AGILITY-38");
        questObjective.addRequirement("SKILL-FISHING-40");
        questObjective.addRequirement("SKILL-THIEVING-45");
        questObjective.addRequirement("SKILL-HERBLORE-48");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__SIR_AMIK_VARZE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__SIR_AMIK_VARZE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("QUEST-FAMILY_CREST");
        questObjective.addRequirement("QUEST-HEROES_QUEST");
        questObjective.addRequirement("QUEST-SHILO_VILLAGE");
        questObjective.addRequirement("QUEST-UNDERGROUND_PASS");
        questObjective.addRequirement("QUEST-WATERFALL_QUEST");
        questObjective.addRequirement("QP-107");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for OLAFS_QUEST
        temp = new QuestModel(Quest.OLAFS_QUEST, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FIREMAKING-40");
        questObjective.addRequirement("SKILL-WOODCUTTING-50");
        questObjective.addRequirement("QUEST-THE_FREMENNIK_TRIALS");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_KINGDOM_DIVIDED
        temp = new QuestModel(Quest.A_KINGDOM_DIVIDED, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-70");
        questObjective.addRequirement("QUEST-THE_ASCENT_OF_ARCEUUS");
        questObjective.addRequirement("QUEST-THE_DEPTHS_OF_DESPAIR");
        questObjective.addRequirement("QUEST-THE_QUEEN_OF_THIEVES");
        questObjective.addRequirement("QUEST-THE_ASCENT_OF_ARCEUUS");
        questObjective.addRequirement("QUEST-TALE_OF_THE_RIGHTEOUS");
        questObjective.addRequirement("SKILL-AGILITY-54");
        questObjective.addRequirement("SKILL-THIEVING-52");
        questObjective.addRequirement("SKILL-WOODCUTTING-52");
        questObjective.addRequirement("SKILL-HERBLORE-50");
        questObjective.addRequirement("SKILL-MINING-42");
        questObjective.addRequirement("SKILL-CRAFTING-38");
        questObjective.addRequirement("SKILL-MAGIC-35");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addBasePriorityLevel(80);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_TASTE_OF_HOPE
        temp = new QuestModel(Quest.A_TASTE_OF_HOPE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(10);
        questObjective.addRequirement("SKILL-CRAFTING-48");
        questObjective.addRequirement("SKILL-AGILITY-45");
        questObjective.addRequirement("SKILL-ATTACK-40");
        questObjective.addRequirement("SKILL-HERBLORE-40");
        questObjective.addRequirement("SKILL-SLAYER-38");
        questObjective.addRequirement("QUEST-DARKNESS_OF_HALLOWVALE");
        questObjective.addRequirement("CMB-70");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CURSE_OF_THE_EMPTY_LORD
        temp = new QuestModel(Quest.CURSE_OF_THE_EMPTY_LORD, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-53");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GENERALS_SHADOW
        temp = new QuestModel(Quest.THE_GENERALS_SHADOW, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CURSE_OF_THE_EMPTY_LORD");
        questObjective.addRequirement("QUEST-FIGHT_ARENA");
        questObjective.addRequirement("QUEST-DESERT_TREASURE_I");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HIS_FAITHFUL_SERVANTS
        temp = new QuestModel(Quest.HIS_FAITHFUL_SERVANTS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("CMB-70");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GREAT_BRAIN_ROBBERY
        temp = new QuestModel(Quest.THE_GREAT_BRAIN_ROBBERY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-16");
        questObjective.addRequirement("SKILL-CONSTRUCTION-30");
        questObjective.addRequirement("SKILL-PRAYER-50");
        questObjective.addRequirement("CMB-60");
        questObjective.addRequirement("QUEST-CABIN_FEVER");
        questObjective.addRequirement("QUEST-CREATURE_OF_FENKENSTRAIN");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__PIRATE_PETE");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAIRYTALE_II__CURE_A_QUEEN
        temp = new QuestModel(Quest.FAIRYTALE_II__CURE_A_QUEEN, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-FAIRYTALE_I__GROWING_PAINS");
        questObjective.addRequirement("SKILL-THIEVING-40");
        questObjective.addRequirement("SKILL-FARMING-49");
        questObjective.addRequirement("SKILL-HERBLORE-57");
        questObjective.addRequirement("CMB-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__KING_AWOWOGEI
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__KING_AWOWOGEI, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-70");
        questObjective.addRequirement("SKILL-AGILITY-48");
        questObjective.addRequirement("QUEST-MONKEY_MADNESS_I");
        questObjective.addRequirement("CMB-65");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__CULINAROMANCER
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__CULINAROMANCER, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(80);
        questObjective.addRequirement("QP-175");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__MOUNTAIN_DWARF");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__PIRATE_PETE");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__LUMBRIDGE_GUIDE");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__EVIL_DAVE");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__KING_AWOWOGEI");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__SIR_AMIK_VARZE");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__SKRACH_UGLOGWEE");
        questObjective.addRequirement("QUEST-DESERT_TREASURE_I");
        questObjective.addRequirement("QUEST-HORROR_FROM_THE_DEEP");
        questObjective.addRequirement("CMB-65");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(400);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__CULINAROMANCER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_PATH_OF_GLOUPHRIE
        temp = new QuestModel(Quest.THE_PATH_OF_GLOUPHRIE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_EYES_OF_GLOUPHRIE");
        questObjective.addRequirement("QUEST-TREE_GNOME_VILLAGE");
        questObjective.addRequirement("QUEST-WATERFALL_QUEST");
        questObjective.addRequirement("SKILL-STRENGTH-60");
        questObjective.addRequirement("SKILL-SLAYER-56");
        questObjective.addRequirement("SKILL-THIEVING-56");
        questObjective.addRequirement("SKILL-RANGED-47");
        questObjective.addRequirement("SKILL-AGILITY-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LUNAR_DIPLOMACY
        temp = new QuestModel(Quest.LUNAR_DIPLOMACY, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-HERBLORE-5");
        questObjective.addRequirement("SKILL-CRAFTING-61");
        questObjective.addRequirement("SKILL-DEFENCE-40");
        questObjective.addRequirement("SKILL-FIREMAKING-49");
        questObjective.addRequirement("SKILL-MAGIC-65");
        questObjective.addRequirement("SKILL-MINING-60");
        questObjective.addRequirement("SKILL-WOODCUTTING-55");
        questObjective.addRequirement("QUEST-THE_FREMENNIK_TRIALS");
        questObjective.addRequirement("QUEST-LOST_CITY");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        questObjective.addRequirement("QUEST-SHILO_VILLAGE");
        questObjective.addBasePriorityLevel(50);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for KINGS_RANSOM
        temp = new QuestModel(Quest.KINGS_RANSOM, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-BLACK_KNIGHTS_FORTRESS");
        questObjective.addRequirement("QUEST-HOLY_GRAIL");
        questObjective.addRequirement("QUEST-MURDER_MYSTERY");
        questObjective.addRequirement("QUEST-ONE_SMALL_FAVOUR");
        questObjective.addRequirement("SKILL-MAGIC-45");
        questObjective.addRequirement("SKILL-DEFENCE-65");
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SWAN_SONG
        temp = new QuestModel(Quest.SWAN_SONG, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(20);
        questObjective.addRequirement("SKILL-MAGIC-66");
        questObjective.addRequirement("SKILL-COOKING-62");
        questObjective.addRequirement("SKILL-FISHING-62");
        questObjective.addRequirement("SKILL-SMITHING-45");
        questObjective.addRequirement("SKILL-FIREMAKING-42");
        questObjective.addRequirement("SKILL-CRAFTING-40");
        questObjective.addRequirement("QUEST-GARDEN_OF_TRANQUILLITY");
        questObjective.addRequirement("QUEST-ONE_SMALL_FAVOUR");
        questObjective.addRequirement("QP-100");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BELOW_ICE_MOUNTAIN
        temp = new QuestModel(Quest.BELOW_ICE_MOUNTAIN, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-16");
        QuestObjectivesList.add(questObjective);

        //TODO: INSERT DEFENDER OF VARROCK

        // Create a QuestModel object for DEVIOUS_MINDS
        temp = new QuestModel(Quest.DEVIOUS_MINDS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-WANTED");
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("QUEST-DORICS_QUEST");
        questObjective.addRequirement("QUEST-ENTER_THE_ABYSS");
        questObjective.addRequirement("SKILL-SMITHING-65");
        questObjective.addRequirement("SKILL-RUNECRAFT-50");
        questObjective.addRequirement("SKILL-FLETCHING-50");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GRIM_TALES
        temp = new QuestModel(Quest.GRIM_TALES, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-WITCHS_HOUSE");
        questObjective.addRequirement("SKILL-FARMING-45");
        questObjective.addRequirement("SKILL-HERBLORE-52");
        questObjective.addRequirement("SKILL-THIEVING-58");
        questObjective.addRequirement("SKILL-AGILITY-59");
        questObjective.addRequirement("SKILL-WOODCUTTING-71");
        questObjective.addRequirement("CMB-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DREAM_MENTOR
        temp = new QuestModel(Quest.DREAM_MENTOR, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-LUNAR_DIPLOMACY");
        questObjective.addRequirement("QUEST-EADGARS_RUSE");
        questObjective.addRequirement("CMB-85");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_EXILES
        temp = new QuestModel(Quest.THE_FREMENNIK_EXILES, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_FREMENNIK_ISLES");
        questObjective.addRequirement("QUEST-LUNAR_DIPLOMACY");
        questObjective.addRequirement("QUEST-MOUNTAIN_DAUGHTER");
        questObjective.addRequirement("QUEST-HEROES_QUEST");
        questObjective.addRequirement("SKILL-CRAFTING-65");
        questObjective.addRequirement("SKILL-SLAYER-60");
        questObjective.addRequirement("SKILL-SMITHING-60");
        questObjective.addRequirement("SKILL-FISHING-60");
        questObjective.addRequirement("SKILL-RUNECRAFT-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SINS_OF_THE_FATHER
        temp = new QuestModel(Quest.SINS_OF_THE_FATHER, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-WOODCUTTING-62");
        questObjective.addRequirement("SKILL-FLETCHING-60");
        questObjective.addRequirement("SKILL-CRAFTING-56");
        questObjective.addRequirement("SKILL-AGILITY-52");
        questObjective.addRequirement("SKILL-ATTACK-50");
        questObjective.addRequirement("SKILL-SLAYER-50");
        questObjective.addRequirement("SKILL-MAGIC-49");
        questObjective.addRequirement("QUEST-A_TASTE_OF_HOPE");
        questObjective.addRequirement("QUEST-VAMPYRE_SLAYER");
        questObjective.addRequirement("CMB-95");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IN_SEARCH_OF_KNOWLEDGE
        temp = new QuestModel(Quest.IN_SEARCH_OF_KNOWLEDGE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BENEATH_CURSED_SANDS
        temp = new QuestModel(Quest.BENEATH_CURSED_SANDS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CONTACT");
        questObjective.addRequirement("SKILL-AGILITY-62");
        questObjective.addRequirement("SKILL-CRAFTING-55");
        questObjective.addRequirement("SKILL-FIREMAKING-55");
        questObjective.addRequirement("CMB-85");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKEY_MADNESS_II
        temp = new QuestModel(Quest.MONKEY_MADNESS_II, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-90");
        questObjective.addRequirement("SKILL-SLAYER-69");
        questObjective.addRequirement("SKILL-CRAFTING-70");
        questObjective.addRequirement("SKILL-HUNTER-60");
        questObjective.addRequirement("SKILL-AGILITY-55");
        questObjective.addRequirement("SKILL-THIEVING-55");
        questObjective.addRequirement("SKILL-FIREMAKING-60");
        questObjective.addRequirement("QUEST-ENLIGHTENED_JOURNEY");
        questObjective.addRequirement("QUEST-THE_EYES_OF_GLOUPHRIE");
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__KING_AWOWOGEI");
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("QUEST-WATCHTOWER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for INTO_THE_TOMBS
        temp = new QuestModel(Quest.INTO_THE_TOMBS, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-95");
        questObjective.addRequirement("QUEST-BENEATH_CURSED_SANDS");
        questObjective.addBasePriorityLevel(10);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_NIGHT_AT_THE_THEATRE
        temp = new QuestModel(Quest.A_NIGHT_AT_THE_THEATRE, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-A_TASTE_OF_HOPE");
        questObjective.addRequirement("CMB-95");
        questObjective.addRequirement("SKILL-PRAYER-43");
//      questObjective.addRequirement("VALUE-50m");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRAGON_SLAYER_II
        temp = new QuestModel(Quest.DRAGON_SLAYER_II, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-LEGENDS_QUEST");
        questObjective.addRequirement("QUEST-DREAM_MENTOR");
        questObjective.addRequirement("QUEST-A_TAIL_OF_TWO_CATS");
        questObjective.addRequirement("QUEST-ANIMAL_MAGNETISM");
        questObjective.addRequirement("QUEST-GHOSTS_AHOY");
        questObjective.addRequirement("QUEST-BONE_VOYAGE");
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("CMB-100");
        questObjective.addRequirement("QP-200");
        questObjective.addRequirement("SKILL-RANGED-70");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addRequirement("SKILL-MAGIC-75");
        questObjective.addRequirement("SKILL-SMITHING-70");
        questObjective.addRequirement("SKILL-MINING-68");
        questObjective.addRequirement("SKILL-CRAFTING-62");
        questObjective.addRequirement("SKILL-AGILITY-60");
        questObjective.addRequirement("SKILL-THIEVING-60");
        questObjective.addRequirement("SKILL-CONSTRUCTION-50");
        questObjective.addRequirement("SKILL-HITPOINTS-50");
        questObjective.addBasePriorityLevel(300);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAKING_FRIENDS_WITH_MY_ARM
        temp = new QuestModel(Quest.MAKING_FRIENDS_WITH_MY_ARM, client);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MY_ARMS_BIG_ADVENTURE");
        questObjective.addRequirement("QUEST-SWAN_SONG");
        questObjective.addRequirement("QUEST-COLD_WAR");
        questObjective.addRequirement("QUEST-ROMEO__JULIET");
        questObjective.addRequirement("SKILL-FIREMAKING-66");
        questObjective.addRequirement("SKILL-MINING-72");
        questObjective.addRequirement("SKILL-CONSTRUCTION-35");
        questObjective.addRequirement("SKILL-AGILITY-68");
        questObjective.addRequirement("CMB-65");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SECRETS_OF_THE_NORTH
        temp = new QuestModel(Quest.SECRETS_OF_THE_NORTH, client);
        questObjective.addBasePriorityLevel(10);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-69");
        questObjective.addRequirement("SKILL-THIEVING-64");
        questObjective.addRequirement("SKILL-HUNTER-56");
        questObjective.addRequirement("QUEST-MAKING_FRIENDS_WITH_MY_ARM");
        questObjective.addRequirement("QUEST-THE_GENERALS_SHADOW");
        questObjective.addRequirement("QUEST-DEVIOUS_MINDS");
        questObjective.addRequirement("QUEST-HAZEEL_CULT");
        questObjective.addRequirement("CMB-85");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DESERT_TREASURE_II__THE_FALLEN_EMPIRE
        temp = new QuestModel(Quest.DESERT_TREASURE_II__THE_FALLEN_EMPIRE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(20);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DESERT_TREASURE_I");
        questObjective.addRequirement("QUEST-SECRETS_OF_THE_NORTH");
        questObjective.addRequirement("QUEST-ENAKHRAS_LAMENT");
        questObjective.addRequirement("QUEST-TEMPLE_OF_THE_EYE");
        questObjective.addRequirement("QUEST-HIS_FAITHFUL_SERVANTS");
        questObjective.addRequirement("QUEST-THE_GARDEN_OF_DEATH");
        questObjective.addRequirement("QUEST-BELOW_ICE_MOUNTAIN");
        questObjective.addRequirement("SKILL-MAGIC-75");
        questObjective.addRequirement("SKILL-FIREMAKING-75");
        questObjective.addRequirement("SKILL-THIEVING-70");
        questObjective.addRequirement("SKILL-HERBLORE-62");
        questObjective.addRequirement("SKILL-RUNECRAFT-60");
        questObjective.addRequirement("SKILL-CONSTRUCTION-60");
        questObjective.addRequirement("CMB-100");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SONG_OF_THE_ELVES
        temp = new QuestModel(Quest.SONG_OF_THE_ELVES, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        questObjective.addRequirement("QUEST-MOURNINGS_END_PART_II");
        questObjective.addRequirement("QUEST-MAKING_HISTORY");
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("SKILL-AGILITY-70");
        questObjective.addRequirement("SKILL-CONSTRUCTION-70");
        questObjective.addRequirement("SKILL-FARMING-70");
        questObjective.addRequirement("SKILL-HERBLORE-70");
        questObjective.addRequirement("SKILL-HUNTER-70");
        questObjective.addRequirement("SKILL-MINING-70");
        questObjective.addRequirement("SKILL-SMITHING-70");
        questObjective.addRequirement("SKILL-WOODCUTTING-70");
        questObjective.addRequirement("CMB-95");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CLOCK_TOWER
        temp = new QuestModel(Quest.CLOCK_TOWER, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);



        // Create a QuestModel object for THE_CORSAIR_CURSE
        temp = new QuestModel(Quest.THE_CORSAIR_CURSE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CHILDREN_OF_THE_SUN
        temp = new QuestModel(Quest.CHILDREN_OF_THE_SUN, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(150);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BEAR_YOUR_SOUL
        temp = new QuestModel(Quest.BEAR_YOUR_SOUL, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(80);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_ENCHANTED_KEY
        temp = new QuestModel(Quest.THE_ENCHANTED_KEY, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MAKING_HISTORY");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAGE_ARENA_I
        temp = new QuestModel(Quest.MAGE_ARENA_I, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        questObjective.addRequirement("SKILL-MAGIC-60");
        questObjective.addRequirement("CMB-55");
        questObjective.addBasePriorityLevel(180);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAMILY_PEST
        temp = new QuestModel(Quest.FAMILY_PEST, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-FAMILY_CREST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAGE_ARENA_II
        temp = new QuestModel(Quest.MAGE_ARENA_II, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-75");
        questObjective.addRequirement("CMB-80");
        questObjective.addBasePriorityLevel(180);
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HOPESPEARS_WILL
        temp = new QuestModel(Quest.HOPESPEARS_WILL, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        questObjective.addRequirement("QUEST-DESERT_TREASURE_I");
        questObjective.addRequirement("QUEST-FAIRYTALE_II__CURE_A_QUEEN");
        questObjective.addRequirement("QUEST-LAND_OF_THE_GOBLINS");
        questObjective.addRequirement("SKILL-PRAYER-50");
        questObjective.addRequirement("CMB-90");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FROZEN_DOOR
        temp = new QuestModel(Quest.THE_FROZEN_DOOR, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-70");
        questObjective.addRequirement("SKILL-HITPOINTS-70");
        questObjective.addRequirement("SKILL-RANGED-70");
        questObjective.addRequirement("SKILL-STRENGTH-70");
        questObjective.addRequirement("CMB-90");
        QuestObjectivesList.add(questObjective);


/*
// Create a QuestModel object for KNIGHT_WAVES_TRAINING_GROUNDS
         QuestObjective KNIGHT_WAVES_TRAINING_GROUNDS = new  QuestObjective(
                "Complete the Knight's Waves Training Grounds Activity:",
                "The guide to complete Knight Waves can be found at https://oldschool.runescape.wiki/w/Knight_Waves",
                800,
                "QUEST-KNIGHT_WAVES"
        );
// Create a QuestModel object for ARCHITECTURAL_ALLIANCE
        QuestObjective ARCHITECTURAL_ALLIANCE = new  QuestObjective(
                "Complete the Architectural Alliance Quest:",
                "The guide to complete Architectural Alliance can be found at https://oldschool.runescape.wiki/w/Architectural_Alliance .",
                10,
                "QUEST-ARCHITECTURAL_ALLIANCE"
        );
        */


    }

    @Override
    public String toString() {
        String result= "QuestObjectives{ QuestObjectivesList=";
        for(Objective temp :QuestObjectivesList){
            result += "+ \n},\n " +temp;
        }
        result+="\nQuestPointObjectivesList=";
        for(Objective temp :QuestPointObjectivesList){
            result += ",\n " +temp;
        }
        return result+ "\n}";
    }
}
