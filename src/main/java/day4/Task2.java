package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            int min = 0;
            int max = 10000;
            Random random = new Random();
            int randomNumber = random.nextInt(max - min) + min;

            array[i] = randomNumber;
        }

        int max = array[0];
        int min = array[0];
        int countOfEndsZero = array[0];
        int sumOfEndsZero = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] % 10 == 0) {
                countOfEndsZero++;
            }

            if (array[i] % 10 == 0) {
                sumOfEndsZero += array[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(countOfEndsZero);
        System.out.println(sumOfEndsZero);
        System.out.println(Arrays.toString(array));
    }
}
