import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();

        String dayName = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tusday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> {
                yield "Invalid Day Number!";
            }
        };
        System.out.println("Day: " + dayName);
    }
}
