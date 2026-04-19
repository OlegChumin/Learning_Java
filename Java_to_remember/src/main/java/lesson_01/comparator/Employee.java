package lesson_01.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test_Comparator {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(23, "Vlad", "Samoilov", 100_000);
        Employee employee2 = new Employee(30, "Sunil", "Sam", 150_000);
        Employee employee3 = new Employee(50, "Sandip", "Han", 130_000);
        Employee employee4 = new Employee(35, "Sunil", "Deem", 100_000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        Collections.shuffle(employeeList);
        System.out.println("Before sorting: " + employeeList);
        EmployeeComparatorByAge employeeComparatorByAge = new EmployeeComparatorByAge();

        Collections.sort(employeeList, employeeComparatorByAge);
        System.out.println("After sorting: " + employeeList);

        EmployeeComparatorByName employeeComparatorByName = new EmployeeComparatorByName();
        Collections.sort(employeeList, employeeComparatorByName);
        System.out.println("After sorting: " + employeeList);
    }
}

public class Employee {
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

}

class EmployeeComparatorByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age - o2.age;
    }
}

class EmployeeComparatorByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
