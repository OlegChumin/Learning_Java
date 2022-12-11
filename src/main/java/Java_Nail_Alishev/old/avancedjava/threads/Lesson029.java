package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.Random;

public class Lesson029 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    if(Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted");
                        break;
                    } // листенер что поток запрошен на прерывание
                    Math.sin(random.nextDouble()); //в радианах по умолчанию Math.toDegrees()
                }
            }
        });
        System.out.println("Starting Thread");
        thread.start();
        Thread.sleep(2000);
        thread.interrupt(); // прерывание потока, он его не останавливает, но потоку сообщается что надо остановиться
        //thread.stop(); //был метод который полностью убивал поток (останавливал)
        // поскольку вызывал неопределенное состояние
        thread.join();

//        goto // тоже неиспользуется
        System.out.println("Ending Thread");
    }
}
