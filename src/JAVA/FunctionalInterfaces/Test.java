package JAVA.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        Foo foo = name -> System.out.println("hello "+name);
//        foo.method("tarak");
//        Consumer<String> doo = name -> System.out.println("consuming "+name);
//        doo.accept("dony");
//
//        Thread t = new Thread(Test::run);
//        t.start();
//        t.join();
//        System.out.println("immediate sout");

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,2,4,1,3));

        int sum = arr.stream().reduce(Integer.MIN_VALUE,(acc,v) ->{
            acc = Math.max(acc,v);
            return acc;
        });

//        int max = arr.stream().max();
        arr.sort(new Comparator<Integer>(){  // inner class
            @Override
            public int compare(Integer a, Integer b){
                return Integer.compare(a,b);
            }
        });

        Foo foo = s -> System.out.println(s+" is my name.");

        foo.method("tarak");

        // consumer
        Consumer<String> c = s -> System.out.println(s+" in cumsomer.");

        c.accept("tarak");

        // supplier

        Supplier<Integer> getNumber = () -> 8;

        System.out.println(getNumber.get());

        // function

        Function<Integer,Integer> square = e -> e*e;

        System.out.println(square.apply(2));

        // bi function

        BiFunction<Integer,Integer,Integer> power = (a,b) -> {
            int res = 1;
            while(b != 0){
                res *= a;
                b--;
            }
            return res;
        };

        System.out.println(power.apply(3,3));

        // predicate

        Predicate<Integer> isEven = e -> e%2 == 0;

        System.out.println(isEven.test(24));


    }

    static class CompInt implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    }

    private static void run() {
        System.out.println("running thread t");
        try{
            Thread.sleep(3000);
            System.out.println("yea");
        }catch(InterruptedException e){
            System.out.println("error");
        }
        System.out.println("execution finished");
    }
}
