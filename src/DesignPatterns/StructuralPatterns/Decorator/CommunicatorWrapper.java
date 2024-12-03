package DesignPatterns.StructuralPatterns.Decorator;

public abstract class CommunicatorWrapper implements Communicator {
    protected Communicator communicator;

//    @Override
//    public void send(String id, String message) {
//
//        if(communicator != null)communicator.send(id,message);
//    }

    CommunicatorWrapper(Communicator communicator){
        this.communicator = communicator;
    }


}
