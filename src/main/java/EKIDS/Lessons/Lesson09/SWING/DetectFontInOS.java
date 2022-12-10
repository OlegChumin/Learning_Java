package EKIDS.Lessons.Lesson09.SWING;

import java.awt.*;

public class DetectFontInOS {
    public static void main(String[] args) {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String element : fonts) {
            System.out.println(element);
        }
    }
}
