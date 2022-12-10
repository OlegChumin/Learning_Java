package EKIDS.Lessons.Lesson08.Sound;

import java.util.Arrays;

// we did some changes
// we add new changes again
// we add also new changes

public class Array2D {
    public static void main(String[] args) {
        String[] arrayOfGelb = new String[10]; // одномерный массив
        // [0][0][0][0][0][0][0][0][0][0][0][0][0]

        int[][] array2D = new int[4][3];

        int[][][] array3D = new int[60][70][30];

        int[][][][] array4D;


        System.out.println("Длина массива = " + arrayOfGelb.length);

        for (int i = 0; i < arrayOfGelb.length; i++) { //заполняем одномерный массив значениями 1
            arrayOfGelb[i] = "Привет";
        }

        for (int i = 0; i < arrayOfGelb.length; i++) {
            System.out.print(arrayOfGelb[i] + " ");
        }

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = 77;
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(array2D));

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");;
            }
            System.out.println();
        }
    }
}
