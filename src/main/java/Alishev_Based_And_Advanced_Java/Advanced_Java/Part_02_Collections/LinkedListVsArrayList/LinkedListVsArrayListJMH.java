package Alishev_Based_And_Advanced_Java.Advanced_Java.Part_02_Collections.LinkedListVsArrayList;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class LinkedListVsArrayListJMH {

    /**
     * Тип списка: ArrayList или LinkedList (задаётся параметром бенчмарка).
     */
    @Param({"ArrayList", "LinkedList"})
    private String listType;

    /**
     * Сам список, над которым будут выполняться операции.
     */
    private List<Integer> list;

    private static final int BIG_SIZE = 10_000_000;
    private static final int SMALL_SIZE = 10_000;

    /**
     * Инициализация списка перед каждым запуском бенчмарка.
     * В зависимости от параметра создаётся ArrayList или LinkedList.
     */
    @Setup(Level.Invocation)
    public void setup() {
        if (listType.equals("ArrayList")) {
            list = new ArrayList<>();
        } else {
            list = new LinkedList<>();
        }
    }

    /**
     * Бенчмарк: добавление элементов в конец списка.
     */
    @Benchmark
    public void benchmarkAddToEnd() {
        for (int i = 0; i < BIG_SIZE; i++) {
            list.add(i);
        }
    }


    /**
     * Бенчмарк: добавление элементов в начало списка.
     */
    @Benchmark
    public void benchmarkAddToBeginning() {
        for (int i = 0; i < SMALL_SIZE; i++) {
            list.add(0, i);
        }
    }

    /**
     * Бенчмарк: доступ к элементам по индексу после предварительного заполнения списка.
     */
    @Benchmark
    public void benchmarkGet() {
        for (int i = 0; i < SMALL_SIZE; i++) {
            list.add(i);
        }
        for (int i = 0; i < SMALL_SIZE; i++) {
            list.get(i);
        }
    }

    /**
     * Бенчмарк: удаление элементов с начала списка после предварительного заполнения.
     */
    @Benchmark
    public void benchmarkRemoveFromBeginning() {
        for (int i = 0; i < SMALL_SIZE; i++) {
            list.add(i);
        }
        for (int i = 0; i < SMALL_SIZE; i++) {
            list.remove(0);
        }
    }
}
