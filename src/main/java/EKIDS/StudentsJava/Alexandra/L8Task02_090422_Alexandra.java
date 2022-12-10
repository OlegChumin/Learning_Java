package EKIDS.StudentsJava.Alexandra;

import java.util.Scanner;

public class L8Task02_090422_Alexandra {
    public static void main(String[] args) throws InterruptedException {
        String ANSI_B = "\u001B[30m";
        String ANSI_RESET = "\u001B[0m";
        String BACKGROUND = "\u001B[41m";
        String BACKGROUND_RESET = "\u001B[0m";
        System.out.print(BACKGROUND + ANSI_B +
                "Вас приветствует программа калькулятор" + ANSI_RESET + BACKGROUND_RESET);
        Thread.sleep(1000);
        Scanner scan = new Scanner(System.in);
        System.out.println(BACKGROUND + ANSI_B +
                "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rВведите чило 1 и нажмите Enter"
                + ANSI_RESET + BACKGROUND_RESET);
        int a = scan.nextInt();
        System.out.println(BACKGROUND + ANSI_B +
                "Введите чило 2 и нажмите Enter" + ANSI_RESET + BACKGROUND_RESET);
        int b = scan.nextInt();
        scan.nextLine();
        System.out.println(BACKGROUND + ANSI_B + "Введите нужное действие над числами(символ) :" +
                " + (сложение), - (вычитание), * (умножение), / (деление), % (остаток от деления) и нажмите Enter"
                + ANSI_RESET + BACKGROUND_RESET);
        String str = scan.next();
        String ANSI_Y = "\u001B[33m";
        String ANSI_RESETY = "\u001B[0m";
        String BACKGROUNDY = "\u001B[40m";
        String BACKGROUND_RESETY = "\u001B[0m";
        switch (str) {
            case "+":
                System.out.println(BACKGROUNDY + ANSI_Y + "Сумма = " + Calc.sum(a, b) + ANSI_RESETY + BACKGROUND_RESETY);
                break;
            case "-":
                System.out.println(BACKGROUNDY + ANSI_Y + "Вычитание = " + Calc.minus(a, b) + ANSI_RESETY + BACKGROUND_RESETY);
                break;
            case "*":
                System.out.println(BACKGROUNDY + ANSI_Y + "Умножение = " + Calc.multiplication(a, b) + ANSI_RESETY + BACKGROUND_RESETY);
                break;
            case "/":
                System.out.println(BACKGROUNDY + ANSI_Y + "Деление = " + Calc.divisionInt(a, b) + ANSI_RESETY + BACKGROUND_RESETY);
                break;
            case "%":
                System.out.println(BACKGROUNDY + ANSI_Y + "Остаток = " + Calc.remainderOfDivision(a, b) + ANSI_RESETY + BACKGROUND_RESETY);
                break;
            default:
                System.out.println("Вы ввели некорректные данные, пожалуйста введите команду из списка");
        }
    }
}
class Calc {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int divisionInt(int a, int b) {
        return a / b;
    }
    public static int remainderOfDivision(int a, int b) {
        return a % b;
    }
}