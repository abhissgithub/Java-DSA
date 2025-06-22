package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DSORTINGSQUARE {


    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void reversearray(int[] arr) {
        int i=0,j=arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static int[] Sortsquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left]*arr[left];
                left++;
            } else {
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the" + " " + n + " " + "Elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printarray(arr);
        int [] ans =Sortsquare(arr);
        System.out.println("sorted array");

        printarray(ans);
        reversearray(ans);


    }
}