package TasksFromLeo.Segments;

public class Segment {
    Point start;
    Point end;

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) { // проверяем что отрезок не вырожден
            throw new RuntimeException();
        } else if (start == null || end == null) { // проверяем что отрезок существует
            throw new RuntimeException();
        } else {
            this.start = start; // новая сущность - отрезок с точками start и end
            this.end = end;
        }
    }

    // Метод, вычисляющий длину отрезка по координатам двух точек по формуле
    // корень квадратный из((end.x - start.x)^2 + (end.y - start.y)^2)
    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    // Метод, вычисляющий середину отрезка - точку с координатами ((start.x + end.x)/2, (start.y + end.y)/2)
    public Point middle() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    // Метод, метод вычисляющий пересечение двух отрезков
    //https://en.wikipedia.org/wiki/Intersection_(geometry)#Two_lines
    public Point intersection(Segment another) {
        //нахождение координат через составление и решение системы уравнений двух прямых проходящих через заданные О1 и О2
        //составляем параметры уравнений прямых проходящих через отрезки
        // O1: K1*x + d1 - y =0; O2: K2*x + d2 - y = 0;

        //Отрезок О1
        double x1 = this.start.getX(); // координата Х начала отрезка О1
        double x2 = this.end.getX(); // координата Х конца отрезка О1
        double y1 = this.start.getY(); // координата Y начала отрезка О1
        double y2 = this.end.getY(); // координата Y конца отрезка О1

        // Отрезок О2
        double x3 = another.start.getX(); // координата X начала отрезка О2
        double x4 = another.end.getX(); // координата X конца отрезка О2
        double y3 = another.start.getY(); // координата Y начала отрезка О2
        double y4 = another.end.getY(); // координата Y конца отрезка О2

        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (denominator != 0) {
            double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
            double u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / denominator;
            boolean tRange = t >= 0 && t <= 1;
            boolean uRange = u >= 0 && u <= 1;
            if (tRange && uRange) {
                if (tRange) {
                    return new Point(x1 + t * (x2 - x1), y1 + t * (y2 - y1)); //intersectionPoint1
                } else if (uRange) {
                    return new Point(x3 + u * (x4 - x3), y3 + u * (y4 - y3)); //intersectionPoint2
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


