package JAVA.Interface;

public class I20 implements HunchBack {
//    String name;

    I20(){
//        name = "I20";
    }
    @Override
    public void start() {
        System.out.println(name+" started.");
    }

    @Override
    public void run() {
        System.out.println("its running.");
    }

    @Override
    public void engineSound() {
        System.out.println("brum brum");
    }
}
