package Java_Nail_Alishev.old.collections;

import java.util.ArrayList;
import java.util.List;

public class Lesson002003ArrayList {
    public static void main(String[] args) {
//        int[] x = new int[3];
//        for (int i = 0; i < 4; i++) {   // ArrayIndexOutOfBoundsException
//            x[i] = 1;
//        }
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for (int i = 6; i < 21; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(arrayList.size() - 1));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        for (Integer element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();

        arrayList.remove(5); // очень нееэффективен
        System.out.println(arrayList);

        System.out.println(arrayList.contains(7));
        System.out.println(arrayList.contains(6));
        System.out.println(arrayList.indexOf(9));

//        arrayList = new LinkedList<>();

    }
}
