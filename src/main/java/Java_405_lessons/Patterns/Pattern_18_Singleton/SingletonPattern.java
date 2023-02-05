package Java_405_lessons.Patterns.Pattern_18_Singleton;

// можно создать только один объект класса
public class SingletonPattern {
    public static void main(String[] args) {
        SingletonSample singleton = SingletonSample.getInstance();
        SingletonSample singleton2 = SingletonSample.getInstance();
        singleton2.i = 5;
        System.out.println("singleton.i = " + singleton.i);
        System.out.println("singleton2.i = " + singleton2.i);
        System.out.println("singleton2 == singleton : " + (singleton2 == singleton));
        System.out.println("singleton = " + singleton);
        System.out.println("singleton2 = " + singleton2);

    }
}

class SingletonSample{
    int i = 0;
    static SingletonSample singleton = new SingletonSample();
    private SingletonSample() {}

    public static SingletonSample getInstance() {
        return singleton;
    }

}


