package radio.adapter.org;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс {@code SocketAdapter} реализует {@link EuroSocket},
 * преобразуя американскую розетку ({@link AmericanSocket}) в европейскую (220В).
 *
 * <p>Реализация паттерна "Адаптер".</p>
 */
@Slf4j
class SocketAdapter implements EuroSocket {

    /**
     * Создаёт адаптер, принимающий {@link AmericanSocket}
     * и эмулирующий преобразование напряжения с 110В на 220В.
     *
     * @param americanSocket американская розетка (110В)
     */
    public SocketAdapter(AmericanSocket americanSocket) {
        log.info("Получен американский источник питания (110В).");
        log.info("Выполняем преобразование напряжения: 110В -> 220В.");
    }

    /**
     * Возвращает питание в формате европейской розетки (220В).
     */
    @Override
    public void getPower() {
        log.info("Выдаём питание 220В (адаптер).");
    }
}
