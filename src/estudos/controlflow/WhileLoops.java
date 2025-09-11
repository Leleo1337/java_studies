package estudos.controlflow;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        // while loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";
        String response = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            while (!response.contains("Q") && !name.isEmpty()) {
                System.out.println("Hello " + name);
                System.out.println("You are playing a game!");
                System.out.print("Press Q to quit: ");
                response = scanner.next().toUpperCase();
            }
        }

        scanner.close();
    }
}
