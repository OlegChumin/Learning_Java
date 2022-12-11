package Java_Oleg.SWING.old;

import javax.swing.*;

public class SimpleWindow {
    public static void main(String[] args) {
        JFrame simpleWindow = new JFrame();
        simpleWindow.setVisible(true);
        simpleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleWindow.setTitle("Простое окно");
        simpleWindow.setSize(640, 480);
        simpleWindow.setLocation(320, 240);
    }
}
