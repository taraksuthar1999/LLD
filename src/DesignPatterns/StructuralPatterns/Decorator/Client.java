package DesignPatterns.StructuralPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Communicator email = new EmailService();
        Communicator message = new MessageService(email);
        Communicator notify = new NotificationService(message);

        notify.send("stirng","message");
    }

}
