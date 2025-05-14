import java.util.Scanner;

//import java.util.Scanner;
//
//public class q3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name and age: ");
//        String name = sc.nextLine();
//        int age = sc.nextInt();
//
//        if (age >= 18) {
//            System.out.println("Hello " + name + ", you are a voter.");
//        } else {
//            int yearsLeft = 18 - age;
//            System.out.println("Hello " + name + ", you are not eligible to vote right now.");
//            System.out.println("You will be eligible in " + yearsLeft + " year(s).");
//        }
//    }
//}
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println(name + " is a valid voter.");
        }else {
//            int yearsLeft = 18 - age;
            System.out.println(name + " will be eligible in " + (18 - age) + " years");
        }
    }
}