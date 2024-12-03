package JAVA.PolyMorphism;

public class Student extends User{
    int studentClass;
    int percentage;

    Student(String name, int age, int sClass, int percent){
        super(name,age);
        studentClass = sClass;
        percentage = percent;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("I study in "+studentClass+" & My percentage is "+percentage+"%. ");
    }

    @Override
    public void run(){
        System.out.println("Started running.");
    }

    @Override
    public void run(String direction, int speed){

        System.out.println("No i am Tired.");
    }

    public void study(){
        System.out.println("I am Studying.");
    }



}
