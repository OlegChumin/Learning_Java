package materials.lesson_02_05.java_memory;

public class MemoryStackDemo {

    public static void main(String[] args) {
        // Инициализация примитивных переменных
        int a = 10;
        double b = 5.5;
        char c = 'A';
        boolean d = true;

        // Вывод значений переменных
        System.out.println("Initial values:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        // Изменение значений переменных
        a = 20;
        b = 7.3;
        c = 'B';
        d = false;

        // Вывод измененных значений
        System.out.println("\nModified values:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        // Переменные автоматически удаляются при завершении блока (в данном случае, при завершении метода main)
    }
}
