package org.legacy.objectives;

import net.runelite.api.Quest;
import net.runelite.api.Skill;
import org.legacy.objectives.models.QuestObjective;
import org.legacy.objectives.models.Objective;
import org.legacy.objectives.models.QuestPointObjective;

import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class QuestObjectivesProvider extends ObjectivesProvider {
    public ArrayList<Objective> QuestObjectivesList;
    public ArrayList<Objective> QuestPointObjectivesList;

    public QuestObjectivesProvider(){
    }
    public void initialize(){
        QuestObjectivesList= new ArrayList<>();
        QuestPointObjectivesList= new ArrayList<>();
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
        questObjective = new QuestObjective(Quest.COOKS_ASSISTANT);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        questObjective.addTag(ObjectiveTags.GIVES_XP.setSkill(Skill.COOKING));
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHEEP_SHEARER
        questObjective = new QuestObjective(Quest.SHEEP_SHEARER);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MISTHALIN_MYSTERY
        questObjective = new QuestObjective(Quest.MISTHALIN_MYSTERY);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PRINCE_ALI_RESCUE
        questObjective = new QuestObjective(Quest.PRINCE_ALI_RESCUE);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_RESTLESS_GHOST
        questObjective = new QuestObjective(Quest.THE_RESTLESS_GHOST);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RUNE_MYSTERIES
        questObjective = new QuestObjective(Quest.RUNE_MYSTERIES);
        questObjective.addBasePriorityLevel(1260); //This is so high because it is not required by a lot of quests, but since it unlocks RC it is a high prio to unlock first
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IMP_CATCHER
        questObjective = new QuestObjective(Quest.IMP_CATCHER);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WITCHS_POTION
        questObjective = new QuestObjective(Quest.WITCHS_POTION);
        questObjective.addBasePriorityLevel(250);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GERTRUDES_CAT
        questObjective = new QuestObjective(Quest.GERTRUDES_CAT);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DADDYS_HOME
        questObjective = new QuestObjective(Quest.DADDYS_HOME);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DWARF_CANNON
        questObjective = new QuestObjective(Quest.DWARF_CANNON);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WATERFALL_QUEST
        questObjective = new QuestObjective(Quest.WATERFALL_QUEST);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TREE_GNOME_VILLAGE
        questObjective = new QuestObjective(Quest.TREE_GNOME_VILLAGE);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        questObjective.addBasePriorityLevel(250);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DORICS_QUEST
        questObjective = new QuestObjective(Quest.DORICS_QUEST);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WITCHS_HOUSE
        questObjective = new QuestObjective(Quest.WITCHS_HOUSE);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_KNIGHTS_SWORD
        questObjective = new QuestObjective(Quest.THE_KNIGHTS_SWORD);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(100);
        questObjective.addRequirement("SKILL-MINING-10");
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_TOURIST_TRAP
        questObjective = new QuestObjective(Quest.THE_TOURIST_TRAP);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("SKILL-FLETCHING-10");
        questObjective.addRequirement("SKILL-SMITHING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BLACK_KNIGHTS_FORTRESS
        questObjective = new QuestObjective(Quest.BLACK_KNIGHTS_FORTRESS);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-12");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRUIDIC_RITUAL
        questObjective = new QuestObjective(Quest.DRUIDIC_RITUAL);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECRUITMENT_DRIVE
        questObjective = new QuestObjective(Quest.RECRUITMENT_DRIVE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-BLACK_KNIGHTS_FORTRESS");
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GOBLIN_DIPLOMACY
        questObjective = new QuestObjective(Quest.GOBLIN_DIPLOMACY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SLEEPING_GIANTS
        questObjective = new QuestObjective(Quest.SLEEPING_GIANTS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-SMITHING-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FIGHT_ARENA
        questObjective = new QuestObjective(Quest.FIGHT_ARENA);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PLAGUE_CITY
        questObjective = new QuestObjective(Quest.PLAGUE_CITY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKS_FRIEND
        temp = (Quest.MONKS_FRIEND);
        questObjective.addBasePriorityLevel(40);
        questObjective = new  QuestObjective(temp);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HAZEEL_CULT
        questObjective = new QuestObjective(Quest.HAZEEL_CULT);
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
        questObjective = new QuestObjective(Quest.BIOHAZARD);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PLAGUE_CITY");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TOWER_OF_LIFE
        questObjective = new QuestObjective(Quest.TOWER_OF_LIFE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CONSTRUCTION-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TRIBAL_TOTEM
        questObjective = new QuestObjective(Quest.TRIBAL_TOTEM);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-21");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEATH_PLATEAU
        questObjective = new QuestObjective(Quest.DEATH_PLATEAU);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MERLINS_CRYSTAL
        questObjective = new QuestObjective(Quest.MERLINS_CRYSTAL);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HOLY_GRAIL
        questObjective = new QuestObjective(Quest.HOLY_GRAIL);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MERLINS_CRYSTAL");
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-ATTACK-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MURDER_MYSTERY
        questObjective = new QuestObjective(Quest.MURDER_MYSTERY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GRAND_TREE
        questObjective = new QuestObjective(Quest.THE_GRAND_TREE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("CMB-50");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RAG_AND_BONE_MAN_I
        questObjective = new QuestObjective(Quest.RAG_AND_BONE_MAN_I);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PRIEST_IN_PERIL
        questObjective = new QuestObjective(Quest.PRIEST_IN_PERIL);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for NATURE_SPIRIT
        questObjective = new QuestObjective(Quest.NATURE_SPIRIT);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_LOST_TRIBE
        questObjective = new QuestObjective(Quest.THE_LOST_TRIBE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-13");
        questObjective.addRequirement("SKILL-THIEVING-13");
        questObjective.addRequirement("SKILL-MINING-17");
        questObjective.addRequirement("QUEST-GOBLIN_DIPLOMACY");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEATH_TO_THE_DORGESHUUN
        questObjective = new QuestObjective(Quest.DEATH_TO_THE_DORGESHUUN);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_LOST_TRIBE");
        questObjective.addRequirement("SKILL-THIEVING-23");
        questObjective.addRequirement("SKILL-AGILITY-23");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ELEMENTAL_WORKSHOP_I
        questObjective = new QuestObjective(Quest.ELEMENTAL_WORKSHOP_I);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MINING-20");
        questObjective.addRequirement("SKILL-SMITHING-20");
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ICTHLARINS_LITTLE_HELPER
        questObjective = new QuestObjective(Quest.ICTHLARINS_LITTLE_HELPER);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-AGILITY-35");
        questObjective.addRequirement("QUEST-GERTRUDES_CAT");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GOLEM
        questObjective = new QuestObjective(Quest.THE_GOLEM);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-THIEVING-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LOST_CITY
        questObjective = new QuestObjective(Quest.LOST_CITY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-45");
        questObjective.addRequirement("SKILL-CRAFTING-31");
        questObjective.addRequirement("SKILL-WOODCUTTING-36");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAIRYTALE_I__GROWING_PAINS
        questObjective = new QuestObjective(Quest.FAIRYTALE_I__GROWING_PAINS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-LOST_CITY");
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-COOKING-10");
        questObjective.addRequirement("QUEST-COOKS_ASSISTANT");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE);
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
        questObjective = new QuestObjective(Quest.FISHING_CONTEST);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FISHING-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__MOUNTAIN_DWARF
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(50);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOUNTAIN_DAUGHTER
        questObjective = new QuestObjective(Quest.MOUNTAIN_DAUGHTER);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-40");
        questObjective.addRequirement("SKILL-AGILITY-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RATCATCHERS
        questObjective = new QuestObjective(Quest.RATCATCHERS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ICTHLARINS_LITTLE_HELPER");
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FEUD
        questObjective = new QuestObjective(Quest.THE_FEUD);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-30");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ALFRED_GRIMHANDS_BARCRAWL
        questObjective = new QuestObjective(Quest.ALFRED_GRIMHANDS_BARCRAWL);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SCORPION_CATCHER
        questObjective = new QuestObjective(Quest.SCORPION_CATCHER);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-PRAYER-31");
        questObjective.addRequirement("QUEST-ALFRED_GRIMHANDS_BARCRAWL");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_DIG_SITE
        questObjective = new QuestObjective(Quest.THE_DIG_SITE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-10");
        questObjective.addRequirement("SKILL-HERBLORE-10");
        questObjective.addRequirement("SKILL-THIEVING-25");
        questObjective.addBasePriorityLevel(5);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ELEMENTAL_WORKSHOP_II
        questObjective = new QuestObjective(Quest.ELEMENTAL_WORKSHOP_II);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-20");
        questObjective.addRequirement("SKILL-SMITHING-30");
        questObjective.addRequirement("QUEST-ELEMENTAL_WORKSHOP_I");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_SOULS_BANE
        questObjective = new QuestObjective(Quest.A_SOULS_BANE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENTER_THE_ABYSS
        questObjective = new QuestObjective(Quest.ENTER_THE_ABYSS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(15);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for X_MARKS_THE_SPOT
        questObjective = new QuestObjective(Quest.X_MARKS_THE_SPOT);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for PIRATES_TREASURE
        questObjective = new QuestObjective(Quest.PIRATES_TREASURE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CLIENT_OF_KOUREND
        questObjective = new QuestObjective(Quest.CLIENT_OF_KOUREND);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-X_MARKS_THE_SPOT");
        questObjective.addBasePriorityLevel(5);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_QUEEN_OF_THIEVES
        questObjective = new QuestObjective(Quest.THE_QUEEN_OF_THIEVES);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-THIEVING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_DEPTHS_OF_DESPAIR
        questObjective = new QuestObjective(Quest.THE_DEPTHS_OF_DESPAIR);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-AGILITY-18");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_PORCINE_OF_INTEREST
        questObjective = new QuestObjective(Quest.A_PORCINE_OF_INTEREST);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WANTED
        questObjective = new QuestObjective(Quest.WANTED);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-32");
        questObjective.addRequirement("QUEST-RECRUITMENT_DRIVE");
        questObjective.addRequirement("QUEST-THE_LOST_TRIBE");
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-ENTER_THE_ABYSS");
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHIELD_OF_ARRAV
        questObjective = new QuestObjective(Quest.SHIELD_OF_ARRAV);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BONE_VOYAGE
        questObjective = new QuestObjective(Quest.BONE_VOYAGE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_DIG_SITE");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WATCHTOWER
        questObjective = new QuestObjective(Quest.WATCHTOWER);
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
        questObjective = new QuestObjective(Quest.THE_GIANT_DWARF);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-12");
        questObjective.addRequirement("SKILL-FIREMAKING-16");
        questObjective.addRequirement("SKILL-MAGIC-33");
        questObjective.addRequirement("SKILL-THIEVING-14");
        questObjective.addBasePriorityLevel(10);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAKING_HISTORY
        questObjective = new QuestObjective(Quest.MAKING_HISTORY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GHOSTS_AHOY
        questObjective = new QuestObjective(Quest.GHOSTS_AHOY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("SKILL-COOKING-20");
        questObjective.addRequirement("CMB-15");
        questObjective.addBasePriorityLevel(15);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FORGETTABLE_TALE
        questObjective = new QuestObjective(Quest.FORGETTABLE_TALE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        questObjective.addRequirement("SKILL-COOKING-22");
        questObjective.addRequirement("SKILL-FARMING-17");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ANOTHER_SLICE_OF_HAM
        questObjective = new QuestObjective(Quest.ANOTHER_SLICE_OF_HAM);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DEATH_TO_THE_DORGESHUUN");
        questObjective.addRequirement("QUEST-THE_GIANT_DWARF");
        questObjective.addRequirement("QUEST-THE_DIG_SITE");
        questObjective.addRequirement("SKILL-ATTACK-15");
        questObjective.addRequirement("SKILL-PRAYER-25");
        questObjective.addRequirement("CMB-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for VAMPYRE_SLAYER
        questObjective = new QuestObjective(Quest.VAMPYRE_SLAYER);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ERNEST_THE_CHICKEN
        questObjective = new QuestObjective(Quest.ERNEST_THE_CHICKEN);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DEMON_SLAYER
        questObjective = new QuestObjective(Quest.DEMON_SLAYER);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHADOW_OF_THE_STORM
        questObjective = new QuestObjective(Quest.SHADOW_OF_THE_STORM);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("QUEST-THE_GOLEM");
        questObjective.addRequirement("QUEST-DEMON_SLAYER");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ANIMAL_MAGNETISM
        questObjective = new QuestObjective(Quest.ANIMAL_MAGNETISM);
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
        questObjective = new QuestObjective(Quest.CREATURE_OF_FENKENSTRAIN);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-THIEVING-25");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BIG_CHOMPY_BIRD_HUNTING
        questObjective = new QuestObjective(Quest.BIG_CHOMPY_BIRD_HUNTING);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FLETCHING-5");
        questObjective.addRequirement("SKILL-COOKING-30");
        questObjective.addRequirement("SKILL-RANGED-30");
        questObjective.addRequirement("CMB-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for JUNGLE_POTION
        questObjective = new QuestObjective(Quest.JUNGLE_POTION);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("SKILL-HERBLORE-3");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHILO_VILLAGE
        questObjective = new QuestObjective(Quest.SHILO_VILLAGE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(10);
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-AGILITY-32");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ZOGRE_FLESH_EATERS
        questObjective = new QuestObjective(Quest.ZOGRE_FLESH_EATERS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-SMITHING-4");
        questObjective.addRequirement("SKILL-HERBLORE-8");
        questObjective.addRequirement("SKILL-RANGED-30");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for OBSERVATORY_QUEST
        questObjective = new QuestObjective(Quest.OBSERVATORY_QUEST);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HORROR_FROM_THE_DEEP
        questObjective = new QuestObjective(Quest.HORROR_FROM_THE_DEEP);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(5);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("QUEST-ALFRED_GRIMHANDS_BARCRAWL");
        questObjective.addRequirement("SKILL-AGILITY-35");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SPIRITS_OF_THE_ELID
        questObjective = new QuestObjective(Quest.SPIRITS_OF_THE_ELID);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-33");
        questObjective.addRequirement("SKILL-RANGED-37");
        questObjective.addRequirement("SKILL-MINING-37");
        questObjective.addRequirement("SKILL-THIEVING-37");
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GARDEN_OF_TRANQUILLITY
        questObjective = new QuestObjective(Quest.GARDEN_OF_TRANQUILLITY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FARMING-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENLIGHTENED_JOURNEY
        questObjective = new QuestObjective(Quest.ENLIGHTENED_JOURNEY);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-20");
        questObjective.addRequirement("SKILL-FIREMAKING-20");
        questObjective.addRequirement("SKILL-FARMING-30");
        questObjective.addRequirement("SKILL-CRAFTING-36");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROMEO__JULIET
        questObjective = new QuestObjective(Quest.ROMEO__JULIET);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEARS_OF_GUTHIX
        questObjective = new QuestObjective(Quest.TEARS_OF_GUTHIX);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(20);
        questObjective.addRequirement("QP-43");
        questObjective.addRequirement("SKILL-FIREMAKING-49");
        questObjective.addRequirement("SKILL-CRAFTING-20");
        questObjective.addRequirement("SKILL-MINING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IN_SEARCH_OF_THE_MYREQUE
        questObjective = new QuestObjective(Quest.IN_SEARCH_OF_THE_MYREQUE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-NATURE_SPIRIT");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SHADES_OF_MORTTON
        questObjective = new QuestObjective(Quest.SHADES_OF_MORTTON);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("CMB-25");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for IN_AID_OF_THE_MYREQUE
        questObjective = new QuestObjective(Quest.IN_AID_OF_THE_MYREQUE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-IN_SEARCH_OF_THE_MYREQUE");
        questObjective.addRequirement("CMB-45");
        questObjective.addRequirement("SKILL-AGILITY-25");
        questObjective.addRequirement("SKILL-CRAFTING-25");
        questObjective.addRequirement("SKILL-MINING-15");
        questObjective.addRequirement("SKILL-MAGIC-7");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for SKIPPY_AND_THE_MOGRES
        questObjective = new QuestObjective(Quest.SKIPPY_AND_THE_MOGRES);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-COOKING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TROLL_STRONGHOLD
        questObjective = new QuestObjective(Quest.TROLL_STRONGHOLD);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DEATH_PLATEAU");
        questObjective.addRequirement("SKILL-AGILITY-15");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TROLL_ROMANCE
        questObjective = new QuestObjective(Quest.TROLL_ROMANCE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("SKILL-AGILITY-28");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DARKNESS_OF_HALLOWVALE
        questObjective = new QuestObjective(Quest.DARKNESS_OF_HALLOWVALE);
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
        questObjective = new QuestObjective(Quest.UNDERGROUND_PASS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-BIOHAZARD");
        questObjective.addRequirement("SKILL-RANGED-25");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for REGICIDE
        questObjective = new QuestObjective(Quest.REGICIDE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-10");
        questObjective.addRequirement("SKILL-AGILITY-56");
        questObjective.addRequirement("QUEST-UNDERGROUND_PASS");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRAGON_SLAYER_I
        questObjective = new QuestObjective(Quest.DRAGON_SLAYER_I);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-32");
        questObjective.addRequirement("CMB-45");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_TRIALS
        questObjective = new QuestObjective(Quest.THE_FREMENNIK_TRIALS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-40");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_ISLES
        questObjective = new QuestObjective(Quest.THE_FREMENNIK_ISLES);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CONSTRUCTION-20");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__EVIL_DAVE
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__EVIL_DAVE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-25");
        questObjective.addRequirement("QUEST-GERTRUDES_CAT");
        questObjective.addRequirement("QUEST-SHADOW_OF_THE_STORM");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__PIRATE_PETE
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__PIRATE_PETE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-31");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TAI_BWO_WANNAI_TRIO
        questObjective = new QuestObjective(Quest.TAI_BWO_WANNAI_TRIO);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-15");
        questObjective.addRequirement("SKILL-COOKING-30");
        questObjective.addRequirement("SKILL-FISHING-5");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CONTACT
        questObjective = new QuestObjective(Quest.CONTACT);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-AGILITY-50");
        questObjective.addRequirement("SKILL-THIEVING-50");
        questObjective.addRequirement("CMB-70");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEMPLE_OF_IKOV
        questObjective = new QuestObjective(Quest.TEMPLE_OF_IKOV);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-42");
        questObjective.addRequirement("SKILL-RANGED-40");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_EYES_OF_GLOUPHRIE
        questObjective = new QuestObjective(Quest.THE_EYES_OF_GLOUPHRIE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_GRAND_TREE");
        questObjective.addRequirement("SKILL-CONSTRUCTION-5");
        questObjective.addRequirement("SKILL-MAGIC-46");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TEMPLE_OF_THE_EYE
        questObjective = new QuestObjective(Quest.TEMPLE_OF_THE_EYE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ENTER_THE_ABYSS");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ONE_SMALL_FAVOUR
        questObjective = new QuestObjective(Quest.ONE_SMALL_FAVOUR);
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
        questObjective = new QuestObjective(Quest.THE_ASCENT_OF_ARCEUUS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-HUNTER-12");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TALE_OF_THE_RIGHTEOUS CLIENT_OF_KOUREND
        questObjective = new QuestObjective(Quest.TALE_OF_THE_RIGHTEOUS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        questObjective.addRequirement("SKILL-STRENGTH-16");
        questObjective.addRequirement("SKILL-MINING-10");
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BETWEEN_A_ROCK
        questObjective = new QuestObjective(Quest.BETWEEN_A_ROCK);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DWARF_CANNON");
        questObjective.addRequirement("QUEST-FISHING_CONTEST");
        questObjective.addRequirement("SKILL-DEFENCE-30");
        questObjective.addRequirement("SKILL-MINING-40");
        questObjective.addRequirement("SKILL-SMITHING-50");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FORSAKEN_TOWER
        questObjective = new QuestObjective(Quest.THE_FORSAKEN_TOWER);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CLIENT_OF_KOUREND");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_SLUG_MENACE
        questObjective = new QuestObjective(Quest.THE_SLUG_MENACE);
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
        questObjective = new QuestObjective(Quest.GETTING_AHEAD);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("SKILL-CONSTRUCTION-26");
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for COLD_WAR
        questObjective = new QuestObjective(Quest.COLD_WAR);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-HUNTER-10");
        questObjective.addRequirement("SKILL-AGILITY-30");
        questObjective.addRequirement("SKILL-CRAFTING-30");
        questObjective.addRequirement("SKILL-CONSTRUCTION-34");
        questObjective.addRequirement("SKILL-THIEVING-15");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_HAND_IN_THE_SAND
        questObjective = new QuestObjective(Quest.THE_HAND_IN_THE_SAND);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-17");
        questObjective.addRequirement("SKILL-CRAFTING-49");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ENAKHRAS_LAMENT
        questObjective = new QuestObjective(Quest.ENAKHRAS_LAMENT);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-25");
        questObjective.addRequirement("SKILL-CRAFTING-50");
        questObjective.addRequirement("SKILL-FIREMAKING-45");
        questObjective.addRequirement("SKILL-PRAYER-43");
        questObjective.addRequirement("SKILL-MAGIC-39");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for EADGARS_RUSE
        questObjective = new QuestObjective(Quest.EADGARS_RUSE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-DRUIDIC_RITUAL");
        questObjective.addRequirement("QUEST-TROLL_STRONGHOLD");
        questObjective.addRequirement("SKILL-AGILITY-31");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MY_ARMS_BIG_ADVENTURE
        questObjective = new QuestObjective(Quest.MY_ARMS_BIG_ADVENTURE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-EADGARS_RUSE");
        questObjective.addRequirement("QUEST-THE_FEUD");
        questObjective.addRequirement("QUEST-JUNGLE_POTION");
        questObjective.addRequirement("SKILL-FARMING-29");
        questObjective.addRequirement("SKILL-WOODCUTTING-10");
        questObjective.addRequirement("CMB-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GARDEN_OF_DEATH
        questObjective = new QuestObjective(Quest.THE_GARDEN_OF_DEATH);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        questObjective.addRequirement("SKILL-FARMING-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RAG_AND_BONE_MAN_II
        questObjective = new QuestObjective(Quest.RAG_AND_BONE_MAN_II);
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
        questObjective = new QuestObjective(Quest.RUM_DEAL);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ZOGRE_FLESH_EATERS");
        questObjective.addRequirement("SKILL-CRAFTING-42");
        questObjective.addRequirement("SKILL-FISHING-50");
        questObjective.addRequirement("SKILL-FARMING-40");
        questObjective.addRequirement("SKILL-PRAYER-47");
        questObjective.addRequirement("SKILL-SLAYER-42");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CABIN_FEVER
        questObjective = new QuestObjective(Quest.CABIN_FEVER);
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
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__LUMBRIDGE_GUIDE);
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
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__SKRACH_UGLOGWEE);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-41");
        questObjective.addRequirement("SKILL-FIREMAKING-20");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HEROES_QUEST
        questObjective = new QuestObjective(Quest.HEROES_QUEST);
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
        questObjective = new QuestObjective(Quest.THRONE_OF_MISCELLANIA);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-HEROES_QUEST");
        questObjective.addRequirement("QUEST-THE_FREMENNIK_TRIALS");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROYAL_TROUBLE
        questObjective = new QuestObjective(Quest.ROYAL_TROUBLE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THRONE_OF_MISCELLANIA");
        questObjective.addRequirement("SKILL-AGILITY-40");
        questObjective.addRequirement("SKILL-SLAYER-40");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HAUNTED_MINE
        questObjective = new QuestObjective(Quest.HAUNTED_MINE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("SKILL-CRAFTING-35");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LAIR_OF_TARN_RAZORLOR
        questObjective = new QuestObjective(Quest.LAIR_OF_TARN_RAZORLOR);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-50");
        questObjective.addRequirement("SKILL-SLAYER-40");
        questObjective.addRequirement("QUEST-HAUNTED_MINE");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKEY_MADNESS_I
        questObjective = new QuestObjective(Quest.MONKEY_MADNESS_I);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("QUEST-THE_GRAND_TREE");
        questObjective.addRequirement("QUEST-TREE_GNOME_VILLAGE");
        questObjective.addBasePriorityLevel(20);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ROVING_ELVES
        questObjective = new QuestObjective(Quest.ROVING_ELVES);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-REGICIDE");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOURNINGS_END_PART_I
        questObjective = new QuestObjective(Quest.MOURNINGS_END_PART_I);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-60");
        questObjective.addRequirement("SKILL-RANGED-60");
        questObjective.addRequirement("SKILL-THIEVING-50");
        questObjective.addRequirement("QUEST-ROVING_ELVES");
        questObjective.addRequirement("QUEST-BIG_CHOMPY_BIRD_HUNTING");
        questObjective.addRequirement("QUEST-SHEEP_HERDER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MOURNINGS_END_PART_II
        questObjective = new QuestObjective(Quest.MOURNINGS_END_PART_II);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MOURNINGS_END_PART_I");
        questObjective.addRequirement("CMB-65");
        questObjective.addRequirement("SKILL-AGILITY-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DESERT_TREASURE_I
        questObjective = new QuestObjective(Quest.DESERT_TREASURE_I);
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
        questObjective = new QuestObjective(Quest.FAMILY_CREST);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-55");
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WHAT_LIES_BELOW
        questObjective = new QuestObjective(Quest.WHAT_LIES_BELOW);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-RUNECRAFT-35");
        questObjective.addRequirement("QUEST-RUNE_MYSTERIES");
        questObjective.addRequirement("CMB-30");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for EAGLES_PEAK
        questObjective = new QuestObjective(Quest.EAGLES_PEAK);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-HUNTER-27");
        questObjective.addRequirement("CMB-10");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_TAIL_OF_TWO_CATS
        questObjective = new QuestObjective(Quest.A_TAIL_OF_TWO_CATS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-ICTHLARINS_LITTLE_HELPER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for LEGENDS_QUEST
        questObjective = new QuestObjective(Quest.LEGENDS_QUEST);
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
        questObjective = new QuestObjective(Quest.LAND_OF_THE_GOBLINS);
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
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__SIR_AMIK_VARZE);
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
        questObjective = new QuestObjective(Quest.OLAFS_QUEST);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-FIREMAKING-40");
        questObjective.addRequirement("SKILL-WOODCUTTING-50");
        questObjective.addRequirement("QUEST-THE_FREMENNIK_TRIALS");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_KINGDOM_DIVIDED
        questObjective = new QuestObjective(Quest.A_KINGDOM_DIVIDED);
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
        questObjective = new QuestObjective(Quest.A_TASTE_OF_HOPE);
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
        questObjective = new QuestObjective(Quest.CURSE_OF_THE_EMPTY_LORD);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-THIEVING-53");
        questObjective.addRequirement("CMB-50");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GENERALS_SHADOW
        questObjective = new QuestObjective(Quest.THE_GENERALS_SHADOW);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CURSE_OF_THE_EMPTY_LORD");
        questObjective.addRequirement("QUEST-FIGHT_ARENA");
        questObjective.addRequirement("QUEST-DESERT_TREASURE_I");
        questObjective.addRequirement("CMB-60");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HIS_FAITHFUL_SERVANTS
        questObjective = new QuestObjective(Quest.HIS_FAITHFUL_SERVANTS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-PRIEST_IN_PERIL");
        questObjective.addRequirement("CMB-70");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_GREAT_BRAIN_ROBBERY
        questObjective = new QuestObjective(Quest.THE_GREAT_BRAIN_ROBBERY);
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
        questObjective = new QuestObjective(Quest.FAIRYTALE_II__CURE_A_QUEEN);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-FAIRYTALE_I__GROWING_PAINS");
        questObjective.addRequirement("SKILL-THIEVING-40");
        questObjective.addRequirement("SKILL-FARMING-49");
        questObjective.addRequirement("SKILL-HERBLORE-57");
        questObjective.addRequirement("CMB-55");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__KING_AWOWOGEI
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__KING_AWOWOGEI);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST");
        questObjective.addRequirement("SKILL-COOKING-70");
        questObjective.addRequirement("SKILL-AGILITY-48");
        questObjective.addRequirement("QUEST-MONKEY_MADNESS_I");
        questObjective.addRequirement("CMB-65");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for RECIPE_FOR_DISASTER__CULINAROMANCER
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER__CULINAROMANCER);
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
        questObjective = new QuestObjective(Quest.RECIPE_FOR_DISASTER);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(400);
        questObjective.addRequirement("QUEST-RECIPE_FOR_DISASTER__CULINAROMANCER");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_PATH_OF_GLOUPHRIE
        questObjective = new QuestObjective(Quest.THE_PATH_OF_GLOUPHRIE);
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
        questObjective = new QuestObjective(Quest.LUNAR_DIPLOMACY);
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
        questObjective = new QuestObjective(Quest.KINGS_RANSOM);
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
        questObjective = new QuestObjective(Quest.SWAN_SONG);
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
        questObjective = new QuestObjective(Quest.BELOW_ICE_MOUNTAIN);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QP-16");
        QuestObjectivesList.add(questObjective);

        //TODO: INSERT DEFENDER OF VARROCK

        // Create a QuestModel object for DEVIOUS_MINDS
        questObjective = new QuestObjective(Quest.DEVIOUS_MINDS);
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
        questObjective = new QuestObjective(Quest.GRIM_TALES);
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
        questObjective = new QuestObjective(Quest.DREAM_MENTOR);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-LUNAR_DIPLOMACY");
        questObjective.addRequirement("QUEST-EADGARS_RUSE");
        questObjective.addRequirement("CMB-85");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FREMENNIK_EXILES
        questObjective = new QuestObjective(Quest.THE_FREMENNIK_EXILES);
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
        questObjective = new QuestObjective(Quest.SINS_OF_THE_FATHER);
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
        questObjective = new QuestObjective(Quest.IN_SEARCH_OF_KNOWLEDGE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-45");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BENEATH_CURSED_SANDS
        questObjective = new QuestObjective(Quest.BENEATH_CURSED_SANDS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-CONTACT");
        questObjective.addRequirement("SKILL-AGILITY-62");
        questObjective.addRequirement("SKILL-CRAFTING-55");
        questObjective.addRequirement("SKILL-FIREMAKING-55");
        questObjective.addRequirement("CMB-85");
        questObjective.addBasePriorityLevel(30);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MONKEY_MADNESS_II
        questObjective = new QuestObjective(Quest.MONKEY_MADNESS_II);
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
        questObjective = new QuestObjective(Quest.INTO_THE_TOMBS);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-95");
        questObjective.addRequirement("QUEST-BENEATH_CURSED_SANDS");
        questObjective.addBasePriorityLevel(10);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for A_NIGHT_AT_THE_THEATRE
        questObjective = new QuestObjective(Quest.A_NIGHT_AT_THE_THEATRE);
                questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-A_TASTE_OF_HOPE");
        questObjective.addRequirement("CMB-95");
        questObjective.addRequirement("SKILL-PRAYER-43");
//      questObjective.addRequirement("VALUE-50m");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for DRAGON_SLAYER_II
        questObjective = new QuestObjective(Quest.DRAGON_SLAYER_II);
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
        questObjective = new QuestObjective(Quest.MAKING_FRIENDS_WITH_MY_ARM);
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
        questObjective = new QuestObjective(Quest.DESERT_TREASURE_II__THE_FALLEN_EMPIRE);
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
        questObjective = new QuestObjective(Quest.SONG_OF_THE_ELVES);
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
        questObjective = new QuestObjective(Quest.CLOCK_TOWER);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-15");
        QuestObjectivesList.add(questObjective);



        // Create a QuestModel object for THE_CORSAIR_CURSE
        questObjective = new QuestObjective(Quest.THE_CORSAIR_CURSE);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("CMB-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for CHILDREN_OF_THE_SUN
        questObjective = new QuestObjective(Quest.CHILDREN_OF_THE_SUN);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(150);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for BEAR_YOUR_SOUL
        questObjective = new QuestObjective(Quest.BEAR_YOUR_SOUL);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addBasePriorityLevel(80);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_ENCHANTED_KEY
        questObjective = new QuestObjective(Quest.THE_ENCHANTED_KEY);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-MAKING_HISTORY");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAGE_ARENA_I
        questObjective = new QuestObjective(Quest.MAGE_ARENA_I);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        questObjective.addRequirement("SKILL-MAGIC-60");
        questObjective.addRequirement("CMB-55");
        questObjective.addBasePriorityLevel(180);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for FAMILY_PEST
        questObjective = new QuestObjective(Quest.FAMILY_PEST);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-FAMILY_CREST");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for MAGE_ARENA_II
        questObjective = new QuestObjective(Quest.MAGE_ARENA_II);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("SKILL-MAGIC-75");
        questObjective.addRequirement("CMB-80");
        questObjective.addBasePriorityLevel(180);
        questObjective.addTag(ObjectiveTags.WILDERNESS);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for HOPESPEARS_WILL
        questObjective = new QuestObjective(Quest.HOPESPEARS_WILL);
        questObjective.setSelfContainedPriorityLevel(totalOptimalQuestSteps--);
        questObjective.addRequirement("QUEST-THE_RESTLESS_GHOST");
        questObjective.addRequirement("QUEST-DESERT_TREASURE_I");
        questObjective.addRequirement("QUEST-FAIRYTALE_II__CURE_A_QUEEN");
        questObjective.addRequirement("QUEST-LAND_OF_THE_GOBLINS");
        questObjective.addRequirement("SKILL-PRAYER-50");
        questObjective.addRequirement("CMB-90");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for THE_FROZEN_DOOR
        questObjective = new QuestObjective(Quest.THE_FROZEN_DOOR);
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
