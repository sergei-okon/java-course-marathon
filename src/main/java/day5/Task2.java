package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2015, "Green", "Honda");

        System.out.println("Bike model  " + motorbike.getModel());
        System.out.println("Bike age " + motorbike.getAge());
        System.out.println("Bike color " + motorbike.getColor());
    }
}
