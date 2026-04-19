package lesson_03.patterns.FabricMethod;

public class Factory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MercedesFactory();
        Car car = abstractFactory.getCar();
        Bike bike = abstractFactory.getBike();
        car.drive();
        bike.drive();
    }
}

interface Car {
    void drive();
}

interface Bike {
    void drive();
}

class Mercedes implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Mercedes...");
    }
}

class MercedesBike implements Bike {

    @Override
    public void drive() {
        System.out.println("Drive MercedesBike...");
    }
}

class BMW implements Car{

    @Override
    public void drive() {
        System.out.println("Drive BMW...");
    }
}
class BMWBike implements Bike{

    @Override
    public void drive() {
        System.out.println("Drive BMWBike...");
    }
}

interface AbstractFactory {
    Car getCar();
    Bike getBike();
}

class MercedesFactory implements AbstractFactory {

    @Override
    public Car getCar() {
        return new Mercedes();
    }

    @Override
    public Bike getBike() {
        return new MercedesBike();
    }
}

class BWM implements AbstractFactory {

    @Override
    public Car getCar() {
        return new BMW();
    }

    @Override
    public Bike getBike() {
        return new BMWBike();
    }
}




