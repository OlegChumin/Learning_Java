package Part_07_Streams.Part_47;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethodMap {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hallo");
        stringArrayList.add(" Leo!");
        stringArrayList.add(" Be ");
        stringArrayList.add("ready for ");
        stringArrayList.add(" Java ");
        stringArrayList.add(" interview!");
        stringArrayList.add(" interview!");

        List<String> stringArrayList2 = new ArrayList<>(stringArrayList);

        System.out.println(stringArrayList);
        for (int i = 0; i < stringArrayList.size(); i++) {
            stringArrayList.set(i, String.valueOf(stringArrayList.get(i).length())); // String.valueOf Returns the string representation of the int argument.

        }
        System.out.println(stringArrayList);

        List<Integer> arrayListAfterStreamMap = stringArrayList2.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(arrayListAfterStreamMap);
        System.out.println(stringArrayList2);

        int[] array = {5, 9, 3, 8, 1};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Hallo");
        treeSet.add(" Leo!");
        treeSet.add(" Be ");
        treeSet.add("ready for ");
        treeSet.add(" Java ");
        treeSet.add(" interview!");
        treeSet.add(" interview!");

        System.out.println(treeSet);
        Set<Integer> integerSet = treeSet.stream().map(element -> element.length()).collect(Collectors.toSet());
        List<Integer> integerList = treeSet.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("integerSet " + integerSet);
        System.out.println("integerList " + integerList);
    }
}