package lessons.lesson_10;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

public class TextToJSON {

    /**
     * {
     * "title": "Лукоморье",
     * "author": "А.С. Пушкин",
     * "text": "У лукоморья дуб зелёный;\n
     * Златая цепь на дубе том:\n
     * И днём и ночью кот учёный\n
     * Всё ходит по цепи кругом;\n
     * Идёт направо — песнь заводит,\n
     * Налево — сказку говорит.\n
     * Там чудеса: там леший бродит,\n
     * Русалка на ветвях сидит;\n
     * Там на неведомых дорожках\n
     * Следы невиданных зверей;\n";
     * }
     */

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
        String filePath = "poemJson.txt";
        writeTextToJson(text, filePath);

        String readJson = readTextFromJson(filePath);
        System.out.println(readJson);
    }

    public static void writeTextToJson(String text, String filePath) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("poem", text);

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(jsonObject.toString());
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибка операции записи файла !");
        }
    }

    public static String readTextFromJson(String filePath) {
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonContent.append(line);
            }
            bufferedReader.close();
            JSONObject jsonObject = new JSONObject(new JSONTokener(jsonContent.toString()));
            text.append(jsonObject.getString("poem"));
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка! Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла");
        }
        return text.toString();
    }
}
