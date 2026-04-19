package materials.lesson_07_08.IV_abstraction_абстракция.sample;

/**
 * В этом примере:
 *
 * Vehicle является абстрактным классом с конструктором, абстрактным методом move(),
 * реализованным методом start(),
 * статическим методом staticMethod(), и методом stop(), который не является абстрактным.
 * Car - это конкретный класс, который наследует Vehicle и обеспечивает реализацию абстрактного
 * метода move().
 * Мы также демонстрируем использование переменной состояния type, которая задается через
 * конструктор и доступна через геттер getType().
 * Этот пример показывает, как можно использовать абстрактные классы для определения общего
 * поведения и структуры, позволяя подклассам предоставлять конкретные реализации абстрактных
 * методов.
 */

// Абстрактный класс Vehicle
abstract class Vehicle {
    private String type;

    // Конструктор абстрактного класса
    Vehicle(String type) {
        this.type = type;
    }

    // Абстрактный метод
    abstract void move();

    // Реализованный метод
    void start() {
        System.out.println(type + " начинает движение.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Статический метод абстрактного класса Vehicle.");
    }

    // Геттер (для демонстрации переменной состояния)
    String getType() {
        return type;
    }

    // Пример метода, который не является абстрактным
    void stop() {
        System.out.println(type + " останавливается.");
    }
}

// Конкретный класс Car, наследующий абстрактный класс Vehicle
class Car extends Vehicle {
    Car(String type) {
        super(type);
    }

    // Реализация абстрактного метода
    @Override
    void move() {
        System.out.println(getType() + " едет по дороге.");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Автомобиль");

        car.start(); // Автомобиль начинает движение.
        car.move();  // Автомобиль едет по дороге.
        car.stop();  // Автомобиль останавливается.

        Vehicle.staticMethod(); // Статический метод абстрактного класса Vehicle.
    }
}
