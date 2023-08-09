package API;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class JSONHandler {
    public static void printJson(String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            // Вывод JSON на экран
            System.out.println("JSON Response:\n" + jsonNode.toPrettyString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveJsonToFile(String jsonString, String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            // Сохранение JSON в файл
            try (FileWriter fileWriter = new FileWriter(fileName)) {
                objectMapper.writeValue(fileWriter, jsonNode);
                System.out.println("JSON сохранен в файл '" + fileName + "'");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
