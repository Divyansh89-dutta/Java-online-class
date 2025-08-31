import java.util.Scanner;

public class q10 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();

    int a = 0, b = 1;

    for (int i = 0; i < n; i++) {
        System.out.print( a);
        int next = a + b;
        a = b;
        b = next;
    }
}}

