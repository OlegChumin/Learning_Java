package EKIDS.Lessons.Lesson10.BusTour;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt(); // считываем высоту автобуса
        int numberOfBridges = scanner.nextInt(); // считываем количество мостов
        int[] bridgesHeightsArray = new int[numberOfBridges]; // формируем массивы куда будем сохранять высоты всех мостов
        boolean check = false; // флаг для проверки что автобус проедет подо всеми мостами успешно

        for (int i = 0; i < bridgesHeightsArray.length; i++) { //считываем данные в массив
            bridgesHeightsArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < bridgesHeightsArray.length; i++) { //итерируемся по массиву для проверки условия
            if (busHeight >= bridgesHeightsArray[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Will not crash");
        }
    }
}
