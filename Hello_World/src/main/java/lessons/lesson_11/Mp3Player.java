package lessons.lesson_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Mp3Player {
    private final static Scanner SCANNER = new Scanner(System.in);
    private static String filePath = "src/main/resources/Dj Power - Popcorn.mp3";
    private static Player player;
    private static Thread playerThread;

     public void play(String filePath) {
        System.out.println(" Работает команда воспроизведения PLAY ");
        FileInputStream fileInputStream;
        try {
             fileInputStream= new FileInputStream(filePath);
             player = new Player(fileInputStream);
             playerThread = new Thread(() -> {
                 try {
                     player.play();
                 } catch (JavaLayerException e) {
                     System.out.println(" Ошибка воспроизведения ");
                 }
             });
             playerThread.start();
        } catch (FileNotFoundException e) {
            System.out.println(" Не найден файл!");
        } catch (JavaLayerException e) {
            System.out.println(" Проблемы с воспроизведение файла ");
        }
    }

    public void rewind() {
        System.out.println(" Работает команда воспроизведения REWIND ");
        // player.getPosition(); попробовать дописать функцию перемотки и воспроизведения с момента последне остановки
    }

    public void stop() {
        System.out.println(" Работает команда STOP ");
        if (playerThread != null && playerThread.isAlive()) {
            player.close();
            playerThread.interrupt();
        }
    }
}
