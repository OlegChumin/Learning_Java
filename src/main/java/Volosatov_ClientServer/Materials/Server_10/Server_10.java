package Volosatov_ClientServer.Materials.Server_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_10 {
    public static void main(String[] args) throws IOException {
        int count = 0; // счетчик обращений к серверу
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("New socket server started on address 127.0.0.1; port 8000; link: http://127.0.0.1:8000/");

        while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Обращение к серверу №: " + (++count));

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //Buffered Writer \n newLine !
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());

            String request = bufferedReader.readLine(); // считываем запрос клиента
            String response = "#" + count + " Your message length is " + request.length() + "\n";

            outputStreamWriter.write(response);
            outputStreamWriter.flush();

            bufferedReader.close();
            outputStreamWriter.close();
            clientSocket.close();
        }
//        serverSocket.close();
    }
}

