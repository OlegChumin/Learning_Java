package Java_streams;

import java.util.stream.IntStream;

public class Test0 {
    private final static int I_RANGE = 100;
    private final static int J_RANGE = 150;
    private final static int K_RANGE = 230;

    public static void main(String[] args) {
        loopMethod();
    }

    private static void loopMethod() {
        IntStream.range(0, I_RANGE)
                .flatMap(i -> IntStream.range(0, J_RANGE)
                        .flatMap(j -> IntStream.range(0, K_RANGE)
                                .map(k -> doSomething())))
                .count();
    }

    private static int doSomething() {
        System.out.println("working...");
        return 0;
    }
}
