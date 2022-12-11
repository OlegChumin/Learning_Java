package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.LinkedList;
import java.util.Queue;

public class Lesson024ProduceConsumer {

    public static void main(String[] args) throws InterruptedException {
        //wait и notify определены у любого объекта в Java

//        Object object = new Object();
//        object.wait();

        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


        //wait и notify нужны для создания синхронизации, они нужны каждому объекту
        // для синхронизации
    }
}

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object(); //синхронизация на объектах константах должна быть

    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                int value = queue.poll(); // появилось 1 свободное место
                System.out.println(value);
                System.out.println("Queue size = " + queue.size());
                lock.notify();
            }

            Thread.sleep(500);
        }
    }
}
