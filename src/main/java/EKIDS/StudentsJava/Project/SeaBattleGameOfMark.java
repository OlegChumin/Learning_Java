package EKIDS.StudentsJava.Project;


import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SeaBattleGameOfMark extends JFrame{
    public SeaBattleGameOfMark() {
        setTitle("Игра морской бой"); // создаем заголовок окна игры
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // отработали закрытие окна
        setSize(1280, 665); // создаем окно размером 640 на 640 + 25 Mac пикселей
        setLocation(250, 250); // задаем начальное положение окна по левому верхнему углу
        //add(new GameField()); //здесь добавляется наша игра
        setVisible(true);
    }

    public static void main(String[] args) {

        SeaBattleGameOfMark sb = new SeaBattleGameOfMark();
    }
}
