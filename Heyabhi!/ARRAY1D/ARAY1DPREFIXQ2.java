package ARRAY1D;

import java.util.Scanner;

public class ARAY1DPREFIXQ2 {
    static void printarray(int []arr){
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static int [] makeprefix(int [] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n= sc.nextInt();
        System.out.println("Enter the "+n+" Elements in array");
        int [] arr= new int[n+1];
        for (int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] pref=makeprefix(arr);
        System.out.println("Enter Number of Queries to find sum b/w range ");
        int q=sc.nextInt();
        while (q-->0){
            System.out.println("Enter  the range in which you Want to find sum");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=pref[r]-pref[l-1];
            System.out.println(ans);


        }

    }
}
