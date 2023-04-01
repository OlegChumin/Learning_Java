package SWING.sin_cos_tan_ctg_graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

public class LogGraph {

    public static void draw(Graphics2D g2, int width, int height) {
        g2.setColor(Color.MAGENTA);
        Path2D.Double pathLog = new Path2D.Double();
        for (double x = 0.1; x <= 10; x += 0.001) {
            double y = Math.log10(x);
            int x1 = (int) (x * width / 10);
            int y1 = (int) ((1 - y) * height / 2);
            if (x == 0.1) {
                pathLog.moveTo(x1, y1);
            } else {
                pathLog.lineTo(x1, y1);
            }
        }
        g2.draw(pathLog);
    }
}
