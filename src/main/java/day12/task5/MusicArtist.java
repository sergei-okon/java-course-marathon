package day12.task5;

public class MusicArtist {
    private String nameSurname;
    private int age;

    public MusicArtist(String name, int age) {
        this.nameSurname = name;
        this.age = age;
    }

    public String getName() {
        return nameSurname;

    }

    public void setName(String name) {
        this.nameSurname = name;
    }

    @Override
    public String toString() {
        return "" +
                "nameSurname='" + nameSurname + '\'' +
                '}';
    }
}

