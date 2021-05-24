package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int sum = 0;
        int countNumbersMoreEight = 0;
        int countOfOneNumbers = 0;
        int countOfEvenNumbers = 0;
        int countOfNotEvenNumbers = 0;

        for (int i : array) {
            sum = sum + i;
            if (i > 8) {
                countNumbersMoreEight++;
            }
            if (i == 1) {
                countOfOneNumbers++;
            }
            if (i % 2 == 0) {
                countOfEvenNumbers++;
            } else {
                countOfNotEvenNumbers++;
            }
        }
        System.out.println("Количество чисел больше 8: " + countNumbersMoreEight);
        System.out.println("Количество чисел равных 1: " + countOfOneNumbers);
        System.out.println("Количество четных чисел:" + countOfEvenNumbers);
        System.out.println("Количество нечетных чисел:" + countOfNotEvenNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("Длина массива: " + array.length);
        System.out.println(Arrays.toString(array));
    }
}




