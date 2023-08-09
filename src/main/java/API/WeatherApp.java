package API;

/**
 * API (Application Programming Interface) - это набор методов, функций, классов и протоколов, которые предоставляются
 * программным или сервисным компонентом для взаимодействия с другими программами или компонентами. API определяет
 * способы и правила взаимодействия между разными частями программного обеспечения.
 * <p>
 * API может быть использован для вызова функциональности, получения данных или интеграции различных компонентов в
 * приложении. Примером может быть API веб-сервиса, который позволяет вашему приложению взаимодействовать с удаленным
 * сервером.
 * <p>
 * Пример Java программы с использованием API:
 * <p>
 * Предположим, у вас есть Java-приложение, которое использует API для получения погодных данных с веб-сервиса.
 * Давайте представим, что вы используете OpenWeatherMap API для этой цели. Вам потребуется подключиться к API,
 * отправить запрос и обработать полученный ответ.
 * <p>
 * Вот пример Java-кода, который использует библиотеку java.net для отправки HTTP-запроса к OpenWeatherMap API и
 * получения погодных данных:
 * <p>
 * В данном примере кода, Java-приложение отправляет запрос к OpenWeatherMap API, получает JSON-ответ с погодными
 * данными для указанного города и может проводить дополнительную обработку данных, например, парсинг JSON и вывод погоды.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class WeatherApp {
    public static void main(String[] args) {
        String apiKey = " "; // Initialize with a default value
        Properties properties = new Properties();
        try (InputStream inputStream = WeatherApp.class.getClassLoader().getResourceAsStream("myconfig.properties")) {
            properties.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            apiKey = properties.getProperty("api.key");
            System.out.println(apiKey);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String city = "Moscow";
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        try {
            URL url = new URL(apiUrl); // контейнер с адресом API сервиса
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // установка возможности отправки
            // запросов на удаленный сервер
            connection.setRequestMethod("GET"); // устанавливается метод GET

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Response: " + response);
            System.out.println();
            // Здесь вы можете распарсить полученные данные и обработать их

            // Вызов методов для обработки JSON
            JSONHandler.printJson(response.toString());
            JSONHandler.saveJsonToFile(response.toString(), "src/main/java/API/output.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
