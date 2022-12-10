package EKIDS.Lessons.Lesson09.SWING;


import javax.swing.*;
import java.awt.*;

public class DrawSimpleFont {
    public static void main(String[] args) {
        JFrame jFrame0 = getFrame();
        jFrame0.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Copperplate Gothic Bold", Font.ITALIC, 25);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("Hello Java", 25, 25);

        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 320, dimension.height / 2 - 240, 640, 480);
        return jFrame;
    }

}
