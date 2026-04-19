package radio.adapter.org;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс {@code SimpleAmericanSocket} реализует интерфейс {@link AmericanSocket}
 * и моделирует простую американскую розетку, подающую напряжение 110В.
 *
 * <p>Используется как исходный источник питания в примере паттерна "Адаптер".</p>
 */
@Slf4j
class SimpleAmericanSocket implements AmericanSocket {

    /**
     * Симулирует подачу питания 110В из американской розетки.
     * <p>Для целей демонстрации пишет сообщение в лог (уровень INFO).</p>
     */
    @Override
    public void getPower() {
        log.info("get 110 volt");
    }
}
