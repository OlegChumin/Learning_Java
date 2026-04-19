package Advanced_Java.Part_02_Collections.LinkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * ✔️ Вставка в конец — почти одинаково (у ArrayList амортизированная O(1), у LinkedList — всегда O(1))
 * ✔️ Вставка в начало/середину — LinkedList в десятки раз быстрее (у ArrayList каждый раз System.arraycopy)
 * ✔️ Чтение (get(i)) — только ArrayList, потому что массив → прямой доступ
 * ✔️ Удаление по индексу — LinkedList намного быстрее, потому что не нужно сдвигать массив
 */
public class LinkedListVsArrayList {
    private final static int BIG_ARRAY_SIZE = 10_000_000;
    private final static int SMALL_ARRAY_SIZE = 10_000;
    public static void main(String[] args) {
        List<Integer> linkedList =  new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        //call measureTimeAddToEnd
        measureTimeAddToEnd(linkedList);
        measureTimeAddToEnd(arrayList);
        System.out.println("-----------------------");
        System.out.println();

        //call measureTimeAddToBeginning
        measureTimeAddToBeginning(linkedList);
        measureTimeAddToBeginning(arrayList);
        System.out.println("-----------------------");
        System.out.println();

        //call measureTimeGet
        measureTimeGet(linkedList);
        measureTimeGet(arrayList);
        System.out.println("-----------------------");
        System.out.println();

        //call measureTimeRemove
        measureTimeRemove(linkedList);
        measureTimeRemove(arrayList);
        System.out.println("-----------------------");
        System.out.println();

    }

    private static void measureTimeAddToEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < BIG_ARRAY_SIZE; i++) {
            list.add(i);
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Number of elements = " +  BIG_ARRAY_SIZE + " measureTimeAddToEnd (endTime - startTime) msec = " + (endTime - startTime) + " " + list.getClass());
    }

    private static void measureTimeAddToBeginning(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SMALL_ARRAY_SIZE; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Number of elements = " +  SMALL_ARRAY_SIZE + " measureTimeAddToBeginning (endTime - startTime) msec = " + (endTime - startTime) + " " + list.getClass());
    }

    private static void measureTimeGet(List<Integer> list) {
        for (int i = 0; i < SMALL_ARRAY_SIZE; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SMALL_ARRAY_SIZE; i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Number of elements = " +  SMALL_ARRAY_SIZE + " measureTimeGet (endTime - startTime) msec = " + (endTime - startTime) + " " + list.getClass());
    }

    private static void measureTimeRemove(List<Integer> list) {
        for (int i = 0; i < SMALL_ARRAY_SIZE; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SMALL_ARRAY_SIZE; i++) {
            list.remove(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Number of elements = " +  SMALL_ARRAY_SIZE + " measureTimeRemove (endTime - startTime) msec = " + (endTime - startTime) + " " + list.getClass());
    }
}
