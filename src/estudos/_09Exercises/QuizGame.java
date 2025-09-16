package estudos._09Exercises;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // JAVA QUIZ GAME

        // QUESTIONS array[]
        // OPTIONS array[]
        // DECLARE VARIABLES
        // WELCOME MESSAGE
        // QUESTION (loop)
        //      OPTIONS
        //      GET GUESS FROM USER
        //      CHECK OUR GUESS
        // DISPLAY FINAL SCORE


        String[] questions = {"What is the main function of a router?", "Which part of the computer is considered the brain?", "What year was facebook launched?", "Who is known of father of computers?", "What was the first programing language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"}, {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"}, {"1. 2000", "2. 2004", "3. 2006", "4. 2008"}, {"1. Steve jobs", "2. Bill gates", "3. Alan turing", "4. Charles Babbage"}, {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        Scanner scanner = new Scanner(System.in);
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("******************************");
                System.out.println("CORRECT!");
                System.out.println("******************************");
                score += 1;
            } else {
                System.out.println("******************************");
                System.out.println("WRONG!");
                System.out.println("******************************");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}
