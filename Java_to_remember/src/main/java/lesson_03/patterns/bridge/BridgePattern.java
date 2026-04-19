package lesson_03.patterns.bridge;

public class BridgePattern {
    public static void main(String[] args) {

    }
}

/**
 * 3 абстрацкии - 3 интерфеса, 3 реализаций  = 3 х 4 = 12 классов (рост в геометрической прогрессии)
 */
interface Car {
    default void printCar () {
        System.out.println("Car Interface");
    }
}

interface Track {
    default void printCar () {
        System.out.println("Truck Interface");
    }
}

class MercedesCarFacility implements Car {}
class MercedesTrackFacility implements Track {}
class MercedesBikeFacility implements Car {}

class ToyotaCarFacility implements Car {}
class ToyotaTrackFacility implements Track {}
class ToyotaBikeFacility implements Car {}

class MitsubishiCarFacility implements Car {}
class MitsubishiTrackFacility implements Track {}
class MitsubishiBike implements Bike {}

class SumitomoCarFacility implements Car {}
class SumitomoTruckFacility implements Track {}
class SumitomoBikeFacility implements Bike {}

interface Bike {
    default void printBike () {
        System.out.println("Bike Interface");
    }
}