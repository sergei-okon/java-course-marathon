package day8;

public class Task1 {
    public static void main(String[] args) {
        String str1 = new String();
        StringBuilder str2 = new StringBuilder(new String());

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            str1 = str1 + " " + i;
        }
        System.out.println(str1);
        long stopTime = System.currentTimeMillis();

        System.out.println("_____________________________________________________________________________________\n");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            str2.append(" ").append(i);
        }
        System.out.println(str2);

        long stopTime2 = System.currentTimeMillis();

        System.out.println("Время выполнения первого метода " + (stopTime - startTime) + " милисенкунд.");
        System.out.println("Время выполнения второго метода " + (stopTime2 - startTime2) + " милисенкунд.");
    }
}