package Java_Oleg.SWING.Images;

import java.awt.*;

public class GetSystemFonts {
    public static void main(String[] args) {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String element :  fonts) {
            System.out.println(element);
        }
    }
}
