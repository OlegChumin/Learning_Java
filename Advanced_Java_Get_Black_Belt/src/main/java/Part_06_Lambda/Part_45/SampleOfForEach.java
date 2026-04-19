package Part_06_Lambda.Part_45;

import java.util.*;

public class SampleOfForEach {
    private static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hallo");
        stringArrayList.add(" Leo");
        stringArrayList.add(" Be ");
        stringArrayList.add("ready to ");
        stringArrayList.add(" Java ");
        stringArrayList.add(" interview!");
        stringArrayList.add(" interview!");

        for (String element: stringArrayList) {
            System.out.println(element);
        }
        System.out.println();

        stringArrayList.forEach(string -> System.out.println(string));
        System.out.println();

        stringArrayList.forEach(System.out::println);
        System.out.println();

        System.out.println(stringArrayList);
        System.out.println();
        stringArrayList.removeIf(element -> element.length() < 6);
//        Predicate<String> predicate = element -> element.length() < 5;
        System.out.println(stringArrayList);


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(random.nextInt(1000));
        }
//        printCollection(integerArrayList);
        printCollectionWithSpace(integerArrayList);
        System.out.println();
        printCollectionWithSpace(fillListBy10Elements(new ArrayList<>()));
        System.out.println();

        LinkedList<Integer> linkedList = (LinkedList<Integer>) fillListBy10Elements(new LinkedList<>());
        linkedList.forEach(element -> {
            System.out.print(element + " ");
            element *= 2;
            System.out.println(element + " ");
        });
        System.out.println();
    }

    private static <T> void printCollection(Collection<T> collection) {
        collection.forEach(System.out::print);
    }

    private static <T> void printCollectionWithSpace(Collection<T> collection) {
        collection.forEach(element -> {System.out.print(element + " ");});
    }


    private static List<Integer> fillListBy10Elements(List<Integer> collection){
        for (int i = 0; i < 10; i++) {
            collection.add(random.nextInt(1000));
        }
        return collection;
    }
}
