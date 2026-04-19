package lesson_05.reflection;

import java.util.UUID;

public class Employee {
    public UUID id;
    public String name;
    public String department;
    private double salary;

    public Employee() {
    }

    public Employee(UUID id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee(UUID id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDepartment(String department) {
        this.department = department;
        System.out.println("New department is: " + department);
    }

    public void increaseSalary() {
        salary *= 2;
    }

    public void increaseSalary(int threeTimes) {
        salary *= 3;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        UUID randomUUID = UUID.randomUUID();
        System.out.println("Random UUID = " + randomUUID);
    }
}
