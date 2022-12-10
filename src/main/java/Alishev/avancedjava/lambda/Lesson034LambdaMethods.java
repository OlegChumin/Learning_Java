package Alishev.avancedjava.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lesson034LambdaMethods {
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Integer> arrayList = new ArrayList<>();

        fillArray(array);
        System.out.println(Arrays.toString(array));
        fillList(arrayList);
        System.out.println(arrayList);
        System.out.println();

        // метод map
        array = Arrays.stream(array).map(element -> element * 5).toArray();
        arrayList = arrayList.stream().map(element -> element * 5).collect(Collectors.toList());

        array = Arrays.stream(array).map(a -> 3).toArray();

        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);

        // метод filter
        int[] array2 = new int[10];
        List<Integer> arrayList2 = new ArrayList<>();
        fillArray(array2);
        fillList(arrayList2);
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(arrayList2);

        // например надо оставить только четные числа
        array2 = Arrays.stream(array2).filter(element -> element % 2 == 0).toArray();
        arrayList2 = arrayList2.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(arrayList2);

        // метод forEach
        System.out.println();
        Arrays.stream(array2).forEach(element -> System.out.print(element + " "));
        System.out.println();
        Arrays.stream(array2).forEach(System.out::print);
        System.out.println();
        arrayList2.stream().forEach(element -> System.out.print(element + " "));
        System.out.println();
        arrayList2.stream().forEach(System.out::print);

        // метод reduce (уменьшение)
        int[] array3 = new int[10];
        List<Integer> arrayList3 = new ArrayList<>();
        fillArray(array3);
        fillList(arrayList3);

        //например надо посчитать сумму всех элементов
        int arraySum = Arrays.stream(array3).reduce((accumulator, element) -> accumulator + element).getAsInt();
        System.out.println();
        System.out.println(arraySum);
        // если не указано начальное значение accumulator, то итерация начнется
        // со второго элемента, а значение 1-го будет сразу присвоено accumulator
        arraySum = Arrays.stream(array3).reduce(5, (accumulator, element) -> accumulator + element);
        //getasInt*() не нужен
        int arrayListSum = arrayList3.stream().reduce((accumulator, element) -> accumulator * element).get();
        // get() нужен
        // без проверки ifPresent()
        System.out.println();
        System.out.println(arraySum);
        System.out.println(arrayListSum);

        //методы можно вызывать один за другим для последовательных преобразований
        int[] array4 = new int[10];
        List<Integer> arrayList4 = new ArrayList<>();
        fillArray(array4);
        fillList(arrayList4);
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(arrayList4);
        // осортировать нечетные числа и умножить их на 5
        array4 = Arrays.stream(array4).filter(element -> element % 2 != 0).map(element -> element *5).toArray();
        arrayList4 = arrayList4.stream().filter(element -> element % 2 != 0).map(element -> element *5).collect(Collectors.toList());
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(arrayList4);

        // коллекция HashSet
        Set<Integer> set = new HashSet<>();
        fillSet(set);
        System.out.println();
        System.out.println(set);
        set = set.stream().map(element -> element * 2).collect(Collectors.toSet());
        System.out.println(set);

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

    private static void fillSet(Set<Integer> set) {
        for (int i = 0; i < 10; i++) {
            set.add(i + 1);
        }
    }


}
