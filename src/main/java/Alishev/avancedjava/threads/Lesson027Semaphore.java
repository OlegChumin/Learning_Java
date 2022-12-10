package Alishev.avancedjava.threads;

import java.util.concurrent.Semaphore;

public class Lesson027Semaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3); //указываем в конструкторе сколько потоков может
        // использовать ресурс, потоки будут брать разрешения и будут их возвращать после завершения работы с ресурсом
        try {
            semaphore.acquire(); // метод для начала взаимодействия с русурсом
            semaphore.acquire();
            semaphore.acquire();
            System.out.println("All permits've been acquired");
            semaphore.acquire();
            System.out.println("Can't reach here..."); // сюда поток main не дойдет

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release(); //отпускает разрешения
        System.out.println(semaphore.availablePermits()); // количество свободных разрешений
        //если все разрешения израсходованы, после вызова нового acquire поток будет ждать
    }
}

