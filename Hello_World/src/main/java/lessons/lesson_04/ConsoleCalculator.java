package lessons.lesson_04;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        System.out.println("Программа Калькулятор");
        System.out.println("Введите два числа и операцию");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Результат сложения a + b = " + summation(a, b));

    }

    public static int summation(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на ноль запрещено!");
        }
        return a / b;
    }


    public static int getReminder(int a, int b) {
        return a % b;
    }

}
