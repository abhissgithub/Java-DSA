package ARRAYLIST;

import java.util.ArrayList;

public class ARRAYLIST {


    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        System.out.println("list a will be");
        // Add new element
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        a.add(11);
        System.out.println(a);


        // Get an element at index i
        System.out.println("Index at position i is:");
        System.out.println(a.get(2));

        // Print with for loop
        System.out.println("For For Loop");
        for (int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));

        }
        System.out.println();
        // adding element at some index i
        System.out.println("Added index list willl be");
        a.add(2,10);
        System.out.println(a);
        boolean ans=a.contains(20);
        System.out.println(ans);
    }


}
