package Part_11_Others.Part_119_Reflection_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
//        Class employeeClass = Class.forName("Part_119_Reflection_1/Employee.java");
        Class employeeClass = Employee.class;

//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field filedId = employeeClass.getField("id"); // получение конкретного поля
        System.out.println("Type of id filed = " + filedId.getType());
        System.out.println();

        Field[] allNotPrivateFields = employeeClass.getFields(); // получаем все поля кроме приватных
//        Arrays.stream(allNotPrivateFields).forEach(System.out::println);
        for (Field element : allNotPrivateFields) {
            System.out.println("Type of " + element.getName() + " = " + element.getType());
        }
        System.out.println();

        Field privateFieldSalary = employeeClass.getDeclaredField("salary");
        System.out.println("privateFieldSalary = " + privateFieldSalary.getName() + " " + privateFieldSalary.getType());
        System.out.println();

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field element : allFields) {
            System.out.println("Type of " + element.getName() + " = " + element.getType());
        }
        System.out.println();

        Method methodIncreaseSalary = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + methodIncreaseSalary.getReturnType() + "\n" +
                " pararameter's types of method increaseSalary = " + Arrays.toString(methodIncreaseSalary.getParameterTypes()));

        Method methodIncreaseSalaryWithParameters = employeeClass.getMethod("increaseSalary", int.class);
        System.out.println("Return type of method increaseSalary with parameters = " + methodIncreaseSalaryWithParameters.getReturnType() + "\n" +
                " pararameter's types of method increaseSalary with parameters = " + Arrays.toString(methodIncreaseSalaryWithParameters.getParameterTypes()));

        Method methodSetSalary = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + methodSetSalary.getReturnType() + "\n" +
                " pararameter's types of method setSalary = " + Arrays.toString(methodSetSalary.getParameterTypes()));
        System.out.println();

        Method[] allNotPrivateMethods = employeeClass.getMethods();
        for (Method element : allNotPrivateMethods) {
            System.out.println("Name of method = " + element.getName() + "\n" +
                    "return type of method = " + element.getReturnType() + "\n" +
                    "parameters types of method = " + Arrays.toString(element.getParameterTypes()));
        }
        System.out.println();

        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method element : allMethods) {
            System.out.println("Name of method = " + element.getName() + "\n" +
                    "return type of method = " + element.getReturnType() + "\n" +
                    "parameters types of method = " + Arrays.toString(element.getParameterTypes()));
        }
        System.out.println();

        Method[] allMethodsOnlyPublic = employeeClass.getDeclaredMethods();
        for (Method element : allMethodsOnlyPublic) {
            if (Modifier.isPublic(element.getModifiers())) {
                System.out.println("Name of method = " + element.getName() + "\n" +
                        "return type of method = " + element.getReturnType() + "\n" +
                        "parameters types of method = " + Arrays.toString(element.getParameterTypes()));
            }
        }
        System.out.println();

        System.out.println("constructorWithoutParams");
        Constructor constructorWithoutParams = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructorWithoutParams.getParameterCount() + " parameters, " +
                "their types are: " + Arrays.toString(constructorWithoutParams.getParameterTypes()));
        System.out.println();

        System.out.println("constructorWithParams");
        Constructor constructorWithParams = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructorWithParams.getParameterCount() + " parameters, " +
                "their types are: " + Arrays.toString(constructorWithParams.getParameterTypes()));
        System.out.println();

        System.out.println("constructorsWithParams");
        Constructor[] constructorsWithParams = employeeClass.getConstructors();
        for (Constructor element: constructorsWithParams) {
            System.out.println("Constructor has " + element.getParameterCount() + " parameters, " +
                    "their types are: " + Arrays.toString(element.getParameterTypes()));
            System.out.println();
        }
        System.out.println();

        System.out.println("allConstructorsWithParams");
        Constructor[] allConstructors = employeeClass.getDeclaredConstructors();
        for (Constructor element: allConstructors) {
            System.out.println("Constructor getModifiers = " + element.getModifiers() + " Constructor has " + element.getParameterCount() + " parameters, " +
                    "their types are: " + Arrays.toString(element.getParameterTypes()));
            System.out.println();
        }
        System.out.println();
    }
}
