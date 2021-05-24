package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setAge(2014);
        myCar.setColor("Grey");
        myCar.setModel("Ford Fusion");

        System.out.println("Модель авто " + myCar.getModel());
        System.out.println("Цвет " + myCar.getColor());
        System.out.println("Год выпуска " + myCar.getAge());
    }
}
