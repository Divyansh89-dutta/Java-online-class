package IntrouctiontoDS.code;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input size
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // revers in-place using two pointers
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        // print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
