package Advanced_Java.Part_08.Annotations;

public class B extends A {
    /**
     @Target(ElementType.METHOD) - Indicates the contexts in which an annotation type is applicable
     @Retention(RetentionPolicy.SOURCE) - Политика хранения аннотаций. Константы этого перечисляемого типа описывают
     различные политики сохранения аннотаций. Они используются в сочетании с типом метааннотаций Retention, чтобы
     указать, как долго должны сохраняться аннотации.
     Annotation retention policy. The constants of this enumerated type describe the various policies for retaining
     annotations. They are used in conjunction with the Retention meta-annotation type to specify how long annotations
     are to be retained.
     */
    @Override
    public void test() {
        System.out.println("Hello from class B");
    }
}

class A {
    public void test() {
        System.out.println("Hello from class A");
    }
}
