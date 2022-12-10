package EKIDS.Students.Mark.MarkProject.SeaButtle;

import java.util.Random;

//  класс отвечающий а создание кораблей на полях игроков
public class Ships {
    private final int ShipOne1x = 0;
    private final int ShipOne1y = 0;
    private final int ShipOne2x = 0;
    private final int ShipOne2y = 0;
    private final int ShipOne3x = 0;
    private final int ShipOne3y = 0;
    private final int ShipOne4x = 0;
    private final int ShipOne4y = 0;


    // координаты двухпалубных кораблей
    private int[] shipTwo1x = new int[2];
    private final int[] shipTwo1y = new int[2];
    private final int[] shipTwo2x = new int[2];
    private final int[] shipTwo2y = new int[2];
    private final int[] shipTwo3x = new int[2];
    private final int[] shipTwo3y = new int[2];

    // координаты трёхпалубных кораблей
    private final int[] shipThree1x = new int[3];
    private final int[] shipThree1y = new int[3];
    private final int[] shipThree2x = new int[3];
    private final int[] shipThree2y = new int[3];


    // координаты четырёхпалубных кораблей
    private final int[] shipFourX = new int[4];
    private final int[] shipFourY = new int[4];


    // Object Ship

    public void createShip() {
        for (int i = 0; i < 1; i++) {
            final int ShipOne1x = new Random().nextInt(10);
            final int ShipOne1y = new Random().nextInt(10);
            final int ShipOne2x = new Random().nextInt(10);
            final int ShipOne2y = new Random().nextInt(10);
            final int ShipOne3x = new Random().nextInt(10);
            final int ShipOne3y = new Random().nextInt(10);
            final int ShipOne4x = new Random().nextInt(10);
            final int ShipOne4y = new Random().nextInt(10);
        }
        for (int i = 0; i < 2; i++) {
            shipTwo1x[i] = new Random().nextInt(10);
            shipTwo1y[i] = new Random().nextInt(10);
            shipTwo2x[i] = new Random().nextInt(10);
            shipTwo2y[i] = new Random().nextInt(10);
            shipTwo3x[i] = new Random().nextInt(10);
            shipTwo3y[i] = new Random().nextInt(10);
        }

        for (int i = 0; i < 3; i++) {
            shipThree1x[i] = new Random().nextInt(10);
            shipThree1y[i] = new Random().nextInt(10);
            shipThree2x[i] = new Random().nextInt(10);
            shipThree2y[i] = new Random().nextInt(10);

        }

        for (int i = 0; i < 4; i++) {
            shipFourX[i] = new Random().nextInt(10);
            shipFourY[i] = new Random().nextInt(10);
        }
    }

// метод отвечающий за то чтобы однопалубные корабли не появлялись на других однопалубных кораблях по оси X
    public void checkShipOneX() {
        if (ShipOne1x == ShipOne2x || ShipOne2x == ShipOne3x || ShipOne3x == ShipOne1x || ShipOne3x == ShipOne4x
                || ShipOne1x == ShipOne4x) {
            createShip();
        }


        if (ShipOne1x - ShipOne2x == 1 || ShipOne2x - ShipOne1x == 1 || ShipOne2x - ShipOne3x == 1
                || ShipOne3x - ShipOne2x == 1 || ShipOne3x - ShipOne1x == 1 || ShipOne1x - ShipOne3x == 1
                || ShipOne4x - ShipOne3x == 1 || ShipOne4x - ShipOne2x == 1 || ShipOne4x - ShipOne1x == 1
                || ShipOne3x - ShipOne4x == 1 || ShipOne2x - ShipOne4x == 1 || ShipOne1x - ShipOne4x == 1) {
            createShip();
        }
    }

    // метод отвечающий за то чтобы однопалубные корабли не появлялись на других однопалубных кораблях по оси Y
    public void checkShipOneY() {
        if (ShipOne1y == ShipOne2y || ShipOne2y == ShipOne3y || ShipOne3y == ShipOne1y || ShipOne3y == ShipOne4y
                || ShipOne1y == ShipOne4y) {
            createShip();
        }

        if (ShipOne1y - ShipOne2y == 1 || ShipOne2y - ShipOne1y == 1 || ShipOne2y - ShipOne3y == 1
                || ShipOne3y - ShipOne2y == 1 || ShipOne3y - ShipOne1y == 1 || ShipOne1y - ShipOne3y == 1
                || ShipOne4y - ShipOne3y == 1 || ShipOne4y - ShipOne2y == 1 || ShipOne4y - ShipOne1y == 1
                || ShipOne3y - ShipOne4y == 1 || ShipOne2y - ShipOne4y == 1 || ShipOne1y - ShipOne4y == 1) {
            createShip();
        }
    }
}


// load images



