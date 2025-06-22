package HASHMAP;
//
//
import java.util.HashMap;
import java.util.Map;

public class HASHMAP {
    public static void main(String[] args) {
        HashMap();

    }

    //    Syntax
    static void HashMap() {
        Map<String, Integer> mp = new HashMap<>();

//    Adding Element in Map
        mp.put("Abhi", 21);
        mp.put("rushi", 21);
        mp.put("giri", 21);
        mp.put("rahi", 21);
        mp.put("bhai", 21);

//    Getting value Of key From the HashMap
        System.out.println(mp.get("Abhi")); //It will value of key i.e. 21

        System.out.println(mp.get("raj")); // If no value present in map then it write null
        System.out.println();

//        Changing value of key in HashMap
        mp.put("Abhi",25);
        System.out.println(mp.get("Abhi"));
        System.out.println(mp.get("raj"));
        System.out.println();

//        Removing a pair from the Hashmap
//        mp.remove("Abhi");
        System.out.println(mp.remove("Abhi")); // It removes key and return value
        System.out.println(mp.remove("riya")); // return null as no key present in map
        System.out.println();

//        Checking in the key present in the HashMap
        System.out.println(mp.containsKey("giri")); // return true if present
        System.out.println(mp.containsKey("ratshi"));  //  return false if not present
        System.out.println();

//        Adding new entry if it isn't exist in map already
        mp.putIfAbsent("raj",29); // will Add in map
        mp.putIfAbsent("Abhi",26); // will not add in hashmap

//        Get All Keys in HashMap
        System.out.println(mp.keySet());
        System.out.println();

//        Get All Values in HashMap
        System.out.println(mp.values());
        System.out.println();

//        Get All entries Pairs in hashMap
        System.out.println(mp.entrySet());
        System.out.println();

//        Iterate all entries in HashMap - Multiple Methods
        for (String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();

//      By Using EntrySet
        for (Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age Of %s is %d\n",e.getKey(),e.getValue());
            System.out.println();
        }
        for (var e:mp.entrySet()){
            System.out.printf("Age Of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
