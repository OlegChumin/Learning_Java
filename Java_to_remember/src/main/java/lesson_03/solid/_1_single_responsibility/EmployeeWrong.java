package lesson_03.solid._1_single_responsibility;

/**
 * Нарушение SRP
 */
public class EmployeeWrong {
    public void calculateSalary() {
        someMethod();
    }
    private void someMethod() {}
    public void printSalaryReport() {}
}
