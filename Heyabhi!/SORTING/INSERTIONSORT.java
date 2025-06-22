package SORTING;

import java.util.Arrays;

public class INSERTIONSORT {
//
//    3] 5 2 1 4  <----- We assume that element at index i  is sorted so we compare with i+1 and swap them
//    0  1 2 3 4
    static void insert(int [] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){    // i=1 because at i=0 we assume that array is sorted
            int j=i;
//            for (int j=i;j<n;j++){  // j=i because at i=1 j also start from 1st index
                while (j>0 && arr[j]<arr[j-1]){
                        int temp=arr[j-1];
                        arr [j-1]=arr[j];
                        arr[j]=temp;
                        j--;
            }

        }
    }

    public static void main(String[] args) {
        int [] arr={4,7,5,3,5};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
