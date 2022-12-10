package Alishev.BaseJava.nestedclasses;

public class Electrocar {
    private int id;
    private static int test;

    // вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor is " + id + " starting...");
        }
    }

    // статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging.." + test);
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1; // только к константам есть доступ у вложенных классов в методах

        class SomeClass {
            public void someMethod() {

            }
        }

        System.out.println("Electrocar " + id + " is starting... ");
    }
}
