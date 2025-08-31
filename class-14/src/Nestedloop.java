public class Nestedloop {
    public static void main(String[] args) {
//🔹 1. What is a Nested Loop?
//
//                A loop inside another loop.
//
//        Outer loop → controls rows.
//
//        Inner loop → controls columns / printing
        for (int i = 1; i <= 5; i++) {     // outer loop → rows
            for (int j = 1; j <= i; j++) { // inner loop → columns
                System.out.print("* ");
            }
            System.out.println();          // new line after each row
        }
    }
}