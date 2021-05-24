package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while (i != 5) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if ((int) y == 0) {
                System.out.println(x + " и " + y + " ваш ввод в консоль\n" +
                        "Деление на 0 запрещено - ответ программы");
                continue;
            }
            System.out.println(x + " и " + y + " ваш ввод в консоль\n" +
                    "x / y = " + x / y + " - ответ программы");
            i++;
        }
    }
}
