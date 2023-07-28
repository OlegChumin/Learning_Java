package static_block;

class MyClass {
    static {
        System.out.println("1. Статический блок инициализации класса MyClass");
    }

    {
        System.out.println("2. Статический блок инициализации объекта MyClass");
    }

    public MyClass() {
        System.out.println("3. Конструктор MyClass");
    }
}

class MySubClass extends MyClass {
    static {
        System.out.println("4. Статический блок инициализации класса MySubClass");
    }

    {
        System.out.println("5. Статический блок инициализации объекта MySubClass");
    }

    public MySubClass() {
        System.out.println("6. Конструктор MySubClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MySubClass obj = new MySubClass();
    }
}
