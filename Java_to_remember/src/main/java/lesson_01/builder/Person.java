package lesson_01.builder;

import java.math.BigDecimal;

class TestPerson {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("Mike")
                .setAge(35)
                .setSalary(new BigDecimal(100_000))
                .build();
    }
}

public class Person {
    String name;
    int age;
    BigDecimal salary;

//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(int age) {
//        this.age = age;
//    }
//
//    public Person(BigDecimal salary) {
//        this.salary = salary;
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(int age, BigDecimal salary) {
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public Person(String name, int age, BigDecimal salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }
}

interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(BigDecimal salary);
    Person build();
}

class PersonBuilderImpl implements PersonBuilder {

    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setSalary(BigDecimal salary) {
        person.salary = salary;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
