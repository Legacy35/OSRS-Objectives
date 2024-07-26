package org.legacy.objectives.models;

import net.runelite.api.QuestState;
import org.legacy.core.ObjectivesPlugin;
import org.legacy.dataProviders.MusicDataProvider;
import org.legacy.dataProviders.QuestDataProvider;
import org.legacy.dataProviders.dataModels.MusicModel;
import org.legacy.objectives.ObjectiveTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MusicObjective extends Objective{
    MusicModel musicTrack;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public MusicObjective(MusicModel musicTrack) {
        super("Unlock music track: "+musicTrack.getTrackName(), "Go to :"+musicTrack.getTrackUrl()+" for more information", 1, "MUSIC-"+musicTrack.getTrackNameFormatted());
        this.musicTrack=musicTrack;
        addTag(ObjectiveTags.MUSIC);
    }

    @Override
    public void updateCompletedValue() {
        MusicModel temp = MusicDataProvider.getMusicTrack(musicTrack.getTrackNameFormatted());
        if(temp== null) {
            log.error("Failed to find "+musicTrack);
            setObjectiveCompleted(false);
            return;
        }
        if(temp.isCompleted()){
            setObjectiveCompleted(true);
            return;
        }
        setObjectiveCompleted(false);
    }
}
