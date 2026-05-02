package Java_to_remember.lesson_02.pattern_adapter;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Player {
    public static void main(String[] args) {
        String pathToAudioFile = "src/main/resources/Java_to_remember/LookHereIsRadio.wav";

        try {
            // Загрузка аудиофайла
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathToAudioFile));

            AudioFormat format = audioInputStream.getFormat(); // получение формата аудиофайла

            // Создание данных для воспроизведения
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(format); // открыть устройство воспроизведение
            line.start(); // воспроизвести

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = audioInputStream.read(buffer)) != -1) {
                line.write(buffer, 0, bytesRead);
            }

            line.drain();
            line.close();

        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }
}
