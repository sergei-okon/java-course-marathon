package day12.task4;

import day12.task5.MusicArtist;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    static void transferMembers(MusicBand musicBand1A, MusicBand musicBand1B) {
        for (String members : musicBand1A.getMembers()) {
            musicBand1B.getMembers().add(members);
        }
        musicBand1A.getMembers().clear();
        {
            System.out.println(musicBand1B);
        }
    }

    public void printMembers() {
        System.out.println(name+members);
    }

    public List<String> getMembers() {
        return members;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
