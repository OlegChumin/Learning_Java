package Alishev.BaseJava.enums;

import ru.learning.alishev.baseJava.interfaces.Animal;

public class Lesson48Enum {
    public static void main(String[] args) {
        Animals animal = Animals.FROG;
        Animals animal2 = Animals.CAT;
        Animals animal3 = Animals.DOG;
        System.out.println(animal3);
        System.out.println(animal2.getTranslation());

        switch(animal) {
            case CAT:
                System.out.println("cat");
                break;
            case DOG:
                System.out.println("dog");
                break;
            case FROG:
                System.out.println("frog");
                break;
        }
        Season season = Season.SUMMER;
        Season season2 = Season.WINTER;
        System.out.println(season2.getTemperature());
        //Object -> Enum -> Season
        System.out.println(season instanceof Season);
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Object);
        System.out.println(season.getClass());

        switch(season) {
            case SUMMER:
                System.out.println("warm outside");
                break;
            case SPRING:
                System.out.println("nice time");
                break;
            case AUTUMN:
                System.out.println("rainy days");
                break;
            case WINTER:
                System.out.println("a lot of snow");
        }
    }
}
