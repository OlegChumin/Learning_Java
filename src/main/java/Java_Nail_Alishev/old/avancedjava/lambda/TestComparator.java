package Java_Nail_Alishev.old.avancedjava.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Первая строка");
        list.add("Третья строка");
        list.add("Седьмая строка");

        List<String> list2 = list;
        List<String> list3 = new ArrayList<String>(list);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println();

        Collections.sort(list); // сортировка list лексикографически
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        list.sort(new Comparator<String>() { //реализация Comparator с помощью анонимного класса
            @Override // сортировка по длине
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(list);

        list3.add("134541351351345315sfgfbg   34");
        List<String> list4 = new ArrayList<String>(list3);
        System.out.println("List4 unsorted" + list4);
        Collections.sort(list4);
        System.out.println("List 4 sorted naturally " + list4);


        list3.sort((s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println();
        System.out.println("List 3 sorted by Comparator interface used " + list3);
        System.out.println();


        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        };
        list4.sort(comparator);
        System.out.println("List 4 sorted by var comparator  " + list4);
    }
}
