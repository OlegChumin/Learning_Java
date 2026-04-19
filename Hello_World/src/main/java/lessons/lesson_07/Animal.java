package lessons.lesson_07;


// класс Родитель
public class Animal {
    void canEat() {
        System.out.println(" Животное ест ");
    }
}

// класс Наследник
class Dog extends Animal {
    void bark() {
        System.out.println(" Собака лает ");
    }
}

class Cat extends Animal {
    void canScratch() {
        System.out.println(" Кошки царапаются ");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        dog.bark();
        dog.canEat();
        Animal animal = new Animal();
        animal.canEat();

        Cat cat = new Cat();
        cat.canEat();
        cat.canScratch();

    }
}





