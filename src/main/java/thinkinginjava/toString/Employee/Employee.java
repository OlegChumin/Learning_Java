package thinkinginjava.toString.Employee;

public class Employee {

    // внутренние переменные
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private String employeeDesignation;

    // Конструктор с четырьмя аргументами


    public Employee(int employeeId, String employeeName, int employeeAge, String employeeDesignation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeDesignation = employeeDesignation;
    }

    // переопределение метода toString()
    @Override
    public String toString() {
        return "Сотрудники [Id = " + employeeId
                + ", Имя = " + employeeName
                + ", Возраст = " + employeeAge
                + ", Обозначение = " + employeeDesignation + "] бе бе бе";
    }


}
