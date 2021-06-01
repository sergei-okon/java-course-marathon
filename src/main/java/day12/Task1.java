package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("Ford");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Ferrari");
        car.add("Opel");
        System.out.println(car);

        car.add(2,"Chevrolet");

        System.out.println(car);

        car.remove(0);

        System.out.println(car);

    }
}
