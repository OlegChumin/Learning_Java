package EKIDS.Lessons.Lesson08.Sound;

public class Dog {
    String name;
    int age;
    double weight;
    String color;
    String voice;
    String owner;

    public Dog(String name, int age, double weight, String color, String voice, String owner) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.voice = voice;
        this.owner = owner;
    }

    public Dog() {
    }
}

class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Боня", 3, 3., "grey", "loud", "Глеб");
        Dog dog2 = new Dog();

        switch(dog1.age) {
            case (1):
                System.out.println("собаке 1 год");
                break;
            case(2):
                System.out.println("собаке 2 года");
                break;
            case(3):
                System.out.println("собаке 3 года");
                break;
            default:
                System.out.println("Возраст неизвестен");
                break;
        }

    }

}
