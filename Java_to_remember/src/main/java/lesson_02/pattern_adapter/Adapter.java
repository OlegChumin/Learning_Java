package lesson_02.pattern_adapter;

public class Adapter {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuroSocket euroSocket = new SocketAdapter(americanSocket);
        radio.listenMusic(euroSocket);
    }
}

// 220 V
interface EuroSocket {
    void getPower();
}

// 110 V
interface AmericanSocket {
    void getPower();
}

class SimpleAmericanSocket implements AmericanSocket {

    @Override
    public void getPower() {
        System.out.println("get 110V");
    }
}

// работает на 220V
class Radio {
    public void listenMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
        System.out.println("listen music");
    }
}

class SocketAdapter implements EuroSocket {
    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        System.out.println("Got 110V american socket");
        this.americanSocket = americanSocket;
        System.out.println("transform 110V to 220V");
    }

    @Override
    public void getPower() {
        System.out.println("get 220V power");
    }
}
