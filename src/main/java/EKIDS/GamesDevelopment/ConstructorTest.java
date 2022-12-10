package EKIDS.GamesDevelopment;

public class ConstructorTest {
    public static void main(String[] args) {
    Cat cat = new Cat("Barsik", 1);
    Object object = new Object();
    object.toString();
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override // аннотация, которая следит за тем чтобы мы не изменили сигнатуру переопределяемого метода
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Object -> String
    //Object -> Cat
}
