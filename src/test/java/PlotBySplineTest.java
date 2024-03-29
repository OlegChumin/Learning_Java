import SWING.sin_cos_tan_ctg_graphics.PlotBySpline;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlotBySplineTest {

    @Test
    void testPlotBySpline() {
        PlotBySpline plotBySpline = new PlotBySpline();
        plotBySpline.setSize(800, 600);
        plotBySpline.setLocationRelativeTo(null);
        plotBySpline.setVisible(true);
        
        assertNotNull(plotBySpline.getContentPane(), "Content pane should not be null");
        assertNotNull(plotBySpline.getGraphics(), "Graphics should not be null");
        assertEquals(plotBySpline.getWidth(), 800, "Width should be 800");
        assertEquals(plotBySpline.getHeight(), 600, "Height should be 600");
        assertEquals(plotBySpline.getTitle(), "Function Plot by Oleg Chumin", "Function Plot by Oleg Chumin'");
    }
}
