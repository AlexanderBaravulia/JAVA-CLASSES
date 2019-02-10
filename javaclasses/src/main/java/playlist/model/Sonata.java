package playlist.model;

public class Sonata extends Melody {
    private String composer;
    private final MusicStyle musicStyle = MusicStyle.CLASSIC;

    public Sonata(int duration, int bytesize, int byterate, String composer){
        super(duration, bytesize, byterate, MusicStyle.CLASSIC);
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
}
