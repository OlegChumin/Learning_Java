package Part_07_Streams.Part_56;

import java.util.stream.Stream;

public class StreamsPeek {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.distinct().peek(System.out::println).count()); //peak - let to view what is going on
        // streams methods chaining like forEach(t) but peek(i)!
    }
}
