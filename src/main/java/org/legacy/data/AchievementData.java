package org.legacy.data;

import net.runelite.api.Client;
import net.runelite.api.Varbits;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.models.AchievementModel;
import org.legacy.utils.Difficulty;
import org.legacy.utils.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.ArrayList;

public class AchievementData extends Data{
    @Inject
    private Client client;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    ArrayList<AchievementModel> Achievements = new ArrayList<AchievementModel>();
    public AchievementData(){
    }
    public void updateValues() {
        Achievements.clear();
        updateEasyDiaries();
        updateMediumDiaries();
        updateHardDiaries();
        updateEliteDiaries();
    }
    public void updateEasyDiaries(){
        if(client.getVarbitValue(Varbits.DIARY_ARDOUGNE_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.ARDOUGNE,Varbits.DIARY_ARDOUGNE_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_DESERT_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.DESERT,Varbits.DIARY_DESERT_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_FALADOR_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.FALADOR,Varbits.DIARY_FALADOR_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_FREMENNIK_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.FREMENNIK,Varbits.DIARY_FREMENNIK_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_KANDARIN_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.KANDARIN,Varbits.DIARY_KANDARIN_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_KARAMJA_EASY)!=2){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.KARAMJA,Varbits.DIARY_KARAMJA_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_KOUREND_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.KOUREND,Varbits.DIARY_KOUREND_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_LUMBRIDGE_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.LUMBRIDGE,Varbits.DIARY_LUMBRIDGE_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_MORYTANIA_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.MORYTANIA,Varbits.DIARY_MORYTANIA_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_VARROCK_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.VARROCK,Varbits.DIARY_VARROCK_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_WESTERN_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.WESTERN,Varbits.DIARY_WESTERN_EASY));
        }
        if(client.getVarbitValue(Varbits.DIARY_WILDERNESS_EASY)!=1){
            Achievements.add(new AchievementModel(Difficulty.Easy, Location.WILDERNESS,Varbits.DIARY_WILDERNESS_EASY));
        }
    }
    public void updateMediumDiaries(){
        if(client.getVarbitValue(Varbits.DIARY_ARDOUGNE_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.ARDOUGNE,Varbits.DIARY_ARDOUGNE_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_DESERT_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.DESERT,Varbits.DIARY_DESERT_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_FALADOR_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.FALADOR,Varbits.DIARY_FALADOR_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_FREMENNIK_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.FREMENNIK,Varbits.DIARY_FREMENNIK_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_KANDARIN_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.KANDARIN,Varbits.DIARY_KANDARIN_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_KARAMJA_MEDIUM)!=2){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.KARAMJA,Varbits.DIARY_KARAMJA_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_KOUREND_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.KOUREND,Varbits.DIARY_KOUREND_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_LUMBRIDGE_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.LUMBRIDGE,Varbits.DIARY_LUMBRIDGE_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_MORYTANIA_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.MORYTANIA,Varbits.DIARY_MORYTANIA_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_VARROCK_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.VARROCK,Varbits.DIARY_VARROCK_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_WESTERN_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.WESTERN,Varbits.DIARY_WESTERN_MEDIUM));
        }
        if(client.getVarbitValue(Varbits.DIARY_WILDERNESS_MEDIUM)!=1){
            Achievements.add(new AchievementModel(Difficulty.Medium, Location.WILDERNESS,Varbits.DIARY_WILDERNESS_MEDIUM));
        }
    }
    public void updateHardDiaries(){
        if(client.getVarbitValue(Varbits.DIARY_ARDOUGNE_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.ARDOUGNE,Varbits.DIARY_ARDOUGNE_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_DESERT_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.DESERT,Varbits.DIARY_DESERT_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_FALADOR_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.FALADOR,Varbits.DIARY_FALADOR_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_FREMENNIK_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.FREMENNIK,Varbits.DIARY_FREMENNIK_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_KANDARIN_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.KANDARIN,Varbits.DIARY_KANDARIN_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_KARAMJA_HARD)!=2){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.KARAMJA,Varbits.DIARY_KARAMJA_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_KOUREND_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.KOUREND,Varbits.DIARY_KOUREND_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_LUMBRIDGE_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.LUMBRIDGE,Varbits.DIARY_LUMBRIDGE_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_MORYTANIA_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.MORYTANIA,Varbits.DIARY_MORYTANIA_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_VARROCK_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.VARROCK,Varbits.DIARY_VARROCK_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_WESTERN_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.WESTERN,Varbits.DIARY_WESTERN_HARD));
        }
        if(client.getVarbitValue(Varbits.DIARY_WILDERNESS_HARD)!=1){
            Achievements.add(new AchievementModel(Difficulty.Hard, Location.WILDERNESS,Varbits.DIARY_WILDERNESS_HARD));
        }
    }
    public void updateEliteDiaries(){
        if(client.getVarbitValue(Varbits.DIARY_ARDOUGNE_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.ARDOUGNE,Varbits.DIARY_ARDOUGNE_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_DESERT_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.DESERT,Varbits.DIARY_DESERT_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_FALADOR_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.FALADOR,Varbits.DIARY_FALADOR_ELITE));

        }
        if(client.getVarbitValue(Varbits.DIARY_FREMENNIK_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.FREMENNIK,Varbits.DIARY_FREMENNIK_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_KANDARIN_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.KANDARIN,Varbits.DIARY_KANDARIN_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_KARAMJA_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.KARAMJA,Varbits.DIARY_KARAMJA_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_KOUREND_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.KOUREND,Varbits.DIARY_KOUREND_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_LUMBRIDGE_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.LUMBRIDGE,Varbits.DIARY_LUMBRIDGE_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_MORYTANIA_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.MORYTANIA,Varbits.DIARY_MORYTANIA_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_VARROCK_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.VARROCK,Varbits.DIARY_VARROCK_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_WESTERN_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.WESTERN,Varbits.DIARY_WESTERN_ELITE));
        }
        if(client.getVarbitValue(Varbits.DIARY_WILDERNESS_ELITE)!=1){
            Achievements.add(new AchievementModel(Difficulty.Elite, Location.WILDERNESS,Varbits.DIARY_WILDERNESS_ELITE));
        }
    }

    @Override
    public String toString() {
        String result = "AchievementData{ , Achievements=";
        for(AchievementModel temp :Achievements){
            result += ",\n " +temp.toString(client);
        }
        return result+ "\n}";
    }
}
