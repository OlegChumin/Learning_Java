package REST_API.first_task;

import java.io.*;
import java.net.URL;
import java.util.regex.*;
import java.net.HttpURLConnection;
import java.util.Arrays;


class Result {

    private static String readFromUrl(String url) throws IOException {
        final int MAX_ATTEMPTS = 3; // максимальное количество попыток
        for (int attempt = 0; attempt < MAX_ATTEMPTS; attempt++) {
            try {
                URL apiUrl = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000); // таймаут соединения, например, 5 секунд
                connection.setReadTimeout(5000);   // таймаут чтения данных

                // Проверка кода ответа HTTP
                int responseCode = connection.getResponseCode();
                if (responseCode != HttpURLConnection.HTTP_OK) {
                    throw new IOException("Server returned HTTP response code: " + responseCode + " for URL: " + url);
                }

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                return response.toString();
            } catch (IOException e) {
                if (attempt == MAX_ATTEMPTS - 1) { // если это последняя попытка, пробрасываем исключение
                    throw e;
                }
                // ждем перед следующей попыткой
                try {
                    Thread.sleep(1000 * (attempt + 1)); // увеличиваем задержку перед каждой новой попыткой
                } catch (InterruptedException ignored) {
                }
            }
        }
        throw new IOException("Failed to fetch data from URL after " + MAX_ATTEMPTS + " attempts: " + url);
    }


    private static boolean hasMatchesOnPage(String response) {
        Pattern pattern = Pattern.compile("\"per_page\":(\\d+)");
        Matcher matcher = pattern.matcher(response);
        if (matcher.find()) {
            int perPage = Integer.parseInt(matcher.group(1));
            pattern = Pattern.compile("\"data\":\\[.*?\\]");
            matcher = pattern.matcher(response);
            if (matcher.find()) {
                String data = matcher.group();
                // Подсчет количества вхождений "team1" или "team2" в строке "data" будет приблизительным способом определить количество матчей на странице
                long matches = data.split("\"team1\"").length - 1;
                return matches == perPage;
            }
        }
        return false;
    }


    private static int getTotalPages(String response) {
        Pattern pattern = Pattern.compile("\"total_pages\":(\\d+)");
        Matcher matcher = pattern.matcher(response);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 1;
    }


    private static int getGoalsFromResponse(String response, String goalKey) {
        int goals = 0;
        Pattern pattern = Pattern.compile("\"" + goalKey + "\":\"(\\d+)\"");
        Matcher matcher = pattern.matcher(response);
        while (matcher.find()) {
            goals += Integer.parseInt(matcher.group(1));
        }
        return goals;
    }


    public static int getTotalGoals(String team, int year) throws IOException {
        int totalGoals = 0;
        for (String teamParam : Arrays.asList("team1", "team2")) {
            int page = 1;
            String url = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&" + teamParam + "=" + team + "&page=" + page;
            String response = readFromUrl(url);
            int totalPages = getTotalPages(response); // получаем общее количество страниц

            for (page = 1; page <= totalPages; page++) {
                if (page > 1) { // уже получили ответ для первой страницы
                    url = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&" + teamParam + "=" + team + "&page=" + page;
                    response = readFromUrl(url);
                }
                totalGoals += getGoalsFromResponse(response, teamParam.equals("team1") ? "team1goals" : "team2goals");
            }
        }
        return totalGoals;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String team = bufferedReader.readLine();

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getTotalGoals(team, year);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
