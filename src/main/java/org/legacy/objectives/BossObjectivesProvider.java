package org.legacy.objectives;

import org.legacy.core.ObjectivesPlugin;
import org.legacy.objectives.models.BossObjective;
import org.legacy.objectives.models.Objective;
import org.legacy.utils.Boss;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class BossObjectivesProvider extends ObjectivesProvider {
    public ArrayList<Objective> bossObjectivesList;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public void initialize(){
        bossObjectivesList = new ArrayList<>();
    }
    public void generateObjectives() {
        addKCBossObjectives();
    }
    public void addKCBossObjectives(){
        int[] kc = {1,5,25,50,100,150};
        for(Boss boss : Boss.values()) {
            int kc_index =4;
            ArrayList<ObjectiveTags> tags= new ArrayList<>();
            ArrayList<String> reqs= new ArrayList<>();
            int priority=1;
            boolean cont= false;
            switch (boss) {
                case CALLISTO:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-95");
                    reqs.add("WEALTH-10M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case ARTIO:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    tags.add(ObjectiveTags.PROFITABLE);
                    reqs.add("CMB-85");
                    reqs.add("WEALTH-10M");
                    break;
                case CALVARION:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-85");
                    reqs.add("WEALTH-10M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case CHAOS_ELEMENTAL:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-75");
                    reqs.add("WEALTH-10M");
                    break;
                case CHAOS_FANATIC:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-65");
                    reqs.add("WEALTH-5M");
                    reqs.add("SKILL-RANGED-75");
                    break;
                case CRAZY_ARCHAEOLOGIST:
                    tags.add(ObjectiveTags.WILDERNESS);
                    reqs.add("SKILL-MAGIC-50");
                    reqs.add("CMB-65");
                    reqs.add("WEALTH-5M");
                    kc_index=1;
                    break;
                case KING_BLACK_DRAGON:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-75");
                    reqs.add("WEALTH-10M");
                    break;
                case SCORPIA:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("SKILL-MAGIC-78");
                    reqs.add("WEALTH-10M");
                    break;
                case SPINDEL:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-85");
                    reqs.add("WEALTH-10M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case VETION:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-95");
                    reqs.add("WEALTH-10M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case VENENATIS:
                    tags.add(ObjectiveTags.WILDERNESS);
                    kc_index=1;
                    reqs.add("CMB-95");
                    reqs.add("WEALTH-10M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case TZKAL_ZUK:
                    kc_index=2;
                    reqs.add("CMB-120");
                    //reqs.add("WEALTH-2B");
                    priority = 5000;
                    reqs.add("WEALTH-1.5B");
                    break;
                case TZTOK_JAD:
                    kc_index=2;
                    reqs.add("SKILL-RANGED-75");
                    priority = 100;
                    reqs.add("WEALTH-10M");
                    break;
                case OBOR:
                    reqs.add("CMB-55");
                    kc_index=2;
                    reqs.add("WEALTH-1M");
                    break;
                case BRYOPHYTA:
                    reqs.add("CMB-55");
                    reqs.add("WEALTH-1M");
                    kc_index=2;
                    break;
                case BARROWS:
                    reqs.add("SKILL-MAGIC-50");
                    reqs.add("CMB-65");
                    reqs.add("WEALTH-5M");
                    break;
                case DERANGED_ARCHAEOLOGIST:
                    reqs.add("SKILL-MAGIC-50");
                    reqs.add("CMB-65");
                    reqs.add("WEALTH-5M");
                    break;
                case SCURRIUS:
                    reqs.add("CMB-65");
                    priority = 800;
                    reqs.add("WEALTH-5M");
                    break;
                case SARACHNIS:
                    reqs.add("CMB-75");
                    reqs.add("WEALTH-5M");
                    break;
                case GIANT_MOLE:
                    reqs.add("CMB-85");
                    reqs.add("WEALTH-10M");
                    break;
                case DAGANNOTH_SUPREME:
                case DAGANNOTH_REX:
                case DAGANNOTH_PRIME:
                    reqs.add("CMB-85");
                    reqs.add("QUEST-THE_FREMENNIK_TRIALS");
                    reqs.add("WEALTH-10M");
                    break;
                case ZULRAH:
                    reqs.add("SKILL-RANGED-75");
                    reqs.add("SKILL-MAGIC-78");
                    reqs.add("CMB-90");
                    reqs.add("WEALTH-15M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    priority = 201;
                    break;
                case KALPHITE_QUEEN:
                    reqs.add("CMB-95");
                    priority = 200;
                    reqs.add("WEALTH-20M");
                    break;
                case ARMADYL:
                    reqs.add("SKILL-RANGED-85");
                    reqs.add("CMB-105");
                    tags.add(ObjectiveTags.PROFITABLE);
                    reqs.add("QUEST-TROLL_STRONGHOLD");
                    reqs.add("WEALTH-50M");
                    break;
                case COMMANDER_ZILYANA:
                    reqs.add("SKILL-AGILITY-70");
                    reqs.add("SKILL-RANGED-85");
                    reqs.add("CMB-105");
                    reqs.add("WEALTH-50M");
                    reqs.add("QUEST-TROLL_STRONGHOLD");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case GENERAL_GRAARDOR:
                    reqs.add("SKILL-STRENGTH-70");
                    reqs.add("CMB-110");
                    tags.add(ObjectiveTags.PROFITABLE);
                    reqs.add("QUEST-TROLL_STRONGHOLD");
                    reqs.add("WEALTH-50M");
                    break;
                case ZAMORAK:
                    reqs.add("SKILL-HITPOINTS-70");
                    reqs.add("CMB-110");
                    reqs.add("QUEST-TROLL_STRONGHOLD");
                    reqs.add("WEALTH-50M");
                    break;
                case CORPOREAL_BEAST:
                    reqs.add("CMB-105");
                    reqs.add("WEALTH-100M");
                    break;
                case NEX:
                    reqs.add("CMB-110");
                    reqs.add("SKILL-RANGED-90");
                    reqs.add("BOSS_KC-ZAMORAK-1");
                    reqs.add("BOSS_KC-GENERAL_GRAARDOR-1");
                    reqs.add("BOSS_KC-COMMANDER_ZILYANA-1");
                    reqs.add("BOSS_KC-ARMADYL-1");
                    reqs.add("WEALTH-400M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    priority = 500;
                    break;
                case VORKATH:
                    reqs.add("CMB-100");
                    tags.add(ObjectiveTags.PROFITABLE);
                    reqs.add("QUEST-DRAGON_SLAYER_II");
                    reqs.add("QUEST-HAUNTED_MINE");
                    reqs.add("WEALTH-50M");
                    //reqs.add("ITEM-SALVE_AMULET");
                    priority = 500;
                    break;
                case PHANTOM_MUSPAH:
                    reqs.add("QUEST-SECRETS_OF_THE_NORTH");
                    reqs.add("WEALTH-30M");
                    break;
                case THE_MIMIC:
                    kc_index=1;
                    //reqs.add("ITEM-MIMIC");
                    reqs.add("CMB-100");
                    reqs.add("WEALTH-20M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case THE_NIGHTMARE:
                    reqs.add("CMB-100");
                    reqs.add("WEALTH-200M");
                    break;
                case PHOSANIS_NIGHTMARE:
                    reqs.add("CMB-100");
                    reqs.add("WEALTH-400M");
                    break;
                case DUKE_SUCELLUS:
                case THE_LEVIATHAN:
                case THE_WHISPERER:
                case VARDORVIS:
                    reqs.add("CMB-110");
                    reqs.add("QUEST-DESERT_TREASURE_II__THE_FALLEN_EMPIRE");
                    reqs.add("WEALTH-400M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case HESPORI:
                    kc_index=2;
                    reqs.add("WEALTH-10M");
                    break;
                case SKOTIZO:
                    reqs.add("CMB-90");
                    reqs.add("WEALTH-10M");
                    //reqs.add("ITEM-DARK_TOTEM");
                    break;
                case GROTESQUE_GUARDIANS:
                    reqs.add("SKILL-SLAYER-75");
                    break;
                case ABYSSAL_SIRE:
                    reqs.add("SKILL-SLAYER-85");
                    break;
                case KRAKEN:
                    reqs.add("SKILL-SLAYER-87");
                    break;
                case CERBERUS:
                    reqs.add("SKILL-SLAYER-91");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case THERMONUCLEAR_SMOKE_DEVIL:
                    reqs.add("SKILL-SLAYER-93");
                    break;
                case ALCHEMICAL_HYDRA:
                    reqs.add("SKILL-SLAYER-95");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case GAUNTLET:
                    reqs.add("QUEST-SONG_OF_THE_ELVES");
                    break;
                case CORRUPTED_GAUNTLET:
                    reqs.add("QUEST-SONG_OF_THE_ELVES");
                    reqs.add("CMB-110");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case TEMPOROSS:
                    reqs.add("SKILL-FISHING-35");
                    break;
                case WINTERTODT:
                    reqs.add("SKILL-FIREMAKING-50");
                    break;
                case CHAMBERS_OF_XERIC:
                    reqs.add("CMB-100");
                    reqs.add("WEALTH-200M");
                    kc_index=6;
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case CHAMBERS_OF_XERIC_CM:
                    reqs.add("CMB-110");
                    kc_index=6;
                    reqs.add("WEALTH-400M");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case THEATRE_OF_BLOOD:
                    reqs.add("CMB-100");
                    reqs.add("WEALTH-100M");
                    reqs.add("QUEST-A_NIGHT_AT_THE_THEATRE");
                    kc_index=6;
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case THEATRE_OF_BLOOD_ENTRY:
                    reqs.add("QUEST-A_NIGHT_AT_THE_THEATRE");
                    reqs.add("WEALTH-50M");
                    kc_index=1;
                    break;
                case THEATRE_OF_BLOOD_HM:
                    reqs.add("CMB-115");
                    reqs.add("WEALTH-400M");
                    reqs.add("QUEST-A_NIGHT_AT_THE_THEATRE");
                    kc_index=6;
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case TOMBS_OF_AMASCUT:
                    reqs.add("CMB-95");
                    reqs.add("WEALTH-100M");
                    reqs.add("QUEST-INTO_THE_TOMBS");
                    tags.add(ObjectiveTags.PROFITABLE);
                    break;
                case TOMBS_OF_AMASCUT_ENTRY:
                    reqs.add("QUEST-INTO_THE_TOMBS");
                    reqs.add("WEALTH-50M");
                    kc_index=1;
                    break;
                case TOMBS_OF_AMASCUT_EXPERT:
                    reqs.add("CMB-105");
                    reqs.add("WEALTH-200M");
                    reqs.add("QUEST-INTO_THE_TOMBS");
                    tags.add(ObjectiveTags.PROFITABLE);
                    kc_index=6;
                    break;
                default:
                    cont =true;
            }
            //TODO ON UPDATE:IF NEW BOSS Needs to added above needs to be added here
            if(cont){
                continue;
            }
            BossObjective prevObjective = null;
           for(int j=0; j<kc_index;j++){
               BossObjective objective = new BossObjective(boss,kc[j]);
               if(j==0) {
                   objective.addTags(tags);
                   objective.addRequirements(reqs);
               }
               objective.setBasePriorityLevel(priority*(j+1));
               if (prevObjective!=null){
                   objective.addRequirement(prevObjective.getID());
               }
               prevObjective=objective;
               bossObjectivesList.add(objective);
           }
        }
    }


}
