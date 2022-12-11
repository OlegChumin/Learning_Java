package Java_Nail_Alishev.old.BaseJava;

public class Lesson41AbstractClass {
    public static void main(String[] args) {
        Cats cats = new Cats();
        Dogs dogs = new Dogs();
//        Animals animals = new Animals();

        dogs.voice();
        dogs.eat();
        cats.eat();
        cats.voice();
    }
}

// абстрактный класс Animals, от него нельзя создать объект - этот класс концепция
// используется когда надо создать иерархию классов
// внутри должен быть хотя бы один абстрактный метод
abstract class Animals {
    public void eat() {
        System.out.println("Animal eating..");
    }

    public abstract void voice(); // у абстрактного метода нет тела {}
}

class Cats extends Animals {
    @Override
    public void voice() {
        System.out.println("meow..");
    }

//    public void voice() {
//        System.out.println("meow..");
//    }
}

class Dogs extends Animals {
    @Override
    public void voice() {
        System.out.println("bark..");
    }
//    public void voice() {
//        System.out.println("bark..");
//    }
}
