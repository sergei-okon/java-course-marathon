package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1");
        PrintWriter printWriter = new PrintWriter(file1);

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            printWriter.println(random.nextInt(100));
        }
        printWriter.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2");

        PrintWriter printWriter1 = new PrintWriter(file2);
        int counter = 0;
        double sum = 0;
        int stepSum = 20;

        while (scanner.hasNextLine()) {
            sum = sum + Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter % stepSum == 0) {
                printWriter1.print(sum / stepSum + "\n");
                sum = 0;
            }
        }
        printWriter1.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {

        Scanner scanner2 = new Scanner(file);
        double result = 0.0;
        while (scanner2.hasNextLine()) {
            result = result + Double.parseDouble(scanner2.nextLine());
        }
        System.out.println((int) result);
    }
}