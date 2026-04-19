package Vigenere_GUI_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 Этот код создает графический интерфейс, который состоит из трех панелей: панель ввода, панель вывода и панель для
 ввода ключа. Пользователь может ввести текст, выбрать ключ и нажать кнопку "Encrypt" или "Decrypt", чтобы зашифровать
 или расшифровать текст. Результат выводится в текстовом поле на панели вывода.

 Также в классе есть два метода readFromFile и writeToFile, которые используются для чтения входных данных из файла и
 записи выходных данных в файл соответственно.

 Методы encrypt и decrypt в этом классе почти идентичны методам в оригинальном классе VigenereCipher, за исключением
 того, что вместо чтения и записи в файлы они используют текст, введенный пользователем через графический интерфейс, и
 отображают результаты на панели вывода.
 * */

public class VigenereCipherGUI extends JFrame {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JTextField keyTextField;

    public VigenereCipherGUI() {
        super("Vigenere Cipher");

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
                String encryptedText = encrypt(inputText, key);
                outputTextArea.setText(encryptedText);
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = keyTextField.getText();
                String inputText = inputTextArea.getText();
                String decryptedText = decrypt(inputText, key);
                outputTextArea.setText(decryptedText);
            }
        });

        // Создать панель для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

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

    public static void main(String[] args) {
        new VigenereCipherGUI();
    }

    private String encrypt(String text, String key) {
        StringBuilder sb = new StringBuilder();
        int keyIndex = 0;
        for (char c : text.toCharArray()) {
            int plainCharIndex = ALPHABET.indexOf(Character.toUpperCase(c));
            if (plainCharIndex != -1) {
                int keyCharIndex = ALPHABET.indexOf(Character.toUpperCase(key.charAt(keyIndex % key.length())));
                int encryptedCharIndex = (plainCharIndex + keyCharIndex) % ALPHABET.length();
                char encryptedChar = ALPHABET.charAt(encryptedCharIndex);
                sb.append(Character.isUpperCase(c) ? encryptedChar : Character.toLowerCase(encryptedChar));
                keyIndex++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private String decrypt(String text, String key) {
        StringBuilder sb = new StringBuilder();
        int keyIndex = 0;
        for (char c : text.toCharArray()) {
            int encryptedCharIndex = ALPHABET.indexOf(Character.toUpperCase(c));
            if (encryptedCharIndex != -1) {
                int keyCharIndex = ALPHABET.indexOf(Character.toUpperCase(key.charAt(keyIndex % key.length())));
                int plainCharIndex = (encryptedCharIndex - keyCharIndex + ALPHABET.length()) % ALPHABET.length();
                char plainChar = ALPHABET.charAt(plainCharIndex);
                sb.append(Character.isUpperCase(c) ? plainChar : Character.toLowerCase(plainChar));
                keyIndex++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

