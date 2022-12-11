package Java_Nail_Alishev.old.avancedjava.threads;

public class Lesson19synchronized {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
    Lesson19synchronized test = new Lesson19synchronized();
    test.doWork();
    }

    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    increment();
//                    counter++; // операция не атомарна -> идет пропуск данных при записи в переменную с разных потоков
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    increment();
//                    counter++;
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // в текущем потоке ждем когда завершится поток thread 2 поток main в этом месте ждет завершения thread1
        thread2.join(); // в текущем потоке ждем когда завершится поток thread 1 поток main в этом месте ждет завершения thread1

        System.out.println(counter);

    }
}

