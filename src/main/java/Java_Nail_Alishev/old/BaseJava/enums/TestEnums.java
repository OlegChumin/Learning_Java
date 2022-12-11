package Java_Nail_Alishev.old.BaseJava.enums;

import java.util.Arrays;

public class TestEnums {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.name());
        System.out.println(season);

        Animals animals = Animals.CAT;
        System.out.println(animals.name());

        Animals frog = Animals.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); // получение номера WINTER в Enum

        Season[] array = Season.values();  // получение массива всего содержимого Enum Season
        System.out.println(Arrays.toString(array));
    }
}
