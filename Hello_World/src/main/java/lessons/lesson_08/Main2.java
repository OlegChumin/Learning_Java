package lessons.lesson_08;

public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck("Дональд");
        duck.displayName();
        duck.canEat();
        Duck duck2 = new Duck("Просто утка");
        duck2.displayName();
        duck2.canEat();
    }
}

class Bird {
    String name;

    public Bird(String name) {
        this.name = name; // this -> на текущий обект класса
    }

    void canEat() {
        System.out.println(this.name + " ест");
    }
}

class Duck extends Bird{

    public Duck(String name) {
        super(name); // super -> конструктор Bird
    }

    void displayName() {
        System.out.println("Имя утки " + this.name);
        System.out.println("Имя птицы " + super.name);
    }
}
