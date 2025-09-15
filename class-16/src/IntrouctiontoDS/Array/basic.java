package IntrouctiontoDS.Array;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements: " + Arrays.toString(arr));

        sc.close();
    }
}
