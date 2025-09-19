package IntrouctiontoDS.code;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input size
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // normalize k
        k = k % n;
        // create a temporary array
        int[] rotated = new int[n];
        // copy elements after k into front
        for (int i = 0; i < n - k; i++) {
            rotated[i] = arr[i + k];
        }
        // copy first k elements to the end
        for (int i = 0; i < k; i++) {
            rotated[n - k + i] = arr[i];
        }
        // print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
