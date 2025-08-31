public class q8 {
    public static void main(String[] args) {
        int n = 1231243;
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n = n / 10;
            }
            n = sum;
            System.out.println(n);
        }
        System.out.println(n);
    }
}
