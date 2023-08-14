package static_block;

class Parent {
    static {
        System.out.println("Static block in Parent");
    }

    {
        System.out.println("Instance initialization block in Parent");
    }

    Parent() {
        System.out.println("Constructor in Parent");
    }
}

class Child extends Parent {
    static {
        System.out.println("Static block in Child");
    }

    {
        System.out.println("Instance initialization block in Child");
    }

    Child() {
        System.out.println("Constructor in Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
