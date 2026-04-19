package materials.lesson_02_05.java_memory;

import java.util.Scanner;

/**
 * В Java, строки (объекты класса String) могут храниться как объекты в куче (heap), а также как строки в пуле строк
 * (string pool), который является частью стека памяти. Когда вы создаете строку с использованием литерала (например,
 * "Пример строки"), Java сначала проверяет, есть ли уже такая строка в пуле строк. Если строка найдена, переменной str
 * будет присвоено ссылку на существующий объект строки в пуле.
 * <p>
 * Если же такой строки в пуле еще нет, то создается новый объект строки в пуле, и переменной str присваивается ссылка
 * на этот новый объект.
 * <p>
 * Таким образом, в вашем коде строка "Пример строки" может храниться в пуле строк в стеке памяти, а не в куче. Однако
 * важно отметить, что строки, созданные с использованием оператора new (например, String str = new String("Пример
 * строки");), всегда хранятся в куче.
 * <p>
 * Важно подчеркнуть, что механизм работы со строками в Java, включая использование пула строк, может зависеть от версии
 * JVM и реализации.
 */

public class SimpleStaticMethodDemo {

    //Java Vizualizer plugin

    public static void main(String[] args) {
        // Вызов статических методов для создания и обработки примитивных переменных
        int x = initializeInt();
        double y = initializeDouble();
        initializeInt();
        initializeDouble();
        initializeDouble();
        String str = "Пример строки";
        System.out.println(str);
        String str2 = new String(" 2 Пример строки");
        System.out.println(str2);
        Object object = new Object();
        System.out.println(object);
        Scanner scanner = new Scanner(System.in);
        int getNumber = scanner.nextInt();
        System.out.println(getNumber);
    }

    // Статический метод для инициализации целочисленной переменной
    private static int initializeInt() {
        int localVar = 5;
        // Дополнительные операции с переменной
        localVar++;
        return localVar;
    }

    // Статический метод для инициализации переменной типа double
    private static double initializeDouble() {
        double localVar = 8.7;
        // Дополнительные операции с переменной
        localVar = localVar / 2;
        return localVar;
    }
}
