package org.legacy.dataProviders.dataModels;

import lombok.Getter;
import lombok.Setter;
import org.legacy.utils.DataProviderUtils;

@Getter
public class MusicModel{
    private String trackName;
    private String trackNameForSorting;
    private String trackNameFormatted;
    private String trackUrl;
    private int midiId;
    private boolean ignored;
    private int varpIndex;
    private int varpBitIndex;
    @Setter
    private boolean completed;
    public MusicModel(String trackName, String trackNameForSorting, int midiId,boolean ignored,int varpIndex, int varpBitIndex){
        this.trackName = trackName;
        this.trackNameForSorting = trackNameForSorting;
        this.midiId = midiId;
        this.varpIndex = varpIndex;
        this.varpBitIndex=varpBitIndex;
        this.ignored=ignored;
        trackNameFormatted = trackName.replaceAll("[^a-zA-Z0-9 ]", "").toUpperCase().replace(' ', '_');
        trackUrl= "https://oldschool.runescape.wiki/w/"+DataProviderUtils.encodeString(trackName.replaceAll(" ", "_"));
        completed=false;
    }

    @Override
    public String toString() {
        return "MusicModel{" +
                "trackName='" + trackName + '\'' +
                ", trackURL='" + trackUrl + '\'' +
         //       ", trackNameFormatted='" + trackNameFormatted + '\'' +
          //      ", midiId=" + midiId +
          //      ", ignored=" + ignored +
           //     ", varpIndex=" + varpIndex +
           //     ", varpBitIndex=" + varpBitIndex +
                ", completed=" + completed +
                '}';
    }
}
