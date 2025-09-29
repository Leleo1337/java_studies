package estudos.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);
        int num;

        try {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0!");
        } catch (Exception e) {
            // SAFETY NET
            System.out.println("Something went wrong");
        }finally {
            scanner.close();
            System.out.println("This always executes");
        }

    }
}
