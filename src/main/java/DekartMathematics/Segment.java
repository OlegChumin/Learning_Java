package DekartMathematics;

public class Segment {
    Point start; // null
    Point end; //null

    public Segment(Point start, Point end) {
        if (start == null || end == null) {
            throw new RuntimeException("отрезок не существует");
        }
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            throw new RuntimeException("отрезок вырожден координаты начала и конца совпадают");
        }
        this.start = start;
        this.end = end;
    }


    public double segmentLength() {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    public Point segmentMiddlePoint() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    public Point segmentsIntersection(Segment another) {
        double x1 = this.start.getX();
        double x2 = this.end.getX();
        double y1 = this.start.getY();
        double y2 = this.end.getY();

        double x3 = another.start.getX();
        double x4 = another.end.getX();
        double y3 = another.start.getY();
        double y4 = another.end.getY();

        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (denominator != 0) {
            double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
            double u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / denominator;

            if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
                return new Point(x1 + t * (x2 - x1), y1 + t * (y2 - y1));
            }
            return null; // Отрезки не пересекаются
        }

        return null; // Отрезки параллельны
    }

}
