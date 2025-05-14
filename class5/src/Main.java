import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter you gender: ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("You are :" + gender);
    }
}