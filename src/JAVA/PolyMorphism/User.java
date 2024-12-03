package JAVA.PolyMorphism;

public class User {
    String name;
    int age;

    User(String n,int age){
        name = n;
        this.age = age;
    }

    public void print(){
        System.out.println("My name is "+this.name+" I am "+age+" years old.");
    }

    public void run(){
        System.out.println("started running");
    }

    public void run(int speed, String direction){
        System.out.println("Running "+speed+"km/h in "+direction+" direction.");
    }

    public void run(String direction, int speed){
        System.out.println("Running towards "+direction+" at "+speed+"km/h.");
    }
}
