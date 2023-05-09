package SOLID._2_open_close;

// Реализация для разных форм
public class Rectangle implements Shape {
    private double width, height;
    public double area() { return width * height; }
}