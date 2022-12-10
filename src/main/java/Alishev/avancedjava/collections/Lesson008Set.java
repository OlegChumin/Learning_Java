package Alishev.avancedjava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
// Iterable -> Collection --> Set -> SortedSet -> TreeSet
//                             |
//                              --> HashSet
//                             |--> LinkedHashSet --> HashSet

//Set хранят только уникальные элементы

public class Lesson008Set {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // нет никакого порядке после внесения
        Set<String> linkedHashSet = new LinkedHashSet<>(); // сохраняется порядок ввода
        Set<String> treeSet = new TreeSet<>(); // объекты сортируются в естественном порядке

//        System.out.println('a' > 'A');

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

        for (String element : hashSet) {
            System.out.println(element);
        }
        System.out.println();


        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for (String element : linkedHashSet) {
            System.out.println(element);
        }
        System.out.println();

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String element : treeSet) {
            System.out.println(element);
        }
        System.out.println();

        // .contains() в Set работает очень быстро за счет кеширования - константное время
        System.out.println(hashSet.contains("Tom"));
        System.out.println(linkedHashSet.contains("Tom"));
        System.out.println(treeSet.contains("Tom"));

        System.out.println(hashSet.isEmpty());

        //как Set обрабатывает дубликаты
        hashSet.add("Tom");
        hashSet.add("Tom");
        System.out.println(hashSet);
        //Union - объединение множеств



    }
}
