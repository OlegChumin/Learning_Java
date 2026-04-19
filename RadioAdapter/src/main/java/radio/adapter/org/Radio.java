package radio.adapter.org;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс {@code Radio} моделирует радио, которое работает только от европейской розетки (220В).
 * <p>
 * В рамках паттерна "Адаптер" демонстрирует устройство, требующее {@link EuroSocket}
 * для работы. При подаче питания радио начинает проигрывать музыку.
 * </p>
 */
@Slf4j
class Radio {

    /** Путь к аудиофайлу, имитирующему работу радио */
    private final String audioFile;

    /**
     * Создаёт радио с указанным WAV-файлом.
     *
     * @param audioFile путь к WAV-файлу, который будет воспроизводиться
     */
    public Radio(String audioFile) {
        this.audioFile = audioFile;
        log.debug("Создан экземпляр Radio с файлом: {}", audioFile);
    }

    /**
     * Подключает радио к европейской розетке и начинает воспроизведение музыки.
     *
     * @param euroSocket розетка европейского стандарта (220В)
     */
    public void listenMusic(EuroSocket euroSocket) {
        log.info("Подключение радио к розетке EuroSocket...");
        euroSocket.getPower();

        log.info("Питание получено, начинаем воспроизведение музыки из файла: {}", audioFile);
        WavPlayer player = new WavPlayer(audioFile);
        player.play();
        log.info("Воспроизведение завершено.");
    }
}
