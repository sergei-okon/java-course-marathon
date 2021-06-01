package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist musicArtist1 = new MusicArtist("Sergei Poliakov", 43);
        MusicArtist musicArtist2 = new MusicArtist("Bon Scot", 18);
        MusicArtist musicArtist3 = new MusicArtist("Katy Chesko", 44);
        MusicArtist musicArtist4 = new MusicArtist("Ann Revko", 25);

        List<MusicArtist> membersList1 = new ArrayList<>(Arrays.asList(musicArtist1, musicArtist2));
        List<MusicArtist> membersList2 = new ArrayList<>(Arrays.asList(musicArtist3, musicArtist4));

        MusicBand musicBandA = new MusicBand("ACDC", 1973, membersList1);

        MusicBand musicBandB = new MusicBand("Animals", 1962, membersList2);

        musicBandA.printMembers();
        musicBandB.printMembers();

        System.out.println();

        MusicBand.transferMembers(musicBandA, musicBandB);

        System.out.println("После слияния");

        musicBandA.printMembers();
        musicBandB.printMembers();
    }
}
