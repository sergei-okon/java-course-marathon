package day6;

public class Motorbike {
    private int age;
    private String color;
    private String model;

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear) {
        return Math.abs(inputYear - age);
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Motorbike(int age, String color, String model) {
        this.age = age;
        this.color = color;
        this.model = model;
    }
}
