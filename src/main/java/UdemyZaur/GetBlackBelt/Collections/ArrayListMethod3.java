package UdemyZaur.GetBlackBelt.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Oleg");
        arrayList1.add("Otto");
        System.out.println(arrayList1);

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList2.add("Maria");
        arrayList2.add("Oleg");
        arrayList2.add("/////");
        System.out.println(arrayList2);

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList2.addAll(4, arrayList1);
        System.out.println(arrayList2);
        arrayList2.addAll(arrayList2);
        System.out.println(arrayList2);
        arrayList2.clear();
        System.out.println(arrayList2);
        System.out.println(arrayList1.indexOf("Oleg"));
        System.out.println();
        System.out.println(arrayList1);
        System.out.println(arrayList1.lastIndexOf("Oleg"));
        System.out.println("arrayList1.size = " + arrayList1.size());
        System.out.println("Is arrayList1 empty = " + arrayList1.isEmpty());
        System.out.println("Is arrayList2 empty = " + arrayList2.isEmpty());
        System.out.println();
        System.out.println(arrayList1.contains("Oleg"));
        System.out.println(arrayList1.toString());
    }
}
