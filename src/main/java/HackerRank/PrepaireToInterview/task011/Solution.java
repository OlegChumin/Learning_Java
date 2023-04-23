package HackerRank.PrepaireToInterview.task011;

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.TextStyle;

class Result {

    public static String findDay(int month, int day, int year) {
        // Создаем объект LocalDate, используя значения дня, месяца и года
        LocalDate date = LocalDate.of(year, month, day);
        // Получаем полное имя дня недели для этой даты и преобразуем его в верхний регистр
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект BufferedReader для чтения ввода от пользователя
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Создаем объект BufferedWriter для вывода результата
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Считываем ввод, разбивая строку на части по пробелам и сохраняя в массив строк
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // Преобразуем строковые значения месяца, дня и года в целочисленные значения
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Вызываем метод findDay класса Result, передавая ему значения месяца, дня и года,
        // и сохраняем результат в строку res
        String res = Result.findDay(month, day, year);

        // Записываем результат в файл вывода, добавляя символ новой строки
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        // Закрываем объекты BufferedReader и BufferedWriter
        bufferedReader.close();
        bufferedWriter.close();
    }
}

