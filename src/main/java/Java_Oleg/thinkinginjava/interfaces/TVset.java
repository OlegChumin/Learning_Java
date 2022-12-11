package Java_Oleg.thinkinginjava.interfaces;

public class TVset implements RemotePanel{
    private boolean power = false;

    public TVset(boolean power) {
        this.power = power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public void powerOnOff() {
        System.out.println("Power On Off button");
    }

    @Override
    public void channelsSW() {
        System.out.println("Swith channels");
    }

    @Override
    public void play() {
        System.out.println("PLAY button");
    }

    @Override
    public void stop() {
        System.out.println("STOP button");
    }
}
