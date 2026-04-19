package lesson_03.patterns.bridge.bridge_solution;

public class BridgePatternSolution {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        Vehicle vehicle = new SomeVehicle(mercedes);
        mercedes.printModel();
        vehicle.drive();

        Toyota toyota = new Toyota();
        toyota.printModel();
        Vehicle vehicle2 = new SomeVehicle(toyota);
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
    void printModel();
}

class SomeVehicle extends Vehicle {

    public SomeVehicle(Model model) {
        super(model);
    }

    @Override
    void drive() {
        System.out.println("SomeCar drive");
    }
}


class Mercedes implements Model {

    @Override
    public void printModel() {
        System.out.println("Mercedes model");
    }
}

class Toyota implements Model {
    @Override
    public void printModel() {
        System.out.println("Mercedes model");
    }
}