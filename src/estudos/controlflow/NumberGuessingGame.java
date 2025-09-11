package estudos.controlflow;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // number guessing game

        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int attempts = 1;
        double randomNumber = Math.ceil(Math.random() * 10);

        System.out.println("Number guessing game!");
        System.out.println("Guess a number between 1-10!");
        while (guess != randomNumber) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.printf("Congrats! You guessed the random number %.0f in %d attempts! \n", randomNumber, attempts);
            } else {
                System.out.println("Wrong number");
                attempts++;
            }
        }

        System.out.println("You have won!");

    }
}
