package EKIDS.Lessons.Lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        String[] string0 = new String[3];
        string0[0] = "AA";
        string0[1] = "AB";
        string0[2] = "BC";

        String[] string = {"AA", "AB", "BC"};

        int i = 2;
        String string2 = new String[] {"AA", "AB", "BC"} [i];
        System.out.println(string2);
    }
}
