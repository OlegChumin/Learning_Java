package Cipher.Students_code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Исправленная версия учебного шифратора.
 * <p>
 * В этой версии были исправлены опечатки, форматирование,
 * логика повторного запуска и работа с файлами.
 */

public class Cipher {
    public static void main(String[] args) throws IOException {
        String key = "CLANG"; // key

        while (true) {
            Scanner toDo = new Scanner(System.in);
            System.out.println("Encrypt new/Decrypt old/Exit?");
            String doing = toDo.nextLine();

            switch (doing) {
                case "Encrypt":
                    Scanner text = new Scanner(System.in);
                    System.out.println("Type the message in:");
                    String originalMessage = text.nextLine();
                    File originalFile = new File("OriginalText.txt");
                    FileWriter pw = new FileWriter(originalFile);
                    pw.write(originalMessage);
                    pw.close();

                    String message = originalMessage.toUpperCase();
                    String encryptedMessage = encrypt(message, key); // encrypting and saving
                    File cryptedFile = new File("Crypt.txt");
                    FileWriter crypto = new FileWriter(cryptedFile);
                    crypto.write(encryptedMessage);
                    crypto.close();

                    try (Scanner writeOut = new Scanner(cryptedFile)) {
                        System.out.println("Encrypted message: ");
                        while (writeOut.hasNextLine()) {
                            System.out.println(writeOut.nextLine());
                        }
                    }
                    break;
                case "Decrypt":
                    File crypted = new File("Crypt.txt");
                    String messageFromFile = new String(Files.readAllBytes(Paths.get("Crypt.txt")));
                    String deciphered = decrypt(messageFromFile, key);
                    System.out.println("Encrypted message: " + messageFromFile);
                    System.out.println("Decrypted message: " + deciphered);
                    File decipheredFile = new File("Decrypted.txt");
                    FileWriter pw1 = new FileWriter(decipheredFile);
                    pw1.write(deciphered);
                    pw1.close();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("Try again");
                    break;
            }
        }
    }

    // encryption
    public static String encrypt(String text, final String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') {
                continue;
            }
            result.append((char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A'));
            j = ++j % key.length();
        }
        return result.toString();
    }

    public static String decrypt(String text, final String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') {
                continue;
            }
            result.append((char) ((c - key.charAt(j) + 26) % 26 + 'A'));
            j = ++j % key.length();
        }
        return result.toString();
    }
}
