package ARRAY1D;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY1D2SUM {
    public  static void sum(int [] arr, int target){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(Arrays.toString(new int[]{i, j}));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" Elements in array");
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        System.out.println("The target is at index:");
        sum(arr,target);
    }
}