package Part_07_Streams.Part_49;

import java.util.Arrays;

public class StreamMethodForEach {
    public static void main(String[] args) {
        //forEach -> void not the same as forEach on Collection
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(element -> {element *= 2;
            System.out.println(element);});
        Arrays.stream(array).forEach(System.out::println); // reference to method println
        Arrays.stream(array).forEach(element -> Utils.addFive(element));
        Arrays.stream(array).forEach(Utils::addFive); // reference to method addFive
    }
}

class Utils{
    public static void addFive(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}
