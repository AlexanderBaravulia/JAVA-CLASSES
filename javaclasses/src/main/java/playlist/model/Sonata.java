package playlist.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Sonata extends Melody {
    private String composer;
    private final MusicStyle musicStyle = MusicStyle.CLASSIC;
    Logger log = LogManager.getLogger(Sonata.class);

    public Sonata(int duration, String title, int byterate, String composer){
        super(duration, title, byterate, MusicStyle.CLASSIC);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public MusicStyle getMusicStyle() {
        return musicStyle;
    }

    public void playMelody() {
        log.info("Sonata is playing by " +composer);
    }
}
