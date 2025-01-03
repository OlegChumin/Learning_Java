package tasks_Arsenii.Task_001;

import java.util.Scanner;

/**
 * Задача Task_001
 * 1. Создай глобальную приватную статическую финальную переменную типа Scanner  (не в методе main а в классе и сделай ее
 * финальной не забудь как правильно писать названия констант (private final static ......)? для чтения данных с
 * клавиатуры.
 * 2. Считай с каждой новый строки два целочисленных значения и сохрани их в две переменные типа int.
 * 3. Создай третью переменную Z и присвой ей тоже целочисленное значение с клавиатуры.
 * 4. теперь создай еще переменную someWord типа String и присвой ей значение тоже с клавиатуры, помнишь метод класса
 * Scanner? который считывает не строку целиком а одно слово до пробела?
 * 5. Теперь можно закоментировать все ненужные переменные как у меня а считывание переменной number_Y сделать через
 * nextInt() иначе программа будет выбрасывать ошибку, это особенности Scanner Выведи в отдельных строках результаты
 * сложения, вычитания, умножения и целочисленного деления number_X на number_Y в
 * следующем виде System.out.println("Результат сложения " + numberX + " + " + numberY + " = " + (...............));
 * 6. Теперь потестируй свою программу на следующих значениях:
 * numberX = 5, numberY = 10
 * numberX = 100, numberY = 11
 * numberX = 3, numberY = 0
 * numberX = 0x80000000, numberY = 0x7fffffff  (x означает шеснадцатиричная система исчисления, так тоже можно вводить)
 * какие проблемы при исполнении программы возникли и почему, давай протестируем и проанализируем
 */

public class Task_java_001 {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int numberX = SCANNER.nextInt();
        int numberY = SCANNER.nextInt();

        System.out.println("Результат сложения " + numberX + " + " + numberY + " = " + (numberX + numberY));
        System.out.println("Результат вычитания " + numberX + " - " + numberY + " = " + (numberX - numberY));
        System.out.println("Результат умножения " + numberX + " * " + numberY + " = " + (numberX * numberY));
        System.out.println("Результат целочисленного деления " + numberX + " / " + numberY + " = " + (numberX / numberY));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
//        int numberZ = Integer.parseInt(String.valueOf(SCANNER.nextInt()));
//        String someString = SCANNER.nextLine();
//        String someWord = SCANNER.next();
    }
}
