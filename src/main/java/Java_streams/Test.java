package Java_streams;

import java.util.stream.IntStream;

public class Test {
    private final static int I_RANGE = 100;
    private final static int J_RANGE = 150;
    private final static int K_RANGE = 230;

    public static void main(String[] args) {

    }

    private static void loopMethod() {
        for (int i = 0; i < I_RANGE; i++) {
            for (int j = 0; j < J_RANGE; j++) {
                for (int k = 0; k < K_RANGE; k++) {
                    doSomething();
                }
            }
        }
    }

    private static void doSomething() {
        System.out.println("working...");
    }

//    private static void streamsMethod() {
//        IntStream.range(0, I_RANGE)
//                .flatMap(i -> IntStream.range(0, J_RANGE)
//                        .flatMap(j -> IntStream.range(0, K_RANGE)
//                                .forEach(k -> {
//                                    doSomething();
//                                })))
//                .count();
//    }
}
