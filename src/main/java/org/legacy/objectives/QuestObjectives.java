package org.legacy.objectives;

import net.runelite.api.Client;
import net.runelite.api.Quest;
import org.legacy.models.QuestModel;
import org.legacy.objectives.models.QuestObjective;
import org.legacy.objectives.models.Objective;
import org.legacy.objectives.models.QuestPointObjective;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class QuestObjectives {
    @Inject
    private Client client;
    public ArrayList<Objective> QuestObjectivesList;
    public ArrayList<QuestPointObjective> QuestPointObjectivesList;

    public QuestObjectives(){
        generateQuestPointObjectives();
        generateQuestObjectives();
    }
    public void generateQuestPointObjectives(){
        QuestPointObjectivesList = new  ArrayList<QuestPointObjective>();
        for(int i=1; i<=301;i++){
            QuestPointObjectivesList.add(new QuestPointObjective(i));
        }

    }
    public void generateQuestObjectives(){
        QuestObjectivesList = new  ArrayList<Objective>();
// Create a QuestModel object for BELOW_ICE_MOUNTAIN
        QuestModel temp = new QuestModel(Quest.BELOW_ICE_MOUNTAIN, client);
        QuestObjective questObjective = new  QuestObjective(temp);
        questObjective.addRequirememnt("QP-16");
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for BLACK_KNIGHTS_FORTRESS
        temp = new QuestModel(Quest.BLACK_KNIGHTS_FORTRESS, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addRequirememnt("QP-12");
        QuestObjectivesList.add(questObjective);
// Create a QuestModel object for COOKS_ASSISTANT
        temp = new QuestModel(Quest.COOKS_ASSISTANT, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_CORSAIR_CURSE
        temp = new QuestModel(Quest.THE_CORSAIR_CURSE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addRequirememnt("CMB_Lvl-20");
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DEMON_SLAYER
        temp = new QuestModel(Quest.DEMON_SLAYER, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addRequirememnt("CMB_Lvl-15");
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DORICS_QUEST
        temp = new QuestModel(Quest.DORICS_QUEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DRAGON_SLAYER_I
        temp = new QuestModel(Quest.DRAGON_SLAYER_I, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addRequirememnt("QP-32");
        questObjective.addRequirememnt("CMB_Lvl-45");
        questObjective.setPriorityLevel(400);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ERNEST_THE_CHICKEN
        temp = new QuestModel(Quest.ERNEST_THE_CHICKEN, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for GOBLIN_DIPLOMACY
        temp = new QuestModel(Quest.GOBLIN_DIPLOMACY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for IMP_CATCHER
        temp = new QuestModel(Quest.IMP_CATCHER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_KNIGHTS_SWORD
        temp = new QuestModel(Quest.THE_KNIGHTS_SWORD, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addRequirememnt("SKILL_MINING_10");
        questObjective.addRequirememnt("CMB_Lvl-20");
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MISTHALIN_MYSTERY
        temp = new QuestModel(Quest.MISTHALIN_MYSTERY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for PIRATES_TREASURE
        temp = new QuestModel(Quest.PIRATES_TREASURE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for PRINCE_ALI_RESCUE
        temp = new QuestModel(Quest.PRINCE_ALI_RESCUE, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setPriorityLevel(200);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_RESTLESS_GHOST
        temp = new QuestModel(Quest.THE_RESTLESS_GHOST, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setPriorityLevel(200);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ROMEO__JULIET
        temp = new QuestModel(Quest.ROMEO__JULIET, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setPriorityLevel(200);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RUNE_MYSTERIES
        temp = new QuestModel(Quest.RUNE_MYSTERIES, client);
        questObjective = new  QuestObjective(temp);
        questObjective.setPriorityLevel(800);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SHEEP_SHEARER
        temp = new QuestModel(Quest.SHEEP_SHEARER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SHIELD_OF_ARRAV
        temp = new QuestModel(Quest.SHIELD_OF_ARRAV, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for VAMPYRE_SLAYER
        temp = new QuestModel(Quest.VAMPYRE_SLAYER, client);
        questObjective = new  QuestObjective(temp);
        questObjective.addRequirememnt("CMB_Lvl-20");
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for WITCHS_POTION
        temp = new QuestModel(Quest.WITCHS_POTION, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for X_MARKS_THE_SPOT
        temp = new QuestModel(Quest.X_MARKS_THE_SPOT, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);
//---------------------------STOPPED HERE----------------------//
// Create a QuestModel object for A_KINGDOM_DIVIDED
        temp = new QuestModel(Quest.A_KINGDOM_DIVIDED, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for A_NIGHT_AT_THE_THEATRE
        temp = new QuestModel(Quest.A_NIGHT_AT_THE_THEATRE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ANIMAL_MAGNETISM
        temp = new QuestModel(Quest.ANIMAL_MAGNETISM, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ANOTHER_SLICE_OF_HAM
        temp = new QuestModel(Quest.ANOTHER_SLICE_OF_HAM, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_ASCENT_OF_ARCEUUS
        temp = new QuestModel(Quest.THE_ASCENT_OF_ARCEUUS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for BENEATH_CURSED_SANDS
        temp = new QuestModel(Quest.BENEATH_CURSED_SANDS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for BETWEEN_A_ROCK
        temp = new QuestModel(Quest.BETWEEN_A_ROCK, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for BIG_CHOMPY_BIRD_HUNTING
        temp = new QuestModel(Quest.BIG_CHOMPY_BIRD_HUNTING, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for BIOHAZARD
        temp = new QuestModel(Quest.BIOHAZARD, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for BONE_VOYAGE
        temp = new QuestModel(Quest.BONE_VOYAGE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for CABIN_FEVER
        temp = new QuestModel(Quest.CABIN_FEVER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for CLIENT_OF_KOUREND
        temp = new QuestModel(Quest.CLIENT_OF_KOUREND, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for CLOCK_TOWER
        temp = new QuestModel(Quest.CLOCK_TOWER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for COLD_WAR
        temp = new QuestModel(Quest.COLD_WAR, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for CONTACT
        temp = new QuestModel(Quest.CONTACT, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for CREATURE_OF_FENKENSTRAIN
        temp = new QuestModel(Quest.CREATURE_OF_FENKENSTRAIN, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DARKNESS_OF_HALLOWVALE
        temp = new QuestModel(Quest.DARKNESS_OF_HALLOWVALE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DEATH_PLATEAU
        temp = new QuestModel(Quest.DEATH_PLATEAU, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DEATH_TO_THE_DORGESHUUN
        temp = new QuestModel(Quest.DEATH_TO_THE_DORGESHUUN, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_DEPTHS_OF_DESPAIR
        temp = new QuestModel(Quest.THE_DEPTHS_OF_DESPAIR, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DESERT_TREASURE_I
        temp = new QuestModel(Quest.DESERT_TREASURE_I, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DESERT_TREASURE_II__THE_FALLEN_EMPIRE
        temp = new QuestModel(Quest.DESERT_TREASURE_II__THE_FALLEN_EMPIRE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DEVIOUS_MINDS
        temp = new QuestModel(Quest.DEVIOUS_MINDS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_DIG_SITE
        temp = new QuestModel(Quest.THE_DIG_SITE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DRAGON_SLAYER_II
        temp = new QuestModel(Quest.DRAGON_SLAYER_II, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DREAM_MENTOR
        temp = new QuestModel(Quest.DREAM_MENTOR, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DRUIDIC_RITUAL
        temp = new QuestModel(Quest.DRUIDIC_RITUAL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DWARF_CANNON
        temp = new QuestModel(Quest.DWARF_CANNON, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for EADGARS_RUSE
        temp = new QuestModel(Quest.EADGARS_RUSE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for EAGLES_PEAK
        temp = new QuestModel(Quest.EAGLES_PEAK, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for ELEMENTAL_WORKSHOP_I
        temp = new QuestModel(Quest.ELEMENTAL_WORKSHOP_I, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ELEMENTAL_WORKSHOP_II
        temp = new QuestModel(Quest.ELEMENTAL_WORKSHOP_II, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ENAKHRAS_LAMENT
        temp = new QuestModel(Quest.ENAKHRAS_LAMENT, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ENLIGHTENED_JOURNEY
        temp = new QuestModel(Quest.ENLIGHTENED_JOURNEY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_EYES_OF_GLOUPHRIE
        temp = new QuestModel(Quest.THE_EYES_OF_GLOUPHRIE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for FAIRYTALE_I__GROWING_PAINS
        temp = new QuestModel(Quest.FAIRYTALE_I__GROWING_PAINS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for FAIRYTALE_II__CURE_A_QUEEN
        temp = new QuestModel(Quest.FAIRYTALE_II__CURE_A_QUEEN, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for FAMILY_CREST
        temp = new QuestModel(Quest.FAMILY_CREST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_FEUD
        temp = new QuestModel(Quest.THE_FEUD, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for FIGHT_ARENA
        temp = new QuestModel(Quest.FIGHT_ARENA, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for FISHING_CONTEST
        temp = new QuestModel(Quest.FISHING_CONTEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for FORGETTABLE_TALE
        temp = new QuestModel(Quest.FORGETTABLE_TALE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_FORSAKEN_TOWER
        temp = new QuestModel(Quest.THE_FORSAKEN_TOWER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_FREMENNIK_ISLES
        temp = new QuestModel(Quest.THE_FREMENNIK_ISLES, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_FREMENNIK_TRIALS
        temp = new QuestModel(Quest.THE_FREMENNIK_TRIALS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for GARDEN_OF_TRANQUILLITY
        temp = new QuestModel(Quest.GARDEN_OF_TRANQUILLITY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for GERTRUDES_CAT
        temp = new QuestModel(Quest.GERTRUDES_CAT, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for GETTING_AHEAD
        temp = new QuestModel(Quest.GETTING_AHEAD, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for GHOSTS_AHOY
        temp = new QuestModel(Quest.GHOSTS_AHOY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_GIANT_DWARF
        temp = new QuestModel(Quest.THE_GIANT_DWARF, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_GOLEM
        temp = new QuestModel(Quest.THE_GOLEM, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_GRAND_TREE
        temp = new QuestModel(Quest.THE_GRAND_TREE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_GREAT_BRAIN_ROBBERY
        temp = new QuestModel(Quest.THE_GREAT_BRAIN_ROBBERY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for GRIM_TALES
        temp = new QuestModel(Quest.GRIM_TALES, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_HAND_IN_THE_SAND
        temp = new QuestModel(Quest.THE_HAND_IN_THE_SAND, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for HAUNTED_MINE
        temp = new QuestModel(Quest.HAUNTED_MINE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for HAZEEL_CULT
        temp = new QuestModel(Quest.HAZEEL_CULT, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for HEROES_QUEST
        temp = new QuestModel(Quest.HEROES_QUEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for HOLY_GRAIL
        temp = new QuestModel(Quest.HOLY_GRAIL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for HORROR_FROM_THE_DEEP
        temp = new QuestModel(Quest.HORROR_FROM_THE_DEEP, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ICTHLARINS_LITTLE_HELPER
        temp = new QuestModel(Quest.ICTHLARINS_LITTLE_HELPER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for IN_AID_OF_THE_MYREQUE
        temp = new QuestModel(Quest.IN_AID_OF_THE_MYREQUE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for IN_SEARCH_OF_THE_MYREQUE
        temp = new QuestModel(Quest.IN_SEARCH_OF_THE_MYREQUE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for JUNGLE_POTION
        temp = new QuestModel(Quest.JUNGLE_POTION, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for KINGS_RANSOM
        temp = new QuestModel(Quest.KINGS_RANSOM, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for LAND_OF_THE_GOBLINS
        temp = new QuestModel(Quest.LAND_OF_THE_GOBLINS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for LEGENDS_QUEST
        temp = new QuestModel(Quest.LEGENDS_QUEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for LOST_CITY
        temp = new QuestModel(Quest.LOST_CITY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_LOST_TRIBE
        temp = new QuestModel(Quest.THE_LOST_TRIBE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for LUNAR_DIPLOMACY
        temp = new QuestModel(Quest.LUNAR_DIPLOMACY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MAKING_FRIENDS_WITH_MY_ARM
        temp = new QuestModel(Quest.MAKING_FRIENDS_WITH_MY_ARM, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MAKING_HISTORY
        temp = new QuestModel(Quest.MAKING_HISTORY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MERLINS_CRYSTAL
        temp = new QuestModel(Quest.MERLINS_CRYSTAL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MONKEY_MADNESS_I
        temp = new QuestModel(Quest.MONKEY_MADNESS_I, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MONKEY_MADNESS_II
        temp = new QuestModel(Quest.MONKEY_MADNESS_II, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MONKS_FRIEND
        temp = new QuestModel(Quest.MONKS_FRIEND, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MOUNTAIN_DAUGHTER
        temp = new QuestModel(Quest.MOUNTAIN_DAUGHTER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MOURNINGS_END_PART_I
        temp = new QuestModel(Quest.MOURNINGS_END_PART_I, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MOURNINGS_END_PART_II
        temp = new QuestModel(Quest.MOURNINGS_END_PART_II, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MURDER_MYSTERY
        temp = new QuestModel(Quest.MURDER_MYSTERY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MY_ARMS_BIG_ADVENTURE
        temp = new QuestModel(Quest.MY_ARMS_BIG_ADVENTURE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for NATURE_SPIRIT
        temp = new QuestModel(Quest.NATURE_SPIRIT, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for OBSERVATORY_QUEST
        temp = new QuestModel(Quest.OBSERVATORY_QUEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for OLAFS_QUEST
        temp = new QuestModel(Quest.OLAFS_QUEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ONE_SMALL_FAVOUR
        temp = new QuestModel(Quest.ONE_SMALL_FAVOUR, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for PLAGUE_CITY
        temp = new QuestModel(Quest.PLAGUE_CITY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for PRIEST_IN_PERIL
        temp = new QuestModel(Quest.PRIEST_IN_PERIL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_QUEEN_OF_THIEVES
        temp = new QuestModel(Quest.THE_QUEEN_OF_THIEVES, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);
// Create a QuestModel object for RAG_AND_BONE_MAN_I
        temp = new QuestModel(Quest.RAG_AND_BONE_MAN_I, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RAG_AND_BONE_MAN_II
        temp = new QuestModel(Quest.RAG_AND_BONE_MAN_II, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RATCATCHERS
        temp = new QuestModel(Quest.RATCATCHERS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__MOUNTAIN_DWARF
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__WARTFACE__BENTNOZE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__PIRATE_PETE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__PIRATE_PETE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__LUMBRIDGE_GUIDE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__LUMBRIDGE_GUIDE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__EVIL_DAVE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__EVIL_DAVE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__KING_AWOWOGEI
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__KING_AWOWOGEI, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__SIR_AMIK_VARZE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__SIR_AMIK_VARZE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__SKRACH_UGLOGWEE
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__SKRACH_UGLOGWEE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECIPE_FOR_DISASTER__CULINAROMANCER
        temp = new QuestModel(Quest.RECIPE_FOR_DISASTER__CULINAROMANCER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RECRUITMENT_DRIVE
        temp = new QuestModel(Quest.RECRUITMENT_DRIVE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for REGICIDE
        temp = new QuestModel(Quest.REGICIDE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ROVING_ELVES
        temp = new QuestModel(Quest.ROVING_ELVES, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ROYAL_TROUBLE
        temp = new QuestModel(Quest.ROYAL_TROUBLE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for RUM_DEAL
        temp = new QuestModel(Quest.RUM_DEAL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SCORPION_CATCHER
        temp = new QuestModel(Quest.SCORPION_CATCHER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SEA_SLUG
        temp = new QuestModel(Quest.SEA_SLUG, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SHADES_OF_MORTTON
        temp = new QuestModel(Quest.SHADES_OF_MORTTON, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SHADOW_OF_THE_STORM
        temp = new QuestModel(Quest.SHADOW_OF_THE_STORM, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SHEEP_HERDER
        temp = new QuestModel(Quest.SHEEP_HERDER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SHILO_VILLAGE
        temp = new QuestModel(Quest.SHILO_VILLAGE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SINS_OF_THE_FATHER
        temp = new QuestModel(Quest.SINS_OF_THE_FATHER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_SLUG_MENACE
        temp = new QuestModel(Quest.THE_SLUG_MENACE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SONG_OF_THE_ELVES
        temp = new QuestModel(Quest.SONG_OF_THE_ELVES, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for A_SOULS_BANE
        temp = new QuestModel(Quest.A_SOULS_BANE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SPIRITS_OF_THE_ELID
        temp = new QuestModel(Quest.SPIRITS_OF_THE_ELID, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SWAN_SONG
        temp = new QuestModel(Quest.SWAN_SONG, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SLEEPING_GIANTS
        temp = new QuestModel(Quest.SLEEPING_GIANTS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TAI_BWO_WANNAI_TRIO
        temp = new QuestModel(Quest.TAI_BWO_WANNAI_TRIO, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for A_TAIL_OF_TWO_CATS
        temp = new QuestModel(Quest.A_TAIL_OF_TWO_CATS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TALE_OF_THE_RIGHTEOUS
        temp = new QuestModel(Quest.TALE_OF_THE_RIGHTEOUS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for A_TASTE_OF_HOPE
        temp = new QuestModel(Quest.A_TASTE_OF_HOPE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TEARS_OF_GUTHIX
        temp = new QuestModel(Quest.TEARS_OF_GUTHIX, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TEMPLE_OF_IKOV
        temp = new QuestModel(Quest.TEMPLE_OF_IKOV, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TEMPLE_OF_THE_EYE
        temp = new QuestModel(Quest.TEMPLE_OF_THE_EYE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THRONE_OF_MISCELLANIA
        temp = new QuestModel(Quest.THRONE_OF_MISCELLANIA, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_TOURIST_TRAP
        temp = new QuestModel(Quest.THE_TOURIST_TRAP, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TOWER_OF_LIFE
        temp = new QuestModel(Quest.TOWER_OF_LIFE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TREE_GNOME_VILLAGE
        temp = new QuestModel(Quest.TREE_GNOME_VILLAGE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

        // Create a QuestModel object for TRIBAL_TOTEM
        temp = new QuestModel(Quest.TRIBAL_TOTEM, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TROLL_ROMANCE
        temp = new QuestModel(Quest.TROLL_ROMANCE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for TROLL_STRONGHOLD
        temp = new QuestModel(Quest.TROLL_STRONGHOLD, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for UNDERGROUND_PASS
        temp = new QuestModel(Quest.UNDERGROUND_PASS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for WANTED
        temp = new QuestModel(Quest.WANTED, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for WATCHTOWER
        temp = new QuestModel(Quest.WATCHTOWER, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for WATERFALL_QUEST
        temp = new QuestModel(Quest.WATERFALL_QUEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for WHAT_LIES_BELOW
        temp = new QuestModel(Quest.WHAT_LIES_BELOW, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for WITCHS_HOUSE
        temp = new QuestModel(Quest.WITCHS_HOUSE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ZOGRE_FLESH_EATERS
        temp = new QuestModel(Quest.ZOGRE_FLESH_EATERS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_FREMENNIK_EXILES
        temp = new QuestModel(Quest.THE_FREMENNIK_EXILES, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for A_PORCINE_OF_INTEREST
        temp = new QuestModel(Quest.A_PORCINE_OF_INTEREST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_GARDEN_OF_DEATH
        temp = new QuestModel(Quest.THE_GARDEN_OF_DEATH, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SECRETS_OF_THE_NORTH
        temp = new QuestModel(Quest.SECRETS_OF_THE_NORTH, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_PATH_OF_GLOUPHRIE
        temp = new QuestModel(Quest.THE_PATH_OF_GLOUPHRIE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for CHILDREN_OF_THE_SUN
        temp = new QuestModel(Quest.CHILDREN_OF_THE_SUN, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ENTER_THE_ABYSS
        temp = new QuestModel(Quest.ENTER_THE_ABYSS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);


// Create a QuestModel object for BEAR_YOUR_SOUL
        temp = new QuestModel(Quest.BEAR_YOUR_SOUL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for ALFRED_GRIMHANDS_BARCRAWL
        temp = new QuestModel(Quest.ALFRED_GRIMHANDS_BARCRAWL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for CURSE_OF_THE_EMPTY_LORD
        temp = new QuestModel(Quest.CURSE_OF_THE_EMPTY_LORD, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_ENCHANTED_KEY
        temp = new QuestModel(Quest.THE_ENCHANTED_KEY, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_GENERALS_SHADOW
        temp = new QuestModel(Quest.THE_GENERALS_SHADOW, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for HIS_FAITHFUL_SERVANTS
        temp = new QuestModel(Quest.HIS_FAITHFUL_SERVANTS, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for SKIPPY_AND_THE_MOGRES
        temp = new QuestModel(Quest.SKIPPY_AND_THE_MOGRES, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MAGE_ARENA_I
        temp = new QuestModel(Quest.MAGE_ARENA_I, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for LAIR_OF_TARN_RAZORLOR
        temp = new QuestModel(Quest.LAIR_OF_TARN_RAZORLOR, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for FAMILY_PEST
        temp = new QuestModel(Quest.FAMILY_PEST, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for MAGE_ARENA_II
        temp = new QuestModel(Quest.MAGE_ARENA_II, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for IN_SEARCH_OF_KNOWLEDGE
        temp = new QuestModel(Quest.IN_SEARCH_OF_KNOWLEDGE, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for DADDYS_HOME
        temp = new QuestModel(Quest.DADDYS_HOME, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for HOPESPEARS_WILL
        temp = new QuestModel(Quest.HOPESPEARS_WILL, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for THE_FROZEN_DOOR
        temp = new QuestModel(Quest.THE_FROZEN_DOOR, client);
        questObjective = new  QuestObjective(temp);
        QuestObjectivesList.add(questObjective);

// Create a QuestModel object for INTO_THE_TOMBS
        temp = new QuestModel(Quest.INTO_THE_TOMBS, client);
        questObjective = new  QuestObjective(temp);
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




}
