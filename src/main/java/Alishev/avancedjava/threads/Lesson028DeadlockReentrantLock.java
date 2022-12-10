package Alishev.avancedjava.threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lesson028DeadlockReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        RunnerNewRL runner = new RunnerNewRL();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class RunnerNewRL {
    private AccountRL account1 = new AccountRL();
    private AccountRL account2 = new AccountRL();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2)  {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }

                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } //end of while()
    }

    public void firstThread() { // метод будет исполнять первый поток
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
//            lock1.lock(); // если 2 на 1 поменять может быть deadlock в synchronized
//            lock2.lock();
            takeLocks(lock1, lock2);
            try {
                AccountRL.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() { // метод будет исполнять второй поток
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
//            lock2.lock();
//            lock1.lock();
            takeLocks(lock2, lock1);
            try {
                AccountRL.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() { // метод, который будет работать после исполнения двух потоков
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance " + (account1.getBalance() + account2.getBalance()));
    }
}

class AccountRL {
    private int balance = 10_000;

    public void deposit(int ammount) {
        balance += ammount;
    }

    public void withDraw(int ammount) {
        balance -= ammount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(AccountRL acc1, AccountRL acc2, int ammount) { // перемещения средств между счетами
        acc1.withDraw(ammount);
        acc2.deposit(ammount);
    }
}
