package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("NumericT16");

        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        int[] number = new int[numbersString.length];
        int counter = 0;
        int sum = 0;
        double average;

        for (String a : numbersString) {
            number[counter++] = Integer.parseInt(a);
        }

        for (int s : number) {
            sum = sum + s;
        }
        average = (double) sum / number.length;

        System.out.println("Массив из файла" + Arrays.toString(number));
        System.out.println("Среднее арифметическое " + average + "-->" + Math.round(average * 1000.00) / 1000.0);
    }
}