package org.legacy.core;

import lombok.Getter;
import org.legacy.data.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class DataManager {

    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    @Inject
    private BankData playerBankValue;
    @Inject
    private SkillData playerSkillData;
    @Inject
    private QuestData playerQuestData;
    @Inject
    private AchievementData playerAchievementData;
    @Inject
    private CombatAchievementData playerCombatAchievementData;
    @Inject
    private BossData playerBossData;
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
        updateValues();
        intializationStarted=true;
        isIntialized=true;
    }
    public void updateValues(){
        playerBankValue.updateValues();
        playerSkillData.updateValues();
        playerQuestData.updateValues();
        playerAchievementData.updateValues();
        playerCombatAchievementData.updateValues();
        playerBossData.updateValues();

    }
    public void printData(){
        log.info("-------Printing Player Data--------");
        log.info(""+ playerBankValue.serializedData());
        log.info(""+ playerSkillData.serializedData());
        log.info(""+ playerQuestData.serializedData());
        log.info(""+ playerAchievementData.serializedData());
        log.info(""+ playerCombatAchievementData.serializedData());
        log.info(""+ playerBossData.serializedData());
    }
}
