package lessons.lesson_08.interfaces;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Алексей");
        person.greet();
    }
}

@FunctionalInterface
interface Greetable {
    void greet();
}

@FunctionalInterface
interface Hallowable {
    void hallo();
}

class Person implements Greetable, Hallowable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void greet() {
        System.out.println(" Привет, меня зовут " + this.name + "!");
    }

    @Override
    public void hallo() {

    }
}
