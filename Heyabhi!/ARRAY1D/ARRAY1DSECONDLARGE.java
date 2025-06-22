package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DSECONDLARGE {
    public static int LargestNum(int [] arr){
        int Max= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>Max){
                Max=arr[i];
            }
        }
        return Max;
    }
    public static int SecondLarge(int [] arr){
        int Max=LargestNum(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==Max){
                arr[i]=Integer.MIN_VALUE;

            }

        }
        int mx=LargestNum(arr);
        return mx;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the"+" "+n+" "+"Elements In Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Seconf Largest Element is: "+SecondLarge(arr));
    }
}
