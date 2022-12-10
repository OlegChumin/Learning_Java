package EKIDS.StudentsJava.Mark;

import java.util.Scanner;

public class Task07_080422_Mark {
    public static void main(String[] args) throws InterruptedException {
        String ANSI_Yellow = "\u001B[33m";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это калькулятор, скажите какое действие вы хотите исполнить " +
                "(sum, minus, multiply, divide, remainder) " +
                "  remainder -- остаток от деления");
        String deystvie = scanner.nextLine();
//        if (deystvie == "sum" || deystvie == "minus" || deystvie == "multiply" || deystvie == "divide"
//                || deystvie == "remainder")
        {
            if (deystvie.equals("sum")) {
                System.out.println("Ведите первое число");
                int fist_Num = scanner.nextInt();
                System.out.println("Ведите второе число");
                int second_Num = scanner.nextInt();
                System.out.println(ANSI_Yellow + calculator.sum(fist_Num, second_Num));
            }

            if (deystvie.equals("minus")) {
                System.out.println("Ведите первое число");
                int fist_Num = scanner.nextInt();
                System.out.println("Ведите второе число");
                int second_Num = scanner.nextInt();
                System.out.println(ANSI_Yellow + calculator.minus(fist_Num, second_Num));
            }
            if (deystvie == "multiply") {
                System.out.println("Ведите первое число");
                int fist_Num = scanner.nextInt();
                System.out.println("Ведите второе число");
                int second_Num = scanner.nextInt();
                System.out.println(ANSI_Yellow + calculator.multiply(fist_Num, second_Num));
            }
            if (deystvie.equalsIgnoreCase("divide")) {
                System.out.println("Ведите первое число");
                int fist_Num = scanner.nextInt();
                System.out.println("Ведите второе число");
                int second_Num = scanner.nextInt();
                System.out.println(ANSI_Yellow + calculator.divideInt(fist_Num, second_Num));
            }
            if (deystvie == "remainder") {
                System.out.println("Ведите первое число");
                int fist_Num = scanner.nextInt();
                System.out.println("Ведите второе число");
                int second_Num = scanner.nextInt();
                System.out.println(ANSI_Yellow + calculator.theRemainderOfTheDivision(fist_Num, second_Num));
            }
        }
    }
}

class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divideInt(int a, int b) {
        return a / b;
    }

    public int theRemainderOfTheDivision(int a, int b) {
        return a % b;
    }
}