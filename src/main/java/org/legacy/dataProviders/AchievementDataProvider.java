package org.legacy.dataProviders;

import org.legacy.dataProviders.dataModels.AchievementTierModel;
import org.legacy.dataProviders.dataModels.AchievementTaskModel;
import org.legacy.utils.DataProviderUtils;
import org.legacy.utils.Difficulty;
import org.legacy.utils.Location;

import javax.inject.Inject;
import java.util.ArrayList;

public
class AchievementDataProvider extends DataProvider {
    @Inject
    private DataProviderUtils utils;
    public static ArrayList<AchievementTierModel> achievements = new ArrayList<>();
    public AchievementDataProvider(){
        initialize();
    }
    public void updateValues() {
        updateDiaries();
    }

    private void updateDiaries() {
        for(AchievementTierModel achievement: achievements){
            achievement.setComplete(utils.checkCompletionOfVarBitOrVarp( achievement.getType(), achievement.getVarBit(), achievement.getValue()));
            for(AchievementTaskModel task: achievement.getTasks()){
                task.setCompleted(utils.checkCompletionOfVarBitOrVarp( task.getType(), task.getVarId(), task.getOffsetOrValue()));
            }
        }
    }
    @Override
    public String serializedData() {
        StringBuilder result = new StringBuilder("AchievementData{ "+achievements.size()+"\n");
        for(AchievementTierModel temp : achievements){
            result.append(temp.toString()).append(",\n ");
        }
        return result.append("}").toString();
    }

    public void initialize() {
        achievements.clear();
        AchievementTierModel temp = new AchievementTierModel(Difficulty.EASY, Location.ARDOUGNE, "bits", 1, 4499);
        temp.addTask(new AchievementTaskModel(0, "player", 1196, "Have Wizard Cromperty teleport you to the Rune essence mine."));
        temp.addTask(new AchievementTaskModel(1, "player", 1196,"Steal a cake from the East Ardougne market stalls."));
        temp.addTask(new AchievementTaskModel(2, "player", 1196,"Sell silk to the Silk trader in East Ardougne for 60 coins each."));
        temp.addTask(new AchievementTaskModel(4, "player", 1196,"Use the altar in East Ardougne's church (requires less than full Prayer points)."));
        temp.addTask(new AchievementTaskModel(5, "player", 1196,"Go out fishing on the Fishing Trawler (you only need to start the minigame)"));
        temp.addTask(new AchievementTaskModel(6, "player", 1196,"Enter the Combat Training Camp north of West Ardougne."));
        temp.addTask(new AchievementTaskModel(7, "player", 1196, "Have Tindel Marchant identify a rusty sword for you."));
        temp.addTask(new AchievementTaskModel(9, "player", 1196,"Use the Ardougne lever to teleport to the Wilderness (you may pull the lever there to return)."));
        temp.addTask(new AchievementTaskModel(11, "player", 1196,"View Aleck's Hunter Emporium in Yanille."));
        temp.addTask(new AchievementTaskModel(12, "player", 1196,"Check what pets you have insured with Probita in East Ardougne (right-click her to Check)."));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.ELITE, Location.ARDOUGNE, "bits", 1, 4502);
        temp.addTask(new AchievementTaskModel(6, "player", 1197,"Catch a manta ray in the Fishing Trawler and cook it in Port Khazard.\nNote: Completing or updating any other task, including those from other diaries, will reset the progress for this task. Leaving Port Khazard will not reset your progress."));
        temp.addTask(new AchievementTaskModel(7, "player", 1197,"Successfully picklock the door to the basement of Yanille Agility dungeon."));
        temp.addTask(new AchievementTaskModel(9, "player", 1197,"Pickpocket a hero."));
        temp.addTask(new AchievementTaskModel(8, "player", 1197,"Make a rune crossbow yourself from scratch within Witchaven or Yanille.\nYou must use the spinning wheel in Witchaven to make the crossbow string, and the anvil in\nYanille to make the runite limbs. Finally, finish making the crossbow in either of the two towns."));
        temp.addTask(new AchievementTaskModel(10, "player", 1197,"Imbue a salve amulet at Nightmare Zone, or equip a salve amulet(i) that was imbued there."));
        temp.addTask(new AchievementTaskModel(11, "player", 1197,"Pick some torstol from the patch north of East Ardougne."));
        temp.addTask(new AchievementTaskModel(12, "player", 1197,"Complete a lap of Ardougne's rooftop agility course."));
        temp.addTask(new AchievementTaskModel(13, "player", 1197,"Cast Ice Barrage on another player within Castle Wars."));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.HARD, Location.ARDOUGNE, "bits", 1, 4501);
        temp.addTask(new AchievementTaskModel(26, "player", 1196,"Recharge some jewellery at the Totem pole in the Legends' Guild."));
        temp.addTask(new AchievementTaskModel(27, "player", 1196,"Enter the Magic Guild."));
        temp.addTask(new AchievementTaskModel(28, "player", 1196,"Attempt to steal from a chest in Ardougne Castle."));
        temp.addTask(new AchievementTaskModel(29, "player", 1196,"Have a zookeeper put you in Ardougne Zoo's monkey cage."));
        temp.addTask(new AchievementTaskModel(30, "player", 1196,"Teleport to the Watchtower ."));
        temp.addTask(new AchievementTaskModel(31, "player", 1196,"Catch a Red Salamander."));
        temp.addTask(new AchievementTaskModel(0, "player", 1197,"Check the health of a palm tree near Tree Gnome Village  (the patch next to Gileth)."));
        temp.addTask(new AchievementTaskModel(1, "player", 1197,"Pick some poison ivy berries from the patch south of East Ardougne (Near the Ardougne Monastery)."));
        temp.addTask(new AchievementTaskModel(2, "player", 1197,"Smith a Mithril platebody near Ardougne (the Port Khazard, Yanille, or West Ardougne anvil)."));
        temp.addTask(new AchievementTaskModel(3, "player", 1197,"Enter your POH from Yanille."));
        temp.addTask(new AchievementTaskModel(4, "player", 1197,"Smith a Dragon sq shield in West Ardougne."));
        temp.addTask(new AchievementTaskModel(5, "player", 1197,"Craft some Death runes from Essence."));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.ARDOUGNE, "bits", 1, 4500);
        temp.addTask(new AchievementTaskModel(13, "player", 1196,"Enter the unicorn pen in Ardougne Zoo using Fairy rings (bis)."));
        temp.addTask(new AchievementTaskModel(14, "player", 1196,"Grapple over Yanille's south wall and jump off."));
        temp.addTask(new AchievementTaskModel(15, "player", 1196,"Harvest some strawberries from the Ardougne farming patch."));
        temp.addTask(new AchievementTaskModel(16, "player", 1196,"Cast the Ardougne Teleport spell."));
        temp.addTask(new AchievementTaskModel(17, "player", 1196,"Travel to Castle Wars by Hot Air Balloon."));
        temp.addTask(new AchievementTaskModel(18, "player", 1196,"Claim buckets of sand from Bert in Yanille."));
        temp.addTask(new AchievementTaskModel(19, "player", 1196,"Catch any fish on the Fishing Platform."));
        temp.addTask(new AchievementTaskModel(20, "player", 1196,"Pickpocket the master farmer north of East Ardougne."));
        temp.addTask(new AchievementTaskModel(21, "player", 1196,"Collect some cave nightshade from the Skavid caves (can be found in the northernmost cave)."));
        temp.addTask(new AchievementTaskModel(23, "player", 1196,"Kill a swordchick in the Tower of Life (south-west in the basement)."));
        temp.addTask(new AchievementTaskModel(24, "player", 1196,"Equip an Iban's upgraded staff or upgrade an Iban's staff."));
        temp.addTask(new AchievementTaskModel(25, "player", 1196,"Visit the island east of the Necromancer Tower. Fair Ring(air)."));
        achievements.add(temp);

        //DESERT
		temp = new AchievementTierModel(Difficulty.EASY, Location.DESERT, "bits", 1, 4523);
        temp.addTask(new AchievementTaskModel(1, "player", 1198));
        temp.addTask(new AchievementTaskModel(2, "player", 1198));
        temp.addTask(new AchievementTaskModel(3, "player", 1198));
        temp.addTask(new AchievementTaskModel(4, "player", 1198));
        temp.addTask(new AchievementTaskModel(5, "player", 1198));
        temp.addTask(new AchievementTaskModel(6, "player", 1198));
        temp.addTask(new AchievementTaskModel(7, "player", 1198));
        temp.addTask(new AchievementTaskModel(8, "player", 1198));
        temp.addTask(new AchievementTaskModel(9, "player", 1198));
        temp.addTask(new AchievementTaskModel(10, "player", 1198));
        temp.addTask(new AchievementTaskModel(11, "player", 1198));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.ELITE, Location.DESERT, "bits", 1, 4526);
        temp.addTask(new AchievementTaskModel(2, "player", 1199));
        temp.addTask(new AchievementTaskModel(4, "player", 1199));
        temp.addTask(new AchievementTaskModel(5, "player", 1199));
        temp.addTask(new AchievementTaskModel(6, "player", 1199));
        temp.addTask(new AchievementTaskModel(7, "player", 1199));
        temp.addTask(new AchievementTaskModel(8, "player", 1199));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.DESERT, "bits", 1, 4525);
        temp.addTask(new AchievementTaskModel(24, "player", 1198));
        temp.addTask(new AchievementTaskModel(25, "player", 1198));
        temp.addTask(new AchievementTaskModel(26, "player", 1198));
        temp.addTask(new AchievementTaskModel(27, "player", 1198));
        temp.addTask(new AchievementTaskModel(28, "player", 1198));
        temp.addTask(new AchievementTaskModel(29, "player", 1198));
        temp.addTask(new AchievementTaskModel(30, "player", 1198));
        temp.addTask(new AchievementTaskModel(31, "player", 1198));
        temp.addTask(new AchievementTaskModel(0, "player", 1199));
        temp.addTask(new AchievementTaskModel(1, "player", 1199));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.DESERT, "bits", 1, 4524);
        temp.addTask(new AchievementTaskModel(12, "player", 1198));
        temp.addTask(new AchievementTaskModel(13, "player", 1198));
        temp.addTask(new AchievementTaskModel(14, "player", 1198));
        temp.addTask(new AchievementTaskModel(15, "player", 1198));
        temp.addTask(new AchievementTaskModel(16, "player", 1198));
        temp.addTask(new AchievementTaskModel(17, "player", 1198));
        temp.addTask(new AchievementTaskModel(18, "player", 1198));
        temp.addTask(new AchievementTaskModel(19, "player", 1198));
        temp.addTask(new AchievementTaskModel(20, "player", 1198));
        temp.addTask(new AchievementTaskModel(21, "player", 1198));
        temp.addTask(new AchievementTaskModel(22, "player", 1198));
        temp.addTask(new AchievementTaskModel(23, "player", 1198));
        achievements.add(temp);

        //Falador

		temp = new AchievementTierModel(Difficulty.EASY, Location.FALADOR, "bits", 1, 4503);
        temp.addTask(new AchievementTaskModel(0, "player", 1186));
        temp.addTask(new AchievementTaskModel(1, "player", 1186));
        temp.addTask(new AchievementTaskModel(2, "player", 1186));
        temp.addTask(new AchievementTaskModel(3, "player", 1186));
        temp.addTask(new AchievementTaskModel(4, "player", 1186));
        temp.addTask(new AchievementTaskModel(5, "player", 1186));
        temp.addTask(new AchievementTaskModel(6, "player", 1186));
        temp.addTask(new AchievementTaskModel(7, "player", 1186));
        temp.addTask(new AchievementTaskModel(8, "player", 1186));
        temp.addTask(new AchievementTaskModel(9, "player", 1186));
        temp.addTask(new AchievementTaskModel(10, "player", 1186));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.ELITE, Location.FALADOR, "bits", 1, 4506);
        temp.addTask(new AchievementTaskModel(5, "player", 1187));
        temp.addTask(new AchievementTaskModel(6, "player", 1187));
        temp.addTask(new AchievementTaskModel(7, "player", 1187));
        temp.addTask(new AchievementTaskModel(8, "player", 1187));
        temp.addTask(new AchievementTaskModel(9, "player", 1187));
        temp.addTask(new AchievementTaskModel(10, "player", 1187));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.FALADOR, "bits", 1, 4505);
        temp.addTask(new AchievementTaskModel(26, "player", 1186));
        temp.addTask(new AchievementTaskModel(27, "player", 1186));
        temp.addTask(new AchievementTaskModel(28, "player", 1186));
        temp.addTask(new AchievementTaskModel(29, "player", 1186));
        temp.addTask(new AchievementTaskModel(30, "player", 1186));
        temp.addTask(new AchievementTaskModel(31, "player", 1186));
        temp.addTask(new AchievementTaskModel(0, "player", 1187));
        temp.addTask(new AchievementTaskModel(1, "player", 1187));
        temp.addTask(new AchievementTaskModel(2, "player", 1187));
        temp.addTask(new AchievementTaskModel(3, "player", 1187));
        temp.addTask(new AchievementTaskModel(4, "player", 1187));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.FALADOR, "bits", 1, 4504);
        temp.addTask(new AchievementTaskModel(11, "player", 1186));
        temp.addTask(new AchievementTaskModel(12, "player", 1186));
        temp.addTask(new AchievementTaskModel(13, "player", 1186));
        temp.addTask(new AchievementTaskModel(14, "player", 1186));
        temp.addTask(new AchievementTaskModel(15, "player", 1186));
        temp.addTask(new AchievementTaskModel(16, "player", 1186));
        temp.addTask(new AchievementTaskModel(17, "player", 1186));
        temp.addTask(new AchievementTaskModel(18, "player", 1186));
        temp.addTask(new AchievementTaskModel(20, "player", 1186));
        temp.addTask(new AchievementTaskModel(21, "player", 1186));
        temp.addTask(new AchievementTaskModel(22, "player", 1186));
        temp.addTask(new AchievementTaskModel(23, "player", 1186));
        temp.addTask(new AchievementTaskModel(24, "player", 1186));
        temp.addTask(new AchievementTaskModel(25, "player", 1186));
        achievements.add(temp);

        //Fremennik
		temp = new AchievementTierModel(Difficulty.EASY, Location.FREMENNIK, "bits", 1, 4531);
        temp.addTask(new AchievementTaskModel(1, "player", 1184));
        temp.addTask(new AchievementTaskModel(2, "player", 1184));
        temp.addTask(new AchievementTaskModel(3, "player", 1184));
        temp.addTask(new AchievementTaskModel(4, "player", 1184));
        temp.addTask(new AchievementTaskModel(5, "player", 1184));
        temp.addTask(new AchievementTaskModel(6, "player", 1184));
        temp.addTask(new AchievementTaskModel(7, "player", 1184));
        temp.addTask(new AchievementTaskModel(8, "player", 1184));
        temp.addTask(new AchievementTaskModel(9, "player", 1184));
        temp.addTask(new AchievementTaskModel(10, "player", 1184));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.ELITE, Location.FREMENNIK, "bits", 1, 4534);
        temp.addTask(new AchievementTaskModel(31, "player", 1184));
        temp.addTask(new AchievementTaskModel(0, "player", 1185));
        temp.addTask(new AchievementTaskModel(1, "player", 1185));
        temp.addTask(new AchievementTaskModel(2, "player", 1185));
        temp.addTask(new AchievementTaskModel(3, "player", 1185));
        temp.addTask(new AchievementTaskModel(4, "player", 1185));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.FREMENNIK, "bits", 1, 4533);
        temp.addTask(new AchievementTaskModel(21, "player", 1184));
        temp.addTask(new AchievementTaskModel(23, "player", 1184));
        temp.addTask(new AchievementTaskModel(24, "player", 1184));
        temp.addTask(new AchievementTaskModel(25, "player", 1184));
        temp.addTask(new AchievementTaskModel(26, "player", 1184));
        temp.addTask(new AchievementTaskModel(27, "player", 1184));
        temp.addTask(new AchievementTaskModel(28, "player", 1184));
        temp.addTask(new AchievementTaskModel(29, "player", 1184));
        temp.addTask(new AchievementTaskModel(30, "player", 1184));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.FREMENNIK, "bits", 1, 4532);
        temp.addTask(new AchievementTaskModel(11, "player", 1184));
        temp.addTask(new AchievementTaskModel(12, "player", 1184));
        temp.addTask(new AchievementTaskModel(13, "player", 1184));
        temp.addTask(new AchievementTaskModel(14, "player", 1184));
        temp.addTask(new AchievementTaskModel(15, "player", 1184));
        temp.addTask(new AchievementTaskModel(17, "player", 1184));
        temp.addTask(new AchievementTaskModel(18, "player", 1184));
        temp.addTask(new AchievementTaskModel(19, "player", 1184));
        temp.addTask(new AchievementTaskModel(20, "player", 1184));
        achievements.add(temp);

        //Kandarin

		temp = new AchievementTierModel(Difficulty.EASY, Location.KANDARIN, "bits", 1, 4515);
        temp.addTask(new AchievementTaskModel(1, "player", 1178));
        temp.addTask(new AchievementTaskModel(2, "player", 1178));
        temp.addTask(new AchievementTaskModel(3, "player", 1178));
        temp.addTask(new AchievementTaskModel(4, "player", 1178));
        temp.addTask(new AchievementTaskModel(5, "player", 1178));
        temp.addTask(new AchievementTaskModel(6, "player", 1178));
        temp.addTask(new AchievementTaskModel(7, "player", 1178));
        temp.addTask(new AchievementTaskModel(8, "player", 1178));
        temp.addTask(new AchievementTaskModel(9, "player", 1178));
        temp.addTask(new AchievementTaskModel(10, "player", 1178));
        temp.addTask(new AchievementTaskModel(11, "player", 1178));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.ELITE, Location.KANDARIN, "bits", 1, 4518);
        temp.addTask(new AchievementTaskModel(5, "player", 1179));
        temp.addTask(new AchievementTaskModel(6, "player", 1179));
        temp.addTask(new AchievementTaskModel(7, "player", 1179));
        temp.addTask(new AchievementTaskModel(8, "player", 1179));
        temp.addTask(new AchievementTaskModel(9, "player", 1179));
        temp.addTask(new AchievementTaskModel(10, "player", 1179));
        temp.addTask(new AchievementTaskModel(11, "player", 1179));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.HARD, Location.KANDARIN, "bits", 1, 4517);
        temp.addTask(new AchievementTaskModel(26, "player", 1178));
        temp.addTask(new AchievementTaskModel(27, "player", 1178));
        temp.addTask(new AchievementTaskModel(28, "player", 1178));
        temp.addTask(new AchievementTaskModel(29, "player", 1178));
        temp.addTask(new AchievementTaskModel(30, "player", 1178));
        temp.addTask(new AchievementTaskModel(31, "player", 1178));
        temp.addTask(new AchievementTaskModel(0, "player", 1179));
        temp.addTask(new AchievementTaskModel(1, "player", 1179));
        temp.addTask(new AchievementTaskModel(2, "player", 1179));
        temp.addTask(new AchievementTaskModel(3, "player", 1179));
        temp.addTask(new AchievementTaskModel(4, "player", 1179));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.KANDARIN, "bits", 1, 4516);
        temp.addTask(new AchievementTaskModel(12, "player", 1178));
        temp.addTask(new AchievementTaskModel(13, "player", 1178));
        temp.addTask(new AchievementTaskModel(14, "player", 1178));
        temp.addTask(new AchievementTaskModel(15, "player", 1178));
        temp.addTask(new AchievementTaskModel(16, "player", 1178));
        temp.addTask(new AchievementTaskModel(17, "player", 1178));
        temp.addTask(new AchievementTaskModel(18, "player", 1178));
        temp.addTask(new AchievementTaskModel(19, "player", 1178));
        temp.addTask(new AchievementTaskModel(20, "player", 1178));
        temp.addTask(new AchievementTaskModel(21, "player", 1178));
        temp.addTask(new AchievementTaskModel(22, "player", 1178));
        temp.addTask(new AchievementTaskModel(23, "player", 1178));
        temp.addTask(new AchievementTaskModel(24, "player", 1178));
        temp.addTask(new AchievementTaskModel(25, "player", 1178));
        achievements.add(temp);

        //Karmja
	
		temp = new AchievementTierModel(Difficulty.EASY, Location.KARAMJA, "bits", 1, 3577);
        temp.addTask(new AchievementTaskModel(5, "bits", 3566));
        temp.addTask(new AchievementTaskModel(1, "bits", 3567));
        temp.addTask(new AchievementTaskModel(1, "bits", 3568));
        temp.addTask(new AchievementTaskModel(1, "bits", 3569));
        temp.addTask(new AchievementTaskModel(1, "bits", 3570));
        temp.addTask(new AchievementTaskModel(1, "bits", 3571));
        temp.addTask(new AchievementTaskModel(1, "bits", 3572));
        temp.addTask(new AchievementTaskModel(5, "bits", 3573));
        temp.addTask(new AchievementTaskModel(1, "bits", 3574));
        temp.addTask(new AchievementTaskModel(1, "bits", 3575));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.ELITE, Location.KARAMJA, "bits", 1, 4567);
        temp.addTask(new AchievementTaskModel(1, "player", 1200));
        temp.addTask(new AchievementTaskModel(2, "player", 1200));
        temp.addTask(new AchievementTaskModel(3, "player", 1200));
        temp.addTask(new AchievementTaskModel(4, "player", 1200));
        temp.addTask(new AchievementTaskModel(5, "player", 1200));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.KARAMJA, "bits", 1, 3610);
        temp.addTask(new AchievementTaskModel(1, "bits", 3600));
        temp.addTask(new AchievementTaskModel(1, "bits", 3601));
        temp.addTask(new AchievementTaskModel(1, "bits", 3602));
        temp.addTask(new AchievementTaskModel(1, "bits", 3603));
        temp.addTask(new AchievementTaskModel(1, "bits", 3604));
        temp.addTask(new AchievementTaskModel(1, "bits", 3605));
        temp.addTask(new AchievementTaskModel(1, "bits", 3606));
        temp.addTask(new AchievementTaskModel(5, "bits", 3607));
        temp.addTask(new AchievementTaskModel(1, "bits", 3608));
        temp.addTask(new AchievementTaskModel(1, "bits", 3609));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.KARAMJA, "bits", 1, 3598);
        temp.addTask(new AchievementTaskModel(1, "bits", 3579));
        temp.addTask(new AchievementTaskModel(1, "bits", 3580));
        temp.addTask(new AchievementTaskModel(1, "bits", 3581));
        temp.addTask(new AchievementTaskModel(1, "bits", 3582));
        temp.addTask(new AchievementTaskModel(1, "bits", 3583));
        temp.addTask(new AchievementTaskModel(1, "bits", 3584));
        temp.addTask(new AchievementTaskModel(1, "bits", 3596));
        temp.addTask(new AchievementTaskModel(1, "bits", 3586));
        temp.addTask(new AchievementTaskModel(1, "bits", 3587));
        temp.addTask(new AchievementTaskModel(1, "bits", 3588));
        temp.addTask(new AchievementTaskModel(1, "bits", 3589));
        temp.addTask(new AchievementTaskModel(1, "bits", 3590));
        temp.addTask(new AchievementTaskModel(1, "bits", 3591));
        temp.addTask(new AchievementTaskModel(1, "bits", 3592));
        temp.addTask(new AchievementTaskModel(1, "bits", 3593));
        temp.addTask(new AchievementTaskModel(1, "bits", 3594));
        temp.addTask(new AchievementTaskModel(1, "bits", 3595));
        temp.addTask(new AchievementTaskModel(1, "bits", 3597));
        temp.addTask(new AchievementTaskModel(1, "bits", 3585));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.EASY, Location.KOUREND, "bits", 1, 7929);
        temp.addTask(new AchievementTaskModel(1, "player", 2085));
        temp.addTask(new AchievementTaskModel(2, "player", 2085));
        temp.addTask(new AchievementTaskModel(3, "player", 2085));
        temp.addTask(new AchievementTaskModel(4, "player", 2085));
        temp.addTask(new AchievementTaskModel(5, "player", 2085));
        temp.addTask(new AchievementTaskModel(6, "player", 2085));
        temp.addTask(new AchievementTaskModel(7, "player", 2085));
        temp.addTask(new AchievementTaskModel(8, "player", 2085));
        temp.addTask(new AchievementTaskModel(9, "player", 2085));
        temp.addTask(new AchievementTaskModel(10, "player", 2085));
        temp.addTask(new AchievementTaskModel(11, "player", 2085));
        temp.addTask(new AchievementTaskModel(12, "player", 2085));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.ELITE, Location.KOUREND, "bits", 1, 7932);
        temp.addTask(new AchievementTaskModel(4, "player", 2086));
        temp.addTask(new AchievementTaskModel(5, "player", 2086));
        temp.addTask(new AchievementTaskModel(6, "player", 2086));
        temp.addTask(new AchievementTaskModel(7, "player", 2086));
        temp.addTask(new AchievementTaskModel(8, "player", 2086));
        temp.addTask(new AchievementTaskModel(9, "player", 2086));
        temp.addTask(new AchievementTaskModel(10, "player", 2086));
        temp.addTask(new AchievementTaskModel(11, "player", 2086));
        achievements.add(temp);
	
	
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.KOUREND, "bits", 1, 7931);
        temp.addTask(new AchievementTaskModel(26, "player", 2085));
        temp.addTask(new AchievementTaskModel(27, "player", 2085));
        temp.addTask(new AchievementTaskModel(28, "player", 2085));
        temp.addTask(new AchievementTaskModel(29, "player", 2085));
        temp.addTask(new AchievementTaskModel(31, "player", 2085));
        temp.addTask(new AchievementTaskModel(30, "player", 2085));
        temp.addTask(new AchievementTaskModel(0, "player", 2086));
        temp.addTask(new AchievementTaskModel(1, "player", 2086));
        temp.addTask(new AchievementTaskModel(2, "player", 2086));
        temp.addTask(new AchievementTaskModel(3, "player", 2086));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.KOUREND, "bits", 1, 7930);
        temp.addTask(new AchievementTaskModel(25, "player", 2085));
        temp.addTask(new AchievementTaskModel(13, "player", 2085));
        temp.addTask(new AchievementTaskModel(14, "player", 2085));
        temp.addTask(new AchievementTaskModel(15, "player", 2085));
        temp.addTask(new AchievementTaskModel(21, "player", 2085));
        temp.addTask(new AchievementTaskModel(16, "player", 2085));
        temp.addTask(new AchievementTaskModel(17, "player", 2085));
        temp.addTask(new AchievementTaskModel(18, "player", 2085));
        temp.addTask(new AchievementTaskModel(19, "player", 2085));
        temp.addTask(new AchievementTaskModel(22, "player", 2085));
        temp.addTask(new AchievementTaskModel(20, "player", 2085));
        temp.addTask(new AchievementTaskModel(23, "player", 2085));
        temp.addTask(new AchievementTaskModel(24, "player", 2085));
        achievements.add(temp);

        //Lumbridge & Draynor

		temp = new AchievementTierModel(Difficulty.EASY, Location.LUMBRIDGE, "bits", 1, 4535);
        temp.addTask(new AchievementTaskModel(1, "player", 1194));
        temp.addTask(new AchievementTaskModel(2, "player", 1194));
        temp.addTask(new AchievementTaskModel(3, "player", 1194));
        temp.addTask(new AchievementTaskModel(4, "player", 1194));
        temp.addTask(new AchievementTaskModel(5, "player", 1194));
        temp.addTask(new AchievementTaskModel(6, "player", 1194));
        temp.addTask(new AchievementTaskModel(7, "player", 1194));
        temp.addTask(new AchievementTaskModel(8, "player", 1194));
        temp.addTask(new AchievementTaskModel(9, "player", 1194));
        temp.addTask(new AchievementTaskModel(10, "player", 1194));
        temp.addTask(new AchievementTaskModel(11, "player", 1194));
        temp.addTask(new AchievementTaskModel(12, "player", 1194));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.ELITE, Location.LUMBRIDGE, "bits", 1, 4538);
        temp.addTask(new AchievementTaskModel(4, "player", 1195));
        temp.addTask(new AchievementTaskModel(5, "player", 1195));
        temp.addTask(new AchievementTaskModel(6, "player", 1195));
        temp.addTask(new AchievementTaskModel(7, "player", 1195));
        temp.addTask(new AchievementTaskModel(8, "player", 1195));
        temp.addTask(new AchievementTaskModel(9, "player", 1195));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.LUMBRIDGE, "bits", 1, 4537);
        temp.addTask(new AchievementTaskModel(25, "player", 1194));
        temp.addTask(new AchievementTaskModel(26, "player", 1194));
        temp.addTask(new AchievementTaskModel(27, "player", 1194));
        temp.addTask(new AchievementTaskModel(28, "player", 1194));
        temp.addTask(new AchievementTaskModel(29, "player", 1194));
        temp.addTask(new AchievementTaskModel(30, "player", 1194));
        temp.addTask(new AchievementTaskModel(31, "player", 1194));
        temp.addTask(new AchievementTaskModel(0, "player", 1195));
        temp.addTask(new AchievementTaskModel(1, "player", 1195));
        temp.addTask(new AchievementTaskModel(2, "player", 1195));
        temp.addTask(new AchievementTaskModel(3, "player", 1195));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.LUMBRIDGE, "bits", 1, 4536);
        temp.addTask(new AchievementTaskModel(13, "player", 1194));
        temp.addTask(new AchievementTaskModel(14, "player", 1194));
        temp.addTask(new AchievementTaskModel(15, "player", 1194));
        temp.addTask(new AchievementTaskModel(16, "player", 1194));
        temp.addTask(new AchievementTaskModel(17, "player", 1194));
        temp.addTask(new AchievementTaskModel(18, "player", 1194));
        temp.addTask(new AchievementTaskModel(19, "player", 1194));
        temp.addTask(new AchievementTaskModel(20, "player", 1194));
        temp.addTask(new AchievementTaskModel(21, "player", 1194));
        temp.addTask(new AchievementTaskModel(22, "player", 1194));
        temp.addTask(new AchievementTaskModel(23, "player", 1194));
        temp.addTask(new AchievementTaskModel(24, "player", 1194));
        achievements.add(temp);

        //MORYTANIA
		temp = new AchievementTierModel(Difficulty.EASY, Location.MORYTANIA, "bits", 1, 4527);
        temp.addTask(new AchievementTaskModel(1, "player", 1180));
        temp.addTask(new AchievementTaskModel(2, "player", 1180));
        temp.addTask(new AchievementTaskModel(3, "player", 1180));
        temp.addTask(new AchievementTaskModel(4, "player", 1180));
        temp.addTask(new AchievementTaskModel(5, "player", 1180));
        temp.addTask(new AchievementTaskModel(6, "player", 1180));
        temp.addTask(new AchievementTaskModel(7, "player", 1180));
        temp.addTask(new AchievementTaskModel(8, "player", 1180));
        temp.addTask(new AchievementTaskModel(9, "player", 1180));
        temp.addTask(new AchievementTaskModel(10, "player", 1180));
        temp.addTask(new AchievementTaskModel(11, "player", 1180));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.ELITE, Location.MORYTANIA, "bits", 1, 4530);
        temp.addTask(new AchievementTaskModel(3, "player", 1181));
        temp.addTask(new AchievementTaskModel(4, "player", 1181));
        temp.addTask(new AchievementTaskModel(5, "player", 1181));
        temp.addTask(new AchievementTaskModel(6, "player", 1181));
        temp.addTask(new AchievementTaskModel(7, "player", 1181));
        temp.addTask(new AchievementTaskModel(8, "player", 1181));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.MORYTANIA, "bits", 1, 4529);
        temp.addTask(new AchievementTaskModel(23, "player", 1180));
        temp.addTask(new AchievementTaskModel(24, "player", 1180));
        temp.addTask(new AchievementTaskModel(25, "player", 1180));
        temp.addTask(new AchievementTaskModel(26, "player", 1180));
        temp.addTask(new AchievementTaskModel(27, "player", 1180));
        temp.addTask(new AchievementTaskModel(28, "player", 1180));
        temp.addTask(new AchievementTaskModel(29, "player", 1180));
        temp.addTask(new AchievementTaskModel(30, "player", 1180));
        temp.addTask(new AchievementTaskModel(1, "player", 1181));
        temp.addTask(new AchievementTaskModel(2, "player", 1181));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.MORYTANIA, "bits", 1, 4528);
        temp.addTask(new AchievementTaskModel(12, "player", 1180));
        temp.addTask(new AchievementTaskModel(13, "player", 1180));
        temp.addTask(new AchievementTaskModel(14, "player", 1180));
        temp.addTask(new AchievementTaskModel(15, "player", 1180));
        temp.addTask(new AchievementTaskModel(16, "player", 1180));
        temp.addTask(new AchievementTaskModel(17, "player", 1180));
        temp.addTask(new AchievementTaskModel(18, "player", 1180));
        temp.addTask(new AchievementTaskModel(19, "player", 1180));
        temp.addTask(new AchievementTaskModel(20, "player", 1180));
        temp.addTask(new AchievementTaskModel(21, "player", 1180));
        temp.addTask(new AchievementTaskModel(22, "player", 1180));
        achievements.add(temp);

        //VARROCK

        temp = new AchievementTierModel(Difficulty.EASY, Location.VARROCK, "bits", 1, 4519);
        temp.addTask(new AchievementTaskModel(1, "player", 1176));
        temp.addTask(new AchievementTaskModel(2, "player", 1176));
        temp.addTask(new AchievementTaskModel(3, "player", 1176));
        temp.addTask(new AchievementTaskModel(4, "player", 1176));
        temp.addTask(new AchievementTaskModel(5, "player", 1176));
        temp.addTask(new AchievementTaskModel(6, "player", 1176));
        temp.addTask(new AchievementTaskModel(7, "player", 1176));
        temp.addTask(new AchievementTaskModel(8, "player", 1176));
        temp.addTask(new AchievementTaskModel(9, "player", 1176));
        temp.addTask(new AchievementTaskModel(10, "player", 1176));
        temp.addTask(new AchievementTaskModel(11, "player", 1176));
        temp.addTask(new AchievementTaskModel(12, "player", 1176));
        temp.addTask(new AchievementTaskModel(13, "player", 1176));
        temp.addTask(new AchievementTaskModel(14, "player", 1176));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.ELITE, Location.VARROCK, "bits", 1, 4522);
        temp.addTask(new AchievementTaskModel(7, "player", 1177));
        temp.addTask(new AchievementTaskModel(8, "player", 1177));
        temp.addTask(new AchievementTaskModel(9, "player", 1177));
        temp.addTask(new AchievementTaskModel(10, "player", 1177));
        temp.addTask(new AchievementTaskModel(11, "player", 1177));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.HARD, Location.VARROCK, "bits", 1, 4521);
        temp.addTask(new AchievementTaskModel(29, "player", 1176));
        temp.addTask(new AchievementTaskModel(30, "player", 1176));
        temp.addTask(new AchievementTaskModel(31, "player", 1176));
        temp.addTask(new AchievementTaskModel(0, "player", 1177));
        temp.addTask(new AchievementTaskModel(1, "player", 1177));
        temp.addTask(new AchievementTaskModel(2, "player", 1177));
        temp.addTask(new AchievementTaskModel(3, "player", 1177));
        temp.addTask(new AchievementTaskModel(4, "player", 1177));
        temp.addTask(new AchievementTaskModel(5, "player", 1177));
        temp.addTask(new AchievementTaskModel(6, "player", 1177));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.VARROCK, "bits", 1, 4520);
        temp.addTask(new AchievementTaskModel(15, "player", 1176));
        temp.addTask(new AchievementTaskModel(16, "player", 1176));
        temp.addTask(new AchievementTaskModel(18, "player", 1176));
        temp.addTask(new AchievementTaskModel(19, "player", 1176));
        temp.addTask(new AchievementTaskModel(20, "player", 1176));
        temp.addTask(new AchievementTaskModel(21, "player", 1176));
        temp.addTask(new AchievementTaskModel(22, "player", 1176));
        temp.addTask(new AchievementTaskModel(23, "player", 1176));
        temp.addTask(new AchievementTaskModel(24, "player", 1176));
        temp.addTask(new AchievementTaskModel(25, "player", 1176));
        temp.addTask(new AchievementTaskModel(26, "player", 1176));
        temp.addTask(new AchievementTaskModel(27, "player", 1176));
        temp.addTask(new AchievementTaskModel(28, "player", 1176));
        achievements.add(temp);

        //Western Provinces

        temp = new AchievementTierModel(Difficulty.EASY, Location.WESTERN, "bits", 1, 4519);
        temp.addTask(new AchievementTaskModel(1, "player", 1182));
        temp.addTask(new AchievementTaskModel(2, "player", 1182));
        temp.addTask(new AchievementTaskModel(3, "player", 1182));
        temp.addTask(new AchievementTaskModel(4, "player", 1182));
        temp.addTask(new AchievementTaskModel(5, "player", 1182));
        temp.addTask(new AchievementTaskModel(6, "player", 1182));
        temp.addTask(new AchievementTaskModel(7, "player", 1182));
        temp.addTask(new AchievementTaskModel(8, "player", 1182));
        temp.addTask(new AchievementTaskModel(9, "player", 1182));
        temp.addTask(new AchievementTaskModel(10, "player", 1182));
        temp.addTask(new AchievementTaskModel(11, "player", 1182));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.ELITE, Location.WESTERN, "bits", 1, 4522);
        temp.addTask(new AchievementTaskModel(6, "player", 1183));
        temp.addTask(new AchievementTaskModel(7, "player", 1183));
        temp.addTask(new AchievementTaskModel(8, "player", 1183));
        temp.addTask(new AchievementTaskModel(9, "player", 1183));
        temp.addTask(new AchievementTaskModel(12, "player", 1183));
        temp.addTask(new AchievementTaskModel(13, "player", 1183));
        temp.addTask(new AchievementTaskModel(14, "player", 1183));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.HARD, Location.WESTERN, "bits", 1, 4521);
        temp.addTask(new AchievementTaskModel(25, "player", 1182));
        temp.addTask(new AchievementTaskModel(26, "player", 1182));
        temp.addTask(new AchievementTaskModel(27, "player", 1182));
        temp.addTask(new AchievementTaskModel(28, "player", 1182));
        temp.addTask(new AchievementTaskModel(29, "player", 1182));
        temp.addTask(new AchievementTaskModel(30, "player", 1182));
        temp.addTask(new AchievementTaskModel(31, "player", 1182));
        temp.addTask(new AchievementTaskModel(0, "player", 1183));
        temp.addTask(new AchievementTaskModel(1, "player", 1183));
        temp.addTask(new AchievementTaskModel(2, "player", 1183));
        temp.addTask(new AchievementTaskModel(3, "player", 1183));
        temp.addTask(new AchievementTaskModel(4, "player", 1183));
        temp.addTask(new AchievementTaskModel(5, "player", 1183));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.WESTERN, "bits", 1, 4520);
        temp.addTask(new AchievementTaskModel(12, "player", 1182));
        temp.addTask(new AchievementTaskModel(13, "player", 1182));
        temp.addTask(new AchievementTaskModel(14, "player", 1182));
        temp.addTask(new AchievementTaskModel(15, "player", 1182));
        temp.addTask(new AchievementTaskModel(16, "player", 1182));
        temp.addTask(new AchievementTaskModel(17, "player", 1182));
        temp.addTask(new AchievementTaskModel(18, "player", 1182));
        temp.addTask(new AchievementTaskModel(19, "player", 1182));
        temp.addTask(new AchievementTaskModel(20, "player", 1182));
        temp.addTask(new AchievementTaskModel(21, "player", 1182));
        temp.addTask(new AchievementTaskModel(22, "player", 1182));
        temp.addTask(new AchievementTaskModel(23, "player", 1182));
        temp.addTask(new AchievementTaskModel(24, "player", 1182));
        achievements.add(temp);

        //WILDERNESS
	
        temp = new AchievementTierModel(Difficulty.EASY, Location.WILDERNESS, "bits", 1, 4507);
        temp.addTask(new AchievementTaskModel(1, "player", 1192));
        temp.addTask(new AchievementTaskModel(2, "player", 1192));
        temp.addTask(new AchievementTaskModel(3, "player", 1192));
        temp.addTask(new AchievementTaskModel(4, "player", 1192));
        temp.addTask(new AchievementTaskModel(5, "player", 1192));
        temp.addTask(new AchievementTaskModel(6, "player", 1192));
        temp.addTask(new AchievementTaskModel(7, "player", 1192));
        temp.addTask(new AchievementTaskModel(8, "player", 1192));
        temp.addTask(new AchievementTaskModel(9, "player", 1192));
        temp.addTask(new AchievementTaskModel(10, "player", 1192));
        temp.addTask(new AchievementTaskModel(11, "player", 1192));
        temp.addTask(new AchievementTaskModel(12, "player", 1192));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.ELITE, Location.WILDERNESS, "bits", 1, 4510);
        temp.addTask(new AchievementTaskModel(3, "player", 1193));
        temp.addTask(new AchievementTaskModel(5, "player", 1193));
        temp.addTask(new AchievementTaskModel(7, "player", 1193));
        temp.addTask(new AchievementTaskModel(8, "player", 1193));
        temp.addTask(new AchievementTaskModel(9, "player", 1193));
        temp.addTask(new AchievementTaskModel(10, "player", 1193));
        temp.addTask(new AchievementTaskModel(11, "player", 1193));
        achievements.add(temp);

		temp = new AchievementTierModel(Difficulty.HARD, Location.WILDERNESS, "bits", 1, 4509);
        temp.addTask(new AchievementTaskModel(25, "player", 1192));
        temp.addTask(new AchievementTaskModel(26, "player", 1192));
        temp.addTask(new AchievementTaskModel(27, "player", 1192));
        temp.addTask(new AchievementTaskModel(28, "player", 1192));
        temp.addTask(new AchievementTaskModel(29, "player", 1192));
        temp.addTask(new AchievementTaskModel(30, "player", 1192));
        temp.addTask(new AchievementTaskModel(31, "player", 1192));
        temp.addTask(new AchievementTaskModel(0, "player", 1193));
        temp.addTask(new AchievementTaskModel(1, "player", 1193));
        temp.addTask(new AchievementTaskModel(2, "player", 1193));
        achievements.add(temp);
	
		temp = new AchievementTierModel(Difficulty.MEDIUM, Location.WILDERNESS, "bits", 1, 4508);
        temp.addTask(new AchievementTaskModel(13, "player", 1192));
        temp.addTask(new AchievementTaskModel(14, "player", 1192));
        temp.addTask(new AchievementTaskModel(15, "player", 1192));
        temp.addTask(new AchievementTaskModel(16, "player", 1192));
        temp.addTask(new AchievementTaskModel(18, "player", 1192));
        temp.addTask(new AchievementTaskModel(19, "player", 1192));
        temp.addTask(new AchievementTaskModel(20, "player", 1192));
        temp.addTask(new AchievementTaskModel(21, "player", 1192));
        temp.addTask(new AchievementTaskModel(22, "player", 1192));
        temp.addTask(new AchievementTaskModel(23, "player", 1192));
        temp.addTask(new AchievementTaskModel(24, "player", 1192));
    }

}