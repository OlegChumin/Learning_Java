package REST.rest_with_jersey;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

//Класс, который представляет ресурс:
@Path("/message")
public class MessageResource {

    // Метод, который будет вызываться при запросе GET /message
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello World!";
    }

    // Метод, который будет вызываться при запросе POST /message
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void postMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
