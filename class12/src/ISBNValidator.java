import java.util.Scanner;

public class ISBNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();

        if (isbn.length() != 10) {
            System.out.println("false");
            return;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            char c = isbn.charAt(i);

            int digit;

            // If last character is 'X', treat it as 10
            if (i == 9 && c == 'X') {
                digit = 10;
            } else if (Character.isDigit(c)) {
                digit = Character.getNumericValue(c);
            } else {
                System.out.println("false");
                return;
            }

            sum += digit * (i + 1);
        }

        System.out.println(sum % 11 == 0 ? "true" : "false");
    }
}
