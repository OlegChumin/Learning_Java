package materials.lesson_02_05;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.printf("%4s |", ""); // Пустая ячейка в верхнем левом углу

        // Заголовки столбцов
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Разделитель
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Таблица умножения
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%4d |", i);

            for (int j = 1; j <= 15; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}
