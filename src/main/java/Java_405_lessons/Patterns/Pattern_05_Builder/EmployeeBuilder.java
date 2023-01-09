package Java_405_lessons.Patterns.Pattern_05_Builder;

public interface EmployeeBuilder {
    EmployeeBuilder setEmployeeName(String name);
    EmployeeBuilder setSurName(String surName);
    EmployeeBuilder setEmployeeAge(int age);
    EmployeeBuilder setEmployeeId(int id);
    EmployeeBuilder setEmployeeSalary(double salary);
    EmployeeBuilder build();
}
