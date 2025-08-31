import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            count++;
            n = n / 10;
        }
        n = temp;
        long sq = n *n;
        long lastDigits = sq % (long) Math.pow(10, count);
        System.out.println(lastDigits ==n ? "Auto" : "Not Auto");
    }
}
