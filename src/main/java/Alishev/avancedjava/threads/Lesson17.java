package Alishev.avancedjava.threads;

public class Lesson17 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
//        myThread.run();        //не надо запускать он для внутреннего использования
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();

        Thread.sleep(50);
        System.out.println("Hello World! from main Thread");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello from my Thread" + Thread.currentThread());
        }
    }
}
