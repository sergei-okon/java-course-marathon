package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Java\\AlishevMarathon\\JavaMarathon2021\\src\\main\\resources\\numbers19.txt");

        numbersArrayList(file);

        numbersHashMap(file);
    }

    static public void numbersArrayList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Integer> numeric = new ArrayList<>();
            int counter = 0;

            while (scanner.hasNext()) {
                numeric.add(scanner.nextInt());
            }

            for (Integer a : numeric) {
                if (a > 500_000_000 && a < 600_000_000)
                    counter++;
            }
            System.out.println("Кол-во чисел " + counter);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    static public void numbersHashMap(File file) {
        try {
            Scanner scanner = new Scanner(file);
            Map<Integer, Integer> num = new HashMap<>();
            int count = 0;

            while (scanner.hasNext()) {
                num.put(scanner.nextInt(), 0);
            }
            for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
                if (entry.getKey() > 500_000_000 && entry.getKey() < 600_000_000) {
                    count++;
                }
            }
            System.out.println("Кол-во чисел " + count);
            System.out.println(num);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}


