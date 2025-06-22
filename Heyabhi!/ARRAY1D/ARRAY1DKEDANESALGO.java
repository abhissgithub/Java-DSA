package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DKEDANESALGO {
    public static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int MaxSubarray(int [] arr){
        int sum=0, Maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){

            sum=Math.max(arr[i],sum+arr[i]);

            if (sum>Maxsum)
                Maxsum=sum;
        }
        return Maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the "+n+" elements in array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MaxSubarray(arr));

    }
}
