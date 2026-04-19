package Part_05_Nested_Classes;

import java.sql.SQLOutput;

public class Part_37_StaticNestedClass {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(149);
        Car car = new Car("red", 3, engine);
        System.out.println(car);
        System.out.println(engine);
        car.engine.startWork();
        car.engine.stopWork();

        Car.Engine engine1 = new Car.Engine(250);
        System.out.println(engine1);
        Car.Engine engine2 = new Car.Engine(300);
        System.out.println(engine2);
        Car.Engine engine3 = new Car.Engine(220);
        System.out.println(engine3);
    }
}

class Car {
    String color;
    int dorCount;
    Engine engine;
    static int detail;

    interface WorkableEngine {
        void startWork();

        void stopWork();
    }

    public static class Engine implements WorkableEngine {
        private int horsePower;
        private static int countOfObjects;

        public Engine(int horsePower) {
//            System.out.println(detail);
//            System.out.println(dorCount); // non-static field
            this.horsePower = horsePower;
            countOfObjects++; // number of engined created
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}' + " #" + countOfObjects;
        }

        @Override
        public void startWork() {
            System.out.println("Engine start");
        }

        @Override
        public void stopWork() {
            System.out.println("Engine stop");
        }
    }

    public Car(String color, int dorCount, Engine engine) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = engine;
    }

    void printCountOfObjects() {
        System.out.println(Engine.countOfObjects);
        Engine engine = new Engine(200);
        System.out.println(engine.horsePower);
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", dorCount=" + dorCount +
                ", engine=" + engine +
                '}';
    }
}

