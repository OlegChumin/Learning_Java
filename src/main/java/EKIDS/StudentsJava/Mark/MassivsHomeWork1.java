package EKIDS.StudentsJava.Mark;

import java.lang.reflect.Array;
import java.util.Arrays;


public class MassivsHomeWork1 {
    public static void main(String[] args) {
        int[][] array2D = new int[4][5];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                array2D[i][j] = 77;
            }
        }
        System.out.println(Arrays.deepToString(array2D));
    }
}