package EKIDS.StudentsJava.Alexandra;

import java.util.Arrays;
import java.util.Scanner;

public class L6Task02_040422_Alexandra {
    public static void main(String[] args) {
        String[] arrayStr1 = new String[7];
        System.out.println("Введите клички 7 животных");
        Scanner scan = new Scanner(System.in);
        String v1 = scan.next();
        arrayStr1[0] = v1;
        String v2 = scan.next();
        arrayStr1[1] = v2;
        String v3 = scan.next();
        arrayStr1[2] = v3;
        String v4 = scan.next();
        arrayStr1[3] = v4;
        String v5 = scan.next();
        arrayStr1[4] = v5;
        String v6 = scan.next();
        arrayStr1[5] = v6;
        String v7 = scan.next();
        arrayStr1[6] = v7;
        System.out.println("Вывод через toString массив arrayStr1");
        System.out.println(Arrays.toString(arrayStr1));

        System.out.println("Вывод через foreach массив arrayStr1");
        for (String str : arrayStr1) {
            System.out.print(str + " ");
        }
        System.out.println();
        String[] arrayStr2 = {"Вася", "Муся", "Кеша", "Фантик", "Мотя", "Дарси", "Фима"};
        System.out.println("Вывод через toString массив arrayStr2");
        System.out.println(Arrays.toString(arrayStr2));
        System.out.println("Вывод через foreach массив arrayStr2");
        for (String str2 : arrayStr2) {
            System.out.print(str2 + " ");
        }
    }
}
