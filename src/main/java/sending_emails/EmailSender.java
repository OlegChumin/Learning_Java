package sending_emails

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {

    public static void main(String[] args) {
        String csvFile = "emails.csv"; // Путь к CSV-файлу с email-адресами
        String subject = "Random Number";
        String body = "Here is your random number: ";
        
        List<String> emailList = getEmailListFromCSV(csvFile);
        if (emailList.isEmpty()) {
            System.out.println("No email addresses found in the CSV file.");
            return;
        }

        Random random = new Random();
        for (String email : emailList) {
            int randomNumber = random.nextInt(10) + 1;
            String message = body + randomNumber;

            sendEmail(email, subject, message);
            System.out.println("Email sent to: " + email);
        }
    }

    private static List<String> getEmailListFromCSV(String csvFile) {
        List<String> emailList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                emailList.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return emailList;
    }

    private static void sendEmail(String toEmail, String subject, String body) {
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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(body);

            // Отправка сообщения
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
