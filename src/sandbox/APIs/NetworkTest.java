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
        // 4. Print the JSON to the terminal!
        System.out.println(response.body());

    } catch (IOException | InterruptedException e) {
        System.out.println("❌ Internet Connection Failed");
    }
}
