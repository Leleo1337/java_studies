package estudos._09Exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        // GET CHOICE FROM THE USER
        // GET RANDOM CHOICE FOR COMPUTER
        // CHECK WIN CONDITIONS
        // ASK TO PLAY AGAIN?
        // GOODBYE MESSAGE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        while (playAgain.equals("yes")) {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals(choices[0]) && !playerChoice.equals(choices[1]) && !playerChoice.equals(choices[2])) {
                System.out.println("Invalid choice");
                return;
            }
            computerChoice = choices[random.nextInt(0, 3)];
            System.out.println("The computer choice is: " + computerChoice);

            checkWin(playerChoice, computerChoice);

            System.out.print("Play again? (yes | no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }

        System.out.println("Thank you for playing");
    }

    static void checkWin(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") || playerChoice.equals("scissors") && computerChoice.equals("paper") || playerChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
