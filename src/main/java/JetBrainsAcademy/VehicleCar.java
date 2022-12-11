package JetBrainsAcademy;

public class VehicleCar {
    public static void main(String[] args) {
        Vehicle car = new Car(); // (1)

        car.setRegNumber("ABC-123"); // (2)
//        car.setNumberOfSeats(5); // (3)

        String regNumber = car.getRegNumber(); // (4)
//        int seats = car.getNumberOfSeats(); // (5)
    }
}

class Vehicle {

    protected String regNumber;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

