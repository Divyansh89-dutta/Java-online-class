package IntrouctiontoDS.code;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 -i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(rev[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
