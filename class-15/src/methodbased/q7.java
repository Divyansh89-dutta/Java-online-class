package methodbased;

public class q7 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("7 is Prime? " + isPrime(7));
        System.out.println("12 is Prime? " + isPrime(12));
    }
}
