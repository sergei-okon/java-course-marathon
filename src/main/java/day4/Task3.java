package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int n = 12;
        int m = 8;
        int[][] arr = new int[n][m];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] arrayOfSums = new int[arr.length];

        for (int row = 0; row < arr.length; row++) {
            int sumRow = 0;
            for (int element : arr[row]) {
                sumRow += element;
            }
            arrayOfSums[row] = sumRow;
        }

        for (int i = 0; i < arrayOfSums.length; i++) {
            System.out.println(arrayOfSums[i]);
        }

        int maxRow = 0;
        int maxRowIndex = 0;
        for (int i = 0; i < arrayOfSums.length; i++) {
            if (arrayOfSums[i] > maxRow) {
                maxRow = arrayOfSums[i];
                maxRowIndex = i;
            }
        }
        System.out.println("Максимальное значение строки " + maxRow + " Индекс строки " + maxRowIndex
                + " Порядковый номер строки " + (maxRowIndex + 1));
    }
}
