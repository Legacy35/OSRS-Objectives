package org.legacy.utils;

import lombok.Getter;
import org.apache.commons.text.WordUtils;

public enum Boss {
    BARROWS("Barrows Chests"),
    SCURRIUS("Scurrius"),
    GIANT_MOLE,
    DERANGED_ARCHAEOLOGIST,
    DAGANNOTH_SUPREME,
    DAGANNOTH_REX,
    DAGANNOTH_PRIME,
    SARACHNIS,
    KALPHITE_QUEEN,
    COMMANDER_ZILYANA,
    ARMADYL("Kree'arra"),
    GENERAL_GRAARDOR,
    ZAMORAK("K'ril Tsutsaroth"),
    CORPOREAL_BEAST("Corporeal Beast"),
    NEX,
    CHAOS_FANATIC,
    CRAZY_ARCHAEOLOGIST,
    SCORPIA,
    KING_BLACK_DRAGON,
    CHAOS_ELEMENTAL,
    VETION("VET'ION"),
    CALVARION("CALVAR'ION"),
    SPINDEL,
    ARTIO,
    CALLISTO,
    ZULRAH,
    VORKATH,
    PHANTOM_MUSPAH,
    THE_NIGHTMARE,
    PHOSANIS_NIGHTMARE("Phosani's Nightmare"),
    DUKE_SUCELLUS,
    THE_LEVIATHAN,
    THE_WHISPERER,
    VARDORVIS,
    OBOR,
    BRYOPHYTA,
    THE_MIMIC("Mimic"),
    HESPORI,
    SKOTIZO,
    GROTESQUE_GUARDIANS,
    ABYSSAL_SIRE("Abyssal Sire"),
    KRAKEN,
    CERBERUS,
    THERMONUCLEAR_SMOKE_DEVIL("Thermonuclear Smoke Devil"),
    ALCHEMICAL_HYDRA("Alchemical Hydra"),
    GAUNTLET,
    CORRUPTED_GAUNTLET,
    TZTOK_JAD("TzTok-Jad"),
    TZKAL_ZUK("TzKal-Zuk"),
    TEMPOROSS,
    WINTERTODT,
    ZALCANO(false),
    CHAMBERS_OF_XERIC,
    CHAMBERS_OF_XERIC_CM("Chambers of Xeric: Challenge Mode"),
    VENENATIS,
    THEATRE_OF_BLOOD,
    THEATRE_OF_BLOOD_ENTRY("Theatre of Blood Entry Mode"),
    THEATRE_OF_BLOOD_HM("Theatre of Blood Hard Mode"),
    TOMBS_OF_AMASCUT,
    TOMBS_OF_AMASCUT_ENTRY("Tombs of Amascut Entry Mode"),
    TOMBS_OF_AMASCUT_EXPERT("Tombs of Amascut Expert Mode");

    String nameOverride ="";
    @Getter
    private boolean  hasKC = true;
    Boss(String s) {
        nameOverride = s;
    }
    Boss(boolean kc) {
        hasKC = kc;
    }
    Boss() { }

    public String getUnformattedName(){
        if(!nameOverride.equals("")){
            return nameOverride;
        }
        return longBossName(name().replace('_',' ').toLowerCase());
    }
    private static String longBossName(String boss) {
        switch (boss.toLowerCase()) {
            case "corp":
                return "Corporeal Beast";

            case "jad":
            case "tzhaar fight cave":
                return "TzTok-Jad";

            case "kq":
                return "Kalphite Queen";

            case "chaos ele":
                return "Chaos Elemental";

            case "dusk":
            case "dawn":
            case "gargs":
            case "ggs":
            case "gg":
                return "Grotesque Guardians";

            case "crazy arch":
                return "Crazy Archaeologist";

            case "deranged arch":
                return "Deranged Archaeologist";

            case "mole":
                return "Giant Mole";

            case "vetion":
                return "Vet'ion";

            case "calvarion":
            case "calv":
                return "Calvar'ion";

            case "vene":
                return "Venenatis";

            case "kbd":
                return "King Black Dragon";

            case "vork":
                return "Vorkath";

            case "sire":
                return "Abyssal Sire";

            case "smoke devil":
            case "thermy":
                return "Thermonuclear Smoke Devil";

            case "cerb":
                return "Cerberus";

            case "zuk":
            case "inferno":
                return "TzKal-Zuk";

            case "hydra":
                return "Alchemical Hydra";

            // gwd
            case "sara":
            case "saradomin":
            case "zilyana":
            case "zily":
                return "Commander Zilyana";
            case "zammy":
            case "zamorak":
            case "kril":
            case "kril tsutsaroth":
                return "K'ril Tsutsaroth";
            case "arma":
            case "kree":
            case "kreearra":
            case "armadyl":
                return "Kree'arra";
            case "bando":
            case "bandos":
            case "graardor":
                return "General Graardor";

            // dks
            case "supreme":
                return "Dagannoth Supreme";
            case "rex":
                return "Dagannoth Rex";
            case "prime":
                return "Dagannoth Prime";

            case "wt":
                return "Wintertodt";
            case "barrows":
                return "Barrows Chests";
            case "herbi":
                return "Herbiboar";

            // Chambers of Xeric
            case "cox":
            case "xeric":
            case "chambers":
            case "olm":
            case "raids":
                return "Chambers of Xeric";
            case "cox 1":
            case "cox solo":
                return "Chambers of Xeric Solo";
            case "cox 2":
            case "cox duo":
                return "Chambers of Xeric 2 players";
            case "cox 3":
                return "Chambers of Xeric 3 players";
            case "cox 4":
                return "Chambers of Xeric 4 players";
            case "cox 5":
                return "Chambers of Xeric 5 players";
            case "cox 6":
                return "Chambers of Xeric 6 players";
            case "cox 7":
                return "Chambers of Xeric 7 players";
            case "cox 8":
                return "Chambers of Xeric 8 players";
            case "cox 9":
                return "Chambers of Xeric 9 players";
            case "cox 10":
                return "Chambers of Xeric 10 players";
            case "cox 11-15":
            case "cox 11":
            case "cox 12":
            case "cox 13":
            case "cox 14":
            case "cox 15":
                return "Chambers of Xeric 11-15 players";
            case "cox 16-23":
            case "cox 16":
            case "cox 17":
            case "cox 18":
            case "cox 19":
            case "cox 20":
            case "cox 21":
            case "cox 22":
            case "cox 23":
                return "Chambers of Xeric 16-23 players";
            case "cox 24":
            case "cox 24+":
                return "Chambers of Xeric 24+ players";

            // Chambers of Xeric Challenge Mode
            case "chambers of xeric: challenge mode":
            case "cox cm":
            case "xeric cm":
            case "chambers cm":
            case "olm cm":
            case "raids cm":
            case "chambers of xeric - challenge mode":
                return "Chambers of Xeric Challenge Mode";
            case "cox cm 1":
            case "cox cm solo":
                return "Chambers of Xeric Challenge Mode Solo";
            case "cox cm 2":
            case "cox cm duo":
                return "Chambers of Xeric Challenge Mode 2 players";
            case "cox cm 3":
                return "Chambers of Xeric Challenge Mode 3 players";
            case "cox cm 4":
                return "Chambers of Xeric Challenge Mode 4 players";
            case "cox cm 5":
                return "Chambers of Xeric Challenge Mode 5 players";
            case "cox cm 6":
                return "Chambers of Xeric Challenge Mode 6 players";
            case "cox cm 7":
                return "Chambers of Xeric Challenge Mode 7 players";
            case "cox cm 8":
                return "Chambers of Xeric Challenge Mode 8 players";
            case "cox cm 9":
                return "Chambers of Xeric Challenge Mode 9 players";
            case "cox cm 10":
                return "Chambers of Xeric Challenge Mode 10 players";
            case "cox cm 11-15":
            case "cox cm 11":
            case "cox cm 12":
            case "cox cm 13":
            case "cox cm 14":
            case "cox cm 15":
                return "Chambers of Xeric Challenge Mode 11-15 players";
            case "cox cm 16-23":
            case "cox cm 16":
            case "cox cm 17":
            case "cox cm 18":
            case "cox cm 19":
            case "cox cm 20":
            case "cox cm 21":
            case "cox cm 22":
            case "cox cm 23":
                return "Chambers of Xeric Challenge Mode 16-23 players";
            case "cox cm 24":
            case "cox cm 24+":
                return "Chambers of Xeric Challenge Mode 24+ players";

            // Theatre of Blood
            case "tob":
            case "theatre":
            case "verzik":
            case "verzik vitur":
            case "raids 2":
                return "Theatre of Blood";
            case "tob 1":
            case "tob solo":
                return "Theatre of Blood Solo";
            case "tob 2":
            case "tob duo":
                return "Theatre of Blood 2 players";
            case "tob 3":
                return "Theatre of Blood 3 players";
            case "tob 4":
                return "Theatre of Blood 4 players";
            case "tob 5":
                return "Theatre of Blood 5 players";

            // Theatre of Blood Entry Mode
            case "theatre of blood: story mode":
            case "tob sm":
            case "tob story mode":
            case "tob story":
            case "theatre of blood: entry mode":
            case "tob em":
            case "tob entry mode":
            case "tob entry":
                return "Theatre of Blood Entry Mode";

            // Theatre of Blood Hard Mode
            case "theatre of blood: hard mode":
            case "tob cm":
            case "tob hm":
            case "tob hard mode":
            case "tob hard":
            case "hmt":
                return "Theatre of Blood Hard Mode";
            case "hmt 1":
            case "hmt solo":
                return "Theatre of Blood Hard Mode Solo";
            case "hmt 2":
            case "hmt duo":
                return "Theatre of Blood Hard Mode 2 players";
            case "hmt 3":
                return "Theatre of Blood Hard Mode 3 players";
            case "hmt 4":
                return "Theatre of Blood Hard Mode 4 players";
            case "hmt 5":
                return "Theatre of Blood Hard Mode 5 players";

            // Tombs of Amascut
            case "toa":
                return "Tombs of Amascut";
            case "toa 1":
            case "toa solo":
                return "Tombs of Amascut Solo";
            case "toa 2":
            case "toa duo":
                return "Tombs of Amascut 2 players";
            case "toa 3":
                return "Tombs of Amascut 3 players";
            case "toa 4":
                return "Tombs of Amascut 4 players";
            case "toa 5":
                return "Tombs of Amascut 5 players";
            case "toa 6":
                return "Tombs of Amascut 6 players";
            case "toa 7":
                return "Tombs of Amascut 7 players";
            case "toa 8":
                return "Tombs of Amascut 8 players";
            case "toa entry":
            case "tombs of amascut - entry":
            case "toa entry mode":
                return "Tombs of Amascut Entry Mode";
            case "toa entry 1":
            case "toa entry solo":
                return "Tombs of Amascut Entry Mode Solo";
            case "toa entry 2":
            case "toa entry duo":
                return "Tombs of Amascut Entry Mode 2 players";
            case "toa entry 3":
                return "Tombs of Amascut Entry Mode 3 players";
            case "toa entry 4":
                return "Tombs of Amascut Entry Mode 4 players";
            case "toa entry 5":
                return "Tombs of Amascut Entry Mode 5 players";
            case "toa entry 6":
                return "Tombs of Amascut Entry Mode 6 players";
            case "toa entry 7":
                return "Tombs of Amascut Entry Mode 7 players";
            case "toa entry 8":
                return "Tombs of Amascut Entry Mode 8 players";
            case "tombs of amascut: expert mode":
            case "toa expert":
            case "tombs of amascut - expert":
            case "toa expert mode":
                return "Tombs of Amascut Expert Mode";
            case "toa expert 1":
            case "toa expert solo":
                return "Tombs of Amascut Expert Mode Solo";
            case "toa expert 2":
            case "toa expert duo":
                return "Tombs of Amascut Expert Mode 2 players";
            case "toa expert 3":
                return "Tombs of Amascut Expert Mode 3 players";
            case "toa expert 4":
                return "Tombs of Amascut Expert Mode 4 players";
            case "toa expert 5":
                return "Tombs of Amascut Expert Mode 5 players";
            case "toa expert 6":
                return "Tombs of Amascut Expert Mode 6 players";
            case "toa expert 7":
                return "Tombs of Amascut Expert Mode 7 players";
            case "toa expert 8":
                return "Tombs of Amascut Expert Mode 8 players";

            // The Gauntlet
            case "gaunt":
            case "gauntlet":
            case "the gauntlet":
                return "Gauntlet";

            // Corrupted Gauntlet
            case "cgaunt":
            case "cgauntlet":
            case "the corrupted gauntlet":
            case "cg":
                return "Corrupted Gauntlet";

            // The Nightmare
            case "nm":
            case "tnm":
            case "nmare":
            case "the nightmare":
                return "Nightmare";

            // Phosani's Nightmare
            case "pnm":
            case "phosani":
            case "phosanis":
            case "phosani nm":
            case "phosani nightmare":
            case "phosanis nightmare":
                return "Phosani's Nightmare";

            // Hallowed Sepulchre
            case "hs":
            case "sepulchre":
            case "ghc":
                return "Hallowed Sepulchre";
            case "hs1":
            case "hs 1":
                return "Hallowed Sepulchre Floor 1";
            case "hs2":
            case "hs 2":
                return "Hallowed Sepulchre Floor 2";
            case "hs3":
            case "hs 3":
                return "Hallowed Sepulchre Floor 3";
            case "hs4":
            case "hs 4":
                return "Hallowed Sepulchre Floor 4";
            case "hs5":
            case "hs 5":
                return "Hallowed Sepulchre Floor 5";

            // Prifddinas Agility Course
            case "prif":
            case "prifddinas":
                return "Prifddinas Agility Course";

            // Shayzien Basic Agility Course
            case "shayb":
            case "sbac":
            case "shayzienbasic":
            case "shayzien basic":
                return "Shayzien Basic Agility Course";

            // Shayzien Advanced Agility Course
            case "shaya":
            case "saac":
            case "shayadv":
            case "shayadvanced":
            case "shayzien advanced":
                return "Shayzien Advanced Agility Course";

            // Ape Atoll Agility
            case "aa":
            case "ape atoll":
                return "Ape Atoll Agility";

            // Draynor Village Rooftop Course
            case "draynor":
            case "draynor agility":
                return "Draynor Village Rooftop";

            // Al-Kharid Rooftop Course
            case "al kharid":
            case "al kharid agility":
            case "al-kharid":
            case "al-kharid agility":
            case "alkharid":
            case "alkharid agility":
                return "Al Kharid Rooftop";

            // Varrock Rooftop Course
            case "varrock":
            case "varrock agility":
                return "Varrock Rooftop";

            // Canifis Rooftop Course
            case "canifis":
            case "canifis agility":
                return "Canifis Rooftop";

            // Falador Rooftop Course
            case "fally":
            case "fally agility":
            case "falador":
            case "falador agility":
                return "Falador Rooftop";

            // Seers' Village Rooftop Course
            case "seers":
            case "seers agility":
            case "seers village":
            case "seers village agility":
            case "seers'":
            case "seers' agility":
            case "seers' village":
            case "seers' village agility":
            case "seer's":
            case "seer's agility":
            case "seer's village":
            case "seer's village agility":
                return "Seers' Village Rooftop";

            // Pollnivneach Rooftop Course
            case "pollnivneach":
            case "pollnivneach agility":
                return "Pollnivneach Rooftop";

            // Rellekka Rooftop Course
            case "rellekka":
            case "rellekka agility":
                return "Rellekka Rooftop";

            // Ardougne Rooftop Course
            case "ardy":
            case "ardy agility":
            case "ardy rooftop":
            case "ardougne":
            case "ardougne agility":
                return "Ardougne Rooftop";

            // Agility Pyramid
            case "ap":
            case "pyramid":
                return "Agility Pyramid";

            // Barbarian Outpost
            case "barb":
            case "barb outpost":
                return "Barbarian Outpost";

            // Brimhaven Agility Arena
            case "brimhaven":
            case "brimhaven agility":
                return "Agility Arena";

            // Dorgesh-Kaan Agility Course
            case "dorg":
            case "dorgesh kaan":
            case "dorgesh-kaan":
                return "Dorgesh-Kaan Agility";

            // Gnome Stronghold Agility Course
            case "gnome stronghold":
                return "Gnome Stronghold Agility";

            // Penguin Agility
            case "penguin":
                return "Penguin Agility";

            // Werewolf Agility
            case "werewolf":
                return "Werewolf Agility";

            // Skullball
            case "skullball":
                return "Werewolf Skullball";

            // Wilderness Agility Course
            case "wildy":
            case "wildy agility":
                return "Wilderness Agility";

            // Jad challenge
            case "jad 1":
                return "TzHaar-Ket-Rak's First Challenge";
            case "jad 2":
                return "TzHaar-Ket-Rak's Second Challenge";
            case "jad 3":
                return "TzHaar-Ket-Rak's Third Challenge";
            case "jad 4":
                return "TzHaar-Ket-Rak's Fourth Challenge";
            case "jad 5":
                return "TzHaar-Ket-Rak's Fifth Challenge";
            case "jad 6":
                return "TzHaar-Ket-Rak's Sixth Challenge";

            // Guardians of the Rift
            case "gotr":
            case "runetodt":
            case "rifts closed":
                return "Guardians of the Rift";

            // Tempoross
            case "fishingtodt":
            case "fishtodt":
                return "Tempoross";

            // Phantom Muspah
            case "phantom":
            case "muspah":
            case "pm":
                return "Phantom Muspah";

            // Desert Treasure 2 bosses
            case "the leviathan":
                return "Leviathan";
            case "duke":
                return "Duke Sucellus";
            case "the whisperer":
                return "Whisperer";

            default:
                return WordUtils.capitalize(boss);
        }
    }
}
