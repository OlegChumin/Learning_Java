package EKIDS.StudentsJava.Mark;

import java.util.Arrays;

public class MassivsHomeWork1Corrected {
    public static void main(String[] args) {
        int[][] array2D = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array2D[i][j] = 77;
            }
        }
        System.out.println(Arrays.deepToString(array2D));
    }
}
