package DesignPatterns.CreationalPatterns.Builder;

public class Client {

    public static void main(String[] args) {
        Student s = Student.builder()
                .setAge(19)
                .setCompany("abc")
                .setPsp(99)
                .setName("Gunga")
                .build();
        System.out.println(s);

    }
}
