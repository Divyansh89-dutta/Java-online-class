package onlinecode;

import java.util.Scanner;

public class StrongNumberSimple {
   public static int factorial(int n){
       int fact = 1;
       for (int i = 1; i <= n; i++) {
           fact *= i;
       }
       return fact;
   }

    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // Number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(isStrong(N));
        }
    }
}
