package Alishev.avancedjava.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson025 {
    public static void main(String[] args) throws InterruptedException {
        //потокобезопасный
        CountDownLatch latch = new CountDownLatch(3); //количество итерация прежде чем защелка отопрется

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(latch));
        }
        executorService.shutdown();
        latch.await();
        System.out.println(("Latch'em opened, main thread is processing"));
    }
}

class Processor  implements Runnable {
    private CountDownLatch latch;

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();

    }
}