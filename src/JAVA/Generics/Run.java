package JAVA.Generics;

import java.util.ArrayList;
import java.util.List;

public class Run<T extends User> {

    public static void main(String[] args) {
        List<Number> arr = new ArrayList<>();
        arr.add(11d);
        arr.add(12);
        double a;
        a = 10;

    }

    public void goodRun(T user, List<?> names){

    }

    public static void fun(List<? extends Number> activities){

    }
}
