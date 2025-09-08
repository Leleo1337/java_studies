package estudos._09Exercises;

import java.util.Scanner;

public class CompoundCalculator {
    public static void main(String[] args) {

        // compount interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesComunded;
        int years;
        double amount;

        System.out.print("Enter the principal amout: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesComunded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesComunded, timesComunded * years);

        System.out.printf("The amount after %d year/s is $%.2f", years, amount);

        scanner.close();
    }
}
