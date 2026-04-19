import javax.swing.*;
import java.awt.*;

/**
 * Класс PlotLabels наследует класс JPanel и предназначен для добавления текстовых меток к графику.
 *
 * public class PlotLabels extends JPanel { - объявление класса PlotLabels, который наследует класс JPanel.
 * public PlotLabels() { - объявление конструктора класса PlotLabels.
 * setLayout(null); - устанавливает менеджер компоновки для панели в null.
 * JLabel sinLabel = new JLabel("sin(x)"); - создание объекта JLabel с текстом "sin(x)" и сохранение его в переменной
 * sinLabel.
 * sinLabel.setForeground(Color.RED); - установка красного цвета для текста метки sinLabel.
 * sinLabel.setBounds(50, 50, 100, 20); - задание координат и размеров метки sinLabel на панели.
 * add(sinLabel); - добавление метки sinLabel на панель.
 * Аналогично создаются метки для функций cos(x), tan(x) и ctg(x).
 * */

public class PlotLabels extends JPanel {
    public PlotLabels() {
        setLayout(null);
        JLabel sinLabel = new JLabel("sin(x)");
        sinLabel.setForeground(Color.RED);
        sinLabel.setBounds(50, 50, 100, 20);
        add(sinLabel);

        JLabel cosLabel = new JLabel("cos(x)");
        cosLabel.setForeground(Color.GREEN);
        cosLabel.setBounds(50, 70, 100, 20);
        add(cosLabel);

        JLabel tanLabel = new JLabel("tan(x)");
        tanLabel.setForeground(Color.BLUE);
        tanLabel.setBounds(50, 90, 100, 20);
        add(tanLabel);

        JLabel ctgLabel = new JLabel("ctg(x)");
        ctgLabel.setForeground(Color.ORANGE);
        ctgLabel.setBounds(50, 110, 100, 20);
        add(ctgLabel);
    }
}
