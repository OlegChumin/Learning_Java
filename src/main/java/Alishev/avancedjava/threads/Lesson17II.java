package Alishev.avancedjava.threads;

public class Lesson17II {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new Runner());
        Thread thread02 = new Thread(new Runner());
        Thread thread03 = new Thread(new Runner());
        Thread thread04 = new Thread(new Runner());
        Thread thread05 = new Thread(new Runner());
        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
        thread05.start();
        System.out.println("Hello from main Thread!");
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from Thread : " + Thread.currentThread());
        }
    }
}
