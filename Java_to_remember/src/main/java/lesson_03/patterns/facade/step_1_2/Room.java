package lesson_03.patterns.facade.step_1_2;

class Main {
    public static void main(String[] args) {

    }
}


abstract class Room {
    abstract void pressButton(String channel, String station, String temperature);
    Tv tv = new Tv();
    Radio radio = new Radio();
    AirCondition airCondition = new AirCondition();
    Light light = new Light();
}

class LivingRoom extends Room {

    @Override
    void pressButton(String channel, String station, String temperature) {
        tv.playChannel(channel);
        radio.playRadioStation(station);
        airCondition.setTemperature(temperature);
        light.turnLight();
    }
}

class BadRoom extends Room {

    @Override
    void pressButton(String channel, String station, String temperature) {
        tv.playChannel(channel);
        radio.playRadioStation(station);
        airCondition.setTemperature(temperature);
        light.turnLight();
    }
}


class Tv {
    void playChannel(String channel) {
        System.out.println("Playing channel: " + channel);
    }
}

class Radio {
    void playRadioStation(String station) {
        System.out.println("Playing radio station: " + station);
    }
}

class Light {
    void turnLight() {
        System.out.println("run Light");
    }
}

class AirCondition {
    void setTemperature(String temperature) {
        System.out.println("Setting temperature: " + temperature);
    }
}

//class LivingRoom {
//    public static void main(String[] args) {
//       Tv tv = new Tv();
//       tv.playChannel("1");
//       Radio radio = new Radio();
//       radio.playRadioStation("RadioRocks");
//       AirCondition airCondition = new AirCondition();
//       airCondition.setTemperature("22");
//       Light light = new Light();
//       light.turnLight();
//    }
//}
//
//class BadRoom {
//    public static void main(String[] args) {
//        Radio radio = new Radio();
//        radio.playRadioStation("Trance");
//        AirCondition airCondition = new AirCondition();
//        airCondition.setTemperature("20");
//        Light light = new Light();
//        light.turnLight();
//    }
//}
//
//
