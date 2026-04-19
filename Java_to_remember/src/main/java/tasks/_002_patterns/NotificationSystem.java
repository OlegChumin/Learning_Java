package tasks._002_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача 1: Создание системы уведомлений
 * Описание:
 * Разработайте систему уведомлений для приложения, в котором поддерживаются различные способы уведомлений (электронная
 * почта, SMS, push-уведомления). Система должна быть гибкой и позволять легко добавлять новые типы уведомлений в
 * будущем.
 *
 * Требования:
 * Создайте интерфейс для уведомлений.
 * Реализуйте несколько классов для различных типов уведомлений.
 * Система должна поддерживать возможность отправки уведомлений через один интерфейс, независимо от их типа.
 * Добавьте возможность отправлять сложные уведомления, состоящие из нескольких типов уведомлений.
 *
 * Решение:
 * Для решения этой задачи выбран паттерн Factory Method для создания различных типов уведомлений и Composite для
 * создания сложных уведомлений, состоящих из нескольких типов уведомлений.
 *
 * Примененные паттерны:
 * Задача 1: Factory Method и Composite.
 */
// Notification interface
interface Notification {
    void send(String message);
}

// Concrete notification classes
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}

// Composite pattern for complex notifications
class CompositeNotification implements Notification {
    private List<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    @Override
    public void send(String message) {
        for (Notification notification : notifications) {
            notification.send(message);
        }
    }
}

// Factory Method for creating notifications
abstract class NotificationFactory {
    abstract Notification createNotification();

    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}

class EmailNotificationFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSNotificationFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}

class PushNotificationFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new PushNotification();
    }
}

// Main class to demonstrate the solution
public class NotificationSystem {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationFactory pushFactory = new PushNotificationFactory();

        emailFactory.sendNotification("Welcome!");
        smsFactory.sendNotification("Your code is 1234");
        pushFactory.sendNotification("You have a new message");

        CompositeNotification compositeNotification = new CompositeNotification();
        compositeNotification.addNotification(new EmailNotification());
        compositeNotification.addNotification(new SMSNotification());
        compositeNotification.addNotification(new PushNotification());

        compositeNotification.send("This is a composite notification");
    }
}
