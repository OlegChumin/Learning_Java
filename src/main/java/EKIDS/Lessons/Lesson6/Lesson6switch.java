package EKIDS.Lessons.Lesson6;

import java.util.Scanner;

public class Lesson6switch {
    public static void main(String[] args) {
        System.out.println("Здравствуйте, программа определяет " +
                "по вашему возрасту где вы учитесь");
        System.out.println("Введи ваш возраст: ноль, два, семь, восемнадцать");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();

        switch (age) {
            case "ноль":
                System.out.println("ты родился");
                break;
            case "два":
                System.out.println("ты пошел в сад");
                break;
            case "семь":
                System.out.println("ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("Ввод данных неверный");
        }
    }
}
