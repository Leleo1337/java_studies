package estudos._09Exercises;

import java.util.Scanner;

public class BakingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGGINERS

        // DECLARE VARIABLES
        // DISPLAY MENU
        // GET AND PROCESS USERS CHOICE
        // showBalance()
        // deposit()
        // withdraw()
        // EXIT MESSAHE

        double balance = 0;
        boolean isRunning = true;
        int choice = 1;

        while (isRunning) {
            System.out.println("---------------");
            System.out.println("BANKING PROGRAM");
            System.out.println("----------------");
            System.out.println("1. Show balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. exit");
            System.out.println("---------------");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withDraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("---------------------------");
        System.out.println("Thank you! have a nice day!");
        System.out.println("---------------------------");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("---------------");
        System.out.printf("$%.2f \n", balance);
    }

    static double deposit() {
        System.out.println("---------------");

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double withDraw(double balance) {
        System.out.println("---------------");
        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

}
