package radio.adapter.org;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс {@code RadioAdapter} демонстрирует работу паттерна "Адаптер"
 * на примере подключения {@link Radio}, который работает только от {@link EuroSocket},
 * к {@link AmericanSocket} через {@link SocketAdapter}.
 *
 * <p>Сценарий:
 * <ol>
 *   <li>Создаём американскую розетку ({@link SimpleAmericanSocket}).</li>
 *   <li>Подключаем её к {@link SocketAdapter}, который преобразует 110В в 220В.</li>
 *   <li>Подключаем {@link Radio} к адаптированной розетке и начинаем воспроизведение музыки.</li>
 * </ol>
 * </p>
 */
@Slf4j
public class ListenRadio {

    /** WAV-файл для имитации работы радио */
    private static final String DEFAULT_AUDIO_FILE =
            "src/main/resources/LookHereIsRadio.wav";

    /**
     * Точка входа. Демонстрирует использование паттерна "Адаптер".
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        log.info("=== Запуск демо паттерна 'Адаптер' ===");

        // 1. Имеем американскую розетку 110В
        log.info("Создаём американскую розетку (SimpleAmericanSocket)...");
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        americanSocket.getPower();

        // 2. Преобразуем её в европейскую 220В через адаптер
        log.info("Подключаем адаптер (SocketAdapter) для преобразования 110В -> 220В...");
        EuroSocket euroSocket = new SocketAdapter(americanSocket);

        // 3. Подключаем радио, которое работает только от EuroSocket
        log.info("Создаём радио с файлом: {}", DEFAULT_AUDIO_FILE);
        Radio radio = new Radio(DEFAULT_AUDIO_FILE);

        log.info("Подключаем радио к EuroSocket через адаптер...");
        radio.listenMusic(euroSocket);

        log.info("=== Демонстрация завершена ===");
    }
}
