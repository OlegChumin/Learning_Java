package materials.lesson_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Mp3Player {
    private final static Scanner SCANNER = new Scanner(System.in);
    private static String filePath = "C:\\Users\\Oleg\\IdeaProjects\\Hello_World\\src\\main\\java\\lessons\\lesson_09\\Dj Power - Popcorn.mp3";

    private static Player player;
    private static Thread playerThread;

    public static void main(String[] args) {
        while(true) {
            System.out.println(" Введите команду \"Play\" \"Stop\" \"Rewind\" \"Exit\"");
            String command = SCANNER.nextLine();

            switch (command.toLowerCase()) {
                case "play":
                    if (filePath == null || filePath == "") {
                        System.out.println(" Укажите корректный путь к mp3 файлу ");
                        filePath = SCANNER.nextLine();
                    }
                    play(filePath);
                    break;
                case "stop":
                    stop();
                    break;
                case "rewind":
                    rewind();
                    break;
                case "exit":
                    System.out.println(" Спасибо за использование программы. Пока! ");

                    SCANNER.close();
                    return;
                default:
                    System.out.println(" Неверная команда. Попробуйте снова. ");
             }

        }
    }

    private static void play(String filePath) {
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

    private static void rewind() {
        System.out.println(" Работает команда воспроизведения REWIND ");
        // player.getPosition(); попробовать дописать функцию перемотки и воспроизведения с момента последне остановки
    }

    private static void stop() {
        System.out.println(" Работает команда STOP ");
        if (playerThread != null && playerThread.isAlive()) {
            player.close();
            playerThread.interrupt();
        }
    }
}
