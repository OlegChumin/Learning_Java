package EKIDS.Lessons.Lesson09.SWING;

import javax.swing.*;

public class NewWindow extends JFrame {
    public NewWindow() {
        setTitle("Мое окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocation(320, 240);
        setVisible(true);
    }

    public static void main(String[] args) {
        NewWindow newWindow = new NewWindow();
    }
}
