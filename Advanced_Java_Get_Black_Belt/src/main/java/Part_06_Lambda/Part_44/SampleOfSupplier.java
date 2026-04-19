package Part_06_Lambda.Part_44;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class SampleOfSupplier {
    public static ArrayList<Car> create3Cars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList =  new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Car> ourCars = create3Cars(() -> new Car("Nissan Tiida", "red", 1.6, random.nextInt(200)));
        System.out.println(ourCars);
    }
}

class Car {
    String model;
    String color;
    double engine;
    int id;

    public Car(String model, String color, double engine, int id) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", id=" + id +
                '}';
    }
}