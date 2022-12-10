package Alishev.avancedjava.collections.Lesson005MyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson016Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
//        iterator.next();
//        iterator.hasNext();
//        iterator.remove();
        System.out.println();

        //for each from Java 5
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
