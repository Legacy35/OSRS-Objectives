package org.legacy.core;

import lombok.Getter;
import org.legacy.dataProviders.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.ArrayList;

public class DataManager {

    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    @Inject
    private BankDataProvider playerBankValue;
    @Inject
    private SkillDataProvider playerSkillData;
    @Inject
    private QuestDataProvider playerQuestData;
    @Inject
    private AchievementDataProvider playerAchievementData;
    @Inject
    private CombatAchievementDataProvider playerCombatAchievementData;
    @Inject
    private MusicDataProvider playerMusicData;
    @Inject
    private BossDataProvider playerBossData;
    ArrayList<DataProvider> allPlayerData;
    int iter;
    @Getter
    private boolean isIntialized;
    @Getter
    private boolean intializationStarted;
    @Getter
    private int intializationState;
    public DataManager(){
        intializationStarted=false;
        isIntialized=false;
        intializationState=0;
    }
    public void initialize(){
        intializationStarted=true;
        iter=0;
        allPlayerData = new ArrayList<DataProvider>();
        allPlayerData.add(playerBankValue);
        allPlayerData.add(playerSkillData);
        allPlayerData.add(playerQuestData);
        allPlayerData.add(playerAchievementData);
        allPlayerData.add(playerCombatAchievementData);
        allPlayerData.add(playerBossData);
        allPlayerData.add(playerMusicData);
        initializeValues();
        isIntialized=true;
    }
    public void initializeValues(){
        log.info("Initialize values");
       for(int i=0;i<allPlayerData.size();i++){
           allPlayerData.get(i).updateValues();
       }

    }
    public void updateValues(){
        allPlayerData.get(iter).updateValues();
        iter++;
        if(iter>allPlayerData.size()-1){
            iter=0;
        }
    }
    public void printData(){
        log.info("-------Printing Player Data--------");
        for(DataProvider data:allPlayerData){
            log.info(data.serializedData());
        }
    }
}
