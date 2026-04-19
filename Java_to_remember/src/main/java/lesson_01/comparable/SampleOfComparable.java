package lesson_01.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SampleOfComparable {
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
//        Arrays.sort(new Employee[] {employee1, employee2, employee3, employee4});
        Collections.sort(employeeList);
        System.out.println("After sorting: " + employeeList);
    }
}
