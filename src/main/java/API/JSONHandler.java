package API;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileWriter;
import java.io.IOException;

public class JSONHandler {
    public static void printJson(String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper(); //ObjectMapper - это основной класс, который предоставляет
            // методы для преобразования между Java-объектами и JSON-данными. Он будет использоваться для анализа
            // JSON-строки и создания объекта, представляющего JSON.
            JsonNode jsonNode = objectMapper.readTree(jsonString); //В этой строке используется созданный ранее
            // objectMapper для анализа (парсинга) строки jsonString в объект типа JsonNode. JsonNode - это класс из
            // библиотеки Jackson, который представляет JSON-структуру в виде дерева узлов. В данном случае, JSON-строка
            // будет разобрана и преобразована в иерархию узлов, которую можно будет легко обрабатывать.

            // Вывод JSON на экран
            System.out.println("JSON Response:\n" + jsonNode.toPrettyString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveJsonToFile(String jsonString, String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Включить красивый формат
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
