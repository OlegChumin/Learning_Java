package Volosatov_ClientServer.Materials;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * многоразовый сервер -> постоянный автоответчик
 * http://127.0.0.1:8000/ в браузере
 * через "выполнить" -> cmd -> telnet 127.0.0.1 8000
 * powershell telnet 127.0.0.1 8000
 * <p>
 * server response:
 * HTTP/1.0 200 OK
 * Server: PGWebServ v0.1
 * Content-Type: text/html
 * <>Hallo Magic Java</>
 */

public class Client_Server_08 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Socket Server started on address 127.0.0.1 port 8000 link: http://127.0.0.1:8000/");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client accepted " + (++count));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
            outputStreamWriter.write("HTTP/1.0 200 OK\r\n" +
                    "Content-type: text/html\r\n" +
                    "\r\n" +
                    "<h1>Hallo Magic Java</h1>\r\n" +
                    "<h2>Java Magic intensive course!</h2>\r\n" + (count - 1));
            outputStreamWriter.flush();
            outputStreamWriter.close();
            clientSocket.close();
        }
//        serverSocket.close();
    }
}
