import java.util.Comparator;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4)
                .filter(i -> i%2 == 0)
                .peek(i -> System.out.println(i));

        System.out.println("Text");
        stream.forEach(i -> System.out.println(i+1));
    }
}
