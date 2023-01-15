package Java_405_lessons.Patterns.Pattern_04_ChainOfResponsibility;

public class ChainOfResponsibilityPatternSample {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender(new MessagePrinter());
        messageSender.sendMessage("Control message");

        MessageHandler messageHandler = new MessageHandlerAddExclamationMark(new MessageCheckHandler(new MessagePrintHandler(null)));
        messageHandler.handle("Hi, check");
    }
}

class MessageSender {
    MessagePrinter messagePrinter;

    public MessageSender(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void sendMessage(String message) {
        messagePrinter.printMessage(message);
    }
}

class MessagePrinter {
    public void printMessage(String message) {
        if(!message.matches(".*\\d.*")) // no numbers
        System.out.println(message);
    }
}

class MessagePrinter2 {
    public void printMessage2(String message) {
            System.out.println(message + "!");
    }
}

abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String msg);
}

class MessagePrintHandler extends MessageHandler {

    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        System.out.println(msg);
    }
}

class MessageCheckHandler extends MessageHandler {

    public MessageCheckHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        if(!msg.matches(".*\\d.*")) {
            messageHandler.handle(msg);
        }
    }
}

class MessageHandlerAddExclamationMark extends MessageHandler {

    public MessageHandlerAddExclamationMark(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        messageHandler.handle(msg + "!");
    }
}
