package Java_Nail_Alishev.old.avancedjava.reflexion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OlegAnnotationNew {
    String name() default "Oleg";

    int year() default 2021;
}
