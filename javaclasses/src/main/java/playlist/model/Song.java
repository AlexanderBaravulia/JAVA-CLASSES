package playlist.model;

public class Song extends Melody {
    private String author;
    private String singer;

    public Song(int duration, int sizebytes, int bitrate, String author, String singer, MusicStyle musicStyle){
        super (duration, sizebytes, bitrate, musicStyle);
        this.author = author;
        this.singer = singer;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }




}
