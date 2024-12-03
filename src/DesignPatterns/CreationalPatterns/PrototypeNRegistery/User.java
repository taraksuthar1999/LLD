package DesignPatterns.CreationalPatterns.PrototypeNRegistery;

public class User implements Prototype<User> {

    private String name;
    private String batch;
    User(){

    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    User(User u){
        this.name = u.name;
        this.batch = u.batch;
    }

    @Override
    public User clone(){
        return new User(this);
    }
}
