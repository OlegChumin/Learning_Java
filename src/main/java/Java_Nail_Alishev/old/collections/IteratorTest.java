package Java_Nail_Alishev.old.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("only");
        list.add("Java");
        list.add("JavaonlyJava");
//      Iterator<Integer> iter = list.iterator();
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.printf(iter.next() + " ");
            System.out.println();
        }
    }
}
