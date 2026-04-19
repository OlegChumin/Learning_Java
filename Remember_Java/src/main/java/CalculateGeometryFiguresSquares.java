import java.util.Scanner;

public class CalculateGeometryFiguresSquares {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Программа расчета площадей геометрических фигур");
        selectGeometryFigure();
        System.out.println("Спасибо за использование программы.");
    }

    public static void selectGeometryFigure() {
        System.out.println("Привет, выбери номер геометрической фигуры: \n" +
                "1 - треугольник\n" +
                "2 - круг\n" +
                "3 - квадрат\n" +
                "4 - трапеция\n" +
                "5 - правильный многоугольник\n" +
                "6 - эллипс\n");

        switch (scanner.nextInt()) {
            case 1: {
                System.out.println("1 - выбран расчет площади треугольника");
                System.out.println("Площадь заданного треугольника = " + calculateTriangleSquare());
            }
            ;
            break;
            case 2: {
                System.out.println("2 - выбран расчет площади круга");
                System.out.println("Площадь заданного круга = " + calculateCircleSquare());
            }
            ;
            break;
            case 3: {
                System.out.println("3 - выбран расчет площади квадрата");
                System.out.println("Площадь заданного квадрата = " + calculateSquareSquare());
            }
            ;
            break;
            case 4: {
                System.out.println("4 - выбран расчет площади трапеции");
                System.out.println("Площадь заданной трапеции = " + calculateTrapezoidSquare());
            }
            ;
            break;
            case 5: {
                System.out.println("5 - выбран расчет площади правильного многоугольника");
                System.out.println("Площадь заданного правильного многоугольника = " + calculateRegularPolygon());
            }
            ;
            break;
            case 6: {
                System.out.println("6 - выбран расчет площади эллипса");
                System.out.println("Площадь заданного эллипса = " + calculateEllipse());
            }
            ;
            break;
            default:
                System.out.println("нет такой фигуры в базе программы");
                break;
        }
    }

    //методы, которые вычисляет площадь фигуры
    //метод, вычисляющий площадь треугольника
    public static double calculateTriangleSquare() {
        System.out.println("Просьба ввети высоту треугольника: ");
        double height = scanner.nextDouble();
        System.out.println("Просьба ввети сторону треугольника: ");
        double side = scanner.nextDouble();
        return 0.5 * height * side;
    }


    //метод, вычисляющий площадь круга
    public static double calculateCircleSquare() {
        System.out.println("Введи длину радиуса окружности");
        return Math.PI * Math.pow(scanner.nextDouble(), 2);
        //Math.PI = 3, 14
    }

    //метод, вычисляющий площадь квадрата
    public static double calculateSquareSquare() {
        System.out.println("Введи длину стороны квадрата");
        return Math.pow(scanner.nextDouble(), 2);
    }

    //метод, вычисляющий площадь трапеции
    public static double calculateTrapezoidSquare() {
        System.out.println("Введи длину первой параллельной стороны трапеции:");
        double side = scanner.nextDouble();
        System.out.println("Введи длину второй параллельной стороны трапеции:");
        double secondSide = scanner.nextDouble();
        System.out.println("Введи длину высоты трапеции:");
        double height = scanner.nextDouble();
        return 0.5 * (side + secondSide) * height;
    }

    //метод, вычисляющий площадь правильного многоугольника
    public static double calculateRegularPolygon() {
        //S = n/4 × a 2 × ctg (pi/n)
        System.out.println("Введи количество сторон правильного многоугольника:");
        long sidesNumber = scanner.nextLong();
        System.out.println("Введи длину стороны правильного многоугольника:");
        double side = scanner.nextDouble();
        return sidesNumber / 4 * Math.pow(side, 2) * 1 / Math.tan(Math.PI / sidesNumber);
    }

    //метод, вычисляющий площадь эллипса
    public static double calculateEllipse() {
        System.out.println("Введи длину первой полуоси эллипса");
        double semiAxisA = scanner.nextDouble();
        System.out.println("Введи длину второй полуоси эллипса");
        double semiAxisB = scanner.nextDouble();
        return Math.PI * semiAxisA * semiAxisB;
    }
}
