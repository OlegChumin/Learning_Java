package Java_Oleg.SWING.old;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class SimpleWindow3 {
    public static void main(String[] args) {
        JFrame simpleWindow = new JFrame();
        simpleWindow.setVisible(true);
        simpleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        simpleWindow.setBounds(dimension.width/2 - 250, dimension.height / 2 - 150, 500, 300);
        simpleWindow.setTitle("Простое окно");
    }
}
