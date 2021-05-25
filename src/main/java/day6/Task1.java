package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(2014);
        car.setColor("Grey");
        car.setModel("Ford");

        car.info();

        int y = car.yearDifference(2021);
        System.out.println("Разницу между переданным годом и годом выпуска авто " + y + " лет" + "\n");

        Motorbike motorbike = new Motorbike(2005, "black", "Honda");

        motorbike.info();

        int z = motorbike.yearDifference(2021);
        System.out.println("Разницу между переданным годом и годом выпуска мотоцикла " + z + " лет");


    }
}
