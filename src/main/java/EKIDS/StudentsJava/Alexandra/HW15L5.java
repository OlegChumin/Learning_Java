package EKIDS.StudentsJava.Alexandra;

public class HW15L5 {
    public static void main(String[] args) {
        char[][] array2D = new char[10][20];
        int j = 0;
        int i = 0;
        if (i == 0) {
            while (j < 20) {
                array2D[i][j] = 'Б';
                j++;
            }
        }
        int l = 1;
        int m = 0;
        if (m == 0) {
            while (l < 10) {
                array2D[l][m] = 'Б';
                l++;
            }
        }
        int q = 1;
        int w = 19;
        if (w == 19) {
            while (q < 10) {
                array2D[q][w] = 'Б';
                q++;
            }
        }
        int r = 9;
        int e = 1;
        if (r == 9) {
            while (e < 19) {
                array2D[r][e] = 'Б';
                e++;
            }
        }

        for (int k = 1; k < 9; k++) {
            for (int n = 1; n < 19; n++) {
                array2D[k][n] = ' ';
            }
        }
        for (int t = 0; t < 10; t++) {
            for (int y = 0; y < 20; y++) {
                System.out.print(array2D[t][y] + " ");
            }
            System.out.println();
        }
    }
}
