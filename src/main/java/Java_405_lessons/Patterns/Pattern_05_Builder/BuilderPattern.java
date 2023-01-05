package Java_405_lessons.Patterns.Pattern_05_Builder;

public class BuilderPattern {

}

class Person {
    String name;
    int age;
    double salary;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(double salary) {
        this.salary = salary;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Person(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
