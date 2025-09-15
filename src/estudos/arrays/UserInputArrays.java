package estudos.arrays;

import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int amount;

        System.out.println("-------FOOD PROGRAM-------");
        System.out.print("Enter the amount of foods: ");
        amount = scanner.nextInt();

        scanner.nextLine(); // clear scanner

        foods = new String[amount];


        for (int i = 0; i < foods.length; i++) {
            System.out.printf("Enter food %d: ", i + 1);
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }

}
