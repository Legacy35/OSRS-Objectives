package org.legacy.data;

import net.runelite.client.config.ConfigManager;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.models.BossModel;
import org.legacy.utils.Boss;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.HashMap;

public class BossData extends Data{
    @Inject
    private ConfigManager configManager;
    private static HashMap<Boss, BossModel> bossMap = new HashMap<>();
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    @Override
    public void updateValues() {
        for(Boss boss : Boss.values()) {
            if (!bossMap.containsKey(boss)){
                bossMap.put(boss,new BossModel(boss));
            }
            log.info(boss.getUnformattedName()+" : "+ boss.name());
            if(boss.isHasKC()){
                int kc;
                try {
                    kc = configManager.getRSProfileConfiguration("killcount", boss.getUnformattedName().toLowerCase(), int.class);
                }catch(Exception e){
                    kc = 0;
                }
                log.info("kc: "+kc);
                bossMap.get(boss).setKillCount(kc);
            }
            double pb;
            try {
                pb = configManager.getRSProfileConfiguration("personalbest", boss.getUnformattedName().toLowerCase(), double.class);
            }catch(Exception e){
                pb = -1;
            }
            log.info("pb: "+pb);
            bossMap.get(boss).setPersonalBest(pb);

        }
    }

    @Override
    public String serializedData() {
        StringBuilder result= new StringBuilder("Boss Data{\n");
        for(BossModel boss:bossMap.values()){
            result.append(boss).append("\n");
        }
        return result.append("\n}").toString();
    }

    public static BossModel getBossData(Boss boss){
        return bossMap.get(boss);
    }

}
