package REST.rest_with_jersey;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

//Класс, который запускает REST API сервер:
public class RestApiServer {

    public static void main(String[] args) throws Exception {
        // Определяем ресурс, который будет доступен по URL /message
        ResourceConfig config = new ResourceConfig(MessageResource.class);

        // Определяем базовый URL и порт для сервера
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();

        // Создаем экземпляр сервера и добавляем наш ресурс
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, config);

        // Запускаем сервер
        server.start();

        System.out.println("Server started at " + baseUri);
        System.in.read(); // Ждем, пока пользователь не нажмет любую клавишу
        server.shutdownNow(); // Останавливаем сервер
    }
}
