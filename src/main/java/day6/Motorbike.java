package day6;

public class Motorbike {
    private int age;
    private String color;
    private String model;

    void info() {
        System.out.println("Это мотоцикл");
    }

    int x;

    int yearDifference(int inputYear) {
        if (inputYear < age) {
            System.out.println("Введен неправильный год");
        } else
            x = inputYear - age;
        return x;
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
