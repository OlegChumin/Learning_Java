package materials.lesson_07_08.IV_abstraction_абстракция.interface_and_abstractClass;

// Интерфейс
interface Movable {
    void move();
}

// Класс, реализующий интерфейс
class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Автомобиль едет");
    }
}
