import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public static void main(String[] Args) {

    // The Blueprint for a Web Request
    try {
        // 1. Open a browser window (HttpClient)
        HttpClient client = HttpClient.newHttpClient();

        // 2. Type in the URL (HttpRequest)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://official-joke-api.appspot.com/random_joke"))
                .build();

        // 3. Press Enter and catch the JSON text that comes back (HttpResponse)
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String rawJson = response.body();
        String[] jsonPieces = rawJson.split(",");
        // Spitting by " and Printing Raw JSON
        for (int piece = 0; piece < jsonPieces.length; piece++) {

            if (jsonPieces[piece].contains("\"setup\"")) {
                String cleanedSetup = jsonPieces[piece].replace("\"setup\"", "Setup - ");
                    cleanedSetup = cleanedSetup.replace("\"", "");
                    cleanedSetup = cleanedSetup.replace(":", "");
                    System.out.print(cleanedSetup.trim() + "\n");

            }  if (jsonPieces[piece].contains("\"punchline\"")) {
                String cleanedPunchline = jsonPieces[piece].replace("\"punchline\"", "Punchline - ");
                cleanedPunchline = cleanedPunchline.replace("\"", "");
                cleanedPunchline = cleanedPunchline.replace(":", "");
                System.out.println(cleanedPunchline.trim());
            }
        }


        // 4. Print the JSON to the terminal!
        System.out.println("\n\nUnformatted Response Body: \n" + response.body());

    } catch (IOException | InterruptedException e) {
        System.out.println("❌ Internet Connection Failed");
    }
}
