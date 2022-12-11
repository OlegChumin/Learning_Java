package Java_Nail_Alishev.old.avancedjava.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Lesson027SemaphoreII {
    public static void main(String[] args) throws InterruptedException {
//        new Connection(); // невозможно создать объект, приватный конструктор не дает это сделать
//        Connection.getConn();
//        Connection.conn2(); // невозможно создать поскольку конструктор приватный
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConn(); // создали connection объект
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);

    }
}

class Connection {
    private static Connection conn = new Connection(); // переменная приватная и видна только в классе Connection
    private int connCount;
    private Semaphore semaphore = new Semaphore(10); // даем только 10 пермитов на 200 потоков

    private Connection() {
    } //приватный конструктор позволяющий создать только один объект - singleton паттерн

    public static Connection getConn() {
        if (conn == null) {
            conn = new Connection();
        } //если объект еще не создан
        return conn;
    }

    //    public static Connection conn2 = new Connection(); //а внутри Connection этих объектом можно создать бесконечность
    public void work() throws InterruptedException { // обернули doWork в новый метод поскольку release()
        // должен быть в финальном блоке
        semaphore.acquire(); // взяли permit на ресурс
        doWork();
        semaphore.release(); // отдали permit на ресурс
    }

    private void doWork() throws InterruptedException { // метод имитирующий работу с сервером
        synchronized (this) { // первый блок синхронизации
            connCount++; // увеличиваем счетчик
            System.out.println(connCount);
        }
        Thread.sleep(2000); // имитация работы с соединением

        synchronized (this) {
            connCount--;
        }
    }
}
