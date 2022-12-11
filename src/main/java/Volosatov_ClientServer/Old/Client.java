package Volosatov_ClientServer.Old;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000);
//        System.out.println(clientSocket.getInputStream().read());

//        byte[] bytes = new byte[256];
//        clientSocket.getInputStream().read(bytes);
//        System.out.println(new String(bytes));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String message = bufferedReader.readLine();
        System.out.println(message);
        clientSocket.close();
    }
}
