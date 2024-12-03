package OOP.Interface;

public class Dog implements Animal{
    @Override
    public void walk() {
        System.out.println("dog is walking");
    }

    @Override
    public void run() {
        System.out.println("dog is running");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

}
