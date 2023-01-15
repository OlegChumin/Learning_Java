package Java_405_lessons.Patterns.Pattern_09_Factory.Pattern_AbstractFactory;
/**
 * Фабрика(фабрик).*/

public class AbstractFactoryLesson {
    public static void main(String[] args) {

        Factory carFactory =  new AbstractFactory().createFactory(FactoryType.CAR);
        Car toyota = carFactory.createCar(CarBrands.TOYOTA);
        toyota.drive();
        Car audi = carFactory.createCar(CarBrands.AUDI);
        audi.drive();

        Factory truckFactory = new AbstractFactory().createFactory(FactoryType.TRUCK);
        Truck ford =  truckFactory.createTruck(TruckBrands.FORD);
        ford.driveTruck();
        Truck MAN = truckFactory.createTruck(TruckBrands.MAN);
        MAN.driveTruck();
    }
}

interface Car{
    void drive();
}

class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}

class CarFactory implements Factory{
    public Car createCar(CarBrands carbrands) {
        switch(carbrands) {
            case TOYOTA: return new Toyota();
            case AUDI: return new Audi();
            default: return null;
        }
    }

    @Override
    public Truck createTruck(TruckBrands truckBrands) {
        return null;
    }
}

enum CarBrands {
    MERCEDES, AUDI, TOYOTA, FORD
}

interface Truck{
    void driveTruck();
}

class FordTruck implements Truck{
    @Override
    public void driveTruck() {
        System.out.println("Drive FORD truck");
    }
}

class MAN_Truck implements Truck{
    @Override
    public void driveTruck() {
        System.out.println("Drive MAN truck");
    }
}

class TruckFactory implements Factory{
    @Override
    public Car createCar(CarBrands carBrands) {
        return null;
    }

    public Truck createTruck(TruckBrands truckBrands) {
        switch(truckBrands) {
            case MAN: return new MAN_Truck();
            case FORD: return new FordTruck();
            default: return null;
        }
    }

}

enum TruckBrands {
    FORD, MAN, CATERPILLAR, IVECO
}

interface Factory{
    Car createCar(CarBrands carBrands);
    Truck createTruck(TruckBrands truckBrands);
}

class AbstractFactory{
    public Factory createFactory(FactoryType factoryType){
        switch(factoryType){
            case CAR: return new CarFactory();
            case TRUCK:return new TruckFactory();
            default: return null;
        }
    }
}

enum FactoryType{
    CAR, TRUCK, BOAT, AIRPLANE
}
