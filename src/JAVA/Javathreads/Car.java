package JAVA.Javathreads;

import java.util.Objects;

public class Car {
    private String color;
    private String name;

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(color,name);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Car c =(Car) obj;
       return Objects.equals(color, c.color) && Objects.equals(name, c.name);
    }

}
