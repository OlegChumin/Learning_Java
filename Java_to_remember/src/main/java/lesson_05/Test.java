package lesson_05;

@MyAnnotation()
public class Test {

    @MyAnnotation
    private String someField;

    @MyAnnotation
    public Test(String someField) {
        this.someField = someField;
    }

    @MyAnnotation
    void someMethod() {
    }
}
