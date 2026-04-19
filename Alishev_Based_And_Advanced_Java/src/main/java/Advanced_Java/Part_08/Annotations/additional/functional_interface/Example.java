package Advanced_Java.Part_08.Annotations.additional.functional_interface;

public class Example {
    public static void main(String[] args) {
        // Использование лямбда-выражения для создания реализации GreetingService
        // в этой части мы реализуем интерфейс
        GreetingService service = message -> System.out.println("Hello " + message);

        // Вызов метода sayMessage интерфейса GreetingService
        // а в этой части мы в уже реализацию передаем String параметр "Java programmer"
        service.sayMessage("Java programmer");
    }
}
