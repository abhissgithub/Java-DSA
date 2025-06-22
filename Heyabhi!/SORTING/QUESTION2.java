package SORTING;

import java.util.Arrays;

public class QUESTION2 {
/* QUE:
There is an array of some numbers put the -ve numbers on left and +ve on right
input = [1,3,-2,5,-7,-9,10,12,-4]
output = [-2 -7 -9 -4 1 3 5 12 10];
 */
//    static void print(int [] arr){
//        for (int a:arr){
//            System.out.println(a);
//        }
//    }
    static void quicksort(int [] arr){
        int n=arr.length;
        int l=0,r=n-1;
        while (l<r){
            while (arr[l]<0)l++;
            while (arr[r]>=0)r--;
            if (l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }

    }

    public static void main(String[] args) {
        int []arr={1,3,-2,5,-7,-9,10,12,-4};
        quicksort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
