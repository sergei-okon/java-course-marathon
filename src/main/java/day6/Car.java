package day6;

public class Car {
    private int age;
    private String color;
    private String model;

    public Car() {
    }

    void info() {
        System.out.println("Это автомобиль");
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
