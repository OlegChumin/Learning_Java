package EKIDS.Lessons.Lesson09.SWING;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class SimpleWindow {
    public static void main(String[] args) {
        JFrame simpleWindow = new JFrame();
        simpleWindow.setVisible(true);
        simpleWindow.setTitle("Simple Window");
        simpleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        simpleWindow.setBounds(dimension.width / 2 - 320, dimension.height / 2 - 240, 640, 480);
    }
}
