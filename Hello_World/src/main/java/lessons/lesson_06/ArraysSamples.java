package lessons.lesson_06;

import java.util.Arrays;

public class ArraysSamples {

    private static final int ARRAY_OF_TEMP = 5; // размер массива


    public static void main(String[] args) {
        int someIntegerNumber;
        int a1 = 23;
        int a2 = 21;
        //.....

        //Пример одномерного массива
        //int - тип целые числа
        // arrayOfTemperatureValues  - переменная которая ссылается на область памяти
        //                                создано 5 ячеек в памяти
        //                                   [0 1 2 3 4] <- length = 5
        //                                    [][][][][]
        int[] arrayOfTemperatureValues = new int[ARRAY_OF_TEMP]; // создается массив длиной 5 элементов
        arrayOfTemperatureValues[0] = 23;
        arrayOfTemperatureValues[1] = 21;
        arrayOfTemperatureValues[2] = 24;
        arrayOfTemperatureValues[3] = 25;
        arrayOfTemperatureValues[4] = 20;

        System.out.println(" Длина массива arrayOfTemperatureValues = " + arrayOfTemperatureValues.length);

        System.out.print("[");
        for (int i = 0; i < arrayOfTemperatureValues.length; i++) {
            if (i == arrayOfTemperatureValues.length - 1) {
                System.out.print(arrayOfTemperatureValues[i]);
                continue;
            }
            System.out.print(arrayOfTemperatureValues[i] + ", ");
        }


        System.out.print("]");
        System.out.println();

        {
            {
                {
                    {
                        {
                            {
                                {

                                }
                            }
                        }
                    }

                }
            }
        }

        System.out.print(Arrays.toString(arrayOfTemperatureValues));
        System.out.println();

        // быстрая инициализация массивов
        int[] arrayOfTemperatureValues2 = {23, 21, 24, 25, 20};
        System.out.println(Arrays.toString(arrayOfTemperatureValues2));

        int[] arrayOfTemperatureValues3 = new int[]{23, 21, 24, 25, 20};
        System.out.println(Arrays.toString(arrayOfTemperatureValues3));


        Arrays.sort(arrayOfTemperatureValues3);
        System.out.println(" Отсортированный массив ");
        System.out.println(Arrays.toString(arrayOfTemperatureValues3));

        // 1. задача на дом написать алгоритм 1. сортировки массива самостоятельно.(нужна внутри временаня переменная))
        // 2. задача написать алгоритм реверсирования массива - т.е. поменять местами все элементы с конца в начало
        // (перебор вести до сердины массива))

        //многомерные или вложенные массивы
        // примеры создания двуменрых массиво
        int[][] twoDimArray1 = new int[3][2]; // пустой массив
        //  [] []
        //  [] []
        //  [] []


        // i - это строки i =3, j - это элементы j = 2
        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int j = 0; j < twoDimArray1[i].length; j++) {
                twoDimArray1[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray1));

                             //  i = 0     i = 1  i = 3
                             //j 0  1    0  1    0  1
        int[][] twoDimArray2 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(twoDimArray2));

        System.out.println("twoDimArray2 элемент в 0 строке в 1 интексе = " + twoDimArray2[0][1]);

        int[][] twoDimArray3 = new int[][]{{1, 2}, {3, 4}, {5, 6}};


        int[][][] threeDimArray1 = new int[3][3][3];


        int[][][] threeDimArray2 = {
                {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}
        };

        System.out.println(Arrays.deepToString(threeDimArray2));

        // зубчатые массивы
        int[][] jaggedArray1 = new int[3][];
        jaggedArray1[0] =  new int[2];
        jaggedArray1[1] = new int[4];
        jaggedArray1[2] = new int[3];

        jaggedArray1[0][0] = 0;
        jaggedArray1[0][1] = 0;

        jaggedArray1[1][0] = 0;
        jaggedArray1[1][1] = 0;
        jaggedArray1[1][2] = 0;
        jaggedArray1[1][3] = 0;

        jaggedArray1[2][0] = 0;
        jaggedArray1[2][1] = 0;
        jaggedArray1[2][2] = 0;


      System.out.println(Arrays.deepToString(jaggedArray1));

      // задача 3 создать зубчатый массив [4][]
        // строка [0] = [2]
        // строка [1] = [5]
        // строка [2] = [4]
        // строка [3] = [7]

        // Заполнить его
        // Вывести на экран
    }

//    static int[][] fillTwoDimArray(int[][] twoDimArray, int fillNumber) {
//        int[][] resultArray = new int[twoDimArray.length][twoDimArray[0].length];
//        return resultArray;
//    }
}
