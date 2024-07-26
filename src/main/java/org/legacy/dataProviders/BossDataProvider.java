package org.legacy.dataProviders;

import net.runelite.client.config.ConfigManager;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.dataProviders.dataModels.BossModel;
import org.legacy.utils.Boss;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.HashMap;

public class BossDataProvider extends DataProvider {
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
            if(boss.isHasKC()){
                int kc;
                try {
                    kc = configManager.getRSProfileConfiguration("killcount", boss.getUnformattedName().toLowerCase(), int.class);
                }catch(Exception e){
                    kc = 0;
                }
                bossMap.get(boss).setKillCount(kc);
            }
            double pb;
            try {
                pb = configManager.getRSProfileConfiguration("personalbest", boss.getUnformattedName().toLowerCase(), double.class);
            }catch(Exception e){
                pb = -1;
            }
            bossMap.get(boss).setPersonalBest(pb);
        }
    }

    @Override
    public String serializedData() {
        StringBuilder result= new StringBuilder("Boss Data{\n");
        for(BossModel boss:bossMap.values()){
            result.append(boss).append("\n");
        }
        return result.append("}").toString();
    }

    public static BossModel getBossData(Boss boss){
        return bossMap.get(boss);
    }

}
