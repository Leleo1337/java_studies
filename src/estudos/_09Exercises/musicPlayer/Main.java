package estudos._09Exercises.musicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // How to PLAY AUDIO with Java (.wav, .au, aiff)
        // o objetivo principal era só dar play uma musica, mas decidi adicionar uma função de next para melhorar minha logica com arrays

        Scanner scanner = new Scanner(System.in);
        File folder = new File("src\\estudos\\_09Exercises\\musicPlayer\\songs");
        File[] songsFiles = folder.listFiles();

        String response = "";
        int songIndex = 0;
        Clip clip = null;

        while (!response.equals("Q")) {
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(songsFiles[songIndex]);
                if (clip == null || !clip.isOpen()) {
                    clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                }

                System.out.print("""  
                             P = PLAY
                             S = STOP
                             R = RESET
                             N = NEXT
                             Q = QUIT
                        """);
                System.out.print("Enter your choice: ");
                response = scanner.nextLine().toUpperCase();
                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "N" -> {
                        clip.stop();
                        songIndex = (songIndex + 1) % songsFiles.length;
                        audioInputStream = AudioSystem.getAudioInputStream(songsFiles[songIndex]);
                        clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    }
                    case "Q" -> scanner.close();
                    default -> System.out.println("Invalid choice");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Could not locale file");
            } catch (UnsupportedAudioFileException e) {
                System.out.println("File not supported");
            } catch (LineUnavailableException e) {
                System.out.println("Unable to access audio resource");
            } catch (IOException e) {
                System.out.println("Something went wrong!");
            }
        }
    }
}
