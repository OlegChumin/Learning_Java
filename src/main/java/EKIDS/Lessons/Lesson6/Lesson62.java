package EKIDS.Lessons.Lesson6;

public class Lesson62 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Emil";
        person1.surName = "Kurbanov";
        person1.age = 12;
        System.out.println("Меня зовут: " + person1.name + " " + person1.surName
                + " мне " + person1.age + "лет");

        Person person2 = new Person();
        person2.name = "Alexandra";
        person2.surName = "Markova";
        person2.age = 10;
        System.out.println("Меня зовут: " + person2.name + " " + person2.surName
                + " мне " + person2.age + "лет");

        Person person3 = new Person();
        person3.name = "Mark";
        person3.surName = "Krasnov";
        person3.age = 11;
        System.out.println("Меня зовут: " + person3.name + " " + person3.surName
                + " мне " + person3.age + "лет");


        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.colour = "grey";
        car1.engineType = "electric";
        car1.maxSpeed = 290;
        car1.type = "car";

        Object object = new Object();
    }
}

class Person {
    String name;
    String surName;
    int age;
}

class Car {
    String brand;
    String colour;
    String engineType;
    String type;
    int maxSpeed;

}
