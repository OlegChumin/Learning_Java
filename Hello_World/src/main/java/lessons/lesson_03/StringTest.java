package lessons.lesson_03;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
//        newMethod();
//        System.out.println(someMethod(1, 2, "3"));

        String name =  "Петя";
        String surName = "Иванов";

        String fullName = name + " " + surName;
        System.out.println(fullName);

        String result = name.concat(" " + surName);
        System.out.println(result);

        String someString;
        //            0  1  2  3
       //char        'П''е''т''я'
        someString = "Петя Иванов";

        System.out.println("Размер строки " + someString.length());
        System.out.println(someString.toLowerCase());
        System.out.println(someString.toUpperCase());

        String str1 = "Hello"; // String pool
        String strN = "Hello";
        String str3 = new String("Hello");
        String str2 = new String("World"); // новый объект

        String substring = result.substring(6);
        System.out.println(substring);

        System.out.println("Замена символов в строке");
        System.out.println(str1);
        String replaced = str1.replace('l', 'H');
        System.out.println(replaced);

        System.out.println();
        System.out.println("Сравнение двух строк");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        boolean equals = str1.equals(str2);
        System.out.println(equals);

        String str4 = "Hello";

        System.out.println();
        System.out.println("Сравнение двух строк");
        System.out.println("str1 = " + str1);
        System.out.println("str4 = " + str4);
        boolean equals2 = str1.equals(str4);
        System.out.println(equals2);

        System.out.println();
        System.out.println(str1 == str4);
        String str5 = new String("Hello");
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1 == str5); //false

        System.out.println("String: метод trim  ");
        String stringWithSpaces = " Trim me ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println(trimmedString);

    }


    public static int someMethod(int a, int b) {
        return a + b;
    }

    public static int someMethod(int a, int b, int c) {
        return a + b + c;
    }

    public static int someMethod(int a, int b, String str) {
        return a + b + Integer.parseInt(str);
    }

    public static void newMethod() {
        System.out.println("Hello");
    }



}

class StringTest2 {

    void methtod() {
        System.out.println();
    }

    {
        System.out.println();
    }


}
