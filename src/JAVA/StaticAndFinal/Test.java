package JAVA.StaticAndFinal;

public class Test extends RuntimeException {
    public static void main(String[] args) {
        Custom c = new Custom();
        c.doSomeThing();
//        c.number = 11;
        System.out.println(c.number);

    }

    public Test(){
        super();
    }
}
