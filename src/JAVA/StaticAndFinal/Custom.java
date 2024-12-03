package JAVA.StaticAndFinal;

public final class Custom {
    final int number;
    Custom(){
        number = 11;
    }

    void doSomeThing(){
//        number = 15;
        System.out.println(number);
    }
}
