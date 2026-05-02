package Java_Oleg.SWING.old;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MainApplication extends JPanel {
    public Image iconImg;

    public MainApplication() {
        setBackground(Color.BLUE);
        loadIconImage();
    }

    public void loadIconImage() {
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Oleg_Chumin\\IdeaProjects\\Learning_Java_and_Kotlin\\src\\Java\\SWING\\Images\\Darth.png");
        iconImg = imageIcon.getImage();
    }
}
