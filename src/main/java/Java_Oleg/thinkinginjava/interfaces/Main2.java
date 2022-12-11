package Java_Oleg.thinkinginjava.interfaces;

public class Main2 {
    public static void main(String[] args) {
       int[][] twoD = {{1,2,3},{4,5,6,7},{8,9,10}};
        System.out.println(twoD[1].length);
        System.out.println(twoD[2].getClass().isArray());

        System.out.println("hello".concat(" world"));
//        System.out.println(new StringBuilder("world").append("hello",0,6));
        System.out.println("hello world".trim());
        int x = (x=3)*4;
        System.out.println(x);
        }
    }
