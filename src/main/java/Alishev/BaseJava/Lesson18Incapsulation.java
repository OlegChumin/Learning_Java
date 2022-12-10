package Alishev.BaseJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson18Incapsulation {
    public static void main(String[] args) throws IOException {
        User user = new User();
        System.out.println("Вы ввели имя пользователя: " + user.setUserName());
    }
}

class User {
    private String userName;
    int userId;
    int userAge;

    public String getUserName() {
        return userName;
    }

    public String setUserName() throws IOException {
        String Name = readUserName();
        while (Name.isEmpty()) {
            System.out.println("Вы не ввели имя! Повторите ввод: ");
            Name = readUserName();
        }
        return userName = Name;
    }

    public String readUserName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Name = reader.readLine();
        return Name;
    }
}

