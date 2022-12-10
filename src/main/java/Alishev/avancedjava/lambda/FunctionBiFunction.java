package Alishev.avancedjava.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mult = (x, y) -> x * y; // два Integer на входе и return Integer
        Function<Integer, Double> sout = x -> Double.valueOf(x);
        Function<Integer, Integer> mult2 = (Integer x) -> x * 2;
        System.out.println(sout.apply(8)); // вызов функции sout
        System.out.println(mult.apply(10, 10)); // вызов BiFunction mult
        printResultfLength(s -> s.length());

        Function<String, Integer> fLength = str -> str.length();

    }

    static void printResult(Function<Integer, Double> d) {
        System.out.println(d.apply(7)); // вызов функции sout как параметра метода printResult
    }

    static void printResultBi(BiFunction<Integer, Integer, Integer> f) {
        System.out.println(f.apply(8, 8)); // вызов BiFunction mult как параметра метода printResultBi
    }


    static void printResultfLength (Function<String, Integer> fLength) {
        System.out.println(fLength.apply("343ff33f32f"));
    }

}
