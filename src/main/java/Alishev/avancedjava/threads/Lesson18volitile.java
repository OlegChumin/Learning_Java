package Alishev.avancedjava.threads;

import java.util.Scanner;

public class Lesson18volitile {
    public static void main(String[] args) {
        // ввиду несинхонности работы потоков необходимо сделать, так чтобы они работали структурно так как нам требуется
        MyThreadNew myThreadNew = new MyThreadNew();
        myThreadNew.start();
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
//        if (stop.equalsIgnoreCase("STOP")) {
            myThreadNew.stopThread();
//        }
    }
}

class MyThreadNew extends Thread {              // код может не сработать по причине плохой когерентности кешей
    private volatile boolean running = true;    // volatile изменчивый/непостоянный не будет кешироваться и
                                                // будет находится только в main memory, т.е. значение
                                                // не кешируется для каждого потока, а берется из общей памяти


    @Override
    public void run() {
        while (running) {
            System.out.println("Hello from Thread:" + Thread.currentThread());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        this.running = false;
    }
}


