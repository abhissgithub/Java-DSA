package HASHMAP;

// Find the element in array which has max freq

import java.util.HashMap;
import java.util.Map;

public class FREQUENCY {

    public static void main(String[] args) {
        int [] arr={1,2,3,1,2,3,2,4,5,4,6,5,3,5,2,3,4,5,5,5};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el:arr){
            if (!freq.containsKey(el)){
                freq.put(el,1);
            }
            else {
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
//        System.out.println();

        int Maxfreq=0, anskey=-1;

//        first method to traverse
//        for (var e : freq.entrySet()) {
//            if (e.getValue() > Maxfreq) {
//                Maxfreq = e.getValue();
//                anskey = e.getKey();
//
//            }
//
//        }
//        System.out.println(anskey);
//        System.out.printf("%d has max occurrence as %d times",anskey,Maxfreq);

//        Another method for traverse
        for (var key : freq.keySet()){
            if (freq.get(key)>Maxfreq){
                Maxfreq=freq.get(key);
                anskey=key;
            }
        }
        System.out.println(anskey);
        System.out.printf("%d has max occurrence as %d times",anskey,Maxfreq);

    }

}
