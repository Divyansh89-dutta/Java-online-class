package IntrouctiontoDS.Array;

import java.util.Scanner;

public class Sumofarrayelements {
    public static void main(String[] args) {
//        Method one
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value : ");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println("Sum = " + sum);
//        System.out.println("Avg = " + (double)sum / size);
//        Method two
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value here: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + (double)sum / size);
    }
}
