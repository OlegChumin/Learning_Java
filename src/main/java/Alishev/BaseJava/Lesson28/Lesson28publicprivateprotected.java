package Alishev.BaseJava.Lesson28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// класс может быть либо публичным либо default и не может быть private
public class Lesson28publicprivateprotected {
    public int id;

    public static void main(String[] args) throws IOException {
        // public, private, default, protected
        PersonOleg person1 = new PersonOleg();
        person1.getName();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str2 = reader.readLine();
    }


    private void privateMethod() {
        System.out.println("К данному методу нет доступа никому только внутри текущего класса, в котором метод находится");
    }

    void defaultMethod() {
        System.out.println("Метод доступен в пределах текущего пакета");
    }

    protected void protectedMethod() {
        System.out.println("Метод доступен всем подклассам, даже если эти подклассы вне пакета -наследникам класса");
    }

}

