import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int num = sc.nextInt();
        int sum = 0, temp = num;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        // Check if number is divisible by sum of digits
        if (num % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
