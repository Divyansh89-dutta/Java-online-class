package IntrouctiontoDS.Array;

public class secondgreatestinarry {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 38, 8};
        int first = arr[0], second = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("Greatest = " + first);
        System.out.println("Second Greatest = " + second);
    }
}
