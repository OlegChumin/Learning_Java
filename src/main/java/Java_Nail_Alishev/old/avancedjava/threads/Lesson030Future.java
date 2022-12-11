package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson030Future {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(()->{
            System.out.println("Starting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finishing");
            Random random = new Random();
            return random.nextInt(10);
        });
        executorService.shutdown();
    }
}
