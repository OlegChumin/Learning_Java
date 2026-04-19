package Part_05_Nested_Classes;

public class Part_38_InnerClass {
    public static void main(String[] args) {
        NewCar newCar = new NewCar("black", 4, 150);
        System.out.println(newCar);

        CarType_02 carType_02 = new CarType_02("white", 4);
        CarType_02.Engine engine02 = carType_02.new Engine(155);
        carType_02.setEngine(engine02);
        System.out.println(carType_02);

//        CarType_02.Engine engine3 = new car.Engine(150);

        CarType_02.Engine engine4 = new CarType_02("yellow", 3).new Engine(220);

    }
}

class NewCar {
    String color;
    private int dorCount;
    Engine engine;


    public class Engine {
        private int horsePower;
//        public static int a = 5;
        public static final  int a = 5;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(dorCount);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public NewCar(String color, int dorCount, int horsePower) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = this.new Engine(horsePower) ;
        System.out.println(horsePower);
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

class CarType_02 {
    String color;
    int dorCount;
    Engine engine;


    public class Engine {
        int horsePower02;

        public Engine(int horsePower) {
            this.horsePower02 = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower02 +
                    '}';
        }
    }

    public CarType_02(String color, int dorCount) {
        this.color = color;
        this.dorCount = dorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

