import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        double p = 1000, r = 5;
        int t = 3;
        double amt = p * Math.pow(1 + (r/100), t);
        System.out.println(amt);
    }
}
