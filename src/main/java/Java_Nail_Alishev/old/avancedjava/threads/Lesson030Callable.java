package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson030Callable {
    private static int result;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5;
            }
        });

        executorService.shutdown();
        System.out.println(result);
    }
}
