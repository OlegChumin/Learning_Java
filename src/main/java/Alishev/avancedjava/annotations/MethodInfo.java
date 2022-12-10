package Alishev.avancedjava.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // указали что аннотация только для метода!
@Retention(RetentionPolicy.RUNTIME) // указываем политику удержания (есть еще CLASS и SOURCE)
//политика удержания - до какого этапа видна аннотация
// SOURCE - дна до компиляции, при компиляции отбрасывается
// CLASS - сохраняются в byte коде, но недоступны во время работы программы
// RUNTIME - охраняются в byte коде, и недоступны во время работы программы
public @interface MethodInfo {
    String author() default "Otto"; // поля аннотации являются методами без реализации!
    int dateOfCreation() default 2021;
    String purpose();
}
