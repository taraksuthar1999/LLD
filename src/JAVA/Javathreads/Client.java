package JAVA.Javathreads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {
//        Runnable r = () -> System.out.println("hello");
//        Thread t1 = new Thread(new SimpleRunnable());
//        Thread t2 = new Thread(r);
//        System.out.println("t1 state:" +t1.getState());
//        t1.start();
//        t2.start();
//        Thread.sleep(2000);
//        System.out.println("t1 state:" +t1.getState());
//        System.out.println("t2 state:" +t2.getState());
//        System.out.println("main state:" +Thread.currentThread().getState());

        Thread t1 = new Thread(new NewRunnable());
        Thread t2 = new Thread(new NewRunnable());


        t1.start();
        t2.start();

//        Thread.sleep(2000);

        System.out.println("t1 state:" +t1.getState());
        System.out.println("t2 state:" +t2.getState());

        ExecutorService executerService = Executors.newCachedThreadPool();

        for(int i = 0;i<10;i++){
            int finalI = i;
            executerService.execute(()-> System.out.println(finalI +" "+Thread.currentThread().getName()));
        }
        executerService.shutdown();

        final Map<Car,String> map =new HashMap<>();

        final Car c = new Car();
        c.setColor("blue");
        c.setName("indica");
        map.put(c,"hello world");
        c.setName("verna");
        System.out.println(map.containsKey(c));

    }
}
