package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("how d'you do");
        list.add("OK");
        list.add("See you");
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {344554, 5, 6, 78, 213, 456, 434, 2434};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hallo");
        set.add("how d'you do");
        set.add("OK");
        set.add("See you");

        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
