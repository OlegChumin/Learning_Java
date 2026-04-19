package materials.lesson_02_05.variables;

/**
 * Этот код создает переменные различных типов данных в Java и выводит их значения. Кроме того, в коде есть пояснения
 * о том, что такое переменная и как она размещается в памяти Java.
 *
 * В Java, простые типы данных (int, long, float, double, char, boolean) обычно хранятся в стеке памяти, а объекты и
 * строки хранятся в куче памяти, а переменные содержат либо примитивные значения, либо ссылки на объекты.
 */

public class VariablesExample {
    public static void main(String[] args) {
        // Целочисленные переменные
        int integerVar = 42;
        long longVar = 123456789012345L;

        // Переменные с плавающей точкой
        float floatVar = 3.14f;
        double doubleVar = 2.71828;

        // Символьная переменная
        char charVar = 'A';

        // Логическая переменная
        boolean booleanVar = true;

        // Строковая переменная
        String stringVar = "Hello, Java!";

        // Вывод значений переменных
        System.out.println("integerVar: " + integerVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("stringVar: " + stringVar);

        // Пояснение о переменных и их размещении в памяти в Java
        int x = 10; // Создание переменной x и присвоение ей значения 10
        // Переменная x хранится в стеке памяти.

        // Ссылка на объект в куче памяти
        String name = "John";
        // Переменная name хранит ссылку на объект "John" в куче памяти.

        // Примеры операций с переменными
        int a = 5;
        int b = 3;
        int sum = a + b; // Сложение переменных
        int difference = a - b; // Вычитание переменных
        int product = a * b; // Умножение переменных
        int quotient = a / b; // Деление переменных

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}
