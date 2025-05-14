//public class Main {
//    public static void main(String[] args) {
//        char a = 'a';

import java.util.Scanner;

////        System.out.println(a++);
////        System.out.println(a);
//        System.out.println(a++ + a);
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        char a = sc.next().charAt(0); //Read a single character
        System.out.println("Your answer is: " + (char)(a + 1));
    }
}