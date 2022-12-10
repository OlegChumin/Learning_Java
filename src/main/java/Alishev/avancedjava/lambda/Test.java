package Alishev.avancedjava.lambda;


interface Executable {
    void execute();
//    void executeSecond();  //если добавлено более одного метода в интерфейс лямбда выражение невозможно
}

interface ExecutableInt {
    int executeInt();
}

interface ExecutableIntInt {
    int executeIntInt(int x); // интерфейс с единственным методом принимающим параметр
    // целое число и возвращающим целое число
}

interface ExecutableTwoParam {
    int executeTwoParam(int x, int y);
}

class Runner {
    //т.е. для запуска метода run необходимо передать объект класса реализующего интерфейс Executable
    public void run(Executable e) {
        e.execute();
    }

    public void runInt(ExecutableInt i) {
        int a = i.executeInt();
        System.out.println(a);
    }

    public void work(ExecutableIntInt x) { //метод, который принимает объект типа ExecutableIntInt
        int b = x.executeIntInt(10);
        System.out.println(b);
    }

    public void runTwoParam(ExecutableTwoParam object) {
        int c = object.executeTwoParam(10, 15);
        System.out.println(c);
    }
}


public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner(); // создали объект класса Runner, чтобы запустить метод run
        int z = 7;
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hallo from 2nd way to start run() method with parameter Executable type");
                int z = 8; //это внутрення переменная переопределенного метода execute(), не видна за пределами метода
            }
        });
        // фигурные скобки в лямбда выражении можно не писать, если в теле метода только 1 строка логики
        runner.run(() -> System.out.println("Hallo from 3rd way to start run() by Lambda"));
        runner.run(() -> System.out.println(("Еще одно сообщение методом run()")));
        runner.runInt(() -> {
            System.out.println("Сообщение из метода runInt");
            return 1;
        });
        runner.runInt(() -> 2);
        runner.work((int x) -> x + 5);
        runner.work(new ExecutableIntInt() {
            @Override
            public int executeIntInt(int x) {
                return x + 5;
            }
        });
        runner.work(x -> x + 5); // можно не писать круглые скобки если 1 аргумент

        runner.runTwoParam(new ExecutableTwoParam() {
            @Override
            public int executeTwoParam(int x, int y) {
                return x + y;
            }
        });
        runner.runTwoParam((x, y) -> x + y);
        runner.runTwoParam(Integer::sum);

        final int a = 1; // должна быть константой final либо не менять ее значение
        runner.runTwoParam((x, y) -> x + y + a);
        // у лямбда выражений нет своей области видимости Scope, а у анонимного класса есть
//        runner.runTwoParam((x, y) -> {int a = 10; return x + y;}); // такое невозможно

    }
}
