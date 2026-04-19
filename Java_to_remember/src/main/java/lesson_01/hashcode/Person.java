package lesson_01.hashcode;

import java.util.HashMap;
import java.util.Objects;

/**
 * Пример: Проблема с hashCode() по умолчанию
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // hashCode не переопределен

    /**
     * Если включить переопределение hashcode
     * Contains p1: true
     * Contains p2: true
     * Value for p1: Second Entry
     * Value for p2: Second Entry
     * Alice (30) -> Second Entry
     * @param args
     */
    // Переопределение hashCode
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);

        map.put(p1, "First Entry");
        map.put(p2, "Second Entry");  // Добавляем вторую пару

        System.out.println("Contains p1: " + map.containsKey(p1)); // true
        System.out.println("Contains p2: " + map.containsKey(p2)); // false (ожидаемо, так как hashCode не переопределен)

        System.out.println("Value for p1: " + map.get(p1)); // First Entry
        System.out.println("Value for p2: " + map.get(p2)); // null (ожидаемо, так как hashCode не переопределен)

        // Выводим все пары ключ-значение
        map.forEach((key, value) -> System.out.println(key.name + " (" + key.age + ") -> " + value));

        /**
         * C:\Users\tschu\.jdks\corretto-11.0.23\bin\java.exe "-javaagent:C:\Users\tschu\AppData\Local\Programs\IntelliJ IDEA Ultimate\lib\idea_rt.jar=54611:C:\Users\tschu\AppData\Local\Programs\IntelliJ IDEA Ultimate\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\tschu\IdeaProjects\Java_to_remember\target\classes lesson_01.hashcode.Person
         * Contains p1: true
         * Contains p2: true
         * Value for p1: First Entry
         * Value for p2: Second Entry
         * Alice (30) -> Second Entry
         * Alice (30) -> First Entry
         *
         * Process finished with exit code 0
         *
         * Этот вывод демонстрирует, что HashMap содержит два различных ключа с одинаковыми значениями полей name и age,
         * но с разными значениями hashCode.
         *
         * Как исправить это поведение
         * Чтобы исправить это поведение, нужно переопределить метод hashCode в классе Person, чтобы он был согласован
         * с методом equals.
         */
    }
}
