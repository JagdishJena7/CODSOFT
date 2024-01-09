import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Number Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound);
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
