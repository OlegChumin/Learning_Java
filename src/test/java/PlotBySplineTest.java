import SWING.sin_cos_tan_ctg_graphics.PlotBySpline;
import org.junit.jupiter.api.Test;


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
        assertEquals(800, plotBySpline.getWidth(), "Width should be 800");
        assertEquals(600, plotBySpline.getHeight(), "Height should be 600");
        assertEquals("Function Plot by Oleg Chumin", plotBySpline.getTitle(), "Function title should match");

    }
}
