package Benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream<T>
 * IntStream        Stream<Integer>
 * LongStream       Stream<Long>
 * DoubleStream     Stream<Double>
 * <p>
 * Java Microbenchmark Harness (JMH)
 */
public class StreamsBenchmark {

    private static int[] ints;
    private static Integer[] integers;

    private static final long STREAM_SIZE = 1_000_000;
    private static final int RANDOM_NUMBER_ORIGIN = 0;
    private static final int RANDOM_NUMBER_BOUND = 1_000;

    public static void main(String[] args) {

    }

    @Setup
    public static void setup() {
        ints = new Random(1).ints(STREAM_SIZE, RANDOM_NUMBER_ORIGIN, RANDOM_NUMBER_BOUND).toArray();
        integers = new Random(1)
                .ints(STREAM_SIZE, RANDOM_NUMBER_ORIGIN, RANDOM_NUMBER_BOUND)
                .boxed()
                .toArray(Integer[]::new);
    }

    /** public static void setup()
     * Обе строки кода генерируют массив случайных чисел, но есть два основных различия между ними:
     * <p>
     * Тип данных: В первой строке создается массив примитивных целых чисел (int[]), а во второй — массив объектов типа
     * Integer (Integer[]). Метод toArray() без аргументов возвращает массив примитивов, тогда как
     * toArray(Integer[]::new) возвращает массив объектов.
     * <p>
     * Метод boxed(): Этот метод используется во второй строке для преобразования IntStream (поток примитивных
     * типов int) в Stream<Integer> (поток объектов Integer). Это необходимо, потому что toArray(Integer[]::new) ожидает
     * поток объектов, а не поток примитивов.
     * <p>
     * Важно отметить, что массивы примитивных типов обычно занимают меньше памяти и обеспечивают более быстрый доступ
     * к данным по сравнению с массивами объектов, так как они не имеют накладных расходов на хранение метаданных
     * объекта и ссылок на объекты. Однако массивы объектов могут быть более удобны в использовании, если вам нужно
     * взаимодействовать с API, которые ожидают объекты, или если вам нужны методы, которые доступны только
     * для объектов.
     * <p>
     * В Java, запись Integer[]::new является ссылкой на конструктор, которая эквивалентна лямбда-выражению, которое
     * принимает один аргумент и возвращает новый массив Integer[] этого размера. Однако в Java 8 и более поздних
     * версиях прямой аналог с использованием анонимного класса отсутствует, поскольку анонимные классы не могут иметь
     * конструкторов с аргументами. Тем не менее, это можно имитировать с использованием интерфейса IntFunction
     * следующим образом:
     * <p>
     * java
     * Copy code
     * IntFunction<Integer[]> arrayConstructor = new IntFunction<Integer[]>() {
     *
     * @Override public Integer[] apply(int value) {
     * return new Integer[value];
     * }
     * };
     * <p>
     * Integer[] array = list.stream().toArray(arrayConstructor);
     * В этом коде создается анонимный класс, реализующий интерфейс IntFunction<Integer[]>. Метод apply() этого
     * интерфейса принимает один аргумент типа int и возвращает массив Integer[] этого размера. Этот анонимный класс
     * функционально эквивалентен Integer[]::new, но запись существенно длиннее и сложнее для чтения.
     */

    @Benchmark
    public static long stream() {
        return Stream.of(integers).distinct().count();
    }

    public static long intStream() {
        return IntStream.of(ints).distinct().count();
    }
}
