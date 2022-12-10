package thinkinginjava.this_super;

public class Main {
    public static void main(String[] args) {
        System.out.println("Главный класс для запуска программы");
        FirstA varA = new FirstA();
        SecondB varB = new SecondB();
        ThirdC varC = new ThirdC();
    }
}


class FirstA {
    public FirstA() {
        System.out.println("Сообщение из пустого конструктора класса FirstA");
    }

    public FirstA(String args) {
        System.out.println("Сообщение из конструктора с 1 аргументом класса FirstA");
    }


}

class SecondB extends FirstA {
    public SecondB() {
        System.out.println("Сообщение из пустого конструктора класса SecondB");
    }

    public SecondB(String args) {
        System.out.println("Сообщение из конструктора с 1 аргументом класса SecondB");
    }
}

class ThirdC extends SecondB {
    public ThirdC() {
        System.out.println("Сообщение из пустого конструктора класса ThirdC");
    }
}