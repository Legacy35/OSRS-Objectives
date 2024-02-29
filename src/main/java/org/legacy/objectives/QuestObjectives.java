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
        Quest temp;
        QuestObjective questObjective;
        //first few quests are given high prio to complete

        // Create a QuestModel object for COOKS_ASSISTANT
        temp = (Quest.COOKS_ASSISTANT);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHEEP_SHEARER
        temp = (Quest.SHEEP_SHEARER);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MISTHALIN_MYSTERY
        temp = (Quest.MISTHALIN_MYSTERY);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PRINCE_ALI_RESCUE
        temp = (Quest.PRINCE_ALI_RESCUE);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_RESTLESS_GHOST
        temp = (Quest.THE_RESTLESS_GHOST);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RUNE_MYSTERIES
        temp = (Quest.RUNE_MYSTERIES);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(1260); //This is so high because it is not required by a lot of requests, but since it unlocks RC it is a high prio to unlock first
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IMP_CATCHER
        temp = (Quest.IMP_CATCHER);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WITCHS_POTION
        temp = (Quest.WITCHS_POTION);
        questObjective = new  QuestObjective(temp);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GERTRUDES_CAT
        temp = (Quest.GERTRUDES_CAT);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DADDYS_HOME
        temp = (Quest.DADDYS_HOME);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DWARF_CANNON
        temp = (Quest.DWARF_CANNON);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WATERFALL_QUEST
        temp = (Quest.WATERFALL_QUEST);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TREE_GNOME_VILLAGE
        temp = (Quest.TREE_GNOME_VILLAGE);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DORICS_QUEST
        temp = (Quest.DORICS_QUEST);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WITCHS_HOUSE
        temp = (Quest.WITCHS_HOUSE);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_KNIGHTS_SWORD
        temp = (Quest.THE_KNIGHTS_SWORD);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        questObjective.addRequirement("SKILL-MINING-10");
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_TOURIST_TRAP
        temp = (Quest.THE_TOURIST_TRAP);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("SKILL-FLETCHING-10");
        questObjective.addRequirement("SKILL-SMITHING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BLACK_KNIGHTS_FORTRESS
        temp = (Quest.BLACK_KNIGHTS_FORTRESS);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-12");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRUIDIC_RITUAL
        temp = (Quest.DRUIDIC_RITUAL);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECRUITMENT_DRIVE
        temp = (Quest.RECRUITMENT_DRIVE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-BLACK_KNIGHTS_FORTRESS");
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GOBLIN_DIPLOMACY
        temp = (Quest.GOBLIN_DIPLOMACY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SLEEPING_GIANTS
        temp = (Quest.SLEEPING_GIANTS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-SMITHING-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FIGHT_ARENA
        temp = (Quest.FIGHT_ARENA);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PLAGUE_CITY
        temp = (Quest.PLAGUE_CITY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKS_FRIEND
        temp = (Quest.MONKS_FRIEND);
        questObjective.addBasePriorityLevel(40);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HAZEEL_CULT
        temp = (Quest.HAZEEL_CULT);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHEEP_HERDER
        temp = (Quest.SHEEP_HERDER);
        questObjective.addBasePriorityLevel(40);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BIOHAZARD
        temp = (Quest.BIOHAZARD);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PLAGUE_CITY");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TOWER_OF_LIFE
        temp = (Quest.TOWER_OF_LIFE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CONSTRUCTION-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TRIBAL_TOTEM
        temp = (Quest.TRIBAL_TOTEM);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-21");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEATH_PLATEAU
        temp = (Quest.DEATH_PLATEAU);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MERLINS_CRYSTAL
        temp = (Quest.MERLINS_CRYSTAL);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HOLY_GRAIL
        temp = (Quest.HOLY_GRAIL);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MERLINS_CRYSTAL");
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-ATTACK-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MURDER_MYSTERY
        temp = (Quest.MURDER_MYSTERY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GRAND_TREE
        temp = (Quest.THE_GRAND_TREE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("CMB-50");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RAG_AND_BONE_MAN_I
        temp = (Quest.RAG_AND_BONE_MAN_I);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PRIEST_IN_PERIL
        temp = (Quest.PRIEST_IN_PERIL);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for NATURE_SPIRIT
        temp = (Quest.NATURE_SPIRIT);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_LOST_TRIBE
        temp = (Quest.THE_LOST_TRIBE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-13");
        questObjective.addRequirement("SKILL-THIEVING-13");
        questObjective.addRequirement("SKILL-MINING-17");
        questObjective.addRequirement("QUEST-GOBLIN_DIPLOMACY");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEATH_TO_THE_DORGESHUUN
        temp = (Quest.DEATH_TO_THE_DORGESHUUN);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_LOST_TRIBE");
        questObjective.addRequirement("SKILL-THIEVING-23");
        questObjective.addRequirement("SKILL-AGILITY-23");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ELEMENTAL_WORKSHOP_I
        temp = (Quest.ELEMENTAL_WORKSHOP_I);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MINING-20");
        questObjective.addRequirement("SKILL-SMITHING-20");
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ICTHLARINS_LITTLE_HELPER
        temp = (Quest.ICTHLARINS_LITTLE_HELPER);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-AGILITY-35");
        questObjective.addRequirement("QUEST-GERTRUDES_CAT");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GOLEM
        temp = (Quest.THE_GOLEM);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-THIEVING-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LOST_CITY
        temp = (Quest.LOST_CITY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-45");
        questObjective.addRequirement("SKILL-CRAFTING-31");
        questObjective.addRequirement("SKILL-WOODCUTTING-36");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAIRYTALE_I__GROWING_PAINS
        temp = (Quest.FAIRYTALE_I__GROWING_PAINS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-LOST_CITY");
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST
        temp = (Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-COOKING-10");
        questObjective.addRequirement("QUEST-COOKS_ASSISTANT");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE
        temp = (Quest.RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("QUEST-GOBLIN_DIPLOMACY");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SEA_SLUG
        temp = (Quest.SEA_SLUG);
        questObjective.addBasePriorityLevel(5);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FIREMAKING-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FISHING_CONTEST
        temp = (Quest.FISHING_CONTEST);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FISHING-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__MOUNTAIN_DWARF
        temp = (Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOUNTAIN_DAUGHTER
        temp = (Quest.MOUNTAIN_DAUGHTER);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-40");
        questObjective.addRequirement("SKILL-AGILITY-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RATCATCHERS
        temp = (Quest.RATCATCHERS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ICTHLARINS_LITTLE_HELPER");
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FEUD
        temp = (Quest.THE_FEUD);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-30");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ALFRED_GRIMHANDS_BARCRAWL
        temp = (Quest.ALFRED_GRIMHANDS_BARCRAWL);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SCORPION_CATCHER
        temp = (Quest.SCORPION_CATCHER);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-PRAYER-31");
        questObjective.addRequirement("QUEST-ALFRED_GRIMHANDS_BARCRAWL");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_DIG_SITE
        temp = (Quest.THE_DIG_SITE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-10");
        questObjective.addRequirement("SKILL-HERBLORE-10");
        questObjective.addRequirement("SKILL-THIEVING-25");
        questObjective.addBasePriorityLevel(5);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ELEMENTAL_WORKSHOP_II
        temp = (Quest.ELEMENTAL_WORKSHOP_II);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-20");
        questObjective.addRequirement("SKILL-SMITHING-30");
        questObjective.addRequirement("QUEST-ELEMENTAL_WORKSHOP_I");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_SOULS_BANE
        temp = (Quest.A_SOULS_BANE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENTER_THE_ABYSS
        temp = (Quest.ENTER_THE_ABYSS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(15);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for X_MARKS_THE_SPOT
        temp = (Quest.X_MARKS_THE_SPOT);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PIRATES_TREASURE
        temp = (Quest.PIRATES_TREASURE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CLIENT_OF_KOUREND
        temp = (Quest.CLIENT_OF_KOUREND);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-X_MARKS_THE_SPOT");
        questObjective.addBasePriorityLevel(5);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_QUEEN_OF_THIEVES
        temp = (Quest.THE_QUEEN_OF_THIEVES);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-THIEVING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_DEPTHS_OF_DESPAIR
        temp = (Quest.THE_DEPTHS_OF_DESPAIR);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-AGILITY-18");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_PORCINE_OF_INTEREST
        temp = (Quest.A_PORCINE_OF_INTEREST);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WANTED
        temp = (Quest.WANTED);
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
        temp = (Quest.SHIELD_OF_ARRAV);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BONE_VOYAGE
        temp = (Quest.BONE_VOYAGE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_DIG_SITE");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WATCHTOWER
        temp = (Quest.WATCHTOWER);
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
        temp = (Quest.THE_GIANT_DWARF);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-12");
        questObjective.addRequirement("SKILL-FIREMAKING-16");
        questObjective.addRequirement("SKILL-MAGIC-33");
        questObjective.addRequirement("SKILL-THIEVING-14");
        questObjective.addBasePriorityLevel(10);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAKING_HISTORY
        temp = (Quest.MAKING_HISTORY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GHOSTS_AHOY
        temp = (Quest.GHOSTS_AHOY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("SKILL-COOKING-20");
        questObjective.addRequirement("CMB-15");
        questObjective.addBasePriorityLevel(15);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FORGETTABLE_TALE
        temp = (Quest.FORGETTABLE_TALE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        questObjective.addRequirement("SKILL-COOKING-22");
        questObjective.addRequirement("SKILL-FARMING-17");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ANOTHER_SLICE_OF_HAM
        temp = (Quest.ANOTHER_SLICE_OF_HAM);
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
        temp = (Quest.VAMPYRE_SLAYER);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ERNEST_THE_CHICKEN
        temp = (Quest.ERNEST_THE_CHICKEN);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEMON_SLAYER
        temp = (Quest.DEMON_SLAYER);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHADOW_OF_THE_STORM
        temp = (Quest.SHADOW_OF_THE_STORM);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("QUEST-THE_GOLEM");
        questObjective.addRequirement("QUEST-DEMON_SLAYER");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ANIMAL_MAGNETISM
        temp = (Quest.ANIMAL_MAGNETISM);
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
        temp = (Quest.CREATURE_OF_FENKENSTRAIN);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-THIEVING-25");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BIG_CHOMPY_BIRD_HUNTING
        temp = (Quest.BIG_CHOMPY_BIRD_HUNTING);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FLETCHING-5");
        questObjective.addRequirement("SKILL-COOKING-30");
        questObjective.addRequirement("SKILL-RANGED-30");
        questObjective.addRequirement("CMB-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for JUNGLE_POTION
        temp = (Quest.JUNGLE_POTION);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("SKILL-HERBLORE-3");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHILO_VILLAGE
        temp = (Quest.SHILO_VILLAGE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(10);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-AGILITY-32");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ZOGRE_FLESH_EATERS
        temp = (Quest.ZOGRE_FLESH_EATERS);
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
        temp = (Quest.OBSERVATORY_QUEST);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HORROR_FROM_THE_DEEP
        temp = (Quest.HORROR_FROM_THE_DEEP);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(5);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("QUEST-ALFRED_GRIMHANDS_BARCRAWL");
        questObjective.addRequirement("SKILL-AGILITY-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SPIRITS_OF_THE_ELID
        temp = (Quest.SPIRITS_OF_THE_ELID);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-33");
        questObjective.addRequirement("SKILL-RANGED-37");
        questObjective.addRequirement("SKILL-MINING-37");
        questObjective.addRequirement("SKILL-THIEVING-37");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GARDEN_OF_TRANQUILLITY
        temp = (Quest.GARDEN_OF_TRANQUILLITY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FARMING-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENLIGHTENED_JOURNEY
        temp = (Quest.ENLIGHTENED_JOURNEY);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-20");
        questObjective.addRequirement("SKILL-FIREMAKING-20");
        questObjective.addRequirement("SKILL-FARMING-30");
        questObjective.addRequirement("SKILL-CRAFTING-36");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROMEO__JULIET
        temp = (Quest.ROMEO__JULIET);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEARS_OF_GUTHIX
        temp = (Quest.TEARS_OF_GUTHIX);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(20);
        questObjective.addRequirement("QP-43");
        questObjective.addRequirement("SKILL-FIREMAKING-49");
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-MINING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IN_SEARCH_OF_THE_MYREQUE
        temp = (Quest.IN_SEARCH_OF_THE_MYREQUE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHADES_OF_MORTTON
        temp = (Quest.SHADES_OF_MORTTON);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("CMB-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IN_AID_OF_THE_MYREQUE
        temp = (Quest.IN_AID_OF_THE_MYREQUE);
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
        temp = (Quest.SKIPPY_AND_THE_MOGRES);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-COOKING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TROLL_STRONGHOLD
        temp = (Quest.TROLL_STRONGHOLD);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DEATH_PLATEAU");
        questObjective.addRequirement("SKILL-AGILITY-15");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TROLL_ROMANCE
        temp = (Quest.TROLL_ROMANCE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("SKILL-AGILITY-28");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DARKNESS_OF_HALLOWVALE
        temp = (Quest.DARKNESS_OF_HALLOWVALE);
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
        temp = (Quest.UNDERGROUND_PASS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-BIOHAZARD");
        questObjective.addRequirement("SKILL-RANGED-25");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for REGICIDE
        temp = (Quest.REGICIDE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-10");
        questObjective.addRequirement("SKILL-AGILITY-56");
        questObjective.addRequirement("QUEST-UNDERGROUND_PASS");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRAGON_SLAYER_I
        temp = (Quest.DRAGON_SLAYER_I);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-32");
        questObjective.addRequirement("CMB-45");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_TRIALS
        temp = (Quest.THE_FREMENNIK_TRIALS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_ISLES
        temp = (Quest.THE_FREMENNIK_ISLES);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CONSTRUCTION-20");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__EVIL_DAVE
        temp = (Quest.RECIPE_FOR_DISASTER__EVIL_DAVE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-25");
        questObjective.addRequirement("QUEST-GERTRUDES_CAT");
        questObjective.addRequirement("QUEST-SHADOW_OF_THE_STORM");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__PIRATE_PETE
        temp = (Quest.RECIPE_FOR_DISASTER__PIRATE_PETE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-31");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TAI_BWO_WANNAI_TRIO
        temp = (Quest.TAI_BWO_WANNAI_TRIO);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-15");
        questObjective.addRequirement("SKILL-COOKING-30");
        questObjective.addRequirement("SKILL-FISHING-5");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CONTACT
        temp = (Quest.CONTACT);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-50");
        questObjective.addRequirement("SKILL-THIEVING-50");
        questObjective.addRequirement("CMB-70");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEMPLE_OF_IKOV
        temp = (Quest.TEMPLE_OF_IKOV);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-42");
        questObjective.addRequirement("SKILL-RANGED-40");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_EYES_OF_GLOUPHRIE
        temp = (Quest.THE_EYES_OF_GLOUPHRIE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_GRAND_TREE");
        questObjective.addRequirement("SKILL-CONSTRUCTION-5");
        questObjective.addRequirement("SKILL-MAGIC-46");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEMPLE_OF_THE_EYE
        temp = (Quest.TEMPLE_OF_THE_EYE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ENTER_THE_ABYSS");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ONE_SMALL_FAVOUR
        temp = (Quest.ONE_SMALL_FAVOUR);
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
        temp = (Quest.THE_ASCENT_OF_ARCEUUS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-HUNTER-12");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TALE_OF_THE_RIGHTEOUS CLIENT_OF_KOUREND
        temp = (Quest.TALE_OF_THE_RIGHTEOUS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-STRENGTH-16");
        questObjective.addRequirement("SKILL-MINING-10");
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BETWEEN_A_ROCK
        temp = (Quest.BETWEEN_A_ROCK);
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
        temp = (Quest.THE_FORSAKEN_TOWER);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_SLUG_MENACE
        temp = (Quest.THE_SLUG_MENACE);
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
        temp = (Quest.GETTING_AHEAD);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("SKILL-CONSTRUCTION-26");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for COLD_WAR
        temp = (Quest.COLD_WAR);
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
        temp = (Quest.THE_HAND_IN_THE_SAND);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-17");
        questObjective.addRequirement("SKILL-CRAFTING-49");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENAKHRAS_LAMENT
        temp = (Quest.ENAKHRAS_LAMENT);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-25");
        questObjective.addRequirement("SKILL-CRAFTING-50");
        questObjective.addRequirement("SKILL-FIREMAKING-45");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addRequirement("SKILL-MAGIC-39");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for EADGARS_RUSE
        temp = (Quest.EADGARS_RUSE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("SKILL-AGILITY-31");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MY_ARMS_BIG_ADVENTURE
        temp = (Quest.MY_ARMS_BIG_ADVENTURE);
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
        temp = (Quest.THE_GARDEN_OF_DEATH);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("SKILL-FARMING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RAG_AND_BONE_MAN_II
        temp = (Quest.RAG_AND_BONE_MAN_II);
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
        temp = (Quest.RUM_DEAL);
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
        temp = (Quest.CABIN_FEVER);
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
        temp = (Quest.RECIPE_FOR_DISASTER__LUMBRIDGE_GUIDE);
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
        temp = (Quest.RECIPE_FOR_DISASTER__SKRACH_UGLOGWEE);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-41");
        questObjective.addRequirement("SKILL-FIREMAKING-20");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HEROES_QUEST
        temp = (Quest.HEROES_QUEST);
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
        temp = (Quest.THRONE_OF_MISCELLANIA);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-HEROES_QUEST");
        questObjective.addRequirement("QUEST-THE_FREMENNIK_TRIALS");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROYAL_TROUBLE
        temp = (Quest.ROYAL_TROUBLE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THRONE_OF_MISCELLANIA");
        questObjective.addRequirement("SKILL-AGILITY-40");
        questObjective.addRequirement("SKILL-SLAYER-40");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HAUNTED_MINE
        temp = (Quest.HAUNTED_MINE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("SKILL-CRAFTING-35");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LAIR_OF_TARN_RAZORLOR
        temp = (Quest.LAIR_OF_TARN_RAZORLOR);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-SLAYER-40");
        questObjective.addRequirement("QUEST-HAUNTED_MINE");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKEY_MADNESS_I
        temp = (Quest.MONKEY_MADNESS_I);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("QUEST-THE_GRAND_TREE");
        questObjective.addRequirement("QUEST-TREE_GNOME_VILLAGE");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROVING_ELVES
        temp = (Quest.ROVING_ELVES);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-REGICIDE");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOURNINGS_END_PART_I
        temp = (Quest.MOURNINGS_END_PART_I);
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
        temp = (Quest.MOURNINGS_END_PART_II);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MOURNINGS_END_PART_I");
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("SKILL-AGILITY-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DESERT_TREASURE_I
        temp = (Quest.DESERT_TREASURE_I);
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
        temp = (Quest.FAMILY_CREST);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-55");
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WHAT_LIES_BELOW
        temp = (Quest.WHAT_LIES_BELOW);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-RUNECRAFT-35");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for EAGLES_PEAK
        temp = (Quest.EAGLES_PEAK);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-HUNTER-27");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_TAIL_OF_TWO_CATS
        temp = (Quest.A_TAIL_OF_TWO_CATS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ICTHLARINS_LITTLE_HELPER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LEGENDS_QUEST
        temp = (Quest.LEGENDS_QUEST);
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
        temp = (Quest.LAND_OF_THE_GOBLINS);
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
        temp = (Quest.RECIPE_FOR_DISASTER__SIR_AMIK_VARZE);
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
        temp = (Quest.OLAFS_QUEST);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FIREMAKING-40");
        questObjective.addRequirement("SKILL-WOODCUTTING-50");
        questObjective.addRequirement("QUEST-THE_FREMENNIK_TRIALS");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_KINGDOM_DIVIDED
        temp = (Quest.A_KINGDOM_DIVIDED);
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
        temp = (Quest.A_TASTE_OF_HOPE);
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
        temp = (Quest.CURSE_OF_THE_EMPTY_LORD);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-53");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GENERALS_SHADOW
        temp = (Quest.THE_GENERALS_SHADOW);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CURSE_OF_THE_EMPTY_LORD");
        questObjective.addRequirement("QUEST-FIGHT_ARENA");
        questObjective.addRequirement("QUEST-DESERT_TREASURE_I");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HIS_FAITHFUL_SERVANTS
        temp = (Quest.HIS_FAITHFUL_SERVANTS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("CMB-70");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GREAT_BRAIN_ROBBERY
        temp = (Quest.THE_GREAT_BRAIN_ROBBERY);
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
        temp = (Quest.FAIRYTALE_II__CURE_A_QUEEN);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-FAIRYTALE_I__GROWING_PAINS");
        questObjective.addRequirement("SKILL-THIEVING-40");
        questObjective.addRequirement("SKILL-FARMING-49");
        questObjective.addRequirement("SKILL-HERBLORE-57");
        questObjective.addRequirement("CMB-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__KING_AWOWOGEI
        temp = (Quest.RECIPE_FOR_DISASTER__KING_AWOWOGEI);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-70");
        questObjective.addRequirement("SKILL-AGILITY-48");
        questObjective.addRequirement("QUEST-MONKEY_MADNESS_I");
        questObjective.addRequirement("CMB-65");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__CULINAROMANCER
        temp = (Quest.RECIPE_FOR_DISASTER__CULINAROMANCER);
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
        temp = (Quest.RECIPE_FOR_DISASTER);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(400);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__CULINAROMANCER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_PATH_OF_GLOUPHRIE
        temp = (Quest.THE_PATH_OF_GLOUPHRIE);
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
        temp = (Quest.LUNAR_DIPLOMACY);
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
        temp = (Quest.KINGS_RANSOM);
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
        temp = (Quest.SWAN_SONG);
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
        temp = (Quest.BELOW_ICE_MOUNTAIN);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-16");
        QuestObjectivesList.add(questObjective);

        //TODO: INSERT DEFENDER OF VARROCK

        // Create a QuestModel object for DEVIOUS_MINDS
        temp = (Quest.DEVIOUS_MINDS);
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
        temp = (Quest.GRIM_TALES);
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
        temp = (Quest.DREAM_MENTOR);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-LUNAR_DIPLOMACY");
        questObjective.addRequirement("QUEST-EADGARS_RUSE");
        questObjective.addRequirement("CMB-85");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_EXILES
        temp = (Quest.THE_FREMENNIK_EXILES);
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
        temp = (Quest.SINS_OF_THE_FATHER);
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
        temp = (Quest.IN_SEARCH_OF_KNOWLEDGE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BENEATH_CURSED_SANDS
        temp = (Quest.BENEATH_CURSED_SANDS);
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
        temp = (Quest.MONKEY_MADNESS_II);
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
        temp = (Quest.INTO_THE_TOMBS);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-95");
        questObjective.addRequirement("QUEST-BENEATH_CURSED_SANDS");
        questObjective.addBasePriorityLevel(10);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_NIGHT_AT_THE_THEATRE
        temp = (Quest.A_NIGHT_AT_THE_THEATRE);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-A_TASTE_OF_HOPE");
        questObjective.addRequirement("CMB-95");
        questObjective.addRequirement("SKILL-PRAYER-43");
//      questObjective.addRequirement("VALUE-50m");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRAGON_SLAYER_II
        temp = (Quest.DRAGON_SLAYER_II);
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
        temp = (Quest.MAKING_FRIENDS_WITH_MY_ARM);
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
        temp = (Quest.SECRETS_OF_THE_NORTH);
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
        temp = (Quest.DESERT_TREASURE_II__THE_FALLEN_EMPIRE);
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
        temp = (Quest.SONG_OF_THE_ELVES);
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
        temp = (Quest.CLOCK_TOWER);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);



        // Create a QuestModel object for THE_CORSAIR_CURSE
        temp = (Quest.THE_CORSAIR_CURSE);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CHILDREN_OF_THE_SUN
        temp = (Quest.CHILDREN_OF_THE_SUN);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(150);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BEAR_YOUR_SOUL
        temp = (Quest.BEAR_YOUR_SOUL);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(80);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_ENCHANTED_KEY
        temp = (Quest.THE_ENCHANTED_KEY);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MAKING_HISTORY");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAGE_ARENA_I
        temp = (Quest.MAGE_ARENA_I);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        questObjective.addRequirement("SKILL-MAGIC-60");
        questObjective.addRequirement("CMB-55");
        questObjective.addBasePriorityLevel(180);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAMILY_PEST
        temp = (Quest.FAMILY_PEST);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-FAMILY_CREST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAGE_ARENA_II
        temp = (Quest.MAGE_ARENA_II);
        questObjective = new  QuestObjective(temp);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-75");
        questObjective.addRequirement("CMB-80");
        questObjective.addBasePriorityLevel(180);
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HOPESPEARS_WILL
        temp = (Quest.HOPESPEARS_WILL);
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
        temp = (Quest.THE_FROZEN_DOOR);
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
