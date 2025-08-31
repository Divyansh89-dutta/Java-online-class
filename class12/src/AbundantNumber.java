import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int num = sc.nextInt();
        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum is greater than the number
        if (sum > num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
