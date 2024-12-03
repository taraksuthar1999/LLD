package JAVA.StaticAndFinal;

public class Launcher {
    final static int NUMBER = 10;  // constant
    static int multiple;

    int something = 15;

    static{ // used for initialization and pre initialization calculation
        System.out.println(multiple);
        multiple = NUMBER * 111;
        System.out.println("in static block.");
    }

    Launcher(){
        System.out.println("constructor.");
    }

    public static void main(String[] args) {
        System.out.println("main block");
        System.out.println(multiple);
//        Launcher l = new Launcher();
//        l.run();// with object
        Launcher.run();
//        InnerClass in = new InnerClass();
//        in.run();
        Launcher l = new Launcher();
        l.doSomething();

    }

    public static void run(){
        System.out.println("running at :"+NUMBER);
//        InnerClass in = new InnerClass();
    }
    public void doSomething(){
        System.out.println("non static method");
        InnerClass in = new InnerClass();
        in.run();
    }

    static class  InnerClass{
//        static int multiple = 11;

        void run(){
            System.out.println("Run from InnerClass :"+multiple);
//            System.out.println(something);
        }
    }

}
