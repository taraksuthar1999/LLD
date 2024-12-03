package JAVA.General.TYPESOFSTATIC;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Person p = new Person();
        p.arr.add(22);
        p.arr.add(24);
        p.arr.add(25);
        System.out.println(p.toString());
        System.out.println(Person.PLANET);
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        map.put(1,new ArrayList<>(Arrays.asList(4,5)));
        map.put(2,new ArrayList<>(Arrays.asList(1,2)));
        Map<Integer,ArrayList<Integer>> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println(unmodifiableMap.get(1));
        ArrayList<Integer> arr = unmodifiableMap.get(1);
        arr.add(22);
//        unmodifiableMap.put(1,"22");
        System.out.println(unmodifiableMap.get(1));


        Db db = new Db(5);
        db.print();
        Db.url = "/pookie/rizz";
        Db.Builder b = new Db.Builder();
        b.setup();

        Bird sparrow = new Bird();
        sparrow.fly();
        sparrow.damn();
        Flyable.getFlyPattern();


    }
}
