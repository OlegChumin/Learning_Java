package EKIDS.draw_logo.boeing;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Панель для отрисовки учебной версии логотипа Boeing.
 * <p>
 * Логотип состоит из двух вертикальных половин:
 * синей слева и белой справа. Над ними по центру
 * рисуется слово {@code Boeing} с контрастной отрисовкой:
 * на синей части текст белый, на белой части текст синий.
 */
public class BoeingLogo extends JPanel {
    /**
     * Цвет синей части логотипа Boeing.
     */
    private static final Color BOEING_BLUE = new Color(11, 61, 130);

    /**
     * Базовый размер шрифта для крупного текста логотипа.
     */
    private static final int BASE_FONT_SIZE = 80;

    /**
     * Отрисовывает фон логотипа и центрированную надпись.
     *
     * @param g графический контекст Swing
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        try {
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            paintBackground(g2d);
            paintCenteredLogoText(g2d, "Boeing");
        } finally {
            g2d.dispose();
        }
    }

    /**
     * Отрисовывает двухцветный фон логотипа.
     *
     * @param g2d графический контекст
     */
    private void paintBackground(Graphics2D g2d) {
        int halfWidth = getWidth() / 2;

        g2d.setColor(BOEING_BLUE);
        g2d.fillRect(0, 0, halfWidth, getHeight());

        g2d.setColor(Color.WHITE);
        g2d.fillRect(halfWidth, 0, getWidth() - halfWidth, getHeight());
    }

    /**
     * Рисует слово логотипа по центру панели.
     * <p>
     * Текст выводится в два прохода с разными областями отсечения:
     * слева белым цветом, справа синим. За счет этого надпись
     * полностью читается на контрастном фоне.
     *
     * @param g2d  графический контекст
     * @param text текст логотипа
     */
    private void paintCenteredLogoText(Graphics2D g2d, String text) {
        Font font = createResponsiveFont();
        g2d.setFont(font);

        FontMetrics metrics = g2d.getFontMetrics(font);
        int textWidth = metrics.stringWidth(text);
        int textX = (getWidth() - textWidth) / 2;
        int textY = (getHeight() - metrics.getHeight()) / 2 + metrics.getAscent();
        int halfWidth = getWidth() / 2;

        Graphics2D leftPart = (Graphics2D) g2d.create();
        try {
            leftPart.setClip(0, 0, halfWidth, getHeight());
            leftPart.setColor(Color.WHITE);
            leftPart.drawString(text, textX, textY);
        } finally {
            leftPart.dispose();
        }

        Graphics2D rightPart = (Graphics2D) g2d.create();
        try {
            rightPart.setClip(halfWidth, 0, getWidth() - halfWidth, getHeight());
            rightPart.setColor(BOEING_BLUE);
            rightPart.drawString(text, textX, textY);
        } finally {
            rightPart.dispose();
        }
    }

    /**
     * Создает адаптивный шрифт, который масштабируется
     * относительно текущего размера панели.
     *
     * @return шрифт для надписи логотипа
     */
    private Font createResponsiveFont() {
        int size = Math.max(42, Math.min(BASE_FONT_SIZE, getWidth() / 7));
        return new Font("Arial", Font.BOLD, size);
    }

    /**
     * Запускает демонстрационное окно с логотипом.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Boeing Logo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new BoeingLogo());
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
