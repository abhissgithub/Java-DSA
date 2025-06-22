package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DROTATION {
    static int [] reptation(int [] arr, int k){
        int n= arr.length;
        k=k%n;
        int j=0;
        int [] ans= new int[n];
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];

        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
    }
        return ans;


    }
    static void PrintArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Enter the"+" "+size+" "+"Elements in array");
        int [] arr= new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of K:");
        int k=sc.nextInt();
        System.out.println("Originl Array");
        PrintArray(arr);
        int [] ans =reptation(arr,k);
        System.out.println("Array After Rotation");
        PrintArray(ans);




    }

}
