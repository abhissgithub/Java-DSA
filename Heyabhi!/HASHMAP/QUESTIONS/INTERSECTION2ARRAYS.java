package HASHMAP.QUESTIONS;

import java.util.HashSet;

public class INTERSECTION2ARRAYS {
    public static int intersection(int [] arr1,int [] arr2){
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++){
            if (set.contains(arr2[j])){
                count++;
//                set.remove(arr2[j]);
            }
        }
        System.out.println(set);
        return count;
    }
    public static void main(String[] args) {
        int [] arr1={1,2,7};
        int [] arr2={1,2,3,7,8,9};
        System.out.println(intersection(arr1,arr2));
    }
}

