package lesson_CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Первое готово";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep(2);
            return "Второе готово";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            sleep(3);
            return "Третье готово";
        });

        // Дождемся всех и после этого напечатаем результат
        CompletableFuture.allOf(future1, future2, future3)
                .thenRun(() -> {
                    try {
                        System.out.println(future1.get());
                        System.out.println(future2.get());
                        System.out.println(future3.get());
                        System.out.println("Все задачи завершились!");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                })
                .join(); // Ждем завершения всей цепочки
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
