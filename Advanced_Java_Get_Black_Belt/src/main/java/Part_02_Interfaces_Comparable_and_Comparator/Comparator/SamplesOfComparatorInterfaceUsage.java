package Part_02_Interfaces_Comparable_and_Comparator.Comparator;

import java.util.*;

public class SamplesOfComparatorInterfaceUsage {
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
        Collections.sort(employeeList, new IdComparator());
        System.out.println("After sorting...\n" + employeeList);
        printLine();

        System.out.println("Before sorting...\n" + employeeList);
        Collections.sort(employeeList, new NameComparator());
        System.out.println("After sorting...\n" + employeeList);
        printLine();

        System.out.println("Before sorting...\n" + employeeList);
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println("After sorting...\n" + employeeList);
        printLine();
    }

    private static void printLine() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

class Employee {
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
                "}\n";
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

//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        int result = this.name.compareTo(anotherEmployee.name);
//        if (result == 0) {
//            result = this.surname.compareTo(anotherEmployee.surname);
//        }
//        return result;
//    }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.id == o2.id) {
            return 0;
        } else if (o1.id < o2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.salary == o2.salary) {
            return 0;
        } else if (o1.salary < o2.salary) {
            return -1;
        } else {
            return 1;
        }
    }
}
