package estudos.OOP.runtimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // runtime polymorphism = When the method that goes executed is decided
        //                        at runtime based on the actual type of the obect

        Scanner scanner = new Scanner(System.in);
        Animal animal;
        int choice;

        System.out.print("Would you like a dog or a cat? (1 = dog | 2 = cat): ");
        choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else {
            animal = new Cat();
            animal.speak();
        }

    }
}
