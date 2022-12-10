package EKIDS.Lessons.Lesson08.Sound.MusicPlayerWAV;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WAV_Player {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\MusicPlayerWAV\\09 Money for Nothing.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";
        Scanner scanner = new Scanner(System.in);

        // P - play, S - Stop, R - reset, Q - quit

        while (!response.equals("Q")) {
            System.out.println("P - play, S - Stop, R - reset, Q - quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    break;
                default:
                    System.out.println("Not a valid response!");
                    break;
            }
        }
        System.out.println("Byyeeee!");
    }
}
