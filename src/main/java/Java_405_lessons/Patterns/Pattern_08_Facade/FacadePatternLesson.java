package Java_405_lessons.Patterns.Pattern_08_Facade;

import org.apache.logging.log4j.core.appender.mom.jeromq.JeroMqManager;

public class FacadePatternLesson {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.pressButton("5", "22", "On");
        BedRoom bedRoom = new BedRoom();
        bedRoom.pressButton("7", "24", "Off");
    }
}

class TV {
    void playChannel(String channel) {
        System.out.println("play channel " + channel);
    }
}

class AirConditioning {
    void setTemperature(String temperature) {
        System.out.println("set temperature " + temperature);
    }
}

class Light {
    void turnOnOffLight(String lightOnOff) {
        System.out.println("run light on/off " + lightOnOff);
    }
}

class RoomFacade {
    TV tv = new TV();
    AirConditioning airConditioning = new AirConditioning();
    Light roomLight = new Light();

    public void pressButton(String channel, String temperature, String light) {
        tv.playChannel(channel);
        airConditioning.setTemperature(temperature);
        roomLight.turnOnOffLight(light);
    }
}

class LivingRoom extends  RoomFacade{
    RoomFacade roomFacade = new RoomFacade();
}

class BedRoom extends RoomFacade {
    RoomFacade roomFacade = new RoomFacade();
}

//I-II
//abstract class Room{
//    TV tv = new TV();
//    AirConditioning airConditioning =  new AirConditioning();
//    Light roomLight = new Light();
//    abstract void pressButton(String channel, String temperature, String light);
//}

//II
//class LivingRoom extends Room{
//    public void pressButton(String channel, String temperature, String light){
//        tv.playChannel(channel);
//        airConditioning.setTemperature(temperature);
//        roomLight.turnOnOffLight(light);
//    }
//}
//
//class BedRoom extends Room{
//    public void pressButton(String channel, String temperature, String light){
//        tv.playChannel(channel);
//        airConditioning.setTemperature(temperature);
//        roomLight.turnOnOffLight(light);
//    }
//}

//I
//class LivingRoom {
//    public void pressButton(String channel, String temperature, String light){
//        TV tv = new TV();
//        tv.playChannel(channel);
//        AirConditioning airConditioning =  new AirConditioning();
//        airConditioning.setTemperature(temperature);
//        Light roomLight = new Light();
//        roomLight.turnOnOffLight(light);
//    }
//}
//
//class BadRoom {
//    public void pressButton(String channel, String temperature, String light){
//        TV tv = new TV();
//        tv.playChannel(channel);
//        AirConditioning airConditioning =  new AirConditioning();
//        airConditioning.setTemperature(temperature);
//        Light roomLight = new Light();
//        roomLight.turnOnOffLight(light);
//    }
//}

