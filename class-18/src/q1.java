import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3]; // row 0 has 3 cols
        arr[1] = new int[2]; // row 1 has 2 cols
        arr[2] = new int[4]; // row 2 has 4 cols

        // fill values
        int val = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = val++;
            }
        }

        // print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


