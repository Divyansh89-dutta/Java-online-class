public class q1 {
    public static void main(String[] args) {
        int n = 76578;
        while (n != 0 ){
            int rem = n%10;

            System.out.print(rem);
            n = n/10;
        }
    }
}
