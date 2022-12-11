package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.Random;

public class Lesson028Deadlock {
    public static void main(String[] args) throws InterruptedException {
        RunnerNew runner = new RunnerNew();
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

class RunnerNew {
    private Account account1 = new Account();
    private Account account2 = new Account();


    public void firstThread() { // метод будет исполнять первый поток
        Random random = new Random();
//        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account1, account2, random.nextInt(100));
                }
            }
        }
    }

    public void secondThread() { // метод будет исполнять второй поток
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            synchronized (account1) {  // два вложенных блока synchronized не приветствуются
                synchronized (account2) {
                    Account.transfer(account2, account1, random.nextInt(100));
                }
            }
        }
    }

    public void finished() { // метод, который будет работать после исполнения двух потоков
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account {
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

    public static void transfer(Account acc1, Account acc2, int ammount) { // перемещения средств между счетами
        acc1.withDraw(ammount);
        acc2.deposit(ammount);
    }
}
