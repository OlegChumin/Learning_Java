package EKIDS.Lessons.Lesson09.SWING.Lesson3;

import javax.swing.*;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action2 extends JFrame implements ActionListener {
    JPanel pnl = new JPanel();

    JButton btn1 = new JButton("Кнопка 1 ");
    JButton btn2 = new JButton("Кнопка 2 ");
    JTextArea textArea = new JTextArea(5, 39);

    public Action2() {
        super("SWING Window");
        setSize(640, 480);
        setLocation(320, 240);
        setDefaultCloseOperation(3);
        add(pnl);
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(textArea);

        btn2.setEnabled(false);
        textArea.setText("Кнопка 2 деактивированна");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.Action window = new Action();
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        textArea.setText(event.getActionCommand() + "Нажата и деактивированна");

        if (event.getSource() == btn1) {
            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }

        if (event.getSource() == btn2) {
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        }
    }
}
