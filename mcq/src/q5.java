public class q5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        boolean result = (a++ < b) && (b++ > a);
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
