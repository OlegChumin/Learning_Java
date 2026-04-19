package Part_07_Streams.Part_51;

import java.util.Arrays;

public class StreamMethodSorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
