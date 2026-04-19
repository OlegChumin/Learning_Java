package lesson_01.comparable;

public class Employee implements Comparable<Employee>{
    int age;
    String name;
    String surName;
    int salary;

    public Employee(int age, String name, String surName, int salary) {
        this.age = age;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        return this.age - anotherEmployee.age;
//    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        return this.name.compareTo(anotherEmployee.name);
    }
}
