package collections;// CollectionDiagramComponent.java
import javax.swing.*;
import java.awt.*;

public class CollectionDiagramComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawDiagram(g);
    }

    // CollectionDiagramComponent.java
    private void drawDiagram(Graphics g) {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        drawCenteredBox(g, "Iterable<Interface>", centerX - 150, centerY - 50, 150, 30);
        drawCenteredBox(g, "Collection<Interface>", centerX + 150, centerY - 50, 150, 30);
        drawLineBetweenBoxes(g, centerX - 150, centerY - 20, centerX - 50, centerY - 20);
        drawLineBetweenBoxes(g, centerX - 50, centerY - 20, centerX + 50, centerY - 20);
        drawLineBetweenBoxes(g, centerX + 50, centerY - 20, centerX + 150, centerY - 20);

        int offsetY = centerY + 30;
        int offsetX = centerX - 300;
        int gap = 150;
        drawCenteredBox(g, "List<Interface>", offsetX, offsetY, 150, 30);
        drawCenteredBox(g, "Queue<Interface>", offsetX + gap, offsetY, 150, 30);
        drawCenteredBox(g, "Deque<Interface>", offsetX + 2 * gap, offsetY, 150, 30);
        drawCenteredBox(g, "Set<Interface>", offsetX + 3 * gap, offsetY, 150, 30);

        drawLineBetweenBoxes(g, centerX, centerY, offsetX + 75, offsetY);
        drawLineBetweenBoxes(g, centerX, centerY, offsetX + gap + 75, offsetY);
        drawLineBetweenBoxes(g, centerX, centerY, offsetX + 2 * gap + 75, offsetY);
        drawLineBetweenBoxes(g, centerX, centerY, offsetX + 3 * gap + 75, offsetY);
    }

    private void drawCenteredBox(Graphics g, String text, int x, int y, int width, int height) {
        g.drawRect(x, y, width, height);
        g.drawString(text, x + (width - g.getFontMetrics().stringWidth(text)) / 2, y + (height - g.getFontMetrics().getHeight()) / 2 + g.getFontMetrics().getAscent());
    }

    private void drawLineBetweenBoxes(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }




//    private void drawDiagram(Graphics g) {
//        // Рисуем блок "Iterable<Interface>"
//        int iterableX = getWidth() / 2 - 100;
//        int iterableY = 20;
//        g.drawRect(iterableX, iterableY, 200, 30);
//        g.drawString("Iterable<Interface>", iterableX + 45, iterableY + 20);
//
//        // Рисуем блок "Collection<Interface>"
//        int collectionX = getWidth() / 2 - 100;
//        int collectionY = iterableY + 30 + 20;
//        g.drawRect(collectionX, collectionY, 200, 30);
//        g.drawString("Collection<Interface>", collectionX + 45, collectionY + 20);
//
//        // Рисуем линии между блоками "Iterable<Interface>" и "Collection<Interface>"
//        g.drawLine(iterableX + 100, iterableY + 30, collectionX + 100, collectionY);
//
//        // Рисуем блоки уровня ниже и линии к ним
//        String[] lowerLevelInterfaces = {"List<Interface>", "Queue<Interface>", "Deque<Interface>", "Set<Interface>"};
//        int lowerLevelX = getWidth() / 2 - 250;
//        int lowerLevelY = collectionY + 30 + 20;
//
//        for (String text : lowerLevelInterfaces) {
//            g.drawRect(lowerLevelX, lowerLevelY, 150, 30);
//            g.drawString(text, lowerLevelX + 30, lowerLevelY + 20);
//            g.drawLine(collectionX + 100, collectionY + 30, lowerLevelX + 75, lowerLevelY);
//            lowerLevelX += 170;
//        }
//    }
}
