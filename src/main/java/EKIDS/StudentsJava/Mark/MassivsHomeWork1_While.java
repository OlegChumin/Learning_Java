package EKIDS.StudentsJava.Mark;

import java.util.Arrays;

public class MassivsHomeWork1_While {
    public static void main(String[] args) {
        int[][] array2D = new int[4][5];
        int i = 0;
        while (i < array2D.length) {
            int j = 0; //важно обнулять счетчик внутреннего цикла, тут еще про области действия переменных поговорим
            while (j < array2D[0].length) {
                array2D[i][j] = 77;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.deepToString(array2D)); //выводим на экран чтобы убедится что заполнили весь массив
        System.out.println();

        //вывод на экран построчно массива 4х5, счетчики задал отдельными переменными
        int k = 0;
        while (k < array2D.length) {
            int m = 0;  //важно счетчик внутреннего цикла обнулять, иначе будет работатьнеправильно
            while (m < array2D[0].length) {
                System.out.print(array2D[k][m] + " ");
                m++;
            }
            System.out.println();
            k++;
        }
    }
}


