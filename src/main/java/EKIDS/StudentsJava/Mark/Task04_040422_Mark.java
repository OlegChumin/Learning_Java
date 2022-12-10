package EKIDS.StudentsJava.Mark;

import java.util.Scanner;

public class Task04_040422_Mark {
    public static void main(String[] args) {
        City city1 = new City();
        city1.cityTitle = "Moskow";
        city1.squareSize =  2561 ;
        city1.cityPopulation = 15_078_546;
        city1.cityOlds = 875;
        System.out.println("Название города №1 - " + city1.cityTitle);
        System.out.println("Площадь города №1 - " + city1.squareSize + " Км в квадрате");;
        System.out.println("Население города № 1 - " + city1.cityPopulation + " человек");
        System.out.println("Городу №1 - " + city1.cityOlds + " лет");
        System.out.println();



        City city2 = new City();
        city2.cityTitle = "ST. Peterspurg";
        city2.squareSize = 1439;
        city2.cityPopulation = 5_376_672;
        city2.cityOlds = 318;
        System.out.println("Название города №2 - " + city2.cityTitle  );
        System.out.println("Площадь города №2 - " + city2.squareSize + " Км в квадрате");
        System.out.println("Население города №2 - " + city2.cityPopulation + " чел.");
        System.out.println("Городу №2 - " + city2.cityOlds + " лет");
        System.out.println();


        City city3 = new City();
        city3.cityTitle = "New yourk";
        city3.squareSize = 1_214;
        city3.cityPopulation = 8_804_190;
        city3.cityOlds = 398;
        System.out.println("Название города №3 - " + city3.cityTitle);
        System.out.println("Площадь города №3 - " + city3.squareSize + " Км в квадрате");
        System.out.println("Население города № 3 - " + city3.cityPopulation + " чел.");
        System.out.println("Городу №3 - " + city3.cityOlds + " лет");
        System.out.println();




        City city4 = new City();
        city4.cityTitle = "Dubay";
        city4.squareSize = 3_885;
        city4.cityPopulation = 3_331_420;
        city4.cityOlds = 189;
        System.out.println("Название города №4 - " + city4.cityTitle);
        System.out.println("Площадь города №4 - " + city4.squareSize + " Км в квадрате");
        System.out.println("Население города № 4 - " + city4.cityPopulation + " чел.");
        System.out.println("Городу №4 - " + city4.cityOlds + " лет");
        System.out.println();
    }
}

class City {
    String cityTitle;
    int cityPopulation;
    int squareSize;
    int cityOlds;
}
