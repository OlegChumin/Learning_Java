package RadioAdapter.radio.adapter.org;

import lombok.extern.slf4j.Slf4j;
import RadioAdapter.radio.adapter.org.exceptions.AudioPlaybackException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

/**
 * Класс {@code WavPlayer} реализует простой проигрыватель WAV-файлов
 * с использованием стандартного API Java Sound.
 *
 * <p>Пример использования:
 * <pre>{@code
 * WavPlayer player = new WavPlayer("src/main/resources/RadioAdapter/LookHereIsRadio.wav");
 * player.play();
 * }</pre>
 * </p>
 *
 * <p>Особенности:
 * <ul>
 *   <li>Поддерживает воспроизведение файлов в формате WAV.</li>
 *   <li>Автоматически открывает и закрывает ресурсы при проигрывании.</li>
 *   <li>Буферизация данных выполняется с помощью массива байт.</li>
 * </ul>
 * </p>
 */
@Slf4j
public class WavPlayer {

    /** Путь к аудиофайлу WAV */
    private final String audioFile;

    /**
     * Создаёт новый проигрыватель для указанного WAV-файла.
     *
     * @param audioFile путь к файлу формата WAV
     */
    public WavPlayer(String audioFile) {
        this.audioFile = audioFile;
        log.debug("Создан WavPlayer для файла: {}", audioFile);
    }

    /**
     * Воспроизводит WAV-файл, указанный при создании {@link WavPlayer}.
     *
     * @throws RuntimeException если файл не поддерживается, не найден или возникли проблемы с устройством воспроизведения
     */
    public void play() {
        log.info("Запуск воспроизведения файла: {}", audioFile);

        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(audioFile))) {
            log.debug("Аудиофайл успешно открыт: {}", audioFile);

            AudioFormat format = audioInputStream.getFormat();
            log.debug("Формат аудиофайла: {} Hz, {} бит, {} канал(ов)",
                    format.getSampleRate(), format.getSampleSizeInBits(), format.getChannels());

            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

            try (SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info)) {
                log.debug("Открываем устройство воспроизведения...");
                line.open(format);
                line.start();
                log.info("Воспроизведение началось.");

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = audioInputStream.read(buffer)) != -1) {
                    line.write(buffer, 0, bytesRead);
                }

                line.drain();
                log.info("Воспроизведение завершено.");
            }

        } catch (UnsupportedAudioFileException e) {
            log.error("Неподдерживаемый формат аудиофайла: {}", audioFile, e);
            throw new AudioPlaybackException("Неподдерживаемый формат аудиофайла: " + audioFile, e);
        } catch (LineUnavailableException e) {
            log.error("Аудио устройство недоступно.", e);
            throw new AudioPlaybackException("Аудио устройство недоступно", e);
        } catch (IOException e) {
            log.error("Ошибка чтения файла: {}", audioFile, e);
            throw new AudioPlaybackException("Ошибка чтения файла: " + audioFile, e);
        }
    }
}
