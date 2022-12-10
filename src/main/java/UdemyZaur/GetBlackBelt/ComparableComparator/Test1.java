package UdemyZaur.GetBlackBelt.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Oleg");
        list.add("Ivan");
        list.add("Maria");
        System.out.println("Перед сортировкой: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки: ");
        System.out.println(list);
    }
}
