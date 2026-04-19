package Part_08_Multithreading.Part_85;

import java.util.concurrent.atomic.AtomicInteger;

public class SampleOfAtomicInteger {
    static int counter = 0;
    static int nonSynchronizedCounter = 0;
    static AtomicInteger atomicCounter = new AtomicInteger(0);

    public synchronized static void increment() { //added synchronized
        counter++; // non atomic operation
    }

    public static void nonSyncrhronizedIncrement() { //not added synchronized
        nonSynchronizedCounter++; // non atomic operation
    }

    public static void atomicIncrement() { //no need to be synchronized
        atomicCounter.incrementAndGet(); // atomic operation
    }

    public static void atomicChange() { //no need to be synchronized and no data race
        atomicCounter.incrementAndGet(); // atomic operation  atomicCounter++
        atomicCounter.decrementAndGet(); // atomicCounter--
        atomicCounter.addAndGet(5); // atomicCounter += 5
        atomicCounter.getAndAdd(5); // = atomicCounter then atomicCounter += 5;
        atomicCounter.getAndAdd(-5); // = atomicCounter then atomicCounter -= 5;
        atomicCounter.getAndDecrement(); // = atomicCounter then atomicCounter--;
        atomicCounter.getAndIncrement(); // = atomicCounter then atomicCounter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new CounterThreadsSynchronized());
        Thread thread2 = new Thread(new CounterThreadsSynchronized());
        Thread thread3 = new Thread(new AtomicCounter());
        Thread thread4 = new Thread(new AtomicCounter());
        Thread thread5 = new Thread(new NonSynchronizedCounter());
        Thread thread6 = new Thread(new NonSynchronizedCounter());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();

        System.out.println("synchronized counter = " + counter);
        System.out.println("atomicCounter = " + atomicCounter);
        System.out.println("nonSynchronizedCounter = " + nonSynchronizedCounter);
    }
}

class CounterThreadsSynchronized implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SampleOfAtomicInteger.increment();
        }
    }
}

class AtomicCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SampleOfAtomicInteger.atomicIncrement();
        }
    }
}

class NonSynchronizedCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SampleOfAtomicInteger.nonSyncrhronizedIncrement();
        }
    }
}