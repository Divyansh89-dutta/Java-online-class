import java.util.Scanner;

//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class q4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the a number (1 to 7: ");
//        int dayNumber = sc.nextInt();
//        if (dayNumber == 1){
//            System.out.println("Monday");
//        } else if (dayNumber == 2) {
//            System.out.println("Tuesday");
//        } else if (dayNumber == 3) {
//            System.out.println("Wednesday");
//        } else if (dayNumber == 4) {
//            System.out.println("Thursday");
//        } else if (dayNumber == 5) {
//            System.out.println("Friday");
//        } else if (dayNumber == 6) {
//            System.out.println("Saturday");
//        } else if (dayNumber == 7) {
//            System.out.println("Sunday");
//        }else {
//            System.out.println("invalid input. Please enter a number between 1 and 7.");
//        }
//    }
//}
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 7): ");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("2 → Tuesday");
                break;
            case 3:
                System.out.println("3 → Wednesday");
                break;
            case 4:
                System.out.println("4 → Thursday");
                break;
            case 5:
                System.out.println("5 → Friday");
                break;
            case 6:
                System.out.println("6 → Saturday");
                break;
            case 7:
                System.out.println("7 → Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}