package Part_06_Lambda.Part_42;

public class LambdaSample2 {
    public static void main(String[] args) {

        def(new A() {
            @Override
            public int abc(int x) {
                return 18;
            }
        });

        def((A) a -> {return a;});
        def((B) b -> b);

//        def((I) i -> 18);
        def(() -> 18);
        def(() -> "Hi");


    }

    static void def(A a) {
        System.out.println(a.abc(18));
    }

    static void def(B b) {
        System.out.println(b.abc("Hi"));
    }

    static void def(I i) {
        System.out.println(i.abc());
    }

    static void def(J j) {
        System.out.println(j.abc());
    }
}

@FunctionalInterface
interface A {
    int abc(int x);
}

@FunctionalInterface
interface B {
    String abc(String str);
}

@FunctionalInterface
interface I {
    int abc();
}

@FunctionalInterface
interface J {
    String abc();
}


