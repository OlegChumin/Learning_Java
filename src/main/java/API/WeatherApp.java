package API;

/**
 * API (Application Programming Interface) - это набор методов, функций, классов и протоколов, которые предоставляются
 * программным или сервисным компонентом для взаимодействия с другими программами или компонентами. API определяет
 * способы и правила взаимодействия между разными частями программного обеспечения.
 *
 * API может быть использован для вызова функциональности, получения данных или интеграции различных компонентов в
 * приложении. Примером может быть API веб-сервиса, который позволяет вашему приложению взаимодействовать с удаленным
 * сервером.
 *
 * Пример Java программы с использованием API:
 *
 * Предположим, у вас есть Java-приложение, которое использует API для получения погодных данных с веб-сервиса.
 * Давайте представим, что вы используете OpenWeatherMap API для этой цели. Вам потребуется подключиться к API,
 * отправить запрос и обработать полученный ответ.
 *
 * Вот пример Java-кода, который использует библиотеку java.net для отправки HTTP-запроса к OpenWeatherMap API и
 * получения погодных данных:
 *
 * В данном примере кода, Java-приложение отправляет запрос к OpenWeatherMap API, получает JSON-ответ с погодными
 * данными для указанного города и может проводить дополнительную обработку данных, например, парсинг JSON и вывод погоды.
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {
    public static void main(String[] args) {
        String apiKey = "493956338161c1426ef04a13f8741edc"; // Замените на свой ключ OpenWeatherMap API
        String city = "Moscow";
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Response: " + response);

            // Здесь вы можете распарсить полученные данные и обработать их
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
