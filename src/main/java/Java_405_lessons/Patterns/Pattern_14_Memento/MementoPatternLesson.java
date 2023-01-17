package Java_405_lessons.Patterns.Pattern_14_Memento;

import java.util.ArrayList;
import java.util.List;

public class MementoPatternLesson {
    public static void main(String[] args) {
        List<Originator.Momento> list =  new ArrayList<>();
        Originator originator = new Originator();
        originator.setState("one");
        System.out.println(originator);
        list.add(originator.saveState());
        originator.setState("two");
        list.add(originator.saveState());
        System.out.println(originator);
        originator.setState("three");
        list.add(originator.saveState());
        System.out.println(originator);
        originator.restoreFromMomento(list.get(0));
        System.out.println(originator);
        originator.restoreFromMomento(list.get(1));
        System.out.println(originator);
        originator.restoreFromMomento(list.get(2));
        System.out.println(originator);

    }
}

class Originator {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public Originator.Momento saveState() {
        return new Momento(this.state);
    }

    public void restoreFromMomento(Momento momento) {
        this.state = momento.state;
    }

    static class Momento {
        String state;

        public Momento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
