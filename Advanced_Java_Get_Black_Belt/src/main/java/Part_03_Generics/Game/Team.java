package Part_03_Generics.Game;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants =  new ArrayList<>(); //<Participants>

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("В команду был добавлен новый участник по имени " + ((Participant) participant).getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(1 == 0) { winnerName = this.name;}
        else {winnerName = team.name;}
        System.out.println("Выйграла команда " + winnerName);
    }
}
