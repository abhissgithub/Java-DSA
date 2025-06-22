package SORTING;

import java.util.Arrays;

public class CYCLESORTMISSINGNUM {
    /*
    ---->FACEBOOK QUESTION<-------

    n=3
    input=[0,1,2]
    output = Missing num is[3];

    n=5
    input=[0,1,2,4,5]
    output= Missing num is[3];
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int cycle(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n){
            int correctindex = arr[i];
            if (arr[i] < n && arr[i]!=arr[correctindex]) {
                swap(arr, i, correctindex);
            } else
                i++;
        }
        for (int index=0;index<n;index++){
            if (arr[index]!=index){
                return index;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int [] arr={3,0,1};
        System.out.println("Missing Num is : " + cycle(arr));


    }
}