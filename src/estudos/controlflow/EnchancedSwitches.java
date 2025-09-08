package estudos.controlflow;

import java.util.Scanner;

public class EnchancedSwitches {
    public static void main(String[] args) {

        // enchanced switches = A replacement to many else if statements
        //                            (java 14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday" -> System.out.println("It is a week day");
            case "saturday", "sunday" -> System.out.println("It is the weekend");
            default -> System.out.printf("[ERROR] %s is not a day", day);
        }
    }
}
