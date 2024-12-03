package DesignPatterns.CreationalPatterns.Factory;

public class BiologyClassFactory implements ClassroomFactory{
    @Override
    public Student getStudent() {
        return new BiologyStudent();
    }

    @Override
    public Teacher getTeacher() {
        return new BiologyTeacher();
    }
}
