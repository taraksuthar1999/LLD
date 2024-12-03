package DesignPatterns.CreationalPatterns.Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("constructor call.");
    }
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){   // thread safe double-checked locking
                if(instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}
