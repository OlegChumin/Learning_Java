package Java_Zaur_Tregulov.old.GetBlackBelt.Generics;

import java.util.ArrayList;
import java.util.List;

public class Test21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("test string"));
//        list.add(new Car());
        list.add("Hallo");
        list.add("By");
        list.add("NULL");

        for(Object element : list) {
            System.out.println(element + " " + ((String)element).length());
        }
    }
}

class Car {

}
