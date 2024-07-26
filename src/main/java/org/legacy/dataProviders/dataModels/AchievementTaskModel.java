package org.legacy.dataProviders.dataModels;


import lombok.Getter;
import lombok.Setter;
import org.legacy.core.ObjectivesPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AchievementTaskModel {
    @Getter
    private final int offset;
    @Getter
    private final String type;
    @Getter
    private final int varId;
    @Getter
    private final int value;
    @Getter@Setter
    private boolean completed;
    @Getter@Setter
    private int id; //non-Unique
    @Getter
    private String name;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);

    public AchievementTaskModel(int offsetOrValue, String type, int varId, String name){
        this.varId =varId;
        this.type=type;
        this.name = name;
        if(type.equals("player")){
            offset=offsetOrValue;
            value=-1;
        }else if(type.equals("bits")){
            value=offsetOrValue;
            offset=-1;
        }else{
            log.error("Attempted to Create an invalid Achievement Task Model of type:"+type);
            offset=-1;
            value=-1;
        }
    }
    public AchievementTaskModel(int offsetOrValue, String type, int varId){
        this.varId =varId;
        this.type=type;
        this.name = "TO BE NAMED";
        if(type.equals("player")){
            offset=offsetOrValue;
            value=-1;
        }else if(type.equals("bits")){
            value=offsetOrValue;
            offset=-1;
        }else{
            log.error("Attempted to Create an invalid Achievement Task Model of type:"+type);
            offset=-1;
            value=-1;
        }
    }
    public int getOffsetOrValue(){
        return offset==-1? value : offset;
    }

    @Override
    public String toString() {
        return "AchievementTaskModel{" +
                //"offset=" + offset +
                //", type='" + type + '\'' +
                ", varId=" + varId +
                //", value=" + value +
                ", completed=" + completed +
                '}';
    }
}
