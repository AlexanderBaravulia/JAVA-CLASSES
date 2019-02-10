package playlist.model;

public class Melody {
    private int duration;
    private int sizebytes;
    private int bitrate;
    private MusicStyle musicStyle;

    public Melody(int duration, int sizebytes, int bitrate, MusicStyle musicStyle) {
        this.duration = duration;
        this.sizebytes = sizebytes;
        this.bitrate = bitrate;
        this.musicStyle = musicStyle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSizebytes() {
        return sizebytes;
    }

    public void setSizebytes(int sizebytes) {
        this.sizebytes = sizebytes;
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


}
