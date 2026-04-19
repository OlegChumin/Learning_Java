package tasks._001;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Задача: Дан список сотрудников, где каждый сотрудник имеет имя и зарплату. Используя Stream API,
 * выведите среднюю зарплату сотрудников, чьё имя начинается на букву "J".
 */

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class AdvancedTask {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 2000),
            new Employee("Jane", 2100),
            new Employee("Mark", 0),
            new Employee("James", 1980),
            new Employee("Jennifer", 2150)
        );
        
        OptionalDouble averageSalary = employees.stream()
                                                .filter(employee -> employee.name.startsWith("J"))
                                                .mapToDouble(employee -> employee.salary)
                                                .average();

        
        averageSalary.ifPresent(average -> System.out.println("Средняя зарплата сотрудников, имя которых начинается на 'J': " + average));

        System.out.println(getAvgSalary(employees));
    }

    public static double getAvgSalary(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.name.startsWith("J"))
                .mapToDouble(employee -> employee.salary)
                .average()
                .orElseThrow();
    }
}
