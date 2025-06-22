package SORTING;

import java.util.Arrays;

public class BUBBLESORT {

//    Certain number of passes and in each pass,compare adjacent element & Swap them if they are not in correct order

    static void bubble(int[] arr) {
        int n = arr.length;
//        What if array is already sorted or sorted at first pass then we'll do not do further passes so we use flag;
        for (int i = 0; i < n; i++) {
            boolean flag=false;  // To check any Swapping happened
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
//                    Swap [j-1]-->[j]
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag=true;    // Yes, swap happened so we'll do next pass
                }
            }
            if (flag==false) break; // No Swapping happened so array is sorted no need to do further passes;

        }
    }

    public static void main(String[] args) {
        int [] arr={4,3,2,5,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
