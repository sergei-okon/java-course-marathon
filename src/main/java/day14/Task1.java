package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("NumericT14");

        printSumDigits(file);
    }

    static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Integer> numeric = new ArrayList<Integer>();
            Integer sum = 0;
            while (scanner.hasNext()) {
                numeric.add(scanner.nextInt());
            }
            if (numeric.size() != 10) {
                throw new IOException();
            } else
                for (Integer a : numeric) {
                    sum = sum + a;
                }
            System.out.println(numeric);
            System.out.println("Сумма чисел в файле " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
