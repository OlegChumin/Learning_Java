package Java_Oleg.thinkinginjava.interfaces;

public class Main extends TVset{
    public Main(boolean power) {
        super(power);
    }

    public static void main(String[] args) {
        TVset tvset = new TVset(true);
        tvset.powerOnOff();
        tvset.channelsSW();
        tvset.play();
        tvset.stop();
        tvset.setPower(false);
    }
}
