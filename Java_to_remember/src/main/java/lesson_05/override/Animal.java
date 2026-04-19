package lesson_05.override;

public class Animal {
    public void eat() {
        System.out.println("This animal can eat");
    }
}


class Dog extends Animal {

//    public void eat(int a, String b) {
//    }

    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }
}
