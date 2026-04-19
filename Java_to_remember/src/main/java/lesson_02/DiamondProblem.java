package lesson_02;

public class DiamondProblem {

}

interface A {
    default void doSomething() {
        System.out.println("method A");
    }
}


interface B extends A {
    default void doSomething() {
        System.out.println("method B");
    }
}

interface C extends A {
    default void doSomething() {
        System.out.println("method C");
    }
}

class Dclass implements B, C {

//    @Override
//    public void doSomething() {
//        B.super.doSomething();
//    }

    @Override
    public void doSomething() {
        C.super.doSomething();
    }
}