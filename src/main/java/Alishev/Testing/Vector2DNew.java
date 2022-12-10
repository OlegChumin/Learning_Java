package Alishev.Testing;

public class Vector2DNew {
    private double x; // координаты вектора по оси x
    private double y; // координаты вектора по оси y

    public double getX() { // метод для получения значения x
        return x;
    }

    public void setX(double x) { // метод для задания значения x текущему объекту класса
        this.x = x;
    }

    public double getY() { // метод для получения значения y
        return y;
    }

    public void setY(double y) { // метод для задания значения y текущему объекту класса
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y); // длина отрезка по теореме Пифагора
    }
}
