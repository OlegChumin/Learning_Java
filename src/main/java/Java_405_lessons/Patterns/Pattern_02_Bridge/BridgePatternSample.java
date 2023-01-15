package Java_405_lessons.Patterns.Pattern_02_Bridge;

public class BridgePatternSample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Mercedes());
        vehicle.drive();
        Vehicle vehicle2 = new Truck(new Mercedes());
        vehicle2.drive();

    }
}

abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

interface Model {
    void drive(String str);
}

class Car extends Vehicle {

    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Drive car ");
    }
}

class Truck extends Vehicle {

    public Truck(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Drive truck ");
    }
}

class Mercedes implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + "Mercedes");
    }
}

class Ford implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + "Ford");
    }
}

//interface Car {}
//interface Truck {}
//interface Bike {}
//
//class MercedesCar {}
//class MercedesTruck {}
//class FordCar {}
//class FordTruck {}
