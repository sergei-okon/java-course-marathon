package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");

        parseFileToStringList(file);
    }

    public static List<String> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            Scanner scanner1 = new Scanner(file);
            List<String> peopleData = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String[] personData = scanner.nextLine().split(" ");
                if (Integer.parseInt(personData[1]) < 0) {
                    throw new IOException();

                } else
                    while (scanner1.hasNextLine())
                        peopleData.add(scanner1.nextLine());
            }
            System.out.println(peopleData);
            return peopleData;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            e.printStackTrace();
        }
        return null;
    }
}