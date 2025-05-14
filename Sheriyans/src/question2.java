import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String a = sc.next();
        System.out.print("Enter Your Age: ");
        int b = sc.nextInt();
        System.out.println(a + " " + b);
        sc.close();
    }
}
