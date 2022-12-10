package Alishev.avancedjava.lambda;


interface Executable4 {
    void execute();
}

class Runner4 {
    //т.е. для запуска метода run необходимо передать объект класса реализующего интерфейс Executable
    public void run(Executable4 e) {
        e.execute();
    }
}

class ExecutableImplementation4 implements Executable4 {

    @Override
    public void execute() {
        System.out.println("Hallo from 1nd way to start run() method by building new class implementing Executable");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Runner4 runner = new Runner4(); // создали объект класса Runner, чтобы запустить метод run
        runner.run(new ExecutableImplementation4()); //передаем для реализации объект реализующий интерфейс Executable
        runner.run(new Executable4() {
            @Override
            public void execute() {
                System.out.println("Hallo from 2nd way to start run() method with parameter Executable type");
            }
        });
        runner.run(() -> System.out.println("Hallo from 3rd way to start run() by Lambda"));

    }
}
