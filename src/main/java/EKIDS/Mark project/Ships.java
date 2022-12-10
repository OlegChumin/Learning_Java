package EKIDS.Mark;

import Progects.SeaButtle.SeaButtleGameMark;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

//  класс отвечающий а создание кораблей на полях игроков
public class Ships extends SeaButtleGameMark {
    public int ShipOne1x;
    public int ShipOne1y;
    public int ShipOne2x;
    public int ShipOne2y;
    public int ShipOne3x;
    public int ShipOne3y;
    public int ShipOne4x;
    public int ShipOne4y;



    private boolean programCanStopRespawnShip = false;


    // координаты двухпалубных кораблей
    public int[] shipTwo1x = new int[2];
    public int[] shipTwo1y = new int[2];
    public int[] shipTwo2x = new int[2];
    public int[] shipTwo2y = new int[2];
    public int[] shipTwo3x = new int[2];
    public int[] shipTwo3y = new int[2];

    // координаты трёхпалубных кораблей
    public int[] shipThree1x = new int[3];
    public int[] shipThree1y = new int[3];
    public int[] shipThree2x = new int[3];
    public int[] shipThree2y = new int[3];


    // координаты четырёхпалубных кораблей
    public int[] shipFourX = new int[4];
    public int[] shipFourY = new int[4];

    public Image ship;


    //TranslateA_to_J_to_X_And_1_to_10_to_Y
    public void TranslateA_to_J_to_X_And_1_to_10_to_Y() {}


    // метод, который создаёт корабли
    public void createShip() {

    }

    // этот метод сравнивает координаты кораблей и если они совпадают или стоят близко, то он их пересоздаёт
    public void checkShip() {
        while (programCanStopRespawnShip == false) {
            // операторы if которые сравнивают координаты 1-палубных кораблей
            // с координатами 1-палубных кораблей по оси х
            if (ShipOne1x == ShipOne2x || ShipOne1x == ShipOne3x || ShipOne1x == ShipOne4x
                    || ShipOne1x - ShipOne2x == 1 || ShipOne1x - ShipOne3x == 1 || ShipOne1x - ShipOne4x == 1) {
                createShip();
            } else if (ShipOne2x == ShipOne1x || ShipOne2x == ShipOne3x || ShipOne2x == ShipOne4x
                    || ShipOne2x - ShipOne1x == 1 || ShipOne2x - ShipOne3x == 1 || ShipOne2x - ShipOne4x == 1) {
                createShip();
            } else if (ShipOne3x == ShipOne1x || ShipOne3x == ShipOne2x || ShipOne3x == ShipOne4x
                    || ShipOne3x - ShipOne1x == 1 || ShipOne3x - ShipOne2x == 1 || ShipOne3x - ShipOne4x == 1) {
                createShip();
            } else if (ShipOne4x == ShipOne1x || ShipOne4x == ShipOne3x || ShipOne4x == ShipOne2x
                    || ShipOne4x - ShipOne2x == 1 || ShipOne4x - ShipOne3x == 1 || ShipOne4x - ShipOne1x == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты первого однопалубного корабля с координатами 2-х палубных
            // кораблей по оси x
            else if (ShipOne1x == shipTwo1x[0] || ShipOne1x == shipTwo1x[1] || ShipOne1x == shipTwo2x[0]
                    || ShipOne1x == shipTwo2x[1] || ShipOne1x == shipTwo3x[0] || ShipOne1x == shipTwo3x[1]
                    || ShipOne1x - shipTwo1x[0] == 1 || ShipOne1x - shipTwo1x[1] == 1
                    || ShipOne1x - shipTwo2x[0] == 1 || ShipOne1x - shipTwo2x[1] == 1
                    || ShipOne1x - shipTwo3x[0] == 1 || ShipOne1x - shipTwo3x[1] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты второго однопалубного корабля с координатами 2-х палубных
            // кораблей по оси x
            else if (ShipOne2x == shipTwo1x[0] || ShipOne2x == shipTwo1x[1] || ShipOne2x == shipTwo2x[0]
                    || ShipOne2x == shipTwo2x[1] || ShipOne2x == shipTwo3x[0] || ShipOne2x == shipTwo3x[1]
                    || ShipOne2x - shipTwo1x[0] == 1 || ShipOne2x - shipTwo1x[1] == 1
                    || ShipOne2x - shipTwo2x[0] == 1 || ShipOne2x - shipTwo2x[1] == 1
                    || ShipOne2x - shipTwo3x[0] == 1 || ShipOne2x - shipTwo3x[1] == 1) {
                createShip();

            }
            // оператор if который сравнивает координаты третьего однопалубного корабля с координатами 2-х палубных
            // кораблей по оси x
            else if (ShipOne3x == shipTwo1x[0] || ShipOne3x == shipTwo1x[1] || ShipOne3x == shipTwo2x[0]
                    || ShipOne3x == shipTwo2x[1] || ShipOne3x == shipTwo3x[0] || ShipOne3x == shipTwo3x[1]
                    || ShipOne3x - shipTwo1x[0] == 1 || ShipOne3x - shipTwo1x[1] == 1
                    || ShipOne3x - shipTwo2x[0] == 1 || ShipOne3x - shipTwo2x[1] == 1
                    || ShipOne3x - shipTwo3x[0] == 1 || ShipOne3x - shipTwo3x[1] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты четвёртого однопалубного корабля с координатами 2-х палубных
            // кораблей по оси x
            else if (ShipOne4x == shipTwo1x[0] || ShipOne4x == shipTwo1x[1] || ShipOne4x == shipTwo2x[0]
                    || ShipOne4x == shipTwo2x[1] || ShipOne4x == shipTwo3x[0] || ShipOne4x == shipTwo3x[1]
                    || ShipOne4x - shipTwo1x[0] == 1 || ShipOne4x - shipTwo3x[1] == 1
                    || ShipOne4x - shipTwo2x[0] == 1 || ShipOne4x - shipTwo2x[1] == 1
                    || ShipOne4x - shipTwo3x[0] == 1 || ShipOne4x - shipTwo3x[1] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты двухпалубных кораблей с координатами 2-х палубных
            // кораблей по оси x
            else if (shipTwo1x[0] == shipTwo2x[0] || shipTwo1x[1] == shipTwo2x[1] || shipTwo1x[0] == shipTwo3x[0]
                    || shipTwo1x[1] == shipTwo3x[1] || shipTwo2x[0] == shipTwo3x[0] || shipTwo2x[1] == shipTwo3x[1]
                    || shipTwo1x[0] - shipTwo2x[0] == 1 || shipTwo1x[1] - shipTwo2x[1] == 1
                    || shipTwo1x[0] - shipTwo3x[0] == 1 || shipTwo1x[1] - shipTwo3x[1] == 1
                    || shipTwo2x[0] - shipTwo3x[0] == 1 || shipTwo2x[1] - shipTwo3x[1] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты первого однопалубного корабля с координатами 3-х палубных
            // кораблей по оси x
            else if (ShipOne1x == shipThree1x[0] || ShipOne1x == shipThree1x[1] || ShipOne1x == shipThree1x[2]
                    || ShipOne1x == shipThree2x[0] || ShipOne1x == shipThree2x[1] || ShipOne1x == shipThree2x[2]
                    || ShipOne1x - shipThree1x[0] == 1 || ShipOne1x - shipThree1x[1] == 1
                    || ShipOne1x - shipThree1x[2] == 1 || ShipOne1x - shipThree2x[0] == 1
                    || ShipOne1x - shipThree2x[1] == 1 || ShipOne1x - shipThree2x[2] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты второго однопалубного корабля с координатами 3-х палубных
            // кораблей по оси x
            else if (ShipOne2x == shipThree1x[0] || ShipOne2x == shipThree1x[1] || ShipOne2x == shipThree1x[2]
                    || ShipOne2x == shipThree2x[0] || ShipOne2x == shipThree2x[1] || ShipOne2x == shipThree2x[2]
                    || ShipOne2x - shipThree1x[0] == 1 || ShipOne2x - shipThree1x[1] == 1
                    || ShipOne2x - shipThree1x[2] == 1 || ShipOne2x - shipThree2x[0] == 1
                    || ShipOne2x - shipThree2x[1] == 1 || ShipOne2x - shipThree2x[2] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты третьего однопалубного корабля с координатами 3-х палубных
            // кораблей по оси x
            else if (ShipOne3x == shipThree1x[0] || ShipOne3x == shipThree1x[1] || ShipOne3x == shipThree1x[2]
                    || ShipOne3x == shipThree2x[0] || ShipOne3x == shipThree2x[1] || ShipOne3x == shipThree2x[2]
                    || ShipOne3x - shipThree1x[0] == 1 || ShipOne3x - shipThree1x[1] == 1
                    || ShipOne3x - shipThree1x[2] == 1 || ShipOne3x - shipThree2x[0] == 1
                    || ShipOne3x - shipThree2x[1] == 1 || ShipOne3x - shipThree2x[2] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты четвёртого однопалубного корабля с координатами 3-х палубных
            // кораблей по оси x
            else if (ShipOne4x == shipThree1x[0] || ShipOne4x == shipThree1x[1] || ShipOne4x == shipThree1x[2]
                    || ShipOne4x == shipThree2x[0] || ShipOne4x == shipThree2x[1] || ShipOne4x == shipThree2x[2]
                    || ShipOne4x - shipThree1x[0] == 1 || ShipOne4x - shipThree1x[1] == 1
                    || ShipOne4x - shipThree1x[2] == 1 || ShipOne4x - shipThree2x[0] == 1
                    || ShipOne4x - shipThree2x[1] == 1 || ShipOne4x - shipThree2x[2] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты 3-х палубных кораблей и координаты 2-х палубных кораблей
            // по оси x
            else if (shipThree1x[0] == shipTwo1x[0] || shipThree1x[0] == shipTwo1x[1]
                    || shipThree1x[1] == shipTwo1x[0] || shipThree1x[1] == shipTwo1x[1]
                    || shipThree1x[2] == shipTwo1x[0] || shipThree1x[2] == shipTwo1x[1]
                    || shipThree2x[0] == shipTwo1x[0] || shipThree2x[0] == shipTwo1x[1]
                    || shipThree2x[1] == shipTwo1x[0] || shipThree2x[1] == shipTwo1x[1]
                    || shipThree2x[2] == shipTwo1x[0] || shipThree2x[2] == shipTwo1x[1]

                    || shipThree1x[0] == shipTwo2x[0] || shipThree1x[0] == shipTwo2x[1]
                    || shipThree1x[1] == shipTwo2x[0] || shipThree1x[1] == shipTwo2x[1]
                    || shipThree1x[2] == shipTwo2x[0] || shipThree1x[2] == shipTwo2x[1]
                    || shipThree2x[0] == shipTwo2x[0] || shipThree2x[0] == shipTwo2x[1]
                    || shipThree2x[1] == shipTwo2x[0] || shipThree2x[1] == shipTwo2x[1]
                    || shipThree2x[2] == shipTwo2x[0] || shipThree2x[2] == shipTwo2x[1]

                    || shipThree1x[0] == shipTwo3x[0] || shipThree1x[0] == shipTwo3x[1]
                    || shipThree1x[1] == shipTwo3x[0] || shipThree1x[1] == shipTwo3x[1]
                    || shipThree1x[2] == shipTwo3x[0] || shipThree1x[2] == shipTwo3x[1]
                    || shipThree2x[0] == shipTwo3x[0] || shipThree2x[0] == shipTwo3x[1]
                    || shipThree2x[1] == shipTwo3x[0] || shipThree2x[1] == shipTwo3x[1]
                    || shipThree2x[2] == shipTwo3x[0] || shipThree2x[2] == shipTwo3x[1]) {
                createShip();
            }

            // продолжение прошлого оператора (не удобно писать в один if)        
            else if (shipThree1x[0] - shipTwo1x[0] == 1 || shipThree1x[0] - shipTwo1x[1] == 1
                    || shipThree1x[1] == shipTwo1x[0] || shipThree1x[1] - shipTwo1x[1] == 1
                    || shipThree1x[2] == shipTwo1x[0] || shipThree1x[2] - shipTwo1x[1] == 1
                    || shipThree2x[0] == shipTwo1x[0] || shipThree2x[0] - shipTwo1x[1] == 1
                    || shipThree2x[1] == shipTwo1x[0] || shipThree2x[1] - shipTwo1x[1] == 1
                    || shipThree2x[2] == shipTwo1x[0] || shipThree2x[2] - shipTwo1x[1] == 1

                    || shipThree1x[0] - shipTwo2x[0] == 1 || shipThree1x[0] - shipTwo2x[1] == 1
                    || shipThree1x[1] - shipTwo2x[0] == 1 || shipThree1x[1] - shipTwo2x[1] == 1
                    || shipThree1x[2] - shipTwo2x[0] == 1 || shipThree1x[2] - shipTwo2x[1] == 1
                    || shipThree2x[0] - shipTwo2x[0] == 1 || shipThree2x[0] - shipTwo2x[1] == 1
                    || shipThree2x[1] - shipTwo2x[0] == 1 || shipThree2x[1] - shipTwo2x[1] == 1
                    || shipThree2x[2] - shipTwo2x[0] == 1 || shipThree2x[2] - shipTwo2x[1] == 1

                    || shipThree1x[0] - shipTwo3x[0] == 1 || shipThree1x[0] - shipTwo3x[1] == 1
                    || shipThree1x[1] - shipTwo3x[0] == 1 || shipThree1x[1] - shipTwo3x[1] == 1
                    || shipThree1x[2] - shipTwo3x[0] == 1 || shipThree1x[2] - shipTwo3x[1] == 1
                    || shipThree2x[0] - shipTwo3x[0] == 1 || shipThree2x[0] - shipTwo3x[1] == 1
                    || shipThree2x[1] - shipTwo3x[0] == 1 || shipThree2x[1] - shipTwo3x[1] == 1
                    || shipThree2x[2] - shipTwo3x[0] == 1 || shipThree2x[2] - shipTwo3x[1] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты 3-х палубных кораблей с координатами 3-х палубных кораблей
            // по оси х
            else if (shipThree1x[0] == shipThree2x[0] || shipThree1x[1] == shipThree2x[1]
                    || shipThree1x[2] == shipThree2x[2] || shipThree1x[0] - shipThree2x[0] == 1
                    || shipThree1x[1] - shipThree2x[1] == 1 || shipThree1x[2] - shipThree2x[2] == 1) {
                createShip();
            }

            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 1-х палубных кораблей
            // по оси х
            else if (shipFourX[0] == ShipOne1x || shipFourX[0] == ShipOne2x
                    || shipFourX[0] == ShipOne3x || shipFourX[0] == ShipOne4x
                    || shipFourX[1] == ShipOne1x || shipFourX[1] == ShipOne2x
                    || shipFourX[1] == ShipOne3x || shipFourX[1] == ShipOne4x
                    || shipFourX[2] == ShipOne1x || shipFourX[2] == ShipOne2x
                    || shipFourX[2] == ShipOne3x || shipFourX[2] == ShipOne4x
                    || shipFourX[3] == ShipOne1x || shipFourX[3] == ShipOne2x
                    || shipFourX[3] == ShipOne3x || shipFourX[3] == ShipOne4x){
                createShip();
            }
            else if (shipFourX[0] - ShipOne1x == 1 || shipFourX[0] - ShipOne2x == 1 || shipFourX[0] - ShipOne3x == 1
                    || shipFourX[0] - ShipOne4x == 1
                    ||shipFourX[1] - ShipOne1x == 1 || shipFourX[1] - ShipOne2x == 1 || shipFourX[1] - ShipOne3x == 1
                    || shipFourX[1] - ShipOne4x == 1
                    || shipFourX[2] - ShipOne1x == 1 || shipFourX[2] - ShipOne2x == 1 || shipFourX[2] - ShipOne3x == 1
                    || shipFourX[2] - ShipOne4x == 1
                    ||shipFourX[3] - ShipOne1x == 1 || shipFourX[3] - ShipOne2x == 1 || shipFourX[3] - ShipOne3x == 1
                    || shipFourX[3] - ShipOne4x == 1) {
                createShip();
            }

            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 2-х палубных кораблей
            // по оси х
            else  if (shipFourX[0] == shipTwo1x[0] || shipFourX[0] == shipTwo1x[1]
                    || shipFourX[1] == shipTwo1x[0] || shipFourX[1] == shipTwo1x[1]
                    || shipFourX[2] == shipTwo1x[0] || shipFourX[2] == shipTwo1x[1]
                    || shipFourX[3] == shipTwo1x[0] || shipFourX[3] == shipTwo1x[1]

                    ||shipFourX[0] == shipTwo2x[0] || shipFourX[0] == shipTwo2x[1]
                    || shipFourX[1] == shipTwo2x[0] || shipFourX[1] == shipTwo2x[1]
                    || shipFourX[2] == shipTwo2x[0] || shipFourX[2] == shipTwo2x[1]
                    || shipFourX[3] == shipTwo2x[0] || shipFourX[3] == shipTwo2x[1]

                    ||shipFourX[0] == shipTwo3x[0] || shipFourX[0] == shipTwo3x[1]
                    || shipFourX[1] == shipTwo3x[0] || shipFourX[1] == shipTwo3x[1]
                    || shipFourX[2] == shipTwo3x[0] || shipFourX[2] == shipTwo3x[1]
                    || shipFourX[3] == shipTwo3x[0] || shipFourX[3] == shipTwo3x[1]) {
                createShip();
            }

            else  if (shipFourX[0] - shipTwo1x[0] == 1 || shipFourX[0] - shipTwo1x[1] == 1
                    || shipFourX[1] - shipTwo1x[0] == 1 || shipFourX[1] - shipTwo1x[1] == 1
                    || shipFourX[2] - shipTwo1x[0] == 1 || shipFourX[2] - shipTwo1x[1] == 1
                    || shipFourX[3] - shipTwo1x[0] == 1 || shipFourX[3] - shipTwo1x[1] == 1

                    || shipFourX[0] - shipTwo2x[0] == 1 || shipFourX[0] - shipTwo2x[1] == 1
                    || shipFourX[1] - shipTwo2x[0] == 1 || shipFourX[1] - shipTwo2x[1] == 1
                    || shipFourX[2] - shipTwo2x[0] == 1 || shipFourX[2] - shipTwo2x[1] == 1
                    || shipFourX[3] - shipTwo2x[0] == 1 || shipFourX[3] - shipTwo2x[1] == 1

                    || shipFourX[0] - shipTwo3x[0]  == 1|| shipFourX[0] - shipTwo3x[1] == 1
                    || shipFourX[1] - shipTwo3x[0] == 1 || shipFourX[1] - shipTwo3x[1] == 1
                    || shipFourX[2] - shipTwo3x[0] == 1 || shipFourX[2] - shipTwo3x[1] == 1
                    || shipFourX[3] - shipTwo3x[0] == 1 || shipFourX[3] - shipTwo3x[1] == 1) {
                createShip();
            }



            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 3-х палубных кораблей
            // по оси х
            else if (shipFourX[0] == shipThree1x[0] || shipFourX[0] == shipThree1x[1]
                    || shipFourX[0] == shipThree1x[2] || shipFourX[1] == shipThree1x[0]
                    || shipFourX[1] == shipThree1x[1] || shipFourX[1] == shipThree1x[2]
                    || shipFourX[2] == shipThree1x[0] || shipFourX[2] == shipThree1x[1]
                    || shipFourX[2] == shipThree1x[2] || shipFourX[3] == shipThree1x[0]
                    || shipFourX[3] == shipThree1x[1] || shipFourX[3] == shipThree1x[2]) {
                createShip();
            }

            else if (shipFourX[0] - shipThree1x[0] == 1 || shipFourX[0] - shipThree1x[1] == 1
                    || shipFourX[0] - shipThree1x[2] == 1 || shipFourX[1] - shipThree1x[0] == 1
                    || shipFourX[1] - shipThree1x[1] == 1 || shipFourX[1] - shipThree1x[2] == 1
                    || shipFourX[2] - shipThree1x[0] == 1 || shipFourX[2] - shipThree1x[1] == 1
                    || shipFourX[2] - shipThree1x[2] == 1 || shipFourX[3] - shipThree1x[0] == 1
                    || shipFourX[3] - shipThree1x[1] == 1 || shipFourX[3] - shipThree1x[2] == 1) {
                createShip();
            }


            else if (shipFourX[0] == shipThree2x[0] || shipFourX[0] == shipThree2x[1]
                    || shipFourX[0] == shipThree2x[2] || shipFourX[1] == shipThree2x[0]
                    || shipFourX[1] == shipThree2x[1] || shipFourX[1] == shipThree2x[2]
                    || shipFourX[2] == shipThree2x[0] || shipFourX[2] == shipThree2x[1]
                    || shipFourX[2] == shipThree2x[2] || shipFourX[3] == shipThree2x[0]
                    || shipFourX[3] == shipThree2x[1] || shipFourX[3] == shipThree2x[2]) {
                createShip();
            }

            else if (shipFourX[0] - shipThree2x[0] == 1 || shipFourX[0] - shipThree2x[1] == 1
                    || shipFourX[0] - shipThree2x[2] == 1 || shipFourX[1] - shipThree2x[0] == 1
                    || shipFourX[1] - shipThree2x[1] == 1 || shipFourX[1] - shipThree2x[2] == 1
                    || shipFourX[2] - shipThree2x[0] == 1 || shipFourX[2] - shipThree2x[1] == 1
                    || shipFourX[2] - shipThree2x[2] == 1 || shipFourX[3] - shipThree2x[0] == 1
                    || shipFourX[3] - shipThree2x[1] == 1 || shipFourX[3] - shipThree2x[2] == 1) {
                createShip();
            }

            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 4-х палубных кораблей
            // по оси х
            else if (shipFourX[0] == shipFourX[1] || shipFourX[0] == shipFourX[2] || shipFourX[0] == shipFourX[3]
                    || shipFourX[1] == shipFourX[2] || shipFourX[1] == shipFourX[3] || shipFourX[2] == shipFourX[3]) {
                createShip();
            }

            else if (shipFourX[0] - shipFourX[2] == 1 || shipFourX[0] - shipFourX[3] == 1
                    || shipFourX[1] - shipFourX[3] == 1) {
                createShip();
            }




            // операторы if которые сравнивают координаты 1-палубных кораблей
            // с координатами 1-палубных кораблей по оси y
            else if (ShipOne1y == ShipOne2y || ShipOne1y == ShipOne3y || ShipOne1y == ShipOne4y
                    || ShipOne1y - ShipOne2y == 1 || ShipOne1y - ShipOne3y == 1 || ShipOne1y - ShipOne4y == 1) {
                createShip();
            } else if (ShipOne2y == ShipOne1y || ShipOne2y == ShipOne3y || ShipOne2y == ShipOne4y
                    || ShipOne2y - ShipOne1y == 1 || ShipOne2y - ShipOne3y == 1 || ShipOne2y - ShipOne4y == 1) {
                createShip();
            } else if (ShipOne3y == ShipOne1y || ShipOne3y == ShipOne2y || ShipOne3y == ShipOne4y
                    || ShipOne3y - ShipOne1y == 1 || ShipOne3y - ShipOne2y == 1 || ShipOne3y - ShipOne4y == 1) {
                createShip();
            } else if (ShipOne4y == ShipOne1y || ShipOne4y == ShipOne3y || ShipOne4y == ShipOne2y
                    || ShipOne4y - ShipOne2y == 1 || ShipOne4y - ShipOne3y == 1 || ShipOne4y - ShipOne1y == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты первого однопалубного корабля с координатами 2-х палубных
            // кораблей по оси y
            else if (ShipOne1y == shipTwo1y[0] || ShipOne1y == shipTwo1y[1] || ShipOne1y == shipTwo2y[0]
                    || ShipOne1y == shipTwo2y[1] || ShipOne1y == shipTwo3y[0] || ShipOne1y == shipTwo3y[1]
                    || ShipOne1y - shipTwo1y[0] == 1 || ShipOne1y - shipTwo1y[1] == 1
                    || ShipOne1y - shipTwo2y[0] == 1 || ShipOne1y - shipTwo2y[1] == 1
                    || ShipOne1y - shipTwo3y[0] == 1 || ShipOne1y - shipTwo3y[1] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты второго однопалубного корабля с координатами 2-х палубных
            // кораблей по оси y
            else if (ShipOne2y == shipTwo1y[0] || ShipOne2y == shipTwo1y[1] || ShipOne2y == shipTwo2y[0]
                    || ShipOne2y == shipTwo2y[1] || ShipOne2y == shipTwo3y[0] || ShipOne2y == shipTwo3y[1]
                    || ShipOne2y - shipTwo1y[0] == 1 || ShipOne2y - shipTwo1y[1] == 1
                    || ShipOne2y - shipTwo2y[0] == 1 || ShipOne2y - shipTwo2y[1] == 1
                    || ShipOne2y - shipTwo3y[0] == 1 || ShipOne2y - shipTwo3y[1] == 1) {
                createShip();

            }
            // оператор if который сравнивает координаты третьего однопалубного корабля с координатами 2-х палубных
            // кораблей по оси y
            else if (ShipOne3y == shipTwo1y[0] || ShipOne3y == shipTwo1x[1] || ShipOne3y == shipTwo2y[0]
                    || ShipOne3y == shipTwo2y[1] || ShipOne3y == shipTwo3y[0] || ShipOne3y == shipTwo3y[1]
                    || ShipOne3y - shipTwo1y[0] == 1 || ShipOne3y - shipTwo1y[1] == 1
                    || ShipOne3y - shipTwo2y[0] == 1 || ShipOne3y - shipTwo2y[1] == 1
                    || ShipOne3y - shipTwo3y[0] == 1 || ShipOne3y - shipTwo3y[1] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты четвёртого однопалубного корабля с координатами 2-х палубных
            // кораблей по оси y
            else if (ShipOne4y == shipTwo1y[0] || ShipOne4y == shipTwo1y[1] || ShipOne4y == shipTwo2y[0]
                    || ShipOne4y == shipTwo2y[1] || ShipOne4y == shipTwo3y[0] || ShipOne4y == shipTwo3y[1]
                    || ShipOne4y - shipTwo1y[0] == 1 || ShipOne4y - shipTwo3y[1] == 1
                    || ShipOne4y - shipTwo2y[0] == 1 || ShipOne4y - shipTwo2y[1] == 1
                    || ShipOne4y - shipTwo3y[0] == 1 || ShipOne4y - shipTwo3y[1] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты двухпалубных кораблей с координатами 2-х палубных
            // кораблей по оси y
            else if (shipTwo1y[0] == shipTwo2y[0] || shipTwo1y[1] == shipTwo2y[1] || shipTwo1y[0] == shipTwo3y[0]
                    || shipTwo1y[1] == shipTwo3y[1] || shipTwo2y[0] == shipTwo3y[0] || shipTwo2y[1] == shipTwo3y[1]
                    || shipTwo1y[0] - shipTwo2y[0] == 1 || shipTwo1y[1] - shipTwo2y[1] == 1
                    || shipTwo1y[0] - shipTwo3y[0] == 1 || shipTwo1y[1] - shipTwo3y[1] == 1
                    || shipTwo2y[0] - shipTwo3y[0] == 1 || shipTwo2y[1] - shipTwo3y[1] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты первого однопалубного корабля с координатами 3-х палубных
            // кораблей по оси y
            else if (ShipOne1y == shipThree1y[0] || ShipOne1y == shipThree1y[1] || ShipOne1y == shipThree1y[2]
                    || ShipOne1y == shipThree2y[0] || ShipOne1y == shipThree2y[1] || ShipOne1y == shipThree2y[2]
                    || ShipOne1y - shipThree1y[0] == 1 || ShipOne1y - shipThree1y[1] == 1
                    || ShipOne1y - shipThree1y[2] == 1 || ShipOne1y - shipThree2y[0] == 1
                    || ShipOne1y - shipThree2y[1] == 1 || ShipOne1y - shipThree2y[2] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты второго однопалубного корабля с координатами 3-х палубных
            // кораблей по оси y
            else if (ShipOne2y == shipThree1y[0] || ShipOne2y == shipThree1y[1] || ShipOne2y == shipThree1y[2]
                    || ShipOne2y == shipThree2y[0] || ShipOne2y == shipThree2y[1] || ShipOne2y == shipThree2y[2]
                    || ShipOne2y - shipThree1y[0] == 1 || ShipOne2y - shipThree1y[1] == 1
                    || ShipOne2y - shipThree1y[2] == 1 || ShipOne2y - shipThree2y[0] == 1
                    || ShipOne2y - shipThree2y[1] == 1 || ShipOne2y - shipThree2y[2] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты третьего однопалубного корабля с координатами 3-х палубных
            // кораблей по оси y
            else if (ShipOne3y == shipThree1y[0] || ShipOne3y == shipThree1y[1] || ShipOne3y == shipThree1y[2]
                    || ShipOne3y == shipThree2y[0] || ShipOne3y == shipThree2y[1] || ShipOne3y == shipThree2y[2]
                    || ShipOne3y - shipThree1y[0] == 1 || ShipOne3y - shipThree1y[1] == 1
                    || ShipOne3y - shipThree1y[2] == 1 || ShipOne3y - shipThree2y[0] == 1
                    || ShipOne3y - shipThree2y[1] == 1 || ShipOne3y - shipThree2y[2] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты четвёртого однопалубного корабля с координатами 3-х палубных
            // кораблей по оси y
            else if (ShipOne4y == shipThree1y[0] || ShipOne4y == shipThree1y[1] || ShipOne4y == shipThree1y[2]
                    || ShipOne4y == shipThree2y[0] || ShipOne4y == shipThree2y[1] || ShipOne4y == shipThree2y[2]
                    || ShipOne4y - shipThree1y[0] == 1 || ShipOne4y - shipThree1y[1] == 1
                    || ShipOne4y - shipThree1y[2] == 1 || ShipOne4y - shipThree2y[0] == 1
                    || ShipOne4y - shipThree2y[1] == 1 || ShipOne4y - shipThree2y[2] == 1) {
                createShip();
            }

            // оператор if который сравнивает координаты 3-х палубных кораблей и координаты 2-х палубных кораблей
            // по оси y
            else if (shipThree1y[0] == shipTwo1y[0] || shipThree1y[0] == shipTwo1y[1]
                    || shipThree1y[1] == shipTwo1y[0] || shipThree1y[1] == shipTwo1y[1]
                    || shipThree1y[2] == shipTwo1y[0] || shipThree1y[2] == shipTwo1y[1]
                    || shipThree2y[0] == shipTwo1y[0] || shipThree2y[0] == shipTwo1y[1]
                    || shipThree2y[1] == shipTwo1y[0] || shipThree2y[1] == shipTwo1y[1]
                    || shipThree2y[2] == shipTwo1y[0] || shipThree2y[2] == shipTwo1y[1]

                    || shipThree1y[0] == shipTwo2y[0] || shipThree1y[0] == shipTwo2y[1]
                    || shipThree1y[1] == shipTwo2y[0] || shipThree1y[1] == shipTwo2y[1]
                    || shipThree1y[2] == shipTwo2y[0] || shipThree1y[2] == shipTwo2y[1]
                    || shipThree2y[0] == shipTwo2y[0] || shipThree2y[0] == shipTwo2y[1]
                    || shipThree2y[1] == shipTwo2y[0] || shipThree2y[1] == shipTwo2y[1]
                    || shipThree2y[2] == shipTwo2y[0] || shipThree2y[2] == shipTwo2y[1]

                    || shipThree1y[0] == shipTwo3y[0] || shipThree1y[0] == shipTwo3y[1]
                    || shipThree1y[1] == shipTwo3y[0] || shipThree1y[1] == shipTwo3y[1]
                    || shipThree1y[2] == shipTwo3y[0] || shipThree1y[2] == shipTwo3y[1]
                    || shipThree2y[0] == shipTwo3y[0] || shipThree2y[0] == shipTwo3y[1]
                    || shipThree2y[1] == shipTwo3y[0] || shipThree2y[1] == shipTwo3y[1]
                    || shipThree2y[2] == shipTwo3y[0] || shipThree2y[2] == shipTwo3y[1]) {
                createShip();
            }

            // продолжение прошлого оператора (не удобно писать в один if)
            else if (shipThree1y[0] - shipTwo1y[0] == 1 || shipThree1y[0] - shipTwo1y[1] == 1
                    || shipThree1y[1] == shipTwo1y[0] || shipThree1y[1] - shipTwo1y[1] == 1
                    || shipThree1y[2] == shipTwo1y[0] || shipThree1y[2] - shipTwo1y[1] == 1
                    || shipThree2y[0] == shipTwo1y[0] || shipThree2y[0] - shipTwo1y[1] == 1
                    || shipThree2y[1] == shipTwo1y[0] || shipThree2y[1] - shipTwo1y[1] == 1
                    || shipThree2y[2] == shipTwo1y[0] || shipThree2y[2] - shipTwo1y[1] == 1

                    || shipThree1y[0] - shipTwo2y[0] == 1 || shipThree1y[0] - shipTwo2y[1] == 1
                    || shipThree1y[1] - shipTwo2y[0] == 1 || shipThree1y[1] - shipTwo2y[1] == 1
                    || shipThree1y[2] - shipTwo2y[0] == 1 || shipThree1y[2] - shipTwo2y[1] == 1
                    || shipThree2y[0] - shipTwo2y[0] == 1 || shipThree2y[0] - shipTwo2y[1] == 1
                    || shipThree2y[1] - shipTwo2y[0] == 1 || shipThree2y[1] - shipTwo2y[1] == 1
                    || shipThree2y[2] - shipTwo2y[0] == 1 || shipThree2y[2] - shipTwo2y[1] == 1

                    || shipThree1y[0] - shipTwo3y[0] == 1 || shipThree1y[0] - shipTwo3y[1] == 1
                    || shipThree1y[1] - shipTwo3y[0] == 1 || shipThree1y[1] - shipTwo3y[1] == 1
                    || shipThree1y[2] - shipTwo3y[0] == 1 || shipThree1y[2] - shipTwo3y[1] == 1
                    || shipThree2y[0] - shipTwo3y[0] == 1 || shipThree2y[0] - shipTwo3y[1] == 1
                    || shipThree2y[1] - shipTwo3y[0] == 1 || shipThree2y[1] - shipTwo3y[1] == 1
                    || shipThree2y[2] - shipTwo3y[0] == 1 || shipThree2y[2] - shipTwo3y[1] == 1) {
                createShip();
            }


            // оператор if который сравнивает координаты 3-х палубных кораблей с координатами 3-х палубных кораблей
            // по оси y
            else if (shipThree1y[0] == shipThree2y[0] || shipThree1y[1] == shipThree2y[1]
                    || shipThree1y[2] == shipThree2y[2] || shipThree1y[0] - shipThree2y[0] == 1
                    || shipThree1y[1] - shipThree2y[1] == 1 || shipThree1y[2] - shipThree2y[2] == 1) {
                createShip();
            }

            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 1-х палубных кораблей
            // по оси y
            else if (shipFourY[0] == ShipOne1y || shipFourY[0] == ShipOne2y
                    || shipFourY[0] == ShipOne3y || shipFourY[0] == ShipOne4y
                    || shipFourY[1] == ShipOne1y || shipFourY[1] == ShipOne2y
                    || shipFourY[1] == ShipOne3y || shipFourY[1] == ShipOne4y
                    || shipFourY[2] == ShipOne1y || shipFourY[2] == ShipOne2y
                    || shipFourY[2] == ShipOne3y || shipFourY[2] == ShipOne4y
                    || shipFourY[3] == ShipOne1y || shipFourY[3] == ShipOne2y
                    || shipFourY[3] == ShipOne3y || shipFourY[3] == ShipOne4y){
                createShip();
            }
            else if (shipFourY[0] - ShipOne1y == 1 || shipFourY[0] - ShipOne2y == 1 || shipFourY[0] - ShipOne3y == 1
                    || shipFourY[0] - ShipOne4y == 1
                    || shipFourY[1] - ShipOne1y == 1 || shipFourY[1] - ShipOne2y == 1 || shipFourY[1] - ShipOne3y == 1
                    || shipFourY[1] - ShipOne4y == 1
                    || shipFourY[2] - ShipOne1y == 1 || shipFourY[2] - ShipOne2y == 1 || shipFourY[2] - ShipOne3y == 1
                    || shipFourY[2] - ShipOne4y == 1
                    || shipFourY[3] - ShipOne1y == 1 || shipFourY[3] - ShipOne2y == 1 || shipFourY[3] - ShipOne3y == 1
                    || shipFourY[3] - ShipOne4y == 1) {
                createShip();
            }

            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 2-х палубных кораблей
            // по оси y
            else  if (shipFourY[0] == shipTwo1y[0] || shipFourY[0] == shipTwo1y[1]
                    || shipFourY[1] == shipTwo1y[0] || shipFourY[1] == shipTwo1y[1]
                    || shipFourY[2] == shipTwo1y[0] || shipFourY[2] == shipTwo1y[1]
                    || shipFourY[3] == shipTwo1y[0] || shipFourY[3] == shipTwo1y[1]

                    ||shipFourY[0] == shipTwo2y[0] || shipFourY[0] == shipTwo2y[1]
                    || shipFourY[1] == shipTwo2y[0] || shipFourY[1] == shipTwo2y[1]
                    || shipFourY[2] == shipTwo2y[0] || shipFourY[2] == shipTwo2y[1]
                    || shipFourY[3] == shipTwo2y[0] || shipFourY[3] == shipTwo2y[1]

                    ||shipFourY[0] == shipTwo3y[0] || shipFourY[0] == shipTwo3y[1]
                    || shipFourY[1] == shipTwo3y[0] || shipFourY[1] == shipTwo3y[1]
                    || shipFourY[2] == shipTwo3y[0] || shipFourY[2] == shipTwo3y[1]
                    || shipFourY[3] == shipTwo3y[0] || shipFourY[3] == shipTwo3y[1]) {
                createShip();
            }

            else  if (shipFourY[0] - shipTwo1y[0] == 1 || shipFourY[0] - shipTwo1y[1] == 1
                    || shipFourY[1] - shipTwo1y[0] == 1 || shipFourY[1] - shipTwo1y[1] == 1
                    || shipFourY[2] - shipTwo1y[0] == 1 || shipFourY[2] - shipTwo1y[1] == 1
                    || shipFourY[3] - shipTwo1y[0] == 1 || shipFourY[3] - shipTwo1y[1] == 1

                    || shipFourY[0] - shipTwo2y[0] == 1 || shipFourY[0] - shipTwo2y[1] == 1
                    || shipFourY[1] - shipTwo2y[0] == 1 || shipFourY[1] - shipTwo2y[1] == 1
                    || shipFourY[2] - shipTwo2y[0] == 1 || shipFourY[2] - shipTwo2y[1] == 1
                    || shipFourY[3] - shipTwo2y[0] == 1 || shipFourY[3] - shipTwo2y[1] == 1

                    || shipFourY[0] - shipTwo3y[0]  == 1|| shipFourY[0] - shipTwo3y[1] == 1
                    || shipFourY[1] - shipTwo3y[0] == 1 || shipFourY[1] - shipTwo3y[1] == 1
                    || shipFourY[2] - shipTwo3y[0] == 1 || shipFourY[2] - shipTwo3y[1] == 1
                    || shipFourY[3] - shipTwo3y[0] == 1 || shipFourY[3] - shipTwo3y[1] == 1) {
                createShip();
            }



            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 3-х палубных кораблей
            // по оси y
            else if (shipFourY[0] == shipThree1y[0] || shipFourY[0] == shipThree1y[1]
                    || shipFourY[0] == shipThree1y[2] || shipFourY[1] == shipThree1y[0]
                    || shipFourY[1] == shipThree1y[1] || shipFourY[1] == shipThree1y[2]
                    || shipFourY[2] == shipThree1y[0] || shipFourY[2] == shipThree1y[1]
                    || shipFourY[2] == shipThree1y[2] || shipFourY[3] == shipThree1y[0]
                    || shipFourY[3] == shipThree1y[1] || shipFourY[3] == shipThree1y[2]) {
                createShip();
            }

            else if (shipFourY[0] - shipThree1y[0] == 1 || shipFourY[0] - shipThree1y[1] == 1
                    || shipFourY[0] - shipThree1y[2] == 1 || shipFourY[1] - shipThree1y[0] == 1
                    || shipFourY[1] - shipThree1y[1] == 1 || shipFourY[1] - shipThree1y[2] == 1
                    || shipFourY[2] - shipThree1y[0] == 1 || shipFourY[2] - shipThree1y[1] == 1
                    || shipFourY[2] - shipThree1y[2] == 1 || shipFourY[3] - shipThree1y[0] == 1
                    || shipFourY[3] - shipThree1y[1] == 1 || shipFourY[3] - shipThree1y[2] == 1) {
                createShip();
            }


            else if (shipFourY[0] == shipThree2y[0] || shipFourY[0] == shipThree2y[1]
                    || shipFourY[0] == shipThree2y[2] || shipFourY[1] == shipThree2y[0]
                    || shipFourY[1] == shipThree2y[1] || shipFourY[1] == shipThree2y[2]
                    || shipFourY[2] == shipThree2y[0] || shipFourY[2] == shipThree2y[1]
                    || shipFourY[2] == shipThree2y[2] || shipFourY[3] == shipThree2y[0]
                    || shipFourY[3] == shipThree2y[1] || shipFourY[3] == shipThree2y[2]) {
                createShip();
            }

            else if (shipFourY[0] - shipThree2y[0] == 1 || shipFourY[0] - shipThree2y[1] == 1
                    || shipFourY[0] - shipThree2y[2] == 1 || shipFourY[1] - shipThree2y[0] == 1
                    || shipFourY[1] - shipThree2y[1] == 1 || shipFourY[1] - shipThree2y[2] == 1
                    || shipFourY[2] - shipThree2y[0] == 1 || shipFourY[2] - shipThree2y[1] == 1
                    || shipFourY[2] - shipThree2y[2] == 1 || shipFourY[3] - shipThree2y[0] == 1
                    || shipFourY[3] - shipThree2y[1] == 1 || shipFourY[3] - shipThree2y[2] == 1) {
                createShip();
            }

            // операторы if которые сравнивают координаты 4-х палубных кораблей с координатами 4-х палубных кораблей
            // по оси y
            else if (shipFourY[0] == shipFourY[1] || shipFourY[0] == shipFourY[2] || shipFourY[0] == shipFourY[3]
                    || shipFourY[1] == shipFourY[2] || shipFourY[1] == shipFourY[3] || shipFourY[2] == shipFourY[3]) {
                createShip();
            }

            else if (shipFourY[0] - shipFourY[2] == 1 || shipFourY[0] - shipFourY[3] == 1
                    || shipFourY[1] - shipFourY[3] == 1) {
                createShip();
            }

            else programCanStopRespawnShip = true;
        }
    }

    // этот метод загружает в игру файлы в формате png
    public void loadImages() {
        ImageIcon shipimg = new ImageIcon("ship.png");
        ship = shipimg.getImage();
    }
}






