package estudos._09Exercises;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
            return;
        }
        if (username.contains("_") || username.contains(" ")) {
            System.out.println("Usernot must not contain underscores or spaces");
            return;
        }

        System.out.println("Welcome " + username);

    }
}
