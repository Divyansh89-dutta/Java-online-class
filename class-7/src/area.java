import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        int n = sc.nextInt();
        double amount = p * Math.pow(1 + (r / n), n * t);
        System.out.println(amount);
        sc.close();
    }
}