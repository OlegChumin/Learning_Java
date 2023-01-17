package Java_405_lessons.Patterns.Pattern_13_Mediator;

import java.util.ArrayList;
import java.util.List;

//Mediator
public class MediatorPatternLesson {
    public static void main(String[] args) {
        Chat chat = new ChatMediator();
        ColleagueImpl oleg = new ColleagueImpl(chat, "Oleg");
        chat.addColleague(oleg);
        ColleagueImpl irina = new ColleagueImpl(chat, "Irina");
        chat.addColleague(irina);
        chat.addColleague(new ColleagueImpl(chat, "Mike"));
        chat.addColleague(new ColleagueImpl(chat, "Den"));
        chat.addColleague(new ColleagueImpl(chat, "Kent"));
        irina.sendMessage("Hallo students");
    }
}

interface Chat {
    void sendMessage(String message, Colleague me);

    void addColleague(Colleague colleague);
}

abstract class Colleague {
    Chat chat;
    String name;

    public Colleague(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void sendMessage(String message);
    abstract void printMessage(String message);
}

class ChatMediator implements Chat {
    List<Colleague> list = new ArrayList<>();

    @Override
    public void sendMessage(String message, Colleague me) {
        list.forEach(colleague -> {
            if (colleague != me) {
                colleague.printMessage(message);
            }
        });
    }

    @Override
    public void addColleague(Colleague colleague) {
        list.add(colleague);
    }
}

class ColleagueImpl extends Colleague {

    public ColleagueImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void printMessage(String message) {
        System.out.println(name + " got message " +message);
    }
}