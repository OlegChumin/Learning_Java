package lessons.lesson_07;

public class Bird {
    void sing() {
        System.out.println(" Птица поет ");
    }
}

class Parrot extends Bird {
    void catImitateSound() {
        System.out.println(" Попугай может имитировать звуки ");
    }
}

class Test {
    public static void main(String[] args) {
        Bird bird = new Parrot(); // полиморфизм
        bird.sing();
        //bird.catImitateSound();

        Parrot parrot = new Parrot();
        parrot.sing();
        parrot.catImitateSound();
    }
}
