package SOLID;

public class Parrot extends Bird implements Flyable{

    Fly m = new MakeFly();
    @Override
    public void fly() {
        m.fly();
    }

    @Override
    public void makeSound() {
        System.out.println("pe pe");
    }

}
