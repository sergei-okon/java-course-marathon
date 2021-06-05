package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\AlishevMarathon\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");

        parseFileToStringList(file);

    }

    public static List<Shoes> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Shoes> shoeList = new ArrayList<>();

            File file1 = new File("shoesList");
            PrintWriter printWriter = new PrintWriter(file1);

            while (scanner.hasNext()) {
                String[] split = scanner.nextLine().split(";");
                int stockBalance = Integer.parseInt(split[2]);

                if (stockBalance == 0) {
                    shoeList.add(new Shoes(split[0], Integer.parseInt(split[1]), stockBalance));
                }
            }
            System.out.println(shoeList);
            for (Shoes sh : shoeList) {
                printWriter.print(sh + "\n");
            }
            printWriter.close();
            return shoeList;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
            return null;
        }
    }
}