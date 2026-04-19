package lesson_05;

import java.lang.annotation.Inherited;

@Inherited
public @interface MyAnnotation {
    String value() default  "Change_it";
    int someValue() default 0;
}
