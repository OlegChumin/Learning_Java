package Java_Oleg.usefull;

public class ReverseXY {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        x = x ^ y ^ x ^ x;
        System.out.println(x);
        System.out.println(y);
    }
}
