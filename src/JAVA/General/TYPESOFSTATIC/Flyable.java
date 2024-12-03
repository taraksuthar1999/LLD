package JAVA.General.TYPESOFSTATIC;

public interface Flyable {
    void fly();
    static void getFlyPattern(){
        System.out.println("<-----------------");
        System.out.println("    left          ^");
        System.out.println("                  '");
        System.out.println("                up'");
        System.out.println("     right        '");
        System.out.println("------------------>");
    }

    default void damn(){
        System.out.println("this is flyable default method");
    }
}
