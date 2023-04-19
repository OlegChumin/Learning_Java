package REST.rest_with_jersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

//Класс, который отправляет POST запрос с сообщением:

public class RestClient {

    public static void main(String[] args) {
        // Отправляем POST запрос на URL http://localhost:8080/message
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/message");
        target.request().post(Entity.entity("Hello REST API", MediaType.TEXT_PLAIN));
        System.out.println("Message sent");
    }
}
