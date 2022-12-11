package Java_Oleg.SWING.old;

import javax.swing.*;
import java.awt.*;

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
