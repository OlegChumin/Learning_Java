package javarush;

public class ThisVaSuper0 {
    public static void main(String[] args) {
//        System.out.println("Создан объект а1 типа A1: ");
//        A1 a1 = new A1();
//        System.out.println("-----------------------------------------");
//        System.out.println();

        System.out.println("Создан объект b1 типа B1 extends A1: ");
        B1 b1 = new B1();
        System.out.println("-----------------------------------------");
        System.out.println();

//        C1 c1 = new C1();
    }
}
class A1{
    public A1() { //третьим выведется сообщение из конструктора без аргументов
        System.out.println("Cообщение из конструктора класса А1");
    }

    { // вторым выведется сообщение из нестатического метода
        System.out.println("Сообщение из нестатического метода класса A1");
    }
    static { // первым выведется сообщение из static метода
        System.out.println("Сообщение из статического метода класса A1");
    }
}

class B1 extends A1 {
    public B1() { //выведется в конце после всех сообщение методов блоков {}
        System.out.println("Сообщение из конструктора B1");
    }

    {
        System.out.println("Cообщение из нестатического метода класса B1");
    }

    static { //напечатается сразу после сообщения из статического метода A1
        System.out.println("Cообщение из статического метода класса B1");
    }
}

class C1 extends B1 {
    {
        System.out.println("Cообщение из нестатического метода класса C1");
    }
}
