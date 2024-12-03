package DesignPatterns.CreationalPatterns.PrototypeNRegistery;

import java.util.HashMap;
import java.util.Map;

public class UserRegistery {
    private final Map<String,User> registery;

    UserRegistery(){
        this.registery = new HashMap<>();
    }

    public void addPrototype(User u){
        registery.put(u.getBatch(),u);
    }

    public User getPrototypeUser(String batch){
        return registery.get(batch);
    }
}
