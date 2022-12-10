package EKIDS.Lessons.Lesson8;

public class Lesson84 {
    public static void main(String[] args) {

    }
}


class Animal {
    void go() {
        System.out.println("Animal can go");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog can run");
    }
}

class Tiger extends  Animal {
    void jump() {
        System.out.println("Tiger can jump");
    }
}

class Birds extends  Animal {
    void fly() {
        System.out.println("Birds can fly");
    }
}

class Duck extends Birds{
    void swim() {
        System.out.println("Duck can swim");
    }
}

