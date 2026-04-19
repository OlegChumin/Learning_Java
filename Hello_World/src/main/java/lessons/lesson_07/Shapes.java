package lessons.lesson_07;

abstract class Shapes {
    private String color;

    // обычный метод абстрактного класса

    public String getColor() {
        return color;
    }

    abstract double area(); // у абстрактного  метода нет реализации, т.е. нет {....}
}

class Circle extends Shapes {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shapes {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}


class TestShapes {
    public static void main(String[] args) {
        //Shapes shapes = new Shapes();
        /*
        * много
        * строчный
        * комментарий
        *
        * */
        /**
         * Это Java doc комментарий
         */

        Shapes circle = new Circle(5.);
        Shapes rectangle = new Rectangle(7., 9.);

        System.out.println(" площадь круга " + circle.area());
        System.out.println(" площадь прямоугольника " + rectangle.area() );
    }
}
