package javarush;

public class ThisVsSuper {
    public static void main(String[] args) {
//        B b = new B("");
    C c = new C();
    }
}

//при создании объекта в первую очередь вызывается конструктор его базового класса,
// а только потом — конструктор самого класса, объект которого мы создаем
class A {
    A() {
        System.out.println("Пустой конструктор класса А");
    }

    A(String str) {
        System.out.println("Конструктор с 1 аргументом класса А");
    }

    A(int a, int b, String str) {
        System.out.println("Конструктор с тремя аргументами");
    }
}

class C extends A {

}

class B extends A {
    B() {
        this(""); //d конструкторе this и super должны быть первыми
        System.out.println("Пустой конструктор класса B");
    }

    B(String str) {
        super(""); // вызов конструктора с одним аргументом класса A
        System.out.println("Конструктор с 1 аргументом класса B");
    }

}


