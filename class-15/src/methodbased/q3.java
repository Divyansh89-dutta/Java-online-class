package methodbased;

public class q3 {
    public static void checkEvenOdd(int n){
        if (n % 2== 0)
            System.out.println(n + " is Even");
         else
            System.out.println(n + " is Odd");
    }

    public static void main(String[] args) {
        checkEvenOdd(7);
        checkEvenOdd(10);
    }
}
