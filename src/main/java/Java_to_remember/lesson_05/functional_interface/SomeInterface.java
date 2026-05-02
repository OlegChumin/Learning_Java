package Java_to_remember.lesson_05.functional_interface;

@FunctionalInterface
public interface SomeInterface {
    void sendMessage();

    default void someMethod() {

    };
}
