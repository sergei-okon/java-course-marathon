package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorCount;

        try {
            floorCount = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Ошибка ввода");
        }

        if (floorCount >= 1 && floorCount <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount >= 5 && floorCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorCount >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
