package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DTWOPOINTERS {
    static void swap(int [] arr, int i, int j){
        int temp=arr[i];
        arr[j]=arr[i];
        temp = arr[j];

    }
    static void PrintArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void sortzeroandone(int [] arr){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            if (arr[left]==1&& arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }



        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter the elements in array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Originl aray");
        PrintArray(arr);

        sortzeroandone(arr);
        System.out.println("After sorting");
        PrintArray(arr);
    }

    }


