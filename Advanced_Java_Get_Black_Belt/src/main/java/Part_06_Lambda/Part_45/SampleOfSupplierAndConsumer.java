package Part_06_Lambda.Part_45;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SampleOfSupplierAndConsumer {
    public static ArrayList<Car> create3Cars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList =  new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car); // accept object
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Car> ourCars = create3Cars(() -> new Car("Nissan Tiida", "red", 1.6, random.nextInt(200)));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> {car.color = "yellow"; car.engine = 240.2;
            System.out.println("upgraded car: " + car);});
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