package Java_405_lessons.Patterns.Pattern_15_Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ObserverPatternLesson {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Subscriber1 subscriber1 = new Subscriber1();
        subject.addSubscriberToSubscribersList(subscriber1);
        Subscriber1 subscriber2 = new Subscriber1();
        subject.addSubscriberToSubscribersList(subscriber2);
        subject.addSubscriberToSubscribersList(new Subscriber2());
        subject.notifySubscribers("Hi, you've been subscribed to our news");
        subject.removeSubscriberFromSubscribersList(subscriber2);

        Subject2 subject2 = new Subject2();
        subject2.addObserver(new Subscriber4());
        subject2.addObserver(new Subscriber5());
        subject2.setChanged();
        subject2.notifyObservers("you been subscribed to our news");

    }
}

interface MyObservable{
    void callMe(String message);
}

class Subscriber1 implements MyObservable{

    @Override
    public void callMe(String message) {
        System.out.println("subscriber_1 " + message);
    }
}

class Subscriber2 implements MyObservable{

    @Override
    public void callMe(String message) {
        System.out.println("subscriber_2 " + message);
    }
}

class Subscriber3 implements MyObservable{

    @Override
    public void callMe(String message) {
        System.out.println("subscriber_3 " + message);
    }
}
class Subject {
    List<MyObservable> listOfSubscribers = new ArrayList<>();
    public void addSubscriberToSubscribersList(MyObservable myObservable) {
        listOfSubscribers.add(myObservable);
    }

    public void removeSubscriberFromSubscribersList (MyObservable myObservable) {
        listOfSubscribers.remove(myObservable);
    }

    public void notifySubscribers(String message) {
        listOfSubscribers.forEach(subscriberToBeNotified -> subscriberToBeNotified.callMe(message));
    }
}

//II -> not List but Vector
class Subject2 extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}

class Subscriber4 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Subscriber_4 " + arg);
    }
}

class Subscriber5 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Subscriber_5 " + arg);
    }
}

