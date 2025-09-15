package estudos._09Exercises.mathClass;

import java.util.Scanner;

public class CircleMath {
    public static void main(String[] args) {

        // Circumference = 2 * Math.PI * radius;
        // Area = Math.PI * Math.pow(radius, 2);
        // Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double area;
        double volume;
        double circumference;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = (2 * Math.PI) * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);

        scanner.close();
    }
}
