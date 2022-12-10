package EKIDS.Lessons.Lesson7;

import java.util.Scanner;

public class TypesOfMethods {

    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            printLnString();
//        }
        calcSumIntOf3Numbers(98, 36, 453);

        Scanner scanner = new Scanner(System.in);
        Object object = new Object();
        object.toString();
    }


    static void printLnString() {
        System.out.println("Данный метод не возвращает ничего void, " +
                "но печатает данную строку");
    }
    // что делает данный метод
    static void calcSumIntOf3Numbers(int number1, int number2, int number3) {
        int sumInt = number1 + number2 + number3;
        if (sumInt > 0) {
            System.out.println("    ");
        } else return;
        System.out.println(sumInt);
    }

    static int calcSumIntOf4Numbers(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }


    //    void go(String str, int age) {
//        System.out.println("Enimal can walk");
//    }
}
