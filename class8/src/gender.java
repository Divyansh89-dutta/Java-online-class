import java.util.Scanner;

public class gender {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("Hello, Sir!");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Hello, Ma'am!");
        } else {
            System.out.println("Hello, Guest!");
        }
    }
}
