package Alishev.avancedjava.lambda;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Сообщение из тела безымянного метода безымянного класса");
            System.out.print("Работа потока thread1");
            for (int i = 0; i < 80; i++) {
                try {
                    Thread.sleep(37, 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(".");
            }
        }); // самое простое написание лямбда выражения
        thread.start();
        thread.join();
        System.out.println("Запущенный поток завершен");
        System.out.println("Поток main продолжил и завершил работу");
    }
}
