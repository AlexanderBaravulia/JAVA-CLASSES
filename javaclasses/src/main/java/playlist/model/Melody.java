package playlist.model;

public abstract class Melody {
    private int duration;
    private String title;
    private int bitrate;
    private MusicStyle musicStyle;


    public Melody(int duration, String title, int bitrate, MusicStyle musicStyle) {
        this.duration = duration;
        this.bitrate = bitrate;
        this.musicStyle = musicStyle;
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    public MusicStyle getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(MusicStyle musicStyle) {
        this.musicStyle = musicStyle;
    }

    public abstract void playMelody();

}
