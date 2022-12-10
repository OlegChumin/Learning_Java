package UdemyZaur.GetBlackBelt.ComparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(100, "Oleg", "Chumin", 450_000);
        Employee employee2 = new Employee(15, "Ivan", "Pertov", 250_000);
        Employee employee3 = new Employee(123, "Ivan", "Bannov", 300_000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println("Before sorting\n " + employees);
        Collections.sort(employees); //по какому критерию сравнивать поэтому используют интерфейс Comparable
        System.out.println("After sorting\n " + employees);
        System.out.println();

        //можно также работать с массивом объектов:
        Employee[] employeeArray = new Employee[]{employee1, employee2, employee3};  //при отсутствии implements Comparable
        System.out.println("Before sorting\n " + Arrays.toString(employeeArray));
        Arrays.sort(employeeArray);                                                                // код все равно скомпилируется но выбросит ошибку
        System.out.println("After sorting\n " + Arrays.toString(employeeArray));
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

    @Override
    public int compareTo(Employee anotherEmployee) {
//        if (this.id == anotherEmployee.id) { //this здесь текущий объект
//            return 0;
//        } else if (this.id < anotherEmployee.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//        return this.id - anotherEmployee.id;
//        return this.id.compareTo(anotherEmployee.id); //использовать Integer вместо int в id поле
//        return  this.name.compareTo(anotherEmployee.name); //сортировка будет по имени
        int result = this.name.compareTo(anotherEmployee.name);
        if (result == 0) {                                          //если совпадают имена сортировка идет по фамилиям
            result = this.surname.compareTo(anotherEmployee.surname);
        }
        return result;
    }
}
