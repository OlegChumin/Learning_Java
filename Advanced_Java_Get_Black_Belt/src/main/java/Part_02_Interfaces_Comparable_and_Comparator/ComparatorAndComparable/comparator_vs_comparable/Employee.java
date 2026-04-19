package Part_02_Interfaces_Comparable_and_Comparator.ComparatorAndComparable.comparator_vs_comparable;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String department;

    public Employee(int id, String name, String surname, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    // Геттеры и сеттеры для полей

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
