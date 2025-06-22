package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DMAXNUM {
    static int last(int [] arr){
        int Max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>Max){
                Max=arr[i];
            }
        }
        return Max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of arrray");
        int size= sc.nextInt();
        int [] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max num is"+last(arr));
    }

}
