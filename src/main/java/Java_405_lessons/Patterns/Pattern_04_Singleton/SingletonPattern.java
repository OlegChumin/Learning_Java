package Java_405_lessons.Patterns.Pattern_04_Singleton;

// можно создать только один объект класса
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        singleton1.i = 5;
        System.out.println(singleton.i);
    }
}

class Singleton{
    int i = 0;
    static Singleton singleton = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

}


