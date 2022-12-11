package Java_Nail_Alishev.old.avancedjava.lambda;

public class LambdaI {
    public static void main(String[] args) {
        // с Java8 просто способ передать кусок кода в метод
        // или позволяют обойтись без применения анонимных классов
        // это просто синтаксис сокращающий объем кода

        Thread thread = new Thread(new Runnable() { // это вариант с анонимным классом
            @Override
            public void run() {
                System.out.println("Hallo from thread1");
            }
        });

        // лямбда выражение
        Thread thread2 = new Thread(() -> System.out.println("Hallo from thread1"));



        // первый способ создаем interface Executable с 1 методом execute
        // создаем класс Runner с методом run принимающий переменную типа Executable
        // создаем класс ExecutableImpl и implements interface Executable
        // переопределяем метод execute по требованию interface Executable
        var runner = new RunnerNew(); // создаем объект типа Runner
        runner.run(new ExecutableImpl()); // запускаем метод run с новым объектом типа Executable
        runner.run(new ExecutableNew() { // второй способ через анонимный класс
            @Override
            public void execute() {
                System.out.println("Hallo");
            }
        });
        runner.run(() -> System.out.println("Hallo")); // 3 способ передаем анонимную функцию = лямбда выражение, метод без названия
    }
}

interface ExecutableNew {
    void execute();
}

class RunnerNew {
    public void run(ExecutableNew e) {
    }
}

class ExecutableImpl implements ExecutableNew {
    @Override
    public void execute() {
        System.out.println("Hallo");
    }
}
