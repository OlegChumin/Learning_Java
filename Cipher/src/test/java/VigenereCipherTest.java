/**
 * The above test class contains four test methods:
 * testEncrypt(): Tests the encrypt() method with a non-empty key.
 * testDecrypt(): Tests the decrypt() method with a non-empty key.
 * testEncryptEmptyKey(): Tests the encrypt() method with an empty key.
 * testDecryptEmptyKey(): Tests the decrypt() method with an empty key.
 * Each test method contains an assertion that compares the expected output with the actual output of the method being
 * tested.
 * The assertEquals() method is used to perform the comparison.
 */

import Vigenere_GUI_V3.VigenereCipher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VigenereCipherTest {

    @Test
    void testEncrypt() {
        String plaintext = "HELLO WORLD";
        String key = "SECRETKEY";
        String expected = "OITWY MHLBW";
        String ciphertext = VigenereCipher.encrypt(plaintext, key);
        assertEquals(expected, ciphertext);
    }

    @Test
    void testDecrypt() {
        String ciphertext = "OITWY MHLBW";
        String key = "SECRETKEY";
        String expected = "HELLO WORLD";
        String plaintext = VigenereCipher.decrypt(ciphertext, key);
        assertEquals(expected, plaintext);
    }

    @Test
    void testEncryptEmptyKey() {
        String plaintext = "HELLO WORLD";
        String key = "";
        String expected = "HELLO WORLD";
        String ciphertext = VigenereCipher.encrypt(plaintext, key);
        assertEquals(expected, ciphertext);
    }

    @Test
    void testDecryptEmptyKey() {
        String ciphertext = "HELLO WORLD";
        String key = "";
        String expected = "HELLO WORLD";
        String plaintext = VigenereCipher.decrypt(ciphertext, key);
        assertEquals(expected, plaintext);
    }
}