package org.chumin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Простейший HTTP-сервер.
 * При подключении http://127.0.0.1:8000/ отдаёт браузеру HTML-страницу с заголовком Hello.
 */
public class SocketServerV5 {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8000)) {
            Socket clientSocket = serverSocket.accept();

            String body = "<h2>Hello</h2>";
            String httpResponse = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + body.getBytes(StandardCharsets.UTF_8).length + "\r\n" +
                    "\r\n" +
                    body;

            clientSocket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            clientSocket.close();
        }
    }
}
