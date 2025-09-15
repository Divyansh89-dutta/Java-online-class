package IntrouctiontoDS.Arraypart2;

import java.util.Arrays;

public class leftroatearraybyk {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 1;

        k = k % n; // optimize: rotating more than n is same as rotating k%n times

        while (k-- > 0) {
            int temp = arr[0]; // store first element
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1]; // shift left
            }
            arr[n - 1] = temp; // put first element at end
        }

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
