package materials.lesson_07_08.IV_abstraction_абстракция;

// Абстрактный класс
abstract class Shape {
    String color;

    // абстрактный метод для подсчета площади
    abstract double area();

    // обычный метод
    public String getColor() {
        return color;
    }
}

// Конкретный класс Circle, наследующийся от Shape
class Circle extends Shape {
    double radius;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Конкретный класс Rectangle, наследующийся от Shape
class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "красный");
        Shape rectangle = new Rectangle(10, 5, "синий");

        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Площадь прямоугольника: " + rectangle.area());
    }
}
