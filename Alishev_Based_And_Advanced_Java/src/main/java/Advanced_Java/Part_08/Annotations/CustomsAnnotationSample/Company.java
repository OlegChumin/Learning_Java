package Advanced_Java.Part_08.Annotations.CustomsAnnotationSample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // Чтобы указать информацию об области действия аннотации и о типах элементов, к которым
// она может быть применена, используются мета-аннотации. TYPE - применяется только к классам
@Retention(RetentionPolicy.RUNTIME) // мета-аннотация @Retention(RetentionPolicy.RUNTIME) указывает, что аннотация
// должна быть доступна в рантайме.
public @interface Company {
}
