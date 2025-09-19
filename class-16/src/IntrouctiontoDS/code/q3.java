package IntrouctiontoDS.code;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input array size
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // initialize first and second greatest
        int firstMax = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        // traverse the array
        for (int num : arr) {
            if (num > firstMax) { // update second
                secondMax = num;  // update first
            } else if (num > secondMax && num < firstMax) {
                secondMax = num; // update only second
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second greatest element does not exist!");
        } else {
            System.out.println("Second greatest element = " + secondMax);
        }
    }
}
