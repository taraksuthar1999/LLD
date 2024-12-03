package JAVA.General.TYPESOFSTATIC;

import java.util.ArrayList;
import java.util.List;

public class Person {
     String type;
     final List<Integer> arr;

     final static String PLANET = "Earth";

     static{

     }
    Person(){
        type = "human";
        arr = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "type: "+type+" arr: "+arr+" lives on planet: "+PLANET;
    }
}
