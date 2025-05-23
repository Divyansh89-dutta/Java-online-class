import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int a = 0; // F0
        int b = 1; // F1

        for (int i = 0; i <= 2 * n; i++) {
            if (i == 0) {
                // F0 = 0, skip since index 0 is not counted
            } else if (i == 1) {
                // F1 = 1, skip since index 1 is odd
            } else {
                int fib = a + b;
                a = b;
                b = fib;

                if (i % 2 == 0) {
                    sum += fib;
                }
            }
        }

        System.out.println(sum);
    }
}
