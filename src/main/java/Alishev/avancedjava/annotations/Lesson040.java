package Alishev.avancedjava.annotations;


public class Lesson040 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();

        Thread thread = new Thread(() -> System.out.println("Hallo from Thread thread"));
        thread.start();
        thread.join();
        System.out.println("All threads finished work");

        A a = new A();
        a.test(); // среда разработки зачеркивает этот метод, но использование его не запрещено
    }

}

class A {
    @Deprecated // обозначаем что метод устарел
    public void test() {
        System.out.println("Hallo from class A");
    }

}

class B extends A {
    @Override //не даст скомпилировать программу если метод в классе B не переопределен
    public void test() {
//        super.test(); // по умолчанию используется код из блока метода родителя
        System.out.println("Hallo from class B");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
//        super.run(); // по умолчанию в переопределенном методе вызывается код метода run суперкласса
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread work");
    }
}

//@SuppressWarnings // для игнорирования предупреждений из кода
