package materials.lesson_02_05.Arithmetic;

public class ArithmeticOperationsExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Сложение
        int sum = num1 + num2;
        System.out.println("Сумма: " + sum);

        // Вычитание
        int difference = num1 - num2;
        System.out.println("Разность: " + difference);

        // Умножение
        int product = num1 * num2;
        System.out.println("Произведение: " + product);

        // Деление
        int quotient = num1 / num2;
        System.out.println("Частное: " + quotient);

        // Остаток от деления
        int remainder = num1 % num2;
        System.out.println("Остаток от деления: " + remainder);

        // Инкремент
        num1++;
        System.out.println("Инкремент num1: " + num1);

        // Декремент
        num2--;
        System.out.println("Декремент num2: " + num2);

        // Порядок приоритетов операторов
        System.out.println("Порядок приоритетов операторов: умножение/деление, сложение/вычитание, инкремент/декремент");
    }
}
