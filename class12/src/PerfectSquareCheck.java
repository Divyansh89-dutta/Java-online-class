import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int num = sc.nextInt();

        // Calculate square root
        int sqrt = (int) Math.sqrt(num);

        // Check if square of sqrt equals num
        if (sqrt * sqrt == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
