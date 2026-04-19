package Vigenere_0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VigenereCipher {
  
  private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  public static void main(String[] args) {
    String key = "KEY"; // Задайте свой ключ здесь
    String inputFile = "input.txt"; // Задайте имя входного файла здесь
    String outputFile = "output.txt"; // Задайте имя выходного файла здесь
    
    String inputText = readFromFile(inputFile);
    String encryptedText = encrypt(inputText, key);
    writeToFile(outputFile, encryptedText);
    
    String decryptedText = decrypt(encryptedText, key);
    System.out.println(decryptedText); // Вывод расшифрованного текста на консоль
  }
  
  public static String encrypt(String text, String key) {
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
  
  public static String decrypt(String text, String key) {
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
  
  private static String readFromFile(String fileName) {
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
  
  private static void writeToFile(String fileName, String text) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
      bw.write(text);
    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }
  }
}
