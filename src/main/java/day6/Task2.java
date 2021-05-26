package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2010, 29, 41140);

        airplane.setYear(2018);
        airplane.setLength(32);
        airplane.fillUp(20000);
        airplane.fillUp(3830);
        airplane.info();
    }
}
