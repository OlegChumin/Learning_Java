package Java_Oleg.thinkinginjava.this_super;

class A{

    A(){
        System.out.println("Конструктор без аргументов класса A");
    }

    A(String args){
        System.out.println("Конструктор с одним аргументом класса A");
    }
}

class B extends A{

    B(){
        this(""); // вызов конструктора с одним аргументом класса B
        System.out.println("Конструктор без аргументов класса B");
    }

    B(String args){
        //super(""); // вызов конструктора с одним аргументом класса A
        System.out.println("Конструктор с одним аргументом класса B");
    }

//    this();
//    super();
}

// Тест-класс и вывод
public class Test {

    public static void main(String args[]) {
        B b = new B();

    }

}
