package ball_race_v_003;

import java.util.*;

class BallColorManager {
    private static final List<BallColor> availableColors = new ArrayList<>();
    private static final Random random = new Random();

    static {
        // Инициализация списка доступных цветов
        Collections.addAll(availableColors, BallColor.values());
        Collections.shuffle(availableColors);  // Перемешиваем, чтобы разнообразить порядок цветов
    }

    /**
     * Метод получения случайного цвета шара. При вызове метод удаляет цвет из списка,
     * гарантируя, что каждый цвет используется только один раз.
     *
     * @return BallColor случайный цвет шара.
     * @throws NoSuchElementException если в списке больше нет доступных цветов.
     */
    public static BallColor getRandomColor() {
        if (availableColors.isEmpty()) {
            throw new NoSuchElementException("No more colors available.");
        }
        // Получаем и удаляем цвет из списка
        return availableColors.remove(random.nextInt(availableColors.size()));
    }
}
