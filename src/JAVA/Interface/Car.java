package JAVA.Interface;

public interface Car {
    String name = "Car";
    public void start();
    public void run();

    public void engineSound();

    public default void blast(){
        System.out.println("Boom! car blasted in the air.");
    }

}
