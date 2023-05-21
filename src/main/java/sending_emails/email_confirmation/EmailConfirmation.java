package sending_emails.email_confirmation;

import java.util.Properties;
import java.util.Scanner;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailConfirmation {

    public static void main(String[] args) {
        // Получение email адреса от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите email адрес: ");
        String emailAddress = scanner.nextLine();

        // Отправка письма подтверждения на указанный email адрес
        sendConfirmationEmail(emailAddress);
    }

    private static void sendConfirmationEmail(String emailAddress) {
        String subject = "Подтверждение адреса электронной почты";
        String body = "Пожалуйста, подтвердите адрес вашей электронной почты " + emailAddress;

        String fromEmail = "your_email@example.com"; // Замените на вашу электронную почту
        String password = "your_password"; // Замените на ваш пароль

        // Настройка свойств для отправки электронной почты
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.example.com"); // Замените настройками вашего почтового сервера
        properties.put("mail.smtp.port", "587"); // Замените настройками вашего почтового сервера

        // Создание сессии для отправки электронной почты
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Создание объекта сообщения
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailAddress));
            message.setSubject(subject);
            message.setText(body);

            // Отправка сообщения
            Transport.send(message);

            System.out.println("Письмо отправлено на адрес: " + emailAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
