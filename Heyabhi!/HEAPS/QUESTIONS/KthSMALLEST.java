package HEAPS.QUESTIONS;

import java.util.PriorityQueue;

public class KthSMALLEST {
    public static void priorityq(int [] arr,int k){
        PriorityQueue<Integer>Maxh = new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            Maxh.add(arr[i]);
            if (Maxh.size()>k){
                Maxh.remove();
            }
        }
        System.out.println(Maxh.peek());
    }

    public static void main(String[] args) {
        int [] arr={6,3,8,1,7,4,2,5,9,10};
        int n=arr.length;
        int k=3;
        priorityq(arr,k%n);
    }
}
