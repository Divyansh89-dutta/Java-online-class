import java.util.Scanner;

public class Swapping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the FirstNumber: ");
        int a = sc.nextInt();
        System.out.print("Enter the SecNumber: ");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        sc.close();

    }
}
