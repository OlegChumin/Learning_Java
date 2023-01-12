package Java_405_lessons.Patterns.Pattern_05_Builder;

public class Stuff implements EmployeeBuilder {
    Employee employee = new Employee();

    @Override
    public EmployeeBuilder setEmployeeName(String name) {
        employee.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder setEmployeeSurName(String surName) {
        employee.surName = surName;
        return this;
    }

    @Override
    public EmployeeBuilder setEmployeeAge(int age) {
        employee.age = age;
        return this;
    }

    @Override
    public EmployeeBuilder setEmployeeId(int id) {
        employee.id = id;
        return this;
    }

    @Override
    public EmployeeBuilder setEmployeeSalary(double salary) {
        employee.salary = salary;
        return this;
    }

    @Override
    public EmployeeBuilder build() {
        return this;
    }
}