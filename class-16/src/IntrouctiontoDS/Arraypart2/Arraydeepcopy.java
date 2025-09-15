package IntrouctiontoDS.Arraypart2;

import java.util.Arrays;

public class Arraydeepcopy {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp = arr[0];
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
