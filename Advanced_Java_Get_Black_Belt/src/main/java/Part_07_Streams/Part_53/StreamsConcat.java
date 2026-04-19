package Part_07_Streams.Part_53;

import java.util.stream.Stream;

public class StreamsConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> streamConcat = Stream.concat(stream2, stream3); //concat cannot be used in chain of streams methods
        streamConcat.forEach(System.out::println);
    }
}
