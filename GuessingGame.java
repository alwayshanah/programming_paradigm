import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfGuesses = 3;
        int targetNumber = random.nextInt(10) + 1; // Change the range or target number as needed

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 10.");

        for (int i = 0; i < numberOfGuesses; i++) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else {
                System.out.println("Wrong guess. Try again.");
            }

            if (i < numberOfGuesses - 1) {
                System.out.println("You have " + (numberOfGuesses - i - 1) + " guesses remaining.");
            }
        }

        System.out.println("The correct number was: " + targetNumber);
        System.out.println("Game over. Thanks for playing!");
        scanner.close();
    }
}
