package materials.lesson_02_05.Arithmetic;

public class ArithmeticOperationsPriority {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Пример 1: Приоритет умножения выше, чем у сложения
        int result1 = num1 + num2 * 2;
        System.out.println("Пример 1: " + result1); // Ожидаемый результат: 20

        // Пример 2: Использование скобок для изменения порядка операций
        int result2 = (num1 + num2) * 2;
        System.out.println("Пример 2: " + result2); // Ожидаемый результат: 30

        // Пример 3: Инкремент сначала, затем сложение
        int result3 = ++num1 + num2;
        System.out.println("Пример 3: " + result3); // Ожидаемый результат: 16

        // Пример 4: Декремент сначала, затем умножение
        int result4 = num1-- * num2;
        System.out.println("Пример 4: " + result4); // Ожидаемый результат: 45

        // Пример 5: Использование скобок для явного указания порядка операций
        int result5 = (num1-- * num2) + (num1 + num2);
        System.out.println("Пример 5: " + result5); // Ожидаемый результат: 44
    }
}
