package OOP;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.gender = Gender.MALE;
        System.out.println(s.gender.getClass());
    }
}
