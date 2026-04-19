package Advanced_Java.Part_08.Annotations.additional.override;

/**
 * Аннотация @Override используется, когда метод подкласса переопределяет метод суперкласса.
 * Это помогает обеспечить правильность переопределения методов на этапе компиляции.
 */
class Animal {
    // Метод в базовом классе
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Переопределение метода с аннотацией @Override
    @Override
    public void eat() {
        System.out.println("Dog eats dog food.");
    }
}
