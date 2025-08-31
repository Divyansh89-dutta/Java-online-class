public class q7 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        int c = --a + a++;

        System.out.println("Final value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
    }
}
