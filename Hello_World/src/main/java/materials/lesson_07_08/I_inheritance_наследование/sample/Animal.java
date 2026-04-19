package materials.lesson_07_08.I_inheritance_наследование.sample;

// Базовый класс Animal
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " ест");
    }

    void sleep() {
        System.out.println(name + " спит");
    }
}

// Подкласс Dog, наследующий класс Animal
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " лает");
    }
}

// Подкласс Cat, наследующий класс Animal
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " мяукает");
    }
}

// Главный класс
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барбос");
        Cat cat = new Cat("Мурзик");

        dog.eat();   // Барбос ест
        dog.sleep(); // Барбос спит
        dog.bark();  // Барбос лает

        cat.eat();   // Мурзик ест
        cat.sleep(); // Мурзик спит
        cat.meow();  // Мурзик мяукает
    }
}
