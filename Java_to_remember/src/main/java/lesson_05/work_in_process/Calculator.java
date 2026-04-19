package lesson_05.work_in_process;

@WorkInProcess(developer = "Olaf", description = "Refactoring Calculator class in process...")
public class Calculator {

    @WorkInProcess
    private int someNumber;

    @WorkInProcess
    public Calculator(int someNumber) {
        this.someNumber = someNumber;
    }

    // Устаревший метод
    @Deprecated
    public void div(int a, int b) {
        System.out.println( a / b);
    }

    // Новый метод
    public void newDiv(int a, int b) {
        if ( b == 0) {
            System.out.println("Деление на 0!");
            return;
        }
        System.out.println( a / b);
    }

    @WorkInProcess(developer = "Jane Doe", description = "Add logic, optimization required...")
    public int multiply(int a, int b) {
        //TODO добавить логики работы метода
        //TODO оптимизировать работу метода
        return (a * b);
    }
}
