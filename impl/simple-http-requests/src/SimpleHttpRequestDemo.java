import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.io.StringReader;

public class SimpleHttpRequestDemo {

    private static final String GET_URI = "https://jsonplaceholder.typicode.com/todos/1";
    public static void main(String[] args){
        try{
            HttpClient client=HttpClient.newHttpClient();
            HttpRequest request=HttpRequest.newBuilder()
                    .uri(URI.create(GET_URI))
                    .GET()
                    .build();
            HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}