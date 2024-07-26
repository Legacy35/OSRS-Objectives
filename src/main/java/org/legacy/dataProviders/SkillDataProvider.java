package org.legacy.dataProviders;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.dataProviders.dataModels.SkillModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class SkillDataProvider extends DataProvider {
    @Inject
    private Client client;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    private static ArrayList<SkillModel> playerSkills = new ArrayList<SkillModel>();
    public static int playerCmbLvl;
    public SkillDataProvider(){
    }
    public void updateValues() {
        this.playerSkills.clear();
        for(Skill skill :Skill.values()){
            this.playerSkills.add(new SkillModel(skill,client));
        }
        playerCmbLvl =client.getLocalPlayer().getCombatLevel();
    }

    @Override
    public String serializedData() {
        StringBuilder result= new StringBuilder("Skill Data{\nCMB Lvl: "+playerCmbLvl+"\n");
        for(SkillModel skill : playerSkills){
            result.append(skill).append("\n");
        }
        return result.append("}").toString();
    }

    public static SkillModel getSkill(Skill targetSkill){
        for (SkillModel skill :playerSkills){
            if(skill.getSkill()==targetSkill){
                return skill;
            }
        }
        log.error("SkillData.getSkill() got "+targetSkill);
        return null;
    }
}
