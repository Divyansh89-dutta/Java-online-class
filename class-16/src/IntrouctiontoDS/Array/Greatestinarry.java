package IntrouctiontoDS.Array;

public class Greatestinarry {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 38, 8};
        int great = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > arr[great]) {
                great = i;
            }
        }
        System.out.println("Greatest = " + arr[great] + " found at = " + great);
    }
}
