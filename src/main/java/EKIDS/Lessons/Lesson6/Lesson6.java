package EKIDS.Lessons.Lesson6;

import java.util.Arrays;

/**
 * Урок 6 03.04.2022
 1. Логические операции.
 2. For each
 3. Switch
 4. Классы, методы, объекты. Создание, параметры.
 5. Методы.
 */

public class Lesson6 {
    public static void main(String[] args) {
        String[] stringArray = new String[3];
        stringArray[0] = "Emil";
        stringArray[1] = "Alexandra";
        stringArray[2] = "Mark";

        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(" " + stringArray[i]);
        }
        System.out.println();

        //for each
        for (String str: stringArray) {
            System.out.println(str + " Super");
        }
    }
}
