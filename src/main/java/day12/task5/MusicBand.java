package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtists;

    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        for (MusicArtist members : musicBandA.getMembers()) {
            musicBandB.getMembers().add(members);
        }
        musicBandA.getMembers().clear();
        {
            System.out.println(musicBandB);
        }
    }

    public void printMembers() {
        System.out.println(name + " Участники группы" + musicArtists);
    }

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musicArtists=" + musicArtists +
                '}';
    }
}
