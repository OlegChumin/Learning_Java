package lesson_05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        //Class employeeClass = Class.forName("lesson_05.reflection.Employee");
        //Employee employeeClass = Employee.class.newInstance(); //Deprecated
        Class employeeClass = Employee.class;
//        Employee employee = new Employee();
//        Class employeeClass = employee.getClass();

        Field fieldId = employeeClass.getField("id");
        System.out.println("Type id field " + fieldId.getType());
        System.out.println("---------------------");

        Field[] allNotPrivateFields = employeeClass.getFields();
        //Arrays.stream(allNotPrivateFields).forEach(System.out::println);
        for (Field element : allNotPrivateFields) {
            System.out.println("Type of " + element.getName() + " = " + element.getType());
            System.out.println("---------------------");
        }

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field element :allFields) {
            System.out.println("Type of " + element.getName() + " = " + element.getType());
            System.out.println("---------------------");
        }

        Method methodIncreaseSalary = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary is = " + methodIncreaseSalary.getReturnType() + "\n"
                + " parameters types of increaseSalary = " + Arrays.toString(methodIncreaseSalary.getParameterTypes())
        );
        System.out.println("---------------------");

        Method methodIncreaseSalaryWithParams = employeeClass.getMethod("increaseSalary", int.class);

        System.out.println("Return type of method increaseSalary is = " + methodIncreaseSalaryWithParams.getReturnType() + "\n"
                + " parameters types of increaseSalary = " + Arrays.toString(methodIncreaseSalaryWithParams.getParameterTypes())
        );
        System.out.println("---------------------");

        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method element : allMethods) {
            System.out.println("Name of method = " + element.getName() + "\n" +
                    "return type of method = " + element.getReturnType() + "\n" +
                    "parameters types of method = " + Arrays.toString(element.getParameterTypes()));
        }
        System.out.println("---------------------");

        Constructor[] allConstructors = employeeClass.getDeclaredConstructors();
        for (Constructor element : allConstructors) {

            System.out.println("Constructor modifier = " + element.getModifiers()   + "\n" +
                    "constructor has " + element.getParameterCount() + " parameters" + "\n" +
                    "parameters types = " + Arrays.toString(element.getParameterTypes()));
        }
        System.out.println("---------------------");

        Constructor<?>[] allConstructorsModifiers = employeeClass.getDeclaredConstructors();
        for (Constructor<?> element : allConstructorsModifiers) {
            System.out.println("Constructor: " + element.getName());
            System.out.println("Modifiers: " + Modifier.toString(element.getModifiers()));
        }
    }


}
