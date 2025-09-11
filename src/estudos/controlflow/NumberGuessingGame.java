package estudos.controlflow;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // number guessing game

        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int attempts = 1;
        int[] range = {0, 10};

        System.out.println("Number guessing game!");
        System.out.println("Enter the range of the randoms");
        System.out.print("Enter range 1: ");
        range[0] = scanner.nextInt();
        System.out.print("Enter range 2: ");
        range[1] = scanner.nextInt();

        System.out.printf("Guess a number between %d - %d: ", range[0], range[1]);

        int randomNumber = (int) Math.ceil(Math.random() * (range[1] - range[0]) + range[0]);

        while (guess != randomNumber) {
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.print("TOO HIGH! try again: ");
            } else if (guess < randomNumber) {
                System.out.print("TOO LOW! try again: ");
            }
            if (guess == randomNumber) {
                    System.out.printf("Congrats! You guessed the random number %.0f in %d attempts! \n", randomNumber, attempts);
            } else {
                attempts++;
            }
        }

        System.out.println("You have won!");

    }
}
