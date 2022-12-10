package Alishev.BaseJava;

interface AbleToEat {
    public void eat();
}

public class LessonInterfaces {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.eat();

        Wolf wolf1 = new Wolf() {
            public void eat() {
                System.out.println("New wolf eating...");
            }
        };

        wolf1.eat();

//    NewWolf newWolf = new NewWolf();
//    newWolf.eat();
    }
}

class Wolf {
    public void eat() {
        System.out.println("Wolf is eating...");
    }
}

//class NewWolf extends Wolf{
//    @Override
//    public void eat() {
//        System.out.println("NewWolf eat...");
//    }
//}

