package SOLID;

abstract public class Bird {
    String color;
    int wings;
    String type;

    double weight;

    String name;


    public abstract void makeSound();


    public void eat(){
        System.out.println("this bird is eating");
    }

}
