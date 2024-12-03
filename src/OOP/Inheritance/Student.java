package OOP.Inheritance;

public class Student extends User {
    double psp;
    void scheduleClass(){
        System.out.println("Class scheduled by :" + this.name);
    }
    @Override
    void login(){

    }
}
