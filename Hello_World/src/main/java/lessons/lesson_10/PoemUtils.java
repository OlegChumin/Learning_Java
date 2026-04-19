package lessons.lesson_10;

import java.io.*;

public class PoemUtils {
    public static void main(String[] args) {
        String text = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n";

        String filePath = "poem.txt";

        // Записываем стихотворение в файл
        writeTextToFile(text, filePath);

        // Читаем стихотворение из файла
        String readPoem = readTextFromFile(filePath);
        System.out.println(readPoem);

    }

    /**
     * Метод для записи текста в файл
     *
     * @param text
     * @param filePath
     */
    public static void writeTextToFile(String text, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибка операции записи файла !");
        }

    }

    /**
     * Метод считывает текст из файла
     *
     * @param filePath
     * @return
     */
    public static String readTextFromFile(String filePath) {
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append("\n");
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка! Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла");
        }
        return text.toString();
    }

}
