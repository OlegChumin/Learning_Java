package Java_Zaur_Tregulov.old.GetBlackBelt.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sB0 = new StringBuilder("A");
        StringBuilder sB1 = new StringBuilder("B");
        StringBuilder sB2 = new StringBuilder("C");
        StringBuilder sB3 = new StringBuilder("D");
        StringBuilder sB4 = new StringBuilder("E");
        StringBuilder sB5 = new StringBuilder("F");

        StringBuilder[] arrayStringBuilders = {sB0, sB1, sB2, sB3, sB4, sB5};
        List<StringBuilder> list = Arrays.asList(arrayStringBuilders);
        System.out.println(list);
//        ArrayList<StringBuilder> arrayList = (ArrayList<StringBuilder>) list;
        System.out.println();
        arrayStringBuilders[0].append("!!!!");
        System.out.println(list);
        arrayStringBuilders[0] = new StringBuilder("Z");
        System.out.println(list);


    }

}
