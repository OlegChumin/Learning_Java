package Mp3Player.ru.chumin.mp3_player;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mp3Player {
    private Player player;
    private Thread playerThread;
    boolean isPlaying = false;

    public void pause() {
        System.out.println("Работает команда PAUSE");
    }

    /**
     * Использование synchronized гарантирует, что в один момент времени только
     * один поток может выполнить методы play или stop, что предотвратит возможные
     * проблемы с согласованностью состояния isPlaying.
     *
     * @param filePath - путь к mp3 файлу для воспроизведения
     */
    public synchronized void play(String filePath) {
        if (isPlaying) {
            stop(); // Если уже воспроизводится, остановить воспроизведение
            // Добавляем небольшую паузу для убедительности, что поток остановлен
            try {
                Thread.sleep(100); // Пауза для корректной остановки и освобождения ресурсов
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Восстановление флага прерывания
            }
        } else {
            System.out.println("Работает команда воспроизведения PLAY ");
            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(filePath);
                player = new Player(fileInputStream);
                playerThread = new Thread(() -> {
                    try {
                        player.play();
                    } catch (JavaLayerException e) {
                        System.err.println("Ошибка воспроизведения!");
                        throw new RuntimeException(e);
                    }
                });
                playerThread.start();
            } catch (FileNotFoundException e) {
                System.err.println(" Не найден файл!");
                throw new RuntimeException(e);
            } catch (JavaLayerException e) {
                System.err.println("Проблемы с воспроизведение файла!");
                throw new RuntimeException(e);
            }
            isPlaying = true;
        }
    }

    public void fastForward() {
        System.out.println("Работает команда перемотки вперед FAST_FORWARD");
        // player.getPosition(); попробовать дописать функцию перемотки и воспроизведения с момента последне остановки
    }

    public void rewind() {
        System.out.println("Работает команда перемотки назад REWIND");
        // player.getPosition(); попробовать дописать функцию перемотки и воспроизведения с момента последне остановки
    }

    public void stop() {
        System.out.println("Работает команда STOP");
        if (player != null) {
            player.close(); // Закрытие плеера
        }
        if (playerThread != null && playerThread.isAlive()) {
            playerThread.interrupt(); // Прерывание потока
        }
        isPlaying = false; // Сброс состояния воспроизведения
    }
}
