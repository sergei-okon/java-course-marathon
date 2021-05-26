package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing 737", 2010, 29, 41140);
        Airplane airbus = new Airplane("Airbus A320", 2018, 37, 41140);

        Airplane.compareAirplanes(boeing, airbus);
    }
}