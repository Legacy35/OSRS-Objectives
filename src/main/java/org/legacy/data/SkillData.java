package org.legacy.data;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.models.QuestModel;
import org.legacy.models.SkillModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class SkillData extends Data{
    @Inject
    private Client client;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    private static ArrayList<SkillModel> playerSkills = new ArrayList<SkillModel>();
    public static int playerCmbLvl;
    public SkillData(){
    }
    public void updateValues() {
        this.playerSkills.clear();
        for(Skill skill :Skill.values()){
            this.playerSkills.add(new SkillModel(skill,client));
        }
        playerCmbLvl =client.getLocalPlayer().getCombatLevel();
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
    @Override
    public String toString() {
        String result= "SkillData{ playerSkills=";
        for(SkillModel temp :playerSkills){
            result += ",\n " +temp;
        }
        return result+ "\n}";
    }
}
