package lesson_CompletableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * несколько примеров, которые показывают:
 *
 * последовательное выполнение;
 *
 * объединение двух результатов;
 *
 * сбор результатов нескольких тасков;
 *
 * обработку ошибок.
 */
public class CompletableFutureExamples {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Пример 1: Простая цепочка
        CompletableFuture.supplyAsync(() -> slowTask("Step 1", 1))
                .thenApply(result -> result + " -> Step 2 done")
                .thenAccept(System.out::println)
                .join();

        // Пример 2: Комбинирование двух результатов
        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> slowCalc(10, 1))
                .thenCombine(
                        CompletableFuture.supplyAsync(() -> slowCalc(20, 2)),
                        Integer::sum
                );

        System.out.println("Сумма 10 + 20 = " + sumFuture.get());

        // Пример 3: Сбор результатов нескольких асинхронных задач
        List<CompletableFuture<String>> tasks = List.of(
                CompletableFuture.supplyAsync(() -> slowTask("Task 1", 1)),
                CompletableFuture.supplyAsync(() -> slowTask("Task 2", 2)),
                CompletableFuture.supplyAsync(() -> slowTask("Task 3", 1))
        );

        List<String> results = tasks.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println("Все результаты: " + results);

        // Пример 4: Обработка ошибки
        CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException("Ошибка внутри future");
                })
                .exceptionally(ex -> "Поймали ошибку: " + ex.getMessage())
                .thenAccept(System.out::println)
                .join();

        System.out.println("Все примеры выполнены.");
    }

    private static String slowTask(String name, int seconds) {
        sleep(seconds);
        return name + " done";
    }

    private static int slowCalc(int value, int seconds) {
        sleep(seconds);
        return value;
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}