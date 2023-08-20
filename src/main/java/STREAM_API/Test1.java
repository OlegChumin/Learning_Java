package STREAM_API;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 5, 8, 13, 21)
                .filter(n -> n>=5) //1
                .sorted(Comparator.comparing(n -> n-10)) //2
                .map(n -> n * 2) //3
                .limit(3) //4
                .forEach(System.out::println);
    }
}
