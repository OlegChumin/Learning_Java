package SWING.sin_cos_tan_ctg_graphics;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
