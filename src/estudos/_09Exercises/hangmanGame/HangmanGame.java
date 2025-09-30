package estudos._09Exercises.hangmanGame;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class HangmanGame {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();

        String word = getRandomWord();
        char guess;
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");


        while (wrongGuesses < 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Guess: ");
            guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!\n");
                for (int i = 0; i < word.length(); i++) {
                    if (guess == word.charAt(i)) {
                        wordState.set(i, guess);
                    }
                    if (!wordState.contains('_')) {
                        System.out.println(getHangmanArt(wrongGuesses));
                        System.out.println("YOU WIN!");
                        System.out.println("The word was: " + word);
                        return;
                    }
                }
            } else {
                System.out.println("Wrong guess!\n");
                wrongGuesses++;
            }

            if (wrongGuesses >= 6) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("GAME OVER!");
                System.out.println("The word was: " + word);
            }

        }

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                    o
                    
                    
                    """;
            case 2 -> """
                    o
                    |
                    
                    """;
            case 3 -> """
                     o
                    /|
                    
                    """;
            case 4 -> """
                     o
                    /|\\
                    
                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }

    static String getRandomWord() {
        String filePath = "C:\\Users\\patin\\Documents\\repos\\java_studies\\src\\estudos\\_09Exercises\\hangmanGame\\words\\words.txt";
        Random random = new Random();
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        if (words.isEmpty()) {
            throw new IllegalStateException("WORDS.TXT IS EMPTY");
        }

        return words.get(random.nextInt(words.size()));
    }
}
