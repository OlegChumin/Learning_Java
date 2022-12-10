package EKIDS.Lessons.Lesson10;

import java.util.Arrays;
import java.util.Random;

public class ClassRandom2Darray {
    public static void main(String[] args) {
        int[][] array2D = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                array2D[i][j] = new Random().nextInt(20);
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
