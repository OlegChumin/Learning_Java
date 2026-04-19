package materials.lesson_02_05.loops;

public class LoopExamples {

    public static void main(String[] args) {
        // Пример цикла for
        for (int i = 0; i < 5; i++) {
            System.out.println("Цикл for: Итерация " + i);
        }

        // Пример цикла while
        int j = 0;
        while (j < 5) {
            System.out.println("Цикл while: Итерация " + j);
            j++;
        }

        // Пример цикла do-while
        int k = 0;
        do {
            System.out.println("Цикл do-while: Итерация " + k);
            k++;
        } while (k < 5);

        // Пример расширенного цикла for (foreach)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Цикл foreach: Число " + number);
        }

        // Пример цикла for с использованием break
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                break;
            }
            System.out.println("Цикл с break: Итерация " + m);
        }

        // Пример цикла for с использованием continue
        for (int n = 0; n < 10; n++) {
            if (n == 5) {
                continue;
            }
            System.out.println("Цикл с continue: Итерация " + n);
        }

        // Пример вложенных циклов
        for (int p = 0; p < 3; p++) {
            for (int q = 0; q < 3; q++) {
                System.out.println("Вложенные циклы: p = " + p + ", q = " + q);
            }
        }
    }
}
