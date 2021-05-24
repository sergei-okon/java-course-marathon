package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            int min = 0;
            int max = 10000;
            Random random = new Random();
            int randomNumber = random.nextInt(max - min) + min;

            array[i] = randomNumber;
        }
        int maxSum = 0;
        int maxThreeElementsSumIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length < (i + 3)) {
                break;
            }
            int threeElementsSum = array[i] + array[i + 1] + array[i + 2];
            if (maxSum < threeElementsSum) {
                maxSum = threeElementsSum;
                maxThreeElementsSumIndex = i;
            }
        }
        System.out.println("ОТВЕТ: " + maxSum);
        System.out.println("Индекс певого значения наибольшей тройки:" + maxThreeElementsSumIndex);
        System.out.println(Arrays.toString(array));
    }
}
