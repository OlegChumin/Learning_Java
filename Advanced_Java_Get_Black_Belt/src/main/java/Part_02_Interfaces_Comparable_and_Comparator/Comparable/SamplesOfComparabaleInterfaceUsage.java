package Part_02_Interfaces_Comparable_and_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SamplesOfComparabaleInterfaceUsage {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(100, "Vlad", "Kiev", 3000);
        Employee employee2 = new Employee(200, "Sunil", "India", 2000);
        Employee employee3 = new Employee(50, "Sandeep", "India", 5000);
        Employee employee4 = new Employee(75, "Sandeep", "Pakistan", 4000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        System.out.println("Before sorting...\n" + employeeList);
        Collections.sort(employeeList);
        System.out.println("After sorting...\n" + employeeList);

        Arrays.sort(new Employee[]{employee1, employee2, employee3, employee4}); // remove Comparable implementation and
        // then it will throw exception
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        if (this.id == anotherEmployee.id) {
//            return 0;
//        } else if (this.id < anotherEmployee.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }

//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        return this.id - anotherEmployee.id;
//    }

//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        return this.id.compareTo(anotherEmployee.id); //change int id to Integer id in Employee
//    }

//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        return this.name.compareTo(anotherEmployee.name);
//    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.name.compareTo(anotherEmployee.name);
        if (result == 0) {
            result = this.surname.compareTo(anotherEmployee.surname);
        }
        return result;
    }
}
