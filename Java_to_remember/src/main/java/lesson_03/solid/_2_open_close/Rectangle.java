package lesson_03.solid._2_open_close;

public class Rectangle implements Shape{
    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }
}
