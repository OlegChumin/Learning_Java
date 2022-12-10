package EKIDS.Lessons.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        byte aMax; //-128.0..127 (256)
            aMax = Byte.MAX_VALUE;
        byte aMin = Byte.MIN_VALUE;

        System.out.println("aMax = " + aMax);
        System.out.println("aMin = " + aMin);
        System.out.println("Max Value short " + Short.MAX_VALUE);
        System.out.println("Min Value short " + Short.MIN_VALUE);
        System.out.println("Max Value int " + Integer.MAX_VALUE);
        System.out.println("Min Value int " + Integer.MIN_VALUE);
        System.out.println("Max Value long " + Long.MAX_VALUE);
        System.out.println("Min Value long " + Long.MIN_VALUE);
        System.out.println();
        System.out.println("Max Value float " + Float.MAX_VALUE);
        System.out.println("Min Value float " + Float.MIN_VALUE);
        System.out.println("Max Value double " + Double.MAX_VALUE);
        System.out.println("Min Value double" + Double.MIN_VALUE);

        String str =  'a' + 'P' + 'r' + "i" + 'v' + 'e' + 't';

        int number = Integer.MAX_VALUE;

        System.out.println(str);

    }
}
