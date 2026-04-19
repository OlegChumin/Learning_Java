package Advanced_Java.Part_02_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestLinkedList1 {
    private final static int ARRAY_LENGTH = 10;
    private final static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> linkedList =  new LinkedList<>();

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            linkedList.add(random.nextInt(2));
        }
        System.out.println(linkedList);
        System.out.println(linkedList.get(0));
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.remove(5);
        System.out.println(linkedList);

    }
}
