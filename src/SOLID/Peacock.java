package SOLID;

public class Peacock extends Bird implements Dance,Flyable{
    Fly m = new MakeFly();
    @Override
    public void makeSound() {
        System.out.println("ko ko");
    }

    @Override
    public void dance() {
        System.out.println("i am dancing bird");
    }

    @Override
    public void fly() {
        m.fly();
    }
}
