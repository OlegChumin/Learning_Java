package EKIDS.Lessons.Lesson5;

import java.util.Arrays;

public class Lesson51 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 56;
        array1[2] = 89;
        array1[3] = -3;
        array1[4] = 5;

//        System.out.println(Arrays.toString(array1));

        int[] array2 = {1, 56, 89, -3, 5};
//        System.out.println(Arrays.toString(array2));

        int[][] array2D = new int[3][3];
//          -0-1-2
//       -0- 2 3 3
//       -1- 4 5 7
//       -2- 6 7 9

        array2D[0][0] = 2;
        array2D[0][1] = 3;
        array2D[0][2] = 3;

        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 7;

        array2D[2][0] = 6;
        array2D[2][1] = 7;
        array2D[2][2] = 9;

//                                     -0-       -1-        -2-
        int[][] array2DSecond = {{2, 3, 3}, {4, 5, 7}, {6, 7, 9}};

        int[][][] array3D = new int[3][3][3];

        int[][][][] array4D = new int[3][3][3][3];


        int[][] array2DFird = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2DFird[i][j] = 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2DFird[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] array3DFird = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3 ; k++) {
                    array3DFird[i][j][k] = 5;
                }
            }
        }

        System.out.println(Arrays.deepToString(array3DFird));
//        int[][][]array3DFourth = {{{}, {}, {}, {}},{{}, {}, {}, {}},{{}, {}, {}}};
    }
}
