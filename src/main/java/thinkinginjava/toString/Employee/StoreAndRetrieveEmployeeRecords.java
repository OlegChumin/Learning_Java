package thinkinginjava.toString.Employee;

import java.util.ArrayList;
import java.util.List;

public class StoreAndRetrieveEmployeeRecords {
    public static void main(String[] args) {

        // создаем объект ArrayList для хранения записей сотрудников
        List<Employee> emplRecord = new ArrayList<>();

        // добавляем записи сотрудников в объект AL
        emplRecord.add(new Employee(101, "SJ", 19, "Writer"));
        emplRecord.add(new Employee(102, "RS", 17, "Developer"));
        emplRecord.add(new Employee(103, "ZR", 25, "Supporter"));
        emplRecord.add(new Employee(104, "IL", 27, "Manager"));
        emplRecord.add(new Employee(105, "SR", 15, "Marketer"));

        // извлекаем записи сотрудников с помощью улучшенного цикла forEach
        for(Employee element : emplRecord) {
            System.out.println(element);
        }
    }
}
