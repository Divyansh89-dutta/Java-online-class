package IntrouctiontoDS.code;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // store first element
        int first = arr[0];
        // shift element left by one
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // place first element at the end
        arr[n - 1] = first;
        // print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
