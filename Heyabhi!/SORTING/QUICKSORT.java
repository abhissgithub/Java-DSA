package SORTING;

import java.util.Arrays;

public class QUICKSORT {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

//    static void print1darray(int[] arr) {
//        for (int value : arr) {
//            System.out.println(value + " ");
//        }
//    }

    static void quick(int[] arr, int start, int end) {
//    7 | 13 | 8 | 5 | 10 | 2 | 4
//   piv

//    5 | 2 | 4 | 7 | 10 | 8 | 13      Here we set piv at his correct position and elements before the pivot is less than
//               piv                     pivot and element after the pivot is greater than pivot
//
        if (start>=end) return;
        int pi=Partition(arr,start,end);
        quick(arr,start,pi-1);
        quick(arr,pi+1,end);

    }
    static int Partition(int [] arr, int start, int end){

        // We assume that index of pivot element is first index;

        int pivot=arr[start];
        int count=0;
        for (int i=start+1;i<=end;i++) {
            if (arr[i] <= pivot) count++;

        }
           int pivotindx=start+count;
            swap(arr,start,pivotindx);
        // We make left side of pivot element less than pivot and right side greater than pivot
        int i=start,j=end;
        while (i<pivotindx && j>pivotindx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            // if there is element on left side which is greater than pivot
            // or any element in left side which is smaller than pivot then

            if (i < pivotindx && j > pivotindx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotindx;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 7, 1};
        int n = arr.length;
        System.out.println("Array before Swaping");
        System.out.println(Arrays.toString(arr));
        System.out.println("Aray after swaping");
        quick(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}