package ARRAY1D;

import java.util.Scanner;

class ARRAY1DPREFSUMQ {
    static void printarray(int [] arr){
        for (int j: arr){
            System.out.println(j);
        }
    }
    public static int [] prefarray( int [] arr){
        int n=arr.length;
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter THe size of array");
        int size=sc.nextInt();
        int [] arr = new int[size+1];
        System.out.println("Enter the "+size+" Elements In Array");
        for (int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] prefsum=prefarray(arr);
        System.out.println("ENter No. Of Queries");
        int q=sc.nextInt();
        while (q-->0){
            System.out.println("Enter Range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefsum[r]-prefsum[l-1];

            System.out.println("sum"+ans);

        }


    }
}