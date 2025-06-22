package SEARCHING.LINEAR;

import java.util.Scanner;

public class LINEARSEARCHONARRAY {
    static int search(int[]arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target)
                return target ;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter element");
        int [] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target=sc.nextInt();
        search(arr,target);
        System.out.println(search(arr,target));

    }
}
