package EKIDS.StudentsJava.Mark;

import java.util.Scanner;

public class Task01_040422_Mark {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 10 до 200 и эта программа определит" +
                ", находится ли это число в диапазоне от 25 до 100 и от 99 до 150");
        int num = scanner.nextInt();
        System.out.println("Минутку, обрабатываю данные...");
        Thread.sleep(3000);
        if (num < 10 || num > 200) {
            System.out.println("Это число не верно");
            return;

        }

        if (num > 25 && num < 100) {
            System.out.println("Это число входит в диапазон 25--100 ");
        } else System.out.println("Это число не входит в диапазон 25--100");

        if (num > 99 && num < 150) {
            System.out.println("Это число входит в диапазон 99--150 ");
        } else System.out.println("Это число не входит в диапазон 99--150");
    }
}




