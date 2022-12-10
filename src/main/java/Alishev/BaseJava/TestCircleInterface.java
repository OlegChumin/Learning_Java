package Alishev.BaseJava;

public class TestCircleInterface {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.area();
    }

}

class Circle implements Measurable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

interface Measurable {
    double area();
}


