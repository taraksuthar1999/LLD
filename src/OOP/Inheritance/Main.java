package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.name = "sandeep";
        i.avgRating = 4.79;
        i.login();
        Student s = new Student();
        s.name = "tarak";
        s.psp = 99;
        s.login();
        s.scheduleClass();
    }
}
