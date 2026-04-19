package lesson_03.patterns.facade.step_3;


public class Main {
    public static void main(String[] args) {

    }
}

class RoomFacade {
    Tv tv = new Tv();
    Radio radio = new Radio();
    AirCondition airCondition = new AirCondition();
    Light light = new Light();

    public void pressButton(String channel, String station, String temperature) {
        tv.playChannel(channel);
        radio.playRadioStation(station);
        airCondition.setTemperature(temperature);
        light.turnLight();
    }
}

class LivingRoom {
    RoomFacade roomFacade = new RoomFacade();

    public void pressButton(String channel, String station, String temperature) {
        roomFacade.pressButton(channel, station, temperature);
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
