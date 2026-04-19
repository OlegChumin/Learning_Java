package lessons.lesson_08;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Name");
        System.out.println(animal.name);

        Animal animal2 = new Animal();
        System.out.println(animal2);
        animal2.name = "New animal";
        System.out.println(animal2.name);
    }
}

class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(int age) {
        this.age = age;
    }
}
