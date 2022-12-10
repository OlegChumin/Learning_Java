package Alishev.avancedjava.threads;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lesson030FutureII {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(()->{ // интерфейс Callable
            System.out.println("Starting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finishing");
            Random random = new Random();
            int randomValue = random.nextInt();
            if (randomValue < 5) throw new Exception("Something bad happend");
            return random.nextInt(10);
        });
        executorService.shutdown();

        try {
            int result = future.get(); // get дожидается окончания выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
