package numbergame;
// Java Program to demonstrates the Number guessing game
import java.util.Scanner;

public class NumberGuessing {

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = 1 + (int)(100 * Math.random());

        // Number of attempts
        int K = 5;

        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have " + K + " attempts to guess the correct number.");

        // Loop for K attempts
        for (int i = 0; i < K; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            // Check conditions
            if (guess == number) {
                System.out.println(" Congratulations! You guessed the correct number.");
                sc.close();
                return;
            } else if (guess < number) {
                System.out.println(" The number is greater than " + guess);
            } else {
                System.out.println(" The number is less than " + guess);
            }
        }

        // If the user runs out of attempts
        System.out.println("You've exhausted all attempts. The correct number was: " + number);
        sc.close();
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }

    // This method was added for unit testing
    public static String provideHint(int guess, int target) {
        if (guess < target) {
            return "Try higher.";
        } else if (guess > target) {
            return "Try lower.";
        } else {
            return "Correct!";
        }
    }
}
