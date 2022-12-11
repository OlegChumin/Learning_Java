package Java_Nail_Alishev.old.avancedjava.reflexion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Lesson042Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = OlegPersons.class; // 1 способ создания

        OlegPersons olegObject = new OlegPersons();
        Class c2 = olegObject.getClass(); // 2 способ создания объекта Class

        Class c3 = Class.forName("ru.learning.alishev.avancedjava.reflexion.OlegPersons");

//        все три переменный одинаковы  с1 = с2 = с3

        Method[] methods = c1.getMethods();

//        for (Method element : methods) {
//            System.out.print(element.getName() + ", " + element.getReturnType() +
//                    ", " + Arrays.toString(element.getParameterTypes())); // выводим блоками все методы с описанием имени,
//            // возвращаемого типа и типов параметров
//            System.out.println();
//        }

//        Field[] fields = c1.getDeclaredFields();
//        for (Field element : fields) {
//            System.out.print(element.getName() + ", " + element.getType()); // выводим блоками все методы с описанием имени,
//            // возвращаемого типа и типов параметров
//            System.out.println();
//        }

        Annotation[] annotations = c1.getAnnotations();
        for (Annotation element : annotations) {
            if (element instanceof OlegAnnotationNew) {
                System.out.println("Yes");
            }
        }
    }
}
