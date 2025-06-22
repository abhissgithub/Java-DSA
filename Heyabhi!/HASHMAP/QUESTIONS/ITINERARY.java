package HASHMAP.QUESTIONS;

import java.util.HashMap;

public class ITINERARY {
    public static String itinerary(HashMap<String,String>mp){
        HashMap<String,String>Revmp=new HashMap<>();
        for (String key:mp.keySet()){
            Revmp.put(mp.get(key),key);
        }
        for (String key: mp.keySet()){
            if (!Revmp.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String ,String>mp=new HashMap<>();
        mp.put("che","bng");
        mp.put("mb","deli");
        mp.put("goa","che");
        mp.put("deli","goa");
        String start=itinerary(mp);
        while (mp.containsKey(start)){
            System.out.print(start+"-->");
            start=mp.get(start);
        }
        System.out.println(start);
    }
}
