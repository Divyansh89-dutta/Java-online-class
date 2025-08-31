import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;

        // Find HCF by checking every number from 1 to min(a, b)
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        // Print HCF
        System.out.println(hcf);
    }
}
