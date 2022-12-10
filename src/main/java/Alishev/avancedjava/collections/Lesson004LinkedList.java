package Alishev.avancedjava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson004LinkedList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> linkedList = new LinkedList<Integer>(); //
//        linkedList.add(1);
//        linkedList.get(0);
//        linkedList.size();
//        linkedList.remove(0);
        List<Integer> arrayList = new ArrayList<>();

//        measureTimeAdd(linkedList);
//        measureTimeAdd(arrayList); //arrayList add в разы быстрее
//        System.out.println();
//
//        measureTimeGet(linkedList);
//        measureTimeGet(arrayList); //arrayList в 10_000 раз быстрее
//        System.out.println();
//
        System.out.println("добавление в начало списка");
        measureTimeAdd0(linkedList);
        measureTimeAdd0(arrayList); //arrayList значительно медленнее!

        System.out.println("добавление в середину списка");
        measureTimeAddMiddle(linkedList);
        measureTimeAddMiddle(arrayList); //arrayList значительно быстрее!

    }

    private static void measureTime(List<Integer> list) throws InterruptedException {
        long start = System.currentTimeMillis();
//        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureTimeAdd(List<Integer> list) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureTimeGet(List<Integer> list) throws InterruptedException {
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //    в LinkedList хранится не массив, а цепочка объектов у каждого из которых есть ссылка на последующий - односвязный
//    [1]-->[2]-->[3]-->[4]-->[5]
//    или на предыдущий и последующий - двусвязный
//    [1]<==>[2]<==>[3]<==>[4]<==>[5]
//    head [7]-->[1]-->[2]-->... добавление на 0 позицию гораздо быстрее всего два линка с head
//    LinkedList подойдет лучше для постоянного добавления в начало листа или постоянных удалений
    private static void measureTimeAdd0(List<Integer> list) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureTimeAddMiddle(List<Integer> list) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.add(50_000, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
