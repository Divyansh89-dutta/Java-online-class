import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n!=0){
            int lastDigit = n%10;
            int fact = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
            sum = sum + fact;
            n = n/10;
        }
        n = temp;
        System.out.println(sum == n ? "Strong" : "Not Strong");
    }
}
