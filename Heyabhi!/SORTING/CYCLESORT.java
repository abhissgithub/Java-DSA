package SORTING;

import java.util.Arrays;

public class CYCLESORT {
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sort(int [] arr){
        int n=arr.length-1;
        int i=1;
        while (i<n){
            int correct=arr[i];         //  We Put element  at his Correct Index
            if (arr[i]!=arr[correct]){   // Here we Check Element at ith index is at correct index?;
                swap(arr,i,correct);    // if not then we swap that index with correct index

            }
            else i++;                 // if yes, element at his correct position then we move forward;
        }
    }

    public static void main(String[] args) {
        int [] arr ={2,0,2,1,1,0};
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after sorting");
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
