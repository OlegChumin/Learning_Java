package Alishev.avancedjava.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson034Lambda {
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Integer> arrayList = new ArrayList<>();

        fillArray(array);
        System.out.println(Arrays.toString(array));
        fillList(arrayList);
        System.out.println(arrayList);
        System.out.println();

        // умножить все элементы на 2
        for (int i = 0; i < 10; i++) {
            array[i] *= 2;
            arrayList.set(i, arrayList.get(i) * 2);
        }

        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);

        array = Arrays.stream(array).map(element -> element * 5).toArray(); // статический метод превращающий array в поток stream
        // метод map (отображение) берет элемент из набора данных и сопоставляет ему лямбда выражение

        arrayList = arrayList.stream().map(element -> element * 5).collect(Collectors.toList());

        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> arrayList) {
        for (int i = 0; i < 10; i++) {
            arrayList.add(i + 1);
        }
    }


}
