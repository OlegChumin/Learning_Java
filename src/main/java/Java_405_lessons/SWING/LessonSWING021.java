package Java_405_lessons.SWING;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class LessonSWING021 {
    public static void main(String[] args) {
        JFrame window = getWindow();
        window.add(new NewComponent());

    }

    private static JFrame getWindow() {
        int width, height;
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // набор инструментов для работы с экранами
        Dimension dimension = toolkit.getScreenSize(); // получаем размер экрана
        JFrame window = new JFrame();
        window.setTitle("Oleg's window");
        width = dimension.width;
        height = dimension.height;
        window.setBounds(width / 4, height / 4, width / 2, height / 2);
        window.setVisible(true);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return window;
    }

    static class NewComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D grObj = (Graphics2D) g;
            String urlStr = "https://e7.pngegg.com/pngimages/799/622/png-clipart-munchkin-cat-persian-cat-kitten-scottish-fold-cat-food-kitten-mammal-cat-like-mammal.png";
            try {
                URL url =  new URL(urlStr);
                Image image = new ImageIcon(url).getImage();
                grObj.drawImage(image, 0, 0, null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                System.err.println("Изображение не найдено по ссылке: " + urlStr);
            }

        }
    }
}


