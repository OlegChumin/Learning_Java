package Vigenere_GUI_V2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VigenereCipherGUI extends JFrame {
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JTextField keyTextField;
    private VigenereCipher cipher;

    public VigenereCipherGUI() {
        super("Vigenere Cipher");

        // Создать объект шифровальщика
        cipher = new VigenereCipher();

        // Установить менеджер компоновки для фрейма
        setLayout(new BorderLayout());

        // Создать панель для ввода
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input"));

        // Создать текстовую область для ввода
        inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(inputTextArea);

        // Добавить текстовую область на панель ввода
        inputPanel.add(scrollPane, BorderLayout.CENTER);

        // Создать панель для вывода
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        outputPanel.setBorder(BorderFactory.createTitledBorder("Output"));

        // Создать текстовую область для вывода
        outputTextArea = new JTextArea();
        outputTextArea.setLineWrap(true);
        outputTextArea.setEditable(false);
        JScrollPane scrollPane2 = new JScrollPane(outputTextArea);

        // Добавить текстовую область на панель вывода
        outputPanel.add(scrollPane2, BorderLayout.CENTER);

        // Создать панель для ввода ключа
        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new FlowLayout());
        keyPanel.setBorder(BorderFactory.createTitledBorder("Key"));

        // Создать текстовое поле для ввода ключа
        keyTextField = new JTextField(20);

        // Добавить текстовое поле на панель ввода ключа
        keyPanel.add(keyTextField);

        // Создать кнопки для шифрования и расшифровки текста
        JButton encryptButton = new JButton("Encrypt");
        JButton decryptButton = new JButton("Decrypt");

        // Добавить обработчики событий для кнопок
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = keyTextField.getText();
                String inputText = inputTextArea.getText();
                String encryptedText = cipher.encrypt(inputText, key);
                outputTextArea.setText(encryptedText);
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = keyTextField.getText();
                String inputText = inputTextArea.getText();
                String decryptedText = cipher.decrypt(inputText, key);
                outputTextArea.setText(decryptedText);
            }
        });

        // Создать панель для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Создать кнопку для ввода ключа
        JButton keyButton = new JButton("Enter Key");
        keyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = JOptionPane.showInputDialog(VigenereCipherGUI.this, "Enter key:");
                if (key != null) {
                    keyTextField.setText(key);
                }
            }
        });
        buttonPanel.add(keyButton);

        // Добавить кнопки на панель кнопок
        buttonPanel.add(encryptButton);
        buttonPanel.add(decryptButton);

        // Добавить панели на фрейм
        add(inputPanel, BorderLayout.NORTH);
        add(outputPanel, BorderLayout.CENTER);
        add(keyPanel, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.PAGE_END);

        // Установить размер фрейма и сделать его видимым
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private String readFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return sb.toString();
    }

    private void writeToFile(String fileName, String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
