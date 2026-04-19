package Part_03_Generics;

import java.util.ArrayList;
import java.util.List;

public class SampleOfGenerics {
    //Type safe and reusable code
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Object());
        list.add("OK");
        list.add(12321321.0F);
        list.add('H');
        list.add(true);
        list.add(new String("---"));
        list.add(new StringBuilder("Hi"));
        list.add(new StringBuffer("Hallo"));

        for (Object element : list) {
            System.out.println(element);
        }

        System.out.println("------------------------------------------------------");

        List<String> stringList = new ArrayList(); //raw type without <String>
        stringList.add("Hallo");
        stringList.add("OK");
        stringList.add("GoodBye");
//        stringList.add(new StringBuffer("No")); // одна из важнейших задач Generics - типобезопасность!

        for (Object element : stringList) {
            System.out.println(element + " length = " + ((String) element).length());
        }
    }
}
