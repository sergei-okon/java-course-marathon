package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> membersList1 = new ArrayList<>(Arrays.asList("Sergei Poliakov", "Bon Scot"));

        List<String> membersList2 = new ArrayList<>(Arrays.asList("Katy Chesko", "Ann Revko"));

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
