package Part_07_Streams.Part_54;

import java.util.stream.Stream;

public class StreamsDistinct {
    public static void main(String[] args) {
        //distinct (отчетливый) returns stream of unique elements
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream.distinct().forEach(System.out::println);
        System.out.println();
        //distinct (отчетливый) returns stream of unique elements
        Stream<Integer> stream2 = Stream.of(1, 1, 5, 1, 5, 1, 2, 2);
        stream2.distinct().forEach(System.out::println);

    }
}
