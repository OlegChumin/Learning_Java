package lessons405.SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LessonSWING03 {
    public static void main(String[] args) {
        JFrame window = buildJFrameWindow();
        JPanel p = new JPanel();
        window.add(p);
        JButton submitButton = new JButton("submit");
        p.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.BLACK);
            }
        });
    }


    static JFrame buildJFrameWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = dimension.width;
        int height = dimension.height;

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setBounds(width / 4, height / 4, width / 2, height / 2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return window;
    }
}
