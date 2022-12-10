package EKIDS.Lessons.Lesson09.SWING.Lesson2;

import javax.swing.*;

public class Buttons extends JFrame{
    JPanel pnl = new JPanel();

    ImageIcon tick = new ImageIcon("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\SWING\\Lesson2\\tick.png");
    ImageIcon cross = new ImageIcon("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\SWING\\Lesson2\\cross.png");

    JButton btn = new JButton( "Нажми меня" );
    JButton tickBtn = new JButton( "OK", tick ) ;
    JButton crossBtn = new JButton( "СТОП" , cross );

    public Buttons() {
        super("Window Title");
        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);
    }

    public static void main(String[] args) {
        Buttons buildWindow = new Buttons();
    }
}