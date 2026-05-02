package Cipher.Vigenere_GUI_V0;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VigenereCipherGUI();
            }
        });
    }
}