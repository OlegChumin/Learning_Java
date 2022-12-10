package Alishev.avancedjava.threads;

import java.util.Scanner;

public class Lesson018 {
    public static void main(String[] args) throws InterruptedException {
        OlegThreadNew thread1 = new OlegThreadNew();
        thread1.start();
        Thread.sleep(4000); // в этом варианте четко останаливает с volitile меткой у running
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine(); // ждет следующую линию после нажатия на Enther
//        // вызывается метод shutDown() но не всегда сразу выключается, поскольку running не для всех false?
//        // есть копия в кешах нитей и они не сразу сравнивают с кешем центральной памяти
        thread1.shutDown();
    }
}

class OlegThreadNew extends Thread {

    private volatile boolean running = true; //как остановить поток? volatale необходимо для
    // пометки поля (переменной) что она может быть изменена и поэтому данное поле не кешируется в потоках каждого ядра
    // чтобы у каждого потока была одинаковая версия данного поля (переменной)

    @Override
    public void run() {
        int k = 0;
        while (running) {
            System.out.println("Hello from " + Thread.currentThread() + " " + k);
            k++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        this.running = false;
    }
}