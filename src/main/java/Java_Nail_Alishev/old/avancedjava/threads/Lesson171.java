package Java_Nail_Alishev.old.avancedjava.threads;

public class Lesson171 {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new Runner01());
        thread01.start();
    }


}

class Runner01 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hallo from Thread " + Thread.currentThread());
    }
}
