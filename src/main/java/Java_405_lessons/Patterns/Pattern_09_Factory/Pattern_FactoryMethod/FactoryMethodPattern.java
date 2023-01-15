package Java_405_lessons.Patterns.Pattern_09_Factory.Pattern_FactoryMethod;

// метод, который создает сам себя
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Person person = Person.create();
    }

}

class Person{
    private Person() {};
    static Person create() {
        return new Person();
    }
}
