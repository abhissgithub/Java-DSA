package HASHMAP.QUESTIONS;

import java.util.HashMap;

public class MAJORITYELEMENTS {
    private static void majority(int [] arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=arr.length;
        for (int i=0;i<arr.length;i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        for (int key:mp.keySet()){
            if (mp.get(key)>n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={1,3,2,1,1,1,3};
        majority(arr);
    }
}
