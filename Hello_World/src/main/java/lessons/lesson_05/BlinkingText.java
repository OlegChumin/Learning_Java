package lessons.lesson_05;

import java.util.Random;

public class BlinkingText {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            System.out.print("\r Мигающий текст ");
            Thread.sleep(300); // Пауза в миллисекундах
            System.out.print("\r                "); // Очистка предыдущего текста
            Thread.sleep(300); // Пауза в миллисекундах

            Random random = new Random();
            int randomNumber = random.nextInt(7);
        }
    }
}
