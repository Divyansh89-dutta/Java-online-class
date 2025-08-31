import java.util.Random;
import java.util.Scanner;

public class Guessthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100!");

        while (guess < numberToGuess){
            System.out.println("Enter Your guss: ");
            guess = sc.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
            }
        }
    }
}
