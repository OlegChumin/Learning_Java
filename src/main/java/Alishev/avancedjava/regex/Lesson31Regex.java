package Alishev.avancedjava.regex;

import java.util.Arrays;

public class Lesson31Regex {
    public static void main(String[] args) {
        String str1 = "Hello a hey";
        stringSplit(str1, " ");

        String str2 = "Hello.a.hey";
        stringSplit(str2, "\\.");

        String str3 = "Hello3452344263a34634623hey"; //разделитель произвольное количество чисел
        stringSplit(str3, "\\d+");
        System.out.println();

        //replaceAll()
        //replace()
        String str4 = "Hi this is Eminem...";
        System.out.println(str4.replace(" ", ".")); //заменяем все пробелы на .
        String str5 = "Hi254624562this25446734is245624654Eminem2546256256...";
        System.out.println(str5.replaceAll("\\d+", " ")); //используется когда не можем описать паттерн
        String str6 = "Hi254624562this25446734is245624654Eminem2546256256...";
        System.out.println(str6.replaceFirst("\\d+", " ")); //используется когда не можем описать паттерн

    }

    public static void stringSplit(String string, String regex) {
        String[] wordsOfString = string.split(regex);
        System.out.println(Arrays.toString(wordsOfString));
    }
}
