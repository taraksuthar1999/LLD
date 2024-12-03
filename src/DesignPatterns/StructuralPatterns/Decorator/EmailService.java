package DesignPatterns.StructuralPatterns.Decorator;

public class EmailService extends CommunicatorWrapper{
    EmailService(){
        super(null);
    }

    EmailService(Communicator communicator){
        super(communicator);
    }
    @Override
    public void send(String id, String message) {
        if(communicator != null) communicator.send(id,message);
        // send email
        System.out.println("Email");
    }
}
