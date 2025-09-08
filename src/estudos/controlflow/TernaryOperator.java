package estudos.controlflow;

public class TernaryOperator {
    public static void main(String[] args) {

        // Ternary operator ? = return 1 of 2 values if a condition is true

        // variable = ( condition ) ? ifTrue : ifFalse;

        int score = 55;
        int number = 1;
        int hours = 13;
        int income = 30000;

        String evenOrOdd = (number % 2 == 1) ? "Odd" : "Even";
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        String timeOfDay = (hours < 12) ? "AM" : "PM";

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(number + " is " + evenOrOdd);
        System.out.println("You hit " + score + " so you " + passOrFail);
        System.out.println("The time is: " + hours + timeOfDay);
        System.out.println("With your income being: " + income + " your tax rate will be: " + taxRate);
    }
}
