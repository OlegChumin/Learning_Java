package Advanced_Java.Part_08.Annotations.additional.depricated;

/**
 * Аннотация @Deprecated указывает, что метод, класс или поле устарело и должно быть заменено новым кодом.
 * Это предупреждение для других разработчиков об изменениях в кодовой базе.
 */
public class Calculator {
    // Устаревший метод
    @Deprecated
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Новый метод
    public void addNumbers(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }
}
