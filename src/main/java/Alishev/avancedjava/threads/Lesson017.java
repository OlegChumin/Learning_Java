package Alishev.avancedjava.threads;
//потоки В Java не синхронизированы и будут бороться за приоритет к ресурсам

public class Lesson017 {
    public static void main(String[] args) {
        OlegThread olegThread1 = new OlegThread();
        olegThread1.start(); //создает новый поток и запускает код из метода run
        OlegThread olegThread2 = new OlegThread();
        olegThread2.start();
        System.out.println("Hallo from main Thread" + Thread.currentThread());
        System.out.println();

        //создание потоков с помощью создания объектов непосредственно от класса Thread
        Thread thread1 = new Thread(new OlegToRunRunnable());
        thread1.start();
        Thread thread2 = new Thread(new OlegToRunRunnable());
        thread2.start();
    }
}

class OlegThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from OlegThread" + Thread.currentThread());
    }
}

//creating thread by implementing of @Functional interface Runnable
class OlegToRunRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Running thread of @Functional interface Runnable" + Thread.currentThread());
    }
}