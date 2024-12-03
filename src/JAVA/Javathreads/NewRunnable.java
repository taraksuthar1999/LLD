package JAVA.Javathreads;

public class NewRunnable implements Runnable{

    @Override
    public void run(){
        complexComputation();
    }

    public static synchronized void complexComputation(){
        while(true){} // infinite loop
    }
}
