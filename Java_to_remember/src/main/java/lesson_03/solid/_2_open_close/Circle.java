package lesson_03.solid._2_open_close;

public class Circle implements Shape{
    private double radius;
    @Override
    public double area() {
        return Math.PI * 2 * radius * radius;
    }
}
