package estudos._09Exercises;

import java.util.Scanner;

public class RetangleArea {
    public static void main(String[] args) {

        // calculate area of a retangle

        double width = 0;
        double heigth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a width: ");
        width = scanner.nextDouble();

        System.out.print("Enter a heigth: ");
        heigth = scanner.nextDouble();

        area = width * heigth;

        System.out.println("A area desse retangulo é: " + area + "cm²");

        scanner.close();
    }
}
