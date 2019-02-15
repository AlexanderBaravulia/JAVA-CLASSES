package playlist.runner;

import playlist.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        Melody melody1 = new Song(175, "Shape of my heart", 144, "Sting", "Sting", MusicStyle.POP);
        Melody melody2 = new Song(250, "Californication", 256, "Red hot chili peppers", "Red hot chili peppers", MusicStyle.ROCK);
        Melody melody3 = new Song(144, "Angie", 256, "The Rolling Stones", "The Rolling Stones", MusicStyle.JAZZ);
        Melody melody4 = new Sonata(675, "Moonlight Sonata", 512, "Beethoven");
        List<Melody> melodies = new ArrayList<Melody>();
        melodies.add(melody1);
        melodies.add(melody2);
        melodies.add(melody3);
        MusicAlbum musicAlbum = new MusicAlbum(melodies);
        musicAlbum.burnNewMelody(melody4);
        musicAlbum.getMelodyList();

        System.out.println("Tine duration : " + musicAlbum.getTimeDuration());
        musicAlbum.getMelodyList().get(0).playMelody();

        musicAlbum.getMelodyListByStyle(MusicStyle.ROCK);
        musicAlbum.getMelodyListByDuration(160, 300);


    }


}
