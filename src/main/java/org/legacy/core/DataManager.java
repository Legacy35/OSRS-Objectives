package org.legacy.core;

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
    public DataManager(){

    }
    public void initialize(){
        updateValues();
    }
    public void updateValues(){
        playerBankValue.updateValues();
        playerSkillData.updateValues();
        playerQuestData.updateValues();
        playerAchievementData.updateValues();
        playerCombatAchievementData.updateValues();
    }
    public void printData(){
        log.info("-------Printing Player Data--------");
        log.info(""+ playerBankValue);
        log.info(""+ playerSkillData);
        log.info(""+ playerQuestData);
        log.info(""+ playerAchievementData);
        log.info(""+ playerCombatAchievementData);
    }
}
