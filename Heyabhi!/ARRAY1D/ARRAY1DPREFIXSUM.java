package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DPREFIXSUM {
    static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static int [] prefixsum(int [] arr){
        int n=arr.length;
        int [] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];




        }
        return prefix;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n= sc.nextInt();
        System.out.println("Enter the"+" "+n+" "+"Elements in array");
        int [] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prefix Array is as");
        printarray(prefixsum(arr));

    }
}
