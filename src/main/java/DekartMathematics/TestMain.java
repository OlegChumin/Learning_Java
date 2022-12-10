package DekartMathematics;

public class TestMain {
    public static void main(String[] args) {
        Segment segment = new Segment(new Point(0, 0), new Point(3, 4));
        System.out.println(segment.segmentLength());
        System.out.println(segment.segmentMiddlePoint());
        Segment segmentAnother = new Segment(new Point(2, 0), new Point(0, 2));
        System.out.println(segment.segmentsIntersection(segmentAnother));
    }
}
