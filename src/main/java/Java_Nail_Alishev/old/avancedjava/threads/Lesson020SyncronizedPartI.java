package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson020SyncronizedPartI {
    public static void main(String[] args)  {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    private List<Integer> list1 = new ArrayList<>(); // смотрим на примере list состояние гонки
    private List<Integer> list2 = new ArrayList<>(); //

    public synchronized void addToList1() { // 1000 раз добавляет случайное число с задержкой 1 мсек в list1
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100)); // добавляет целое псевдослучайное число от 0 до 99
    }

    // дублирование кода пока не смотрим хотя надо создать метод с параметром List<Integer>
    public synchronized void addToList2() { // 1000 раз добавляет случайное число с задержкой 1 мсек в list2
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100)); // добавляет целое псевдослучайное число от 0 до 99
    }

    public void work() { //вызывает методы заполняющие list 1 и list2
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main()  {
        long timeBefore = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        }); // создаем 1 поток
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        }); // создаем 2 поток

        thread1.start(); // запускаем 1 поток каждый поток начинает добавлять в оба list!
        thread2.start(); // запускаем 2 поток

        try {
            thread1.join();  // ждем окончания работы потоков
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long timeAfter = System.currentTimeMillis();

        System.out.println("Время исполнения программы: " + (timeAfter - timeBefore));
        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}