package Part_07_Streams.Part_52;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodChainingInStreamsSamples {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(element -> element % 2 == 1)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .reduce((accumulator, element) -> accumulator + element).getAsInt();
        System.out.println(result);

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.filter(element -> { // filter() is not terminal method
            System.out.println("!!!");
            return element % 2 == 0;
        });

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        List<Integer> list = stream2.filter(element -> {
            return element % 2 == 0;
        }).collect(Collectors.toList()); //terminal / eager method
        System.out.println(list);
    }
}
