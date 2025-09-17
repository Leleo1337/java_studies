package estudos._09Exercises;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        // DECLARE VARIABLES
        // DISPLAY WELCOME MESSAGE
        // PLAY IF BALANCE > 0
        // ENTER BET AMOUNT
        //      VERIFY IF BET > BALANCE
        //      VERIFY IF BET > 0
        //      SUBTRACT BET FROM BALANCE
        // SPINN ROW
        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // EXIT MESSAGE

        Scanner scanner = new Scanner(System.in);
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "🌟"};
        String[] rolls = new String[3];
        String playAgain = "Y";
        double balance = 100;
        double betAmount;
        double payout;

        System.out.println("************************");
        System.out.println("Welcome to Java slots");
        System.out.println("Symbols: " + String.join(",", symbols));
        System.out.println("************************");

        while (playAgain.equals("Y")) {
            System.out.println("Your current balance: " + balance);
            System.out.print("Place your bet amount: ");

            betAmount = scanner.nextInt();
            scanner.nextLine();

            if (betAmount > balance) {
                System.out.printf("You dont have %.2f in your balance \n", betAmount);
                System.out.println("************************");
                continue;
            }

            if (betAmount <= 0) {
                System.out.println("Bet must be greater than 0");
                System.out.println("************************");
                continue;
            }

            System.out.println("Spinning...");
            System.out.println("************************");

            balance -= betAmount;

            rolls = spinRoll(symbols);
            printRoll(rolls);

            payout = getPayout(rolls, betAmount);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
                System.out.println("************************");
            } else {
                System.out.println("************************");
                System.out.println("Sorry you lost this round");
                System.out.println("************************");

            }

            System.out.print("Do you want to play again (Y / N)?: ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }
        System.out.println("Game over! Your final balance is: " + balance);
    }

    static String[] spinRoll(String[] symbols) {

        Random random = new Random();
        String[] rolls = new String[3];

        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = symbols[random.nextInt(symbols.length)];
        }

        return rolls;
    }

    static void printRoll(String[] rolls) {
        System.out.println(" " + String.join(" | ", rolls));
    }

    static double getPayout(String[] rolls, double betAmount) {
        if (rolls[0].equals(rolls[1]) && rolls[1].equals(rolls[2])) {
            return switch (rolls[0]) {
                case "🍒" -> betAmount * 3;
                case "🍉" -> betAmount * 4;
                case "🍋" -> betAmount * 5;
                case "🔔" -> betAmount * 10;
                case "🌟" -> betAmount * 20;
                default -> 0;
            };
        } else if (rolls[0].equals(rolls[1])) {
            return switch (rolls[0]) {
                case "🍒" -> betAmount * 3;
                case "🍉" -> betAmount * 4;
                case "🍋" -> betAmount * 5;
                case "🔔" -> betAmount * 10;
                case "🌟" -> betAmount * 20;
                default -> 0;
            };
        } else if (rolls[1].equals(rolls[2])) {
            return switch (rolls[1]) {
                case "🍒" -> betAmount * 3;
                case "🍉" -> betAmount * 4;
                case "🍋" -> betAmount * 5;
                case "🔔" -> betAmount * 10;
                case "🌟" -> betAmount * 20;
                default -> 0;
            };
        }

        return 0;
    }
}
