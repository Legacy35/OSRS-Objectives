package org.legacy.dataProviders;

import net.runelite.api.Client;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.dataProviders.dataModels.CombatAchievementTierModel;
import org.legacy.dataProviders.dataModels.CombatAchievementTaskModel;
import org.legacy.utils.CombatAchievementTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.ArrayList;

public class CombatAchievementDataProvider extends DataProvider {
    private String combatAchievementTaskBinary;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);

    @Inject
    private Client client;
    public static ArrayList<CombatAchievementTaskModel>  combatAchievementTasks = new ArrayList<>();
    public static ArrayList<CombatAchievementTierModel>  combatAchievements = new ArrayList<>();
    public CombatAchievementDataProvider(){
    }
    public void updateValues() {
        updateCombatAchievementTasks();
        updateCombatAchievements();
    }

    @Override
    public String serializedData() {
        StringBuilder result= new StringBuilder("CombatAchievementData{ \n");
        for(CombatAchievementTaskModel temp :combatAchievementTasks){
            result.append(temp).append(",\n");
        }
        return result.append("}").toString();
    }

    private void updateCombatAchievementTasks() {
        updateCombatAchievementTaskBinary();
        combatAchievementTasks.clear();
        for(int i=0;i<combatAchievementTaskBinary.length();i++){
            CombatAchievementTask task =CombatAchievementTask.getByVarpIndex(i);
            if(task!=null) {
                combatAchievementTasks.add(new CombatAchievementTaskModel(task, combatAchievementTaskBinary.charAt(i) == '1'));
            }
        }

    }

    private void updateCombatAchievements() {

    }

    private void updateCombatAchievementTaskBinary() {
        StringBuilder builder = new StringBuilder();
        int bit = 3116;
        for (int i = bit; i < bit + 13; i++) {
            builder.append(reverseString(String.format("%32s", Integer.toBinaryString(client.getVarpValue(i))).replace(' ', '0')));
        }
        builder.append(reverseString(String.format("%32s", Integer.toBinaryString(client.getVarpValue(3387))).replace(' ', '0')))
                .append(reverseString(String.format("%32s", Integer.toBinaryString(client.getVarpValue(3718))).replace(' ', '0')))
                .append(reverseString(String.format("%32s", Integer.toBinaryString(client.getVarpValue(3773))).replace(' ', '0')))
                .append(reverseString(String.format("%32s", Integer.toBinaryString(client.getVarpValue(3774))).replace(' ', '0')));
        combatAchievementTaskBinary = builder.toString();

    }
    public static String reverseString(String str) {
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedBuilder.append(str.charAt(i));
        }
        return reversedBuilder.toString();
    }
}
