package EKIDS.StudentsJava.Emil;

import java.util.Scanner;

public class HomeWork6_KurbanovEmil {
    public static void main(String[] args) {
        System.out.println("Эта программа будет определять кем ты станешь в будущем " +
                "по тому что вы любите");
        System.out.println("Введите варианты ответов:Играть в игры_Фотографировать_" +
                "Играть на Муз Инструментах_Гонять на мотоцикле");
        Scanner scanner = new Scanner(System.in);
        String work = scanner.nextLine();
        switch (work) {
            case "Играть в игры":
                System.out.println("Вы будете КиберСпортсменом");
                break;
            case "Фотографировать":
                System.out.println("Вы будете Фотографом");
                break;
            case "Играть на Муз Инструментах":
                System.out.println("Вы будете Музыкантом");
                break;
            case "Гонять на мотоцикле":
                System.out.println("Вы будете Гонщиком");
                break;
            default:
                System.out.println("Ввод данных не верен");
        }
    }
}
