package IntrouctiontoDS.Array;

import java.util.Arrays;

public class SortedArray {
    public static void sortArray(int[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 38, 8};
        System.out.println("Original Array: " + Arrays.toString(arr));
        sortArray(arr);
    }
}
