package Alishev.avancedjava.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Lesson021ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); //создаем пул из 5 потоков

        for (int i = 0; i < 5; i++) {
            executorService.submit(new WorkForExecutor(i)); // тоже используем объект который создан на базе класса \
            // имплементирующего интерфейс Runnable
            executorService.shutdown(); // больше новых заданий на 10 потоков не принимаем
            // аналог метода start
            System.out.println("Все нити запущены");

            executorService.awaitTermination(1, TimeUnit.HOURS); // задаем предел времени ожидания окончания
            // выполнения задачи потоками
            //здесь поток main ждет выполнения
        }
    }
}

class WorkForExecutor implements Runnable {
    private int id;

    public WorkForExecutor(int id) { // конструктор для создания объекта чтобы был id
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Работа " + id + " закончена");
    }
}
