import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square = square / 10;
        }
        if (sum == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
