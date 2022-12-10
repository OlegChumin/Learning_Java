package Alishev.avancedjava.reflexion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Lesson043 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, InvocationTargetException {
        // считаем из консоли названия двух классов и создадим объекты двух этих классов
        // затем считаем из консоли название метода
        // вызовем этот метод на объекте первого класса передав в качестве аргумента объект второго класса

        // название класса1 Название класса 2 Название метода
        Scanner scanner = new Scanner(System.in);
        Class classObject1 = Class.forName(scanner.next()); // метод принимает на вход полное название класса
                                                            // и создает объект класса
        Class classObject2 = Class.forName(scanner.next());

        String methodName = scanner.next(); // считали название метода
        @Deprecated
        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance(); // из объекта первого класса создаем новый объект с пустым конструктором
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value"); // для второго объекта создаем конструктор с пармером

        m.invoke(o1, o2);
        System.out.println(o1);
    }
}
