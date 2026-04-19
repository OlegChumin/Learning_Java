package lessons.lesson_05;

import java.util.Scanner;


public class ConsoleCalculator {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";



    public static void main(String[] args) {
        while (true) {
            callCalculator();
            Scanner scanner = new Scanner(System.in);
            String operationType = scanner.nextLine();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
             // "+"  \n
            switch (operationType) {
                case "+":
                    System.out.println(ANSI_CYAN + "Результат суммы введенных чисел = " + summation(a, b) + ANSI_RESET); // \n
                    break;
                case "-":
                    System.out.println("Результат вычитания введенных чисел = " + subtraction(a, b));
                    break;
                case "*":
                    System.out.println("Результат умножения введенных чисел = " + multiplication(a, b));
                    break;
                case "/":
                    System.out.println("Результат деления введенных чисел = " + division(a, b));
                    break;
                case "%":
                    System.out.println("Результат остатка от деления введенных чисел = " + getReminder(a, b));
                    break;
                default:
                    System.out.println("Вы ввели неверную операцию");

            }

            scanner.nextLine();
            System.out.println("Если хотите закончить вычисления, нажмите Y?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                scanner.close();
                break;
            }
        }

//        System.out.println("Результат сложения a + b = " + summation(a, b));
//        System.out.println("Результат сложения a - b = " + subtraction(a, b));
//        System.out.println("Результат сложения a * b = " + multiplication(a, b));
//        System.out.println("Результат сложения a / b = " + division(a, b));
//        System.out.println("Результат сложения a % b = " + getReminder(a, b));

    }

    public static void callCalculator() {
        System.out.println("Программа Калькулятор");
        System.out.println("Введите операцию + - * / % и два целых числа");
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
