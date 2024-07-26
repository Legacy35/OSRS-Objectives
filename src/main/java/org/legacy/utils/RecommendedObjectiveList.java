package org.legacy.utils;

import lombok.Getter;
import lombok.Setter;
import org.legacy.objectives.ObjectiveTags;
import org.legacy.objectives.models.Objective;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

@Setter
@Getter
public class RecommendedObjectiveList {
    int skipJobCount;
    HashMap<ObjectiveTags,Integer> subObjectiveSkipJobCount;
    ArrayList<Objective> objectiveList;
    public RecommendedObjectiveList(){
        subObjectiveSkipJobCount= new HashMap<>();
        skipJobCount=0;
        for( ObjectiveTags tag: ObjectiveTags.values()){
            subObjectiveSkipJobCount.put(tag,0);
        }
        ArrayList<Objective> objectiveList = new ArrayList<>();
    }

    public void incrementSkipJobCount() {
        skipJobCount++;
        if(skipJobCount>=objectiveList.size()){
            skipJobCount=0;
        }
    }
    public void incrementSubObjectiveSkipJobCount(ObjectiveTags tag) {
        subObjectiveSkipJobCount.put(tag,subObjectiveSkipJobCount.get(tag)+1);
        if(skipJobCount>=objectiveList.size()){
            subObjectiveSkipJobCount.put(tag,0);
        }
    }
    public Objective getReccommendedObjective(){
        if(skipJobCount>=objectiveList.size()){
            skipJobCount=0;
        }
        if(objectiveList.isEmpty()){
            return null;
        }
        return objectiveList.get(skipJobCount);
    }

    public Objective getReccommendedObjective (ObjectiveTags tag){
        if(objectiveList.isEmpty()){
            return null;
        }
        ArrayList<Objective> filteredList = (ArrayList<Objective>)objectiveList.stream()
                .filter(obj -> obj.getTags().contains(tag))
                .collect(Collectors.toList());
        if(filteredList.isEmpty()){
            return null;
        }
        return filteredList.get(subObjectiveSkipJobCount.get(tag));
    }
    //TODO: Consider the list changes and new things are added before Skip job, Consider new things are added after skip job. In left scenario do we want to reset or move those to the new front?
    //TODO: There should be a config for if Skips get reset when the client resets.
}
