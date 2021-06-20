package day18;

public class Task1 {
    private static int counter;

    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        System.out.println(recursionSum(0, numbers)); // 65346

    }

    public static int recursionSum(int n, int[] x) {
        if (n == (x.length - 1))
            return x[n];

        return x[n] + recursionSum(n + 1, x);
    }
}


