package SORTING;

import java.util.Arrays;

class SELECTIONSORT{
    static void selection(int [] arr){
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {   // i reprsent the current element
//           Find the minimum element in unsorted array
            int minelement=i;   //we assume current element as minimum
            for (int j = i+1; j <n ; j++) {
                if (arr[j]<arr[minelement]){
                    minelement=j;
                }

            }
//            Swap current element and minimum element
            int temp=arr[i];     // Current index i has current element
            arr[i]=arr[minelement];
            arr[minelement]=temp;


        }
    }

    public static void main(String[] args) {
        int[]arr={1,7,5,3,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}