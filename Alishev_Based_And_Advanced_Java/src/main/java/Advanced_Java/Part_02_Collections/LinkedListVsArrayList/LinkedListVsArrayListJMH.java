package Advanced_Java.Part_02_Collections.LinkedListVsArrayList;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Бенчмарк для сравнения производительности ArrayList и LinkedList
 * по следующим операциям:
 * <ul>
 *     <li>добавление в конец</li>
 *     <li>добавление в начало</li>
 *     <li>получение по индексу</li>
 *     <li>удаление из начала</li>
 * </ul>
 * Используется фреймворк JMH.
 *
 * To start measuring benchmark: run BenchmarkRunner or in terminal (PowerShell)
 * mvn clean install
 * mvn exec:exec -Dexec.mainClass=org.openjdk.jmh.Main
 *
 * @BenchmarkMode(Mode.AverageTime) измеряется среднее время выполнения
 * @OutputTimeUnit(TimeUnit.MILLISECONDS) единица измерения — миллисекунды
 * @State(Scope.Thread) каждый поток бенчмарка использует собственный экземпляр класса
 * ускорить
 * @Warmup(iterations = 1, time = 2) прогрев: 1 итерация по 2 секунды
 * @Measurement(iterations = 2, time = 2) измерения: 2 итерации по 2 секунды
 * @Fork(1)   запускать один отдельный процесс JVM
 * добавить к аннотациям класса
 */
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