package estudos._09Exercises;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM
        // declare variables
        // welcome message
        // prompt for user choice
        // option 1 convert lbs to kgs
        // option 2 convert kgs to lbs
        // else print not a valid choice

        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter a weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;

            System.out.printf("%.2f lbs in kg is: %.2f kgs", weight, newWeight);
        } else if (choice == 2) {
            System.out.print("Enter a weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;

            System.out.printf("%.2f kgs in lbs is: %.2f lbs", weight, newWeight);
        } else {
            System.out.printf("%d is not a valid choice", choice);
        }

        scanner.close();

    }
}
