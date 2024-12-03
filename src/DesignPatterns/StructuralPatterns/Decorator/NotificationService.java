package DesignPatterns.StructuralPatterns.Decorator;

public class NotificationService extends CommunicatorWrapper{

    public NotificationService(){
        super(null);
    }
    public NotificationService(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void send(String id, String message) {
        if(communicator != null) communicator.send(id,message);
        System.out.println("Notifications");
    }
}
