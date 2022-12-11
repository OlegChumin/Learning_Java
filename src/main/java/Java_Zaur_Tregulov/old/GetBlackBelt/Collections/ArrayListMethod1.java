package Java_Zaur_Tregulov.old.GetBlackBelt.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        // add
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");
        list.add("Oleg");
        list.add("Otto");

        // for each
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        // add on index
        list.add(0, "Olaf");
        System.out.println(list);

        // get from index
        System.out.println(list.get(2));

        // set on index new element (replace with delete previous)
        System.out.println(list);
        list.set(4, "Masha");
        System.out.println(list);

        //remove __ <--
        System.out.println("remove method");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
