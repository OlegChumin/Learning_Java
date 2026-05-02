package sending_emails.mime_sample;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSenderMIME {

    public static void main(String[] args) {
        String toEmail = "recipient@example.com"; // Адрес получателя
        String fromEmail = "sender@example.com"; // Адрес отправителя
        String password = "password"; // Пароль от почтового ящика отправителя

        String subject = "Hello";
        String body = "This is a test email.";

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
            // Создание объекта сообщения MimeMessage
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(body);

            // Отправка сообщения
            Transport.send(message);

            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

/**
 * В этом примере создается объект MimeMessage с помощью Session.getInstance() и настраивается с помощью свойств,
 * таких как mail.smtp.auth, mail.smtp.starttls.enable, mail.smtp.host и mail.smtp.port. Затем устанавливаются
 * отправитель, получатель, тема и текст сообщения с помощью методов setFrom(), addRecipient(), setSubject() и setText().
 * Наконец, сообщение отправляется с помощью метода Transport.send().
 *
 * */
