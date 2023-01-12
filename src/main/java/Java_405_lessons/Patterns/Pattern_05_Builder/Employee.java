package Java_405_lessons.Patterns.Pattern_05_Builder;

public class Employee {
    String name;
    String surName;
    int age;
    int id;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    //    public Employee(String name, String surName, int age, double salary) {
//        this.name = name;
//        this.surName = surName;
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public Employee(String name) {
//        this.name = name;
//    }
//
//    public Employee(String name, String surName) {
//        this.name = name;
//        this.surName = surName;
//    }
//
//    public Employee(String name, String surName, int age) {
//        this.name = name;
//        this.surName = surName;
//        this.age = age;
//    }
//
//    public Employee(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public Employee(String surName, int age) {
//        this.surName = surName;
//        this.age = age;
//    }
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
}
