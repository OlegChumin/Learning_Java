package Vigenere_1_Comments;

/**
 * Первые четыре строки импортируют классы, необходимые для чтения и записи текстовых файлов. Классы BufferedReader и
 * FileReader используются для чтения входных данных из файла, а BufferedWriter и FileWriter используются для записи
 * выходных данных в файл.
 * <p>
 * Последняя строка импортирует класс IOException из пакета java.io, который используется для обработки ошибок
 * ввода-вывода. IOException является общим типом исключения, которое может возникнуть при чтении или записи файлов.
 * В программе обработка исключений выполняется с помощью конструкции try-catch, чтобы обработать возможные ошибки
 * чтения или записи файла и сообщить об этом пользователю.
 */

import java.io.BufferedReader; // класс BufferedReader из пакета java.io для чтения входных данных из файла
import java.io.BufferedWriter; // класс BufferedWriter из пакета java.io для записи выходных данных в файл
import java.io.FileReader; // класс FileReader из пакета java.io для чтения символов из файла
import java.io.FileWriter; // класс FileWriter из пакета java.io для записи символов в файл
import java.io.IOException; // класс IOException из пакета java.io для обработки ошибок ввода-вывода

/**
 * Шифр Виженера (фр. Chiffre de Vigenère) — метод полиалфавитного шифрования буквенного текста с использованием ключевого
 * слова
 * Этот метод является простой формой многоалфавитной замены. Шифр Виженера изобретался многократно. Впервые этот метод
 * описал Джовани Баттиста Белласо (итал. Giovan Battista Bellaso) в книге La cifra del. Sig. Giovan Battista Bellasо в
 * 1553 году[2], однако в XIX веке получил имя Блеза Виженера[3], французского дипломата. Метод прост для понимания и
 * реализации, но является недоступным для простых методов криптоанализа.[4]
 * <p>
 * Хотя шифр легко понять и реализовать, на протяжении трех столетий он противостоял всем попыткам его сломать; чем и
 * заработал имя le chiffre indéchiffrable (фр. неразгаданный шифр). Многие люди пытались реализовать схемы шифрования,
 * которые по сути являлись шифрами Виженера.[5]
 */

public class VigenereCipher { // объявляем класс VigenereCipher

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // объявляем и инициализируем константу ALPHABET, которая содержит все буквы алфавита

    public static void main(String[] args) { // объявляем метод main
        String key = "KEY"; // задаем ключ шифрования
        String inputFile = "input.txt"; // задаем имя входного файла
        String outputFile = "output.txt"; // задаем имя выходного файла

        String inputText = readFromFile(inputFile); // считываем входной текст из файла
        String encryptedText = encrypt(inputText, key); // шифруем текст
        writeToFile(outputFile, encryptedText); // записываем шифрованный текст в выходной файл

        String decryptedText = decrypt(encryptedText, key); // дешифруем текст
        System.out.println(decryptedText); // выводим дешифрованный текст на консоль
    }

    /**
     * Метод encrypt используется для шифрования текста с использованием алгоритма Виженера. Он принимает два аргумента:
     * текст, который нужно зашифровать, и ключ, который используется для шифрования. Затем метод итерируется по каждому
     * символу входного текста, определяет индекс текущего символа в алфавите и вычисляет индекс символа в ключе. Затем он
     * использует эти индексы для вычисления индекса зашифрованного символа, добавляет зашифрованный символ в StringBuilder
     * и инкрементирует индекс ключа. Если символ не содержится в алфавите, он добавляется в StringBuilder без изменений.
     * Наконец, метод возвращает строку зашифрованного текста.
     * <p>
     * Метод encrypt является важной частью алгоритма Виженера, поскольку он отвечает за зашифровку исходного текста.
     * Зашифрованный текст можно передавать по сети или сохранять в файле без риска, что он будет прочитан посторонними.
     * Затем, чтобы прочитать зашифрованный текст, его нужно расшифровать с использованием того же ключа, который
     * использовался при шифровании.
     */
    public static String encrypt(String text, String key) { // объявляем метод encrypt для шифрования текста
        StringBuilder sb = new StringBuilder(); // создаем новый объект StringBuilder для построения зашифрованной строки
        int keyIndex = 0; // индекс ключа
        for (char c : text.toCharArray()) { // итерируемся по каждому символу входного текста
            int plainCharIndex = ALPHABET.indexOf(Character.toUpperCase(c)); // определяем индекс текущего символа в алфавите
            if (plainCharIndex != -1) { // если символ содержится в алфавите
                int keyCharIndex = ALPHABET.indexOf(Character.toUpperCase(key.charAt(keyIndex % key.length()))); // определяем индекс символа в ключе
                int encryptedCharIndex = (plainCharIndex + keyCharIndex) % ALPHABET.length(); // вычисляем индекс зашифрованного символа
                char encryptedChar = ALPHABET.charAt(encryptedCharIndex); // определяем зашифрованный символ
                sb.append(Character.isUpperCase(c) ? encryptedChar : Character.toLowerCase(encryptedChar)); // добавляем зашифрованный символ в StringBuilder
                keyIndex++; // инкрементируем индекс ключа
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Метод decrypt работает почти так же, как encrypt, только в обратном порядке. Он итерируется по каждому символу
     * входного текста, определяет индекс текущего символа в алфавите и вычисляет индекс символа в ключе. Затем он
     * использует эти индексы для вычисления индекса расшифрованного символа, добавляет расшифрованный символ в
     * StringBuilder и инкрементирует индекс ключа. Если символ не содержится в алфавите, он добавляется в StringBuilder
     * без изменений. Наконец, метод возвращает строку расшифрованного текста.
     */
    public static String decrypt(String text, String key) { // объявляем метод decrypt для расшифровки текста
        StringBuilder sb = new StringBuilder(); // создаем новый объект StringBuilder для построения расшифрованной строки
        int keyIndex = 0; // индекс ключа
        for (char c : text.toCharArray()) { // итерируемся по каждому символу входного текста
            int encryptedCharIndex = ALPHABET.indexOf(Character.toUpperCase(c)); // определяем индекс текущего символа в алфавите
            if (encryptedCharIndex != -1) { // если символ содержится в алфавите
                int keyCharIndex = ALPHABET.indexOf(Character.toUpperCase(key.charAt(keyIndex % key.length()))); // определяем индекс символа в ключе
                int plainCharIndex = (encryptedCharIndex - keyCharIndex + ALPHABET.length()) % ALPHABET.length(); // вычисляем индекс расшифрованного символа
                char plainChar = ALPHABET.charAt(plainCharIndex); // определяем расшифрованный символ
                sb.append(Character.isUpperCase(c) ? plainChar : Character.toLowerCase(plainChar)); // добавляем расшифрованный символ в StringBuilder
                keyIndex++; // инкрементируем индекс ключа
            } else {
                sb.append(c); // если символ не содержится в алфавите, то добавляем его в StringBuilder без изменений
            }
        }
        return sb.toString(); // возвращаем строку расшифрованного текста
    }


    private static String readFromFile(String fileName) { // объявляем метод readFromFile для чтения текста из файла
        StringBuilder sb = new StringBuilder(); // создаем новый объект StringBuilder для построения строки считанного текста
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // создаем новый объект BufferedReader для чтения из файла
            String line; // создаем строку line
            while ((line = br.readLine()) != null) { // читаем строки из файла, пока не дойдем до конца файла
                sb.append(line); // добавляем строку в StringBuilder
            }
        } catch (IOException e) { // обрабатываем исключение, если чтение из файла не удалось
            System.err.println("Error reading from file: " + e.getMessage()); // выводим сообщение об ошибке
        }
        return sb.toString(); // возвращаем строку считанного текста
    }

    private static void writeToFile(String fileName, String text) { // объявляем метод writeToFile для записи текста в файл
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) { // создаем новый объект BufferedWriter для записи в файл
            bw.write(text); // записываем текст в файл
        } catch (IOException e) { // обрабатываем исключение, если запись в файл не удалась
            System.err.println("Error writing to file: " + e.getMessage()); // выводим сообщение об ошибке
        }
    }
}


/**
 * Это конец программы. Здесь определены два метода: readFromFile для чтения текста из файла и writeToFile для записи
 * текста в файл. Оба метода используют конструкцию try-with-resources, чтобы автоматически закрыть соответствующий поток
 * после использования. readFromFile возвращает считанный текст в виде строки, а writeToFile не возвращает значения. Оба
 * метода могут вызываться внутри метода main для чтения входного файла и записи выходного файла соответственно.
 */