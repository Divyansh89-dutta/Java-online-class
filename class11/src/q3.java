import java.math.BigInteger;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger fact = new BigInteger("1"); // Corrected constructor syntax

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i)); // Better approach
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}