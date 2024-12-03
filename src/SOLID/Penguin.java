package SOLID;

public class Penguin extends Bird implements Dance{
    @Override
    public void dance() {
        System.out.println("happy feet");
    }

    @Override
    public void makeSound() {
        System.out.println("qwak qwak");
    }
}
