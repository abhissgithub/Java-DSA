package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BUCKETSORT {

//  Initially We Create empty Bucket to add elements
//  Here We can use 2D array for multiple elements in single Bucket
//  Or We May use ArrayList To Store the element

    static void bucket(float [] arr){
        int n= arr.length;
        ArrayList<Float>[]bucket=new ArrayList[n];  // Here We Make Array of Arraylist
        for (int i=0;i<arr.length;i++){
            bucket[i]=new ArrayList<>();        // Now we make empty buckets to store elements;

             }

//        Now We Have To add Elements in That Empty Bucket by logically
        for (int i=0;i<n;i++){
            int bucketindx= (int) arr[i]*n;  // Here we make indx
            bucket[bucketindx].add(arr[i]); // Here We add number to bucketlist

        }

//        Now We Sort The Elements in each bucket
        for (int i=0;i<bucket.length;i++) {
            Collections.sort(bucket[i]);
        }
//
//        Now We Have to Merge all sorted Elements in final array
        int index=0;  // for adding elements in final array
        for (int i=0;i<bucket.length;i++){
//            Now We Have to Add elements From current bucket
            ArrayList<Float>CurrBucket=bucket[i];
            for (int j=0;j< CurrBucket.size();j++){    // We traverse on first bucket
                arr[index++]= CurrBucket.get(j);
            }

        }

    }

    public static void main(String[] args) {
        float [] bucket={0.2f,0.9f,0.8f,0.77f,0.89f};
        System.out.println("Array Before Bucket sorting");
        System.out.println(Arrays.toString(bucket));
        System.out.println("Arrays after sorting");
        bucket(bucket);
        System.out.println(Arrays.toString(bucket));
    }
}
