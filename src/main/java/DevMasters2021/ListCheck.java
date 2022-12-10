package DevMasters2021;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListCheck {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3));
        for (Integer i : list) {
            list.add(i+3);
            System.out.println(i);
        }
    }
}
