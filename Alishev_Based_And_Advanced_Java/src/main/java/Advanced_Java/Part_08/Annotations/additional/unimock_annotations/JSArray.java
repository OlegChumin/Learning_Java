package Advanced_Java.Part_08.Annotations.additional.unimock_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *<p>
 * Аннотация для определения типа JS объекта
 * добавлена для UI юнимока.</p>
 * @author ****_****
 */
@Target(ElementType.FIELD)  // Эта аннотация указывает, что аннотация JSArray может быть применена только к полям
                            // и предотвращает ее применение к, например, методам или классам.
@Retention(RetentionPolicy.RUNTIME) // Эта аннотация определяет, что аннотация JSArray будет сохранена
                                    // во время выполнения программы и доступна через рефлексию
public @interface JSArray {
    String value() default "";
}
