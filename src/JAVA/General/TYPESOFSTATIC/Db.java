package JAVA.General.TYPESOFSTATIC;

public class Db {
    static String url;
    int pool;

    Db(int pool){
        this.pool = pool;
    }

    void print(){
        System.out.println(pool+" "+url);
    }

    static class Builder{
        static String name = "DB Builder";
        String url;

        Builder(){
            url = "/goodmorning/people";
        }
        static void setup(){
            System.out.println(name+" "+Db.url);
        }
    }
}
