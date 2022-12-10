package DekartMathematics;

public class Segment {
    Point start; // null
    Point end; //null

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) { // проверяем совпадение координат начала и
            // конца отрезка -> "вырожденным отрезком" == точка
            throw new RuntimeException("отрезок вырожден координаты начала и конца совпадают");
        } else if (start == null || end == null) {
            throw new RuntimeException("отрезок не существует");
        } else {
            this.start = start;
            this.end = end;
        }
    }

    public double segmentLength() {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    public Point segmentMiddlePoint() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY()) + end.getY() / 2);
    }

    public Point segmentsIntersection(Segment another) {
        //нахождение координат через составление и решение системы уравнений двух прямых проходящих через заданные О1 и О2
        //составляем параметры уравнений прямых проходящих через отрезки
        // O1: K1*x + d1 - y =0; O2: K2*x + d2 - y = 0;
        double x1 = this.start.getX(); // зеленый
        double x2 = this.end.getX(); // зеленый
        double y1 = this.start.getY(); // зеленый
        double y2 = this.end.getY();  // зеленый

        double x3 = another.start.getX(); // синий
        double x4 = another.end.getX(); // синий
        double y3 = another.start.getY(); // синий
        double y4 = another.end.getY();  // синий

        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (denominator != 0) {
            double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
            double u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / denominator;
            boolean tRange = t >= 0 && t <= 1; // true/false
            boolean uRange = u >= 0 && u <= 1; // true/false
            if (tRange && uRange) {
                if (tRange) {
                    return new Point(x1 + t * (x2 - x1), y1 + t * (y2 - y1)); // пересечение вариант 1
                } else if (uRange) {
                    return new Point(x3 + u * (x4 - x3), y3 + u * (y4 - y3)); // пересечение вариант 2
                } else {
                    return null; // нет пересечений
                }
            } else {
                return null; // нет пересечений
            }
        } else {
            return null; // отрезки параллельны
        }
    }
}
