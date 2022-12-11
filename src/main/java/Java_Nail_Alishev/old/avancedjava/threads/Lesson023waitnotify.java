package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.Scanner;

public class Lesson023waitnotify {
    public static void main(String[] args) throws InterruptedException {
        //wait и notify определены у любого объекта в Java

//        Object object = new Object();
//        object.wait();

        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
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

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer Thread started...");
            wait(); // может вызываться только в пределах синхронизованного блока на объекте на котором блок определен
            // отдаем intrinsic lock и ждем пока будет вызван notify()
            System.out.println("Producer Thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key ");
            scanner.nextLine();
            notify(); //пробуждает 1 поток, но не освобождает монитор
        }
    }
}
