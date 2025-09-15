package question;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Not a letter");
        } else {
            ch = Character.toLowerCase(ch);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
    }
}
