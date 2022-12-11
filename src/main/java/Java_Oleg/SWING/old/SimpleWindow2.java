package Java_Oleg.SWING.old;

import javax.swing.*;

public class SimpleWindow2 {
    public static void main(String[] args) {
        JFrame simpleWindow = new JFrame();
        simpleWindow.setVisible(true);
        simpleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleWindow.setTitle("Простое окно");
        simpleWindow.setBounds(500, 500, 500, 600);
    }
}
