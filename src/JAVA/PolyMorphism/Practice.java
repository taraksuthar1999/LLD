package JAVA.PolyMorphism;

public class Practice {
    public static void main(String[] args) {
        User user = new User("tarak",19);
        user.print();
        user.run();
        user.run("south",10);
        user.run(9,"north");

        Student s = new Student("jamun",15,7,88);
        s.print();
        s.run();
        s.run("west",8);
        s.run(2,"north");

        User s1 = new Student("golu",13,5,76);
        s1.print();
        s1.run();
        s1.run("west",5);
        s1.run(3,"east");
    }
}

class A{
    private String name;

    A(){ name = "default";}
    A(String name){
        this.name = name;
    }

    private void privateMethod(){
        System.out.println("called");
    };

    public String getName() {
        return name;
    }
}