package Java_Nail_Alishev.old.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// аннотация ждя нескольких типов сущностей, в данном случае для метода, или для класса интерфейса или Enum
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface OlegAnnotation {
    String author() default "Oleg";

    int dateOf() default 2021;
}
