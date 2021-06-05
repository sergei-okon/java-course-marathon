package day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");

        parseFileToStringList(file);
    }

    static List<Person> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Person> personList = new ArrayList<>();

            while (scanner.hasNext()) {
                String[] personData = scanner.nextLine().split(" ");
                int age = Integer.parseInt(personData[1]);

                if (age > 0) {
                    personList.add(new Person(personData[0], age));

                } else {
                    throw new IOException();
                }
            }
            System.out.println(personList);
            return personList;

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

