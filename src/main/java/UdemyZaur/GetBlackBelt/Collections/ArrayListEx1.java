package UdemyZaur.GetBlackBelt.Collections;


import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //Iterable->Collection -> List -> ArrayList (динамический/изменяющий свой размер массив)
        //                             -> LinkedList
        //                             -> Vector
        //                             -> Stack
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Oleg");
        arrayList1.add("Otto");
//        arrayList1.add(50);

        System.out.println(arrayList1);

        List<String> arrayList2 = new ArrayList<>(30);
        arrayList2.add("Otto");
        arrayList2.add("Oleg");
        System.out.println(arrayList2.size());

        List<String> arrayList3 = new ArrayList<>(arrayList1); // способ создания копии, но как новый объект
        System.out.println();
        System.out.println(arrayList1);
        System.out.println(arrayList3);
        System.out.println(arrayList1 == arrayList3);
        System.out.println(arrayList1.equals(arrayList3));
    }
}
