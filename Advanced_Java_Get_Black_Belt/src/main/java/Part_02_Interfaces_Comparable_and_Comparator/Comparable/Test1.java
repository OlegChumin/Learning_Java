package Part_02_Interfaces_Comparable_and_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murzik");
        list.add("Lotar");
        list.add("Erna");
        list.add("Sherlock");
        list.add("Vasia");
        list.add("Ryzik");
        list.add("Uiliam");
        list.add("Katana");
        list.add("Python");
        System.out.println("Before sorting...");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting...");
        System.out.println(list);
    }
}
