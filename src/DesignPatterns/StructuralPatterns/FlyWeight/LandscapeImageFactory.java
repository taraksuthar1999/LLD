package DesignPatterns.StructuralPatterns.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class LandscapeImageFactory {
    public static final Map<String,LandscapeImage> landscapes = new HashMap<>();

    public LandscapeImage getImage(String s){
        if(landscapes.containsKey(s)) return landscapes.get(s);
        return null;
    }

    public void addImage(String s, LandscapeImage image){
        landscapes.put(s,image);
    }
}
