package IntrouctiontoDS.Shorting;

import java.util.Arrays;

public class SelectionShort {
    public static void main(String[] args) {
        int arr[] = {34, 56, 23, 78, 95};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
           int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[smallest])
                    smallest = j;
            }
            if (i != smallest) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
