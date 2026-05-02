package RadioAdapter.radio.adapter.org;

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
            "src/main/resources/RadioAdapter/LookHereIsRadio.wav";

    /**
     * Точка входа. Демонстрирует использование паттерна "Адаптер".
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        log.info("=== Запуск демо паттерна 'Адаптер' ===");
        DemoPacing.pause(DemoPacing.MEDIUM_DELAY_MS);

        // 1. Имеем американскую розетку 110В
        log.info("Шаг 1/4. Создаём американскую розетку (SimpleAmericanSocket)...");
        DemoPacing.pause(DemoPacing.SHORT_DELAY_MS);
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        americanSocket.getPower();
        DemoPacing.pause(DemoPacing.MEDIUM_DELAY_MS);

        // 2. Преобразуем её в европейскую 220В через адаптер
        log.info("Шаг 2/4. Подключаем адаптер (SocketAdapter) для преобразования 110В -> 220В...");
        DemoPacing.pause(DemoPacing.SHORT_DELAY_MS);
        EuroSocket euroSocket = new SocketAdapter(americanSocket);
        DemoPacing.pause(DemoPacing.MEDIUM_DELAY_MS);

        // 3. Подключаем радио, которое работает только от EuroSocket
        log.info("Шаг 3/4. Создаём радио с файлом: {}", DEFAULT_AUDIO_FILE);
        DemoPacing.pause(DemoPacing.SHORT_DELAY_MS);
        Radio radio = new Radio(DEFAULT_AUDIO_FILE);
        DemoPacing.pause(DemoPacing.MEDIUM_DELAY_MS);

        log.info("Шаг 4/4. Подключаем радио к EuroSocket через адаптер...");
        DemoPacing.pause(DemoPacing.SHORT_DELAY_MS);
        radio.listenMusic(euroSocket);

        DemoPacing.pause(DemoPacing.SHORT_DELAY_MS);
        log.info("=== Демонстрация завершена ===");
    }
}
