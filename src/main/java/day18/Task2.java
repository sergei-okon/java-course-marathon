package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237)); // 5

    }

    public static int count7(int x) {
        if (x == 0)
            return 0;

        if (x % 10 == 7) {
            return 1 + count7(x / 10);

        } else
            return count7(x / 10);
    }
}
