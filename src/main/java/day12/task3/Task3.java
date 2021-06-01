package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("AC/DC", 1973);
        MusicBand musicBand2 = new MusicBand("Nazareth", 1968);
        MusicBand musicBand3 = new MusicBand("Animals", 1962);
        MusicBand musicBand4 = new MusicBand("Rolling Stones", 1962);
        MusicBand musicBand5 = new MusicBand("Beatles", 1960);
        MusicBand musicBand6 = new MusicBand("Uma2rman", 2003);
        MusicBand musicBand7 = new MusicBand("Aftermath", 2004);
        MusicBand musicBand8 = new MusicBand("Cascada", 2004);
        MusicBand musicBand9 = new MusicBand("НеАнгелі", 2006);
        MusicBand musicBand10 = new MusicBand("Потап и Настя:)", 2006);

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand10);

        System.out.println(musicBandList);
        System.out.println();
        Task3.groupsAfter2000(musicBandList);

    }

    public static void groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandAfter2000 = new ArrayList<>();

        for (MusicBand band : bands)
            if (band.getYear() >= 2000) {
                musicBandAfter2000.add(band);
            }
        System.out.println(musicBandAfter2000);
    }
}
