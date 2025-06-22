package HASHMAP.QUESTIONS;

import java.util.HashSet;

public class UNION2ARRAYS {
    public static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        System.out.println(set.size());
        System.out.println(set);

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 4, 7};
        union(arr1, arr2);
    }
}
