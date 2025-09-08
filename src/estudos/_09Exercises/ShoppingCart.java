package estudos._09Exercises;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        double price;
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is: " + total);

        scanner.close();
    }
}
