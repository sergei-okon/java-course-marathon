package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0) {
                System.out.println(x + " + " + y + " ваш ввод в консоль\n" +
                        "работа программы завершается");
                break;

            } else
                System.out.println(x + "   " + y + " ваш ввод в консоль\n" +
                        x / y + "-ответ программы");
        }

    }
}
