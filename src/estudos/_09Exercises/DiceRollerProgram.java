package estudos._09Exercises;

import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {

    static Random random = new Random();
    static int total;

    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLES
        // GET # OF DICE FROM THE USER
        // CHECK IF # OF DICE IS > THAN 0
        // ROLL ALL THE DICE
        // GET THE TOTAL
        // DISPLAY ASCII OF DICE

        Scanner scanner = new Scanner(System.in);
        int numOfDice;

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            rollDices(numOfDice);
            System.out.println("TOTAL: " + total);
        } else {
            System.out.println("Number of dice must be greater than 0");
        }

        scanner.close();
    }

    static void rollDices(int numOfDice) {
        for (int i = 0; numOfDice > i; i++) {
            int roll = random.nextInt(1, 7);
            System.out.println("You rolled: " + roll);
            total += roll;
            printDie(roll);
        }
    }

    static void printDie(int roll) {
        switch (roll) {
            case 1 -> System.out.print("""
                     -------
                    |       |
                    |   O   |
                    |       |
                     -------
                    """);

            case 2 -> System.out.print("""
                     -------
                    | O     |
                    |       |
                    |     O |
                     -------
                    """);

            case 3 -> System.out.print("""
                     -------
                    | O     |
                    |   O   |
                    |     O |
                     -------
                    """);

            case 4 -> System.out.print("""
                     -------
                    | O   O |
                    |       |
                    | O   O |
                     -------
                    """);

            case 5 -> System.out.print("""
                     -------
                    | O   O |
                    |   O   |
                    | O   O |
                     -------
                    """);

            case 6 -> System.out.print("""
                     -------
                    | O   O |
                    | O   O |
                    | O   O |
                     -------
                    """);

            default -> System.out.println("INVALID ROLL");
        }
    }
}
