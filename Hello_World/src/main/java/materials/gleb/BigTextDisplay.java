package materials.gleb;

import javax.swing.*;

public class BigTextDisplay {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Big Text Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea("Я помню чудное мгновенье:\n\nПередо мной явилась ты,\n\nКак мимолетное виденье,\n\nКак гений чистой красоты.");
        textArea.setFont(textArea.getFont().deriveFont(30f)); // Устанавливаем крупный шрифт
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);

        frame.setSize(600, 300);
        frame.setVisible(true);
    }
}