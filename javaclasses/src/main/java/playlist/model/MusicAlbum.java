package playlist.model;

import java.util.ArrayList;
import java.util.List;

public class MusicAlbum {
    private List<Melody> melodyList;

    public MusicAlbum (List<Melody> melodyList){
        this.melodyList = melodyList;
    }

    public List<Melody> getMelodyList(){
        return melodyList;
    }

    public void setMelodyList(List<Melody> melodyList){
        this.melodyList=melodyList;
    }

    public void burnNewMelody(Melody melody){
        melodyList.add(melody);
    }

    public int getTimeDuration(){
        int timeSize = 0;
        for (Melody melody : melodyList){
            timeSize += melody.getDuration();
        }
        return timeSize;
    }

    public List<Melody> getMelodyListByStyle(MusicStyle style){
        List<Melody> melodies = new ArrayList<Melody>();
        for (Melody melody : melodyList){
            if (melody.getMusicStyle().equals(style)){
                melodies.add(melody);
            }
        }
        return melodies;
    }


}
