package SOLID._2_open_close;

public class Circle implements Shape {
    private double radius;
    public double area() { return Math.PI * radius * radius; }
}