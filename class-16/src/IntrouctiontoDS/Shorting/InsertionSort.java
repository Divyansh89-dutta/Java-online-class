package IntrouctiontoDS.Shorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {34, 56, 23, -78, 78, 95, -1};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i-1;
            int key = arr[i];
            while (j >=0 && arr[j] > key)
                arr[j+1] = arr[j--];
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
