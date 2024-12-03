package DesignPatterns.StructuralPatterns.Decorator;

public class MessageService extends CommunicatorWrapper {
    public MessageService(){
        super(null);
    }
    public MessageService(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void send(String id, String message) {
        if(communicator != null) communicator.send(id,message);
        System.out.println("message");
    }
}
