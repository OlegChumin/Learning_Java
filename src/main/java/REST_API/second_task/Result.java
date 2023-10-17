package REST_API.second_task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

class Result {

    private static String fetchWinner(String competition, int year) throws Exception {
        String url = "https://jsonmock.hackerrank.com/api/football_competitions?name=" + competition + "&year=" + year;

        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // Parse the response to get the winner using javax.json
                try (JsonReader reader = Json.createReader(new InputStreamReader(con.getInputStream()))) {
                    JsonObject jsonResponse = reader.readObject();
                    if (jsonResponse.getInt("total") > 0) {
                        JsonArray dataArray = jsonResponse.getJsonArray("data");
                        JsonObject competitionData = dataArray.getJsonObject(0);
                        return competitionData.getString("winner");
                    }
                }
            }
        }
        return null;
    }

    public static int getWinnerTotalGoals(String competition, int year) {
        try {
            String winner = fetchWinner(competition, year);
            if (winner != null) {
                // TODO: Fetch and compute total goals scored by winner
                return 0; // Placeholder, will update later
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
