package UdemyZaur.BaseJava;
//varargs

import java.util.ArrayList;

public class Lesson19 {
    public static void main(String[] args) {

    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c) {
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c, int d) {
        System.out.println(a + b);
    }

    //перегруженный метод sum под любое количество параметров
    static void sum(int... a) { // здесь типа массива int[] a с неуказанным размером до бесконечности
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
    //
    static void sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }

}
