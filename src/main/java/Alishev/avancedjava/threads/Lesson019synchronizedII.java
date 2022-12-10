package Alishev.avancedjava.threads;

public class Lesson019synchronizedII {
    //когда необходимо чтобы потоки по очереди обращались к полю например один пишет, а все остальные читают
    //volatile не подходит и применяется synchonized
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        //создаем потоки, которые будут делить одно поле
        Lesson019synchronizedII test = new Lesson019synchronizedII(); // при создании каждого объекта
        test.doWork();
    }

    public void increment() {
        //
        synchronized(this) { // блок synchronized
            counter++;
        }

    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    increment();

                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    //counter = counter + 1;
                    increment();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    } //end of doWork()

}
